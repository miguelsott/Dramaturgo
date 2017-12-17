package modelos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class Som {
	
    private String nome;
    private String caminho;
    private Sound som;
    
    public Som(String nome, String caminho) {
    	this.nome = nome;
    	this.caminho = caminho;
    	
    	som = Gdx.audio.newSound(Gdx.files.internal(caminho));
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }
    
    public Sound getSom() {
    	return som;
    }

} // Som
