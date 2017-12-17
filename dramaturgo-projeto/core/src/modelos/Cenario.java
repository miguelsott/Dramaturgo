package modelos;

import com.badlogic.gdx.graphics.Texture;

public class Cenario {
    private String nome;
    private Texture textura;
    private String caminho;
    
    public Cenario(String nome, String caminho) {
    	this.nome = nome;
    	this.caminho = caminho;
    	textura = new Texture(caminho);
    }
    
    public String getNome() {
    	return nome;
    }
    
    public String getCaminho() {
    	return caminho;
    }
    
    public Texture getTextura() {
    	return textura;
    }

	@Override
	public String toString() {
		return "Cenario [nome=" + nome + ", caminho=" + caminho + "]";
	}
    
} // Cenario
