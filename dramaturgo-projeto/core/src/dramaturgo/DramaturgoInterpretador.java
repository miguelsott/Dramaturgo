package dramaturgo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import acao.AcaoEntrarPersonagem;
import acao.AcaoEscolha;
import acao.AcaoFala;
import acao.AcaoMudarCenario;
import acao.AcaoMudarEmocaoPersonagem;
import acao.AcaoPulo;
import acao.AcaoSairPersonagem;
import acao.AcaoTocarMusica;
import acao.AcaoTocarSom;
import dramaturgo.DramaturgoParser.CenaContext;
import dramaturgo.DramaturgoParser.DialogoContext;
import dramaturgo.DramaturgoParser.EscolhaContext;
import dramaturgo.DramaturgoParser.Mais_escolhasContext;
import dramaturgo.DramaturgoParser.Mudanca_emocaoContext;
import dramaturgo.DramaturgoParser.Nome_cenaContext;
import dramaturgo.DramaturgoParser.Nova_entradaContext;
import dramaturgo.DramaturgoParser.Nova_musicaContext;
import dramaturgo.DramaturgoParser.Nova_saidaContext;
import dramaturgo.DramaturgoParser.Novo_cenarioContext;
import dramaturgo.DramaturgoParser.Novo_somContext;
import dramaturgo.DramaturgoParser.Outra_entradaContext;
import dramaturgo.DramaturgoParser.Outra_mudancaContext;
import dramaturgo.DramaturgoParser.Outra_saidaContext;
import dramaturgo.DramaturgoParser.PuloContext;
import dramaturgo.DramaturgoParser.RecursoContext;
import dramaturgo.DramaturgoParser.TituloContext;
import modelos.Cena;
import modelos.Cenario;
import modelos.Narrativa;
import modelos.Musica;
import modelos.Personagem;
import modelos.Som;

public class DramaturgoInterpretador extends DramaturgoBaseVisitor <Object> {
    
	// Cria uma instancia do narrativa que sera retornada
	// para a classe Main, que roda o jogo com funcoes da LibGDX
    private Narrativa narrativa;
    
    // Lista de cenas declaradas durante o script
    private List<Cena> cenas;
    private int cenaAtual;	// Index da cenaAtual dentro da lista de cenas
    
    public DramaturgoInterpretador() {
        narrativa = new Narrativa();
        cenas = new ArrayList<Cena>();
        cenaAtual = 0;        
    }

    @Override
    public Object visitPrograma(DramaturgoParser.ProgramaContext ctx) {
  
    	visitCabecalho(ctx.cabecalho());
    	visitCorpo(ctx.corpo());
    	
    	// Apos terminar de percorrer o script populando as cenas
    	// adiciona as cenas ao narrativa.
    	for(Cena c : cenas) {
    		narrativa.addCena(c);
    	}
  
    	/* Teste do Interpretador.
    	 * Remova os comentarios abaixo para testar
    	 * os objetos setados nesta classe.
    	 */ 
    	//printaPersonagens();
    	//printaCenarios();
    	//printaCenas();
    	
    	// Retorno do narrativa
    	return narrativa;
    }
    
    @Override
    public Object visitTitulo(TituloContext ctx) {
    	
    	String titulo = ctx.CADEIA().getText();
    	
    	narrativa.setTitulo(titulo);
    	
    	return null;
    }
    
