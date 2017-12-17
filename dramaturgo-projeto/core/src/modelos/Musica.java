package modelos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class Musica {
	
	private String nome;
    private String caminho;
    private Music musica;

    public Musica(String nome, String caminho) {
    	this.nome = nome;
    	this.caminho = caminho;
    	
    	musica = Gdx.audio.newMusic(Gdx.files.internal(caminho));
    }
    
    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }
    
    public Music getMusica() {
    	return musica;
    }
    
} // Musica