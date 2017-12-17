package modelos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

import acao.Acao;

public class Narrativa {
	
	/* Classe narrativa mantem todas as instancias de entidades
	* declaradas em um script Dramaturgo. 
	* Essas entidades podem ser: personagens, cenarios, sons, cenas, etc.
	* Alem de manter listas com todos os 
	* objetos de uma determinada entidade,
    * tambem mantem objetos que estao vigentes na cena atual
    */
	
    private String titulo;
    private List<Personagem> personagens;
    private List<Cenario> cenarios;
    private List<Musica> musicas;
    private List<Som> sons;
    private List<Cena> cenas;
    private Map<String, Integer> escolhas;
    
    private int cenarioAtual;
    
    private List<Integer> personagensEmCena;
    
    public int cenaAtual;
    
    public int musicaAtual;
    private int somAtual;
    
    public Acao acao;
    public int acaoAtual;
    
    private String falante;
    private String fala;
    
    public Narrativa() {
    	
    	titulo = "";
    	
        personagens = new ArrayList<Personagem>();
        cenarios = new ArrayList<Cenario>();
        musicas = new ArrayList<Musica>();
        sons = new ArrayList<Som>();
        cenas = new ArrayList<Cena>();
        escolhas = new LinkedHashMap<String, Integer>();
        
        personagensEmCena = new ArrayList<Integer>();
        
        cenarioAtual = -1;
        cenaAtual = 0;
        
        musicaAtual = -1;
        somAtual = -1;
        
        acao = new Acao(this);
        acaoAtual = 0;
        
        falante = "";
        fala = "";
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void addPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }
    
    public void addCenario(Cenario cenario) {
        cenarios.add(cenario);
    }
    
    public void addMusica(Musica musica) {
        musicas.add(musica);
    }
    
    public void addSom(Som som) {
        sons.add(som);
    }
    
    public void addCena(Cena cena) {
    	cenas.add(cena);
    }
    
    // Funcao para retornar index de uma personagem
    // dentro da lista de personagens a partir do seu nome
    public int indexDaPersonagem(String nome) {
    	for(int i = 0; i < personagens.size(); i++)
    		if(personagens.get(i).getNome().equals(nome))
    			return i;
    	
    	return -1;
    }
    
    // Funcao para retornar index de um cenario
    // dentro da lista de cenarios a partir do seu nome
    public int indexDoCenario(String nome) {
    	for(int i = 0; i < cenarios.size(); i++)
    		if(cenarios.get(i).getNome().equals(nome))
    			return i;
    	
    	return -1;
    }
    
    // Funcao para retornar index do personagem
    // com base na lista de personagens em cena.
    // Usado pela acao de sair de cena.
    public int indexDaPersonagemEmCena(String nome) {
    	
    	// Abaixo, um loop bem feio digno de Java.
    	// Basicamente ele percorre a lista de personagensEmCena 
    	// (uma lista de indices inteiros), e pega um personagem
    	// em cada indice e verifica se contem o nome
    	for(int i = 0; i < personagensEmCena.size(); i++) {
    		if(personagens.get(personagensEmCena.get(i)).getNome().contains(nome))
    			return i;
    	}
    	
    	return -1;
    }
    
    public int indexDaMusica(String nome) {
    	for(int i = 0; i < musicas.size(); i++)
    		if(musicas.get(i).getNome().equals(nome))
    			return i;
    	
    	return -1;
    }
    
    public int indexDoSom(String nome) {
    	for(int i = 0; i < sons.size(); i++)
    		if(sons.get(i).getNome().equals(nome))
    			return i;
    	
    	return -1;
    }
    
    public List<Personagem> getPersonagens() {
    	return personagens;
    }
    
    public List<Cenario> getCenarios() {
    	return cenarios;
    }
    
    public Texture getCenarioAtual() {
    	if(cenarioAtual != -1) 
    		return cenarios.get(cenarioAtual).getTextura();
    	else
    		return null;
    }
    
    public Music getMusicaAtual() {
    	if(musicaAtual != -1)
    		return musicas.get(musicaAtual).getMusica();
    	else 
    		return null;
    }
    
    public Sound getSomAtual() {
    	if(somAtual != -1)
    		return sons.get(somAtual).getSom();
    	else
    		return null;
    }
    
    public String getFalante() {
    	return falante;
    }
    
    public String getFala() {
    	return fala;
    }
    
    public Map<String, Integer> getEscolhas() {
    	if(escolhas.size() != 0) {
    		return escolhas;
    	} else {
    		return null;
    	}
    }
    
    public List<Integer> getPersonagensEmCena() {
    	return personagensEmCena;
    }
    
    public Texture getTexturaPersonagem(int index) {
    	return personagens.get(index).getTextura();
    }
    
    public Acao getAcaoAtual() {
    	return cenas.get(cenaAtual).getAcao(acaoAtual);
    }
    
    public boolean proximaAcao() {
    	
    	if(cenaAtual < cenas.size()) {
    		//System.out.println("Cena " + cenas.get(cenaAtual).getNome());
    		
	    	acao = cenas.get(cenaAtual).getAcao(acaoAtual);
	    	
	    	fala = "";
	    	escolhas.clear();
	    	
	    	// Se ainda tem acao na cena atual
	    	if(acao != null) {
	    		
	    		//System.out.println(acao.toString());
	    		
	    		acao.executaAcao();
	    		
	    		acaoAtual++;
	    		
	    	// Se vai trocar de cena
	    	} else {
	    		
	    		acaoAtual = 0;
	    		cenaAtual++;
	    
	    	}
	    	
	    	return true;
	    	
    	} else {
    		return false;
    	}
    }
    
    /*------------------------------------------*/
    /*------------ FUNCOES DE ACOES ------------*/
    /*------------------------------------------*/
    
    /* Abaixo estao funcoes utilizadas por acoes
     * para mudar alguma coisa da classe narrativa
     * afetando o que acontece no jogo. Logo apos uma 
     * acao terminar, a proxima acao sera chamada da lista
     * de acoes de uma determinada cena.
     */
    
    public void entraEmCena(int index) {
    	personagensEmCena.add(index);
    }
    
    public void mudaCenarioAtual(int index) {
    	// Cenario atual recebe 
    	// posicao da lista de cenarios
    	cenarioAtual = index;
    }
    
    public void saiDeCena(int index) {
    	personagensEmCena.remove(index);
    }
    
    public void mudaEmocao(int indexPersonagemEmCena, int indexPersonagem) {
    	personagensEmCena.set(indexPersonagemEmCena, indexPersonagem);
    }
    
    public void mudaMusicaAtual(int index) {
    	if(musicaAtual != -1) {
    		getMusicaAtual().stop();
    	}
    	
    	musicaAtual = index;
    }
    
    public void mudaSomAtual(int index) { 
    	somAtual = index;
    	getSomAtual().play();
    }
    
    public void mudaFala(String falante, String fala) {
    	this.falante = falante;
    	this.fala = fala;
    }
    
    public void addEscolha(Map<String, Integer> mapaEscolhas) {
    	for(String e : mapaEscolhas.keySet()) {
    		escolhas.put(e, mapaEscolhas.get(e));
    	}
    }
    
    public void pulaCena(int cenaAPular) {
    	acaoAtual = 0;
    	
    	if(cenaAPular == 0) {
    		Gdx.app.exit();
    	} else {
    		System.out.println(cenaAPular);
    		cenaAtual = cenaAPular - 1;
    	}
    }
	
} // Narrativa
