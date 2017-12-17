package main;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;

import dramaturgo.DramaturgoMain;
import modelos.Narrativa;

public class Main extends Game {
	
	// Largura e Altura da janela do jogo
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	// String fornecida por argumento pela linha de comando.
	private String arquivo_a_ser_interpretado;
	
	// Instanciacao dos objetos do interpretador da linguagem
	// e da classe controladora do estado de jogo Narrativa.
	private DramaturgoMain dramaturgo;
	Narrativa narrativa;
	
	// Eh atraves do batch que a libGDX renderiza as textures
	private SpriteBatch batch;
	
	// Texture para a caixaDeDialogo. Apenas existe uma imagem padrao,
	// versoes futuras devem deixar os usuarios utilizarem artes proprias.
	private Texture caixaDeDialogo;
	
	// Fonte bitmap utilizada para renderizacao de texto no jogo.
	private BitmapFont texto;
	
	// Todos os objetos abaixo estao sendo usados (gambiarramente) para 
	// a renderizacao dos botoes de escolha.
	private Stage stage; 
	private TextureAtlas textureAtlas;
	private Skin skin;
	private Table table;
	TextButtonStyle estiloDoBotao = new TextButtonStyle();
	private List<TextButton> botoesEscolha;
	//-------------------------------------
	
	// Boolean para ajudar na gambiarra do funcionamento das escolhas
	private boolean foiClicado;
	
	// A instanciacao da main, na verdade,
	// eh feita e chamada pelo arquivo do projeto desktop.
	public Main(String[] args) {
		if(args.length != 1) {
			System.out.println("Uso: java -jar dramaturgo <arquivo_a_ser_interpretado>");
			System.exit(0);
		} else  {
			arquivo_a_ser_interpretado = args[0];
		}
	}

	// Ao ser criada, Main inicializa todas suas variaveis
	@Override
	public void create() {
		batch = new SpriteBatch();
		dramaturgo = new DramaturgoMain(arquivo_a_ser_interpretado);
		narrativa = new Narrativa();
		
		caixaDeDialogo = new Texture(Gdx.files.internal("ui/caixa_de_dialogo.png"));
		
		texto = new BitmapFont(Gdx.files.internal("fontes/nobile.fnt"));
		texto.getData().setScale(0.7f);
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);	
		
		textureAtlas = new TextureAtlas("ui/botao.pack");
		
		skin = new Skin(textureAtlas);
		
		table = new Table(skin);
		table.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		estiloDoBotao.up = skin.getDrawable("botao.up");
		estiloDoBotao.down = skin.getDrawable("botao.down");
		estiloDoBotao.font = texto;
		
		botoesEscolha = new ArrayList<TextButton>();
		
		for(int i = 0; i < 5; i++) {
			
			TextButton botaoEscolha = new TextButton("x", estiloDoBotao);
			botaoEscolha.setVisible(false);
			
			botoesEscolha.add(botaoEscolha);
		}
		
		for(TextButton b : botoesEscolha) { 
			table.add(b);
			table.row();
		}
		
		stage.addActor(table);
		
		foiClicado = true;
		
		try {
			narrativa = dramaturgo.run();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	// Funcao de renderizacao fica em loop
	@Override
	public void render() {
		
		// Chama funcao para tocar musica
		tocarMusica();
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!
		// ALERTA: GAMBIARRA BELOW
		//!!!!!!!!!!!!!!!!!!!!!!!!!
		// Se esta num estado de escolha
		if(narrativa.getEscolhas() != null) {
			if(foiClicado) {
				foiClicado = false;
				
				narrativa.acao.executaAcao();
			}
			
			for(TextButton b : botoesEscolha) { 
				b.setVisible(false);
			}
		}
		else if(foiClicado) {
			// Pressionando ENTER, proxima acao eh chamada
			if(Gdx.input.isKeyJustPressed(Keys.ENTER)) {
				if(!narrativa.proximaAcao()) {
					Gdx.app.exit();
				}
			}
		}
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// Comecar o batch para poder renderizar
		batch.begin();
				
		// Funcoes de renderizacao
		renderCenario();
		renderPersonagens();
		renderPersonagens();

		// Se esta num estado de falas, renderiza caixa de dialogo e fala
		if(narrativa.getFala() != "") {
			renderCaixaDeDialogo();
			renderFala();
		}
		
		// Enquanto nao foi clicado, renderiza botoes de escolha
		if(!foiClicado)
			renderEscolhas();
		
		batch.end();
	}

	// Faz dispose dos recursos para liberar memoria
	@Override
	public void dispose() {
		caixaDeDialogo.dispose();
		texto.dispose();
		skin.dispose();
		textureAtlas.dispose();
		stage.dispose();
		batch.dispose();
	}
	
	// ------------------------
	// FUNCOES DE RENDERIZACAO
	// ------------------------
	
	public void tocarMusica() {
		if(narrativa.getMusicaAtual() != null) {
			narrativa.getMusicaAtual().play();
		}
	}
	
	public void renderCenario() {
		if(narrativa.getCenarioAtual() != null) {
			batch.draw(narrativa.getCenarioAtual(), 0, 0,
					Gdx.graphics.getWidth(),
					Gdx.graphics.getHeight());
		}
	}
	
	public void renderPersonagens() {
		
		int numPersonagens = narrativa.getPersonagensEmCena().size();
		int pos = 0;
		
		
		for(Integer index : narrativa.getPersonagensEmCena()) {
			if(numPersonagens == 1) {
				batch.draw(narrativa.getTexturaPersonagem(index), WIDTH/2 - WIDTH/4, 0, WIDTH/2, HEIGHT - HEIGHT/5);
			} else {
				batch.draw(narrativa.getTexturaPersonagem(index), pos * WIDTH/numPersonagens, 0, WIDTH/numPersonagens, HEIGHT - HEIGHT/5);
			}
			
			pos++;
		}
	}
	
	public void renderFala() {
		texto.draw(batch, narrativa.getFalante(), 68, 182, 150, Align.center, true);
		texto.draw(batch, narrativa.getFala(), 100, 130, 600, Align.topLeft, true);
	}
	
	public void renderEscolhas() {
		if(narrativa.getEscolhas() != null) {
			
			int i = 0;
			
			for(final String escolha : narrativa.getEscolhas().keySet()) {
				//System.out.println(escolha);
				botoesEscolha.get(i).addListener(new ClickListener() {
					@Override
					public void clicked(InputEvent event, float x, float y) {
						if(narrativa.getEscolhas() == null)
							return;
						
							int aux = narrativa.getEscolhas().get(escolha);
							if(!narrativa.proximaAcao()) {
								Gdx.app.exit();
							}
							narrativa.cenaAtual = aux-1;
							narrativa.acaoAtual = 0;
				    			
							foiClicado = true;
						
					}
				});
				
				botoesEscolha.get(i).setText(escolha);
				botoesEscolha.get(i).setVisible(true);

				i++;
			}
			
			stage.act(Gdx.graphics.getDeltaTime());
			stage.draw();
		}
	}
	
	public void renderCaixaDeDialogo() {
		if(narrativa.getCenarioAtual() != null) {
			batch.draw(caixaDeDialogo, Gdx.graphics.getWidth()/2 - caixaDeDialogo.getWidth()/2, 10);
		}
	}

} // Main
