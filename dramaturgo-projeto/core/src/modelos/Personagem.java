package modelos;

import com.badlogic.gdx.graphics.Texture;

public class Personagem {
    
    // Nome e emocao sao implementados como uma string concatenada,
	// implicando que, na verdade, cada declaracao de: 
	// Personagem[emocao] (Exemplo: Joao[triste]), eh uma personagem nova.
	// Ao inves de considerar que uma personagem possui uma ou mais emocoes,
	// cada par personagem+emocao eh uma personagem nova.
	private String nomeEmocao;
	// Caminho para a textura dessa emocao de personagem.
    private String caminho;
    // Textura da personagem
    private Texture textura;
   
    public Personagem(String nomeEmocao, String caminho) {
    	this.nomeEmocao = nomeEmocao;
    	this.caminho = caminho;
    	textura = new Texture(caminho);
    }

    public String getNome() {
    	return nomeEmocao;
    }
    
    public Texture getTextura() {
    	return textura;
    }

	@Override
	public String toString() {
		return "Personagem [nomeEmocao=" + nomeEmocao + ", caminho=" + caminho + "]";
	}
          
} // Personagem