    @Override
    public Object visitRecurso(RecursoContext ctx) {
    	
    	// Cada vez que entrar na regra de recurso, 
    	// checamos que tipo de recurso eh: personagem ou cenario ou som 
    	
    	// Se for um personagem
    	if(ctx.estado_personagem() != null) {
    		
    		// Pega o nome e a emocao do personagem concatenados em uma string.
    		// Lembre-se que um objeto personagem possui um map:
    		// Map<NomeEmocao, CaminhoParaTextura>
    		String nomeEmocao = ctx.estado_personagem().getText();
    		// Caminho para a textura dessa emocao do personagem
    		String caminho = ctx.CADEIA().getText();
    		// Os caminhos dos recursos vem com aspas, eh preciso tira-las
    		caminho = caminho.replace("\"", "");
    		
    		narrativa.addPersonagem(new Personagem(nomeEmocao, caminho));
    		    		
    	// Se for um cenario
    	} else if(ctx.tipo_som() == null) {
    		
    		// Nome do cenario
    		String nome = ctx.IDENT().getText();
    		// Nome do caminho para a textura
    		String caminho = ctx.CADEIA().getText();
    		// Os caminhos dos recursos vem com aspas, eh preciso tira-las
    		caminho = caminho.replace("\"", "");
    		
    		Cenario cenario = new Cenario(nome, caminho);
    		
    		narrativa.addCenario(cenario);
    		
    	// Se for um som
    	} else {
    		
    		if(ctx.tipo_som().getText().equals("musica")) {
    		
    			String nome = ctx.IDENT().getText();
    			String caminho = ctx.CADEIA().getText();
    			// Os caminhos dos recursos vem com aspas, eh preciso tira-las
        		caminho = caminho.replace("\"", "");
    			
    			Musica musica = new Musica(nome, caminho);
    			
    			narrativa.addMusica(musica);
    			
    		} else {
    			
    			String nome = ctx.IDENT().getText();
    			String caminho = ctx.CADEIA().getText();
    			// Os caminhos dos recursos vem com aspas, eh preciso tira-las
        		caminho = caminho.replace("\"", "");
    			
    			Som som = new Som(nome, caminho);
    			
    			narrativa.addSom(som);
    			
    		} 
    		    		
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitCena(CenaContext ctx) {
    	
    	visitNome_cena(ctx.nome_cena());
    	visitNarrativa(ctx.narrativa());
    	visitPulo(ctx.pulo());
    	
    	cenaAtual++;
    	
    	return null;
    }
    
    @Override
    public Object visitNome_cena(Nome_cenaContext ctx) {
    	
    	// Ver classe Cena para entender o motivo de ser inteiro
    	int nome = Integer.parseInt(ctx.NUM().getText());
    	
    	// Cria cena colocando nome
    	cenas.add(new Cena(nome));
    	
    	return null;
    }
    
    @Override
    public Object visitNovo_cenario(Novo_cenarioContext ctx) {
    	
    	// Nome do cenario
    	String nome = ctx.IDENT().getText();
    	
    	// Adiciona uma acao de mudar cenario na cena atual
    	cenas.get(cenaAtual).addAcao(new AcaoMudarCenario(narrativa, nome));
    	
    	return null;
    }
    
    @Override
    public Object visitNova_entrada(Nova_entradaContext ctx) {
    	
    	// NomeEmocao do personagem
    	String nomeEmocao = ctx.estado_personagem().getText();
    	
    	// Adiciona a acao de entrar um personagem na cena atual
    	cenas.get(cenaAtual).addAcao(new AcaoEntrarPersonagem(narrativa, nomeEmocao));
    	
    	visitOutra_entrada(ctx.outra_entrada());
    	
    	return null;
    }
    
    @Override
    public Object visitOutra_entrada(Outra_entradaContext ctx) {
    	
    	// Se existe a entrada de outro personagem
    	if(ctx.estado_personagem() != null) {
    		
    		// NomeEmocao do personagem
        	String nomeEmocao = ctx.estado_personagem().getText();
        	
        	// Adiciona a acao de entrar um personagem na cena atual
        	cenas.get(cenaAtual).addAcao(new AcaoEntrarPersonagem(narrativa, nomeEmocao));
        	
        	visitOutra_entrada(ctx.outra_entrada());
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitMudanca_emocao(Mudanca_emocaoContext ctx) {
    	
    	// NomeEmocao do personagem
    	String nome = ctx.estado_personagem().PERSONAGEM().getText();
    	String emocao = ctx.estado_personagem().IDENT().getText();
    	
    	cenas.get(cenaAtual).addAcao(new AcaoMudarEmocaoPersonagem(narrativa, nome, emocao));
    	
    	visitOutra_mudanca(ctx.outra_mudanca());
    	
    	return null;
    }
    
    @Override
    public Object visitOutra_mudanca(Outra_mudancaContext ctx) {
    	
    	
    	if(ctx.estado_personagem() != null) {
    		
    		// NomeEmocao do personagem
        	String nome = ctx.estado_personagem().PERSONAGEM().getText();
        	String emocao = ctx.estado_personagem().IDENT().getText();
        	
        	cenas.get(cenaAtual).addAcao(new AcaoMudarEmocaoPersonagem(narrativa, nome, emocao));
        	
        	visitOutra_mudanca(ctx.outra_mudanca());
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitNova_saida(Nova_saidaContext ctx) {
    	
    	// A saida de personagens eh feita apenas chamando o nome do personagem,
    	// sem sua emocao: (sai Roberto).
    	String nome = ctx.PERSONAGEM().getText();
    	
    	// Adiciona a acao de sair personagem da cena atual
    	cenas.get(cenaAtual).addAcao(new AcaoSairPersonagem(narrativa, nome));
    	
    	visitOutra_saida(ctx.outra_saida());
    	
    	return null;
    }
    
    @Override
    public Object visitOutra_saida(Outra_saidaContext ctx) {
    	
    	// Se existe a saida de outro personagem
    	if(ctx.PERSONAGEM() != null) {
    		
    		// A saida de personagens eh feita apenas chamando o nome do personagem,
        	// sem sua emocao: (sai Roberto).
        	String nome = ctx.PERSONAGEM().getText();
        	
        	// Adiciona a acao de sair personagem da cena atual
        	cenas.get(cenaAtual).addAcao(new AcaoSairPersonagem(narrativa, nome));
        	
        	visitOutra_saida(ctx.outra_saida());
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitNova_musica(Nova_musicaContext ctx) {
    	
    	String musica = ctx.IDENT().getText();
    	
    	cenas.get(cenaAtual).addAcao(new AcaoTocarMusica(narrativa, musica));
    	
    	return null;
    }
    
    @Override
    public Object visitNovo_som(Novo_somContext ctx) {
    	
    	String som = ctx.IDENT().getText();
    	
    	cenas.get(cenaAtual).addAcao(new AcaoTocarSom(narrativa, som));
    	
    	return null;
    	
    };
    
    @Override
    public Object visitDialogo(DialogoContext ctx) {
    	
    	// Se o a fala eh do narrador
    	if(ctx.PERSONAGEM() == null) {
    		
    		// Fala do narrador
    		String fala = ctx.CADEIA().getText();
    		fala = fala.replace("\"", "");
    		
    		cenas.get(cenaAtual).addAcao(new AcaoFala(narrativa, "narrador", fala));
    		
    	// Se a fala eh de uma personagem
    	} else {
    		
    		// Personagem e sua respectiva fala
    		String personagem = ctx.PERSONAGEM().getText();
    		String fala = ctx.CADEIA().getText();
    		fala = fala.replace("\"", "");
    		
    		cenas.get(cenaAtual).addAcao(new AcaoFala(narrativa, personagem, fala));    		
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitEscolha(EscolhaContext ctx) {
    	
    	Map<String, Integer> escolhas = new LinkedHashMap<String, Integer>();
    	
    	// Escolha a ser feita (eh um texto)
    	String escolha = ctx.CADEIA().getText();
    	escolha = escolha.replace("\"", "");
    	escolha += "\n";
    	
    	// Para qual cena vai se for feita essa escolha
    	int cenaSeEscolha = Integer.parseInt(ctx.nome_cena().NUM().getText());
    	
    	escolhas.put(escolha, cenaSeEscolha);
    	
    	visitMais_escolhas(ctx.mais_escolhas(), escolhas);
    	
    	cenas.get(cenaAtual).addAcao(new AcaoEscolha(narrativa, escolhas));
    	
    	return null;
    }
    
    public Object visitMais_escolhas(Mais_escolhasContext ctx, Map<String, Integer> escolhas) {
    	
    	if(ctx.CADEIA() != null) {
    		
    		// Escolha a ser feita (eh um texto)
        	String escolha = ctx.CADEIA().getText();
        	escolha = escolha.replace("\"", "");
        	escolha += "\n";
        	
        	// Para qual cena vai se for feita essa escolha
        	int cenaSeEscolha = Integer.parseInt(ctx.nome_cena().NUM().getText());
        	
        	escolhas.put(escolha, cenaSeEscolha);
        	
        	visitMais_escolhas(ctx.mais_escolhas(), escolhas);
    	}
    	
    	return null;
    }
    
    @Override
    public Object visitPulo(PuloContext ctx) {
    	
    	// Se for pulo para uma cena
    	if(ctx.NUM() != null) {
    		
    		int cenaAPular = Integer.parseInt(ctx.NUM().getText());
    		
    		cenas.get(cenaAtual).addAcao(new AcaoPulo(narrativa, cenaAPular));
    		
    	// Se for pulo para o fim da narrativa
    	} else if(ctx.getText().equals("PULO FIM")) {
    		
    		// Para reconhecer que o pulo eh para o fim da narrativa,
    		// a cenaAPular eh atribuida a zero
    		cenas.get(cenaAtual).addAcao(new AcaoPulo(narrativa, 0));
    		
    	} 
    		
    	return null;
    }	
    
    /*------------------------------------------*/
    /*----------- FUNCOES PARA DEBUG -----------*/
    /*------------------------------------------*/
    
    public void printaPersonagens() {
    	for(Personagem p : narrativa.getPersonagens()) {
    		System.out.println(p.toString());
    	}
    }
    
    public void printaCenarios() {
    	for(Cenario c : narrativa.getCenarios()) {
    		System.out.println(c.toString());
    	}
    }
    
    public void printaCenas() {
    	for(Cena c: cenas) {
    		System.out.println(c.toString());
    	}
    }
    
} // DramaturgoInterpretador
