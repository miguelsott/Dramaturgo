package acao;

import modelos.Narrativa;

public class AcaoFala extends Acao {
	
	// Personagem pode ser uma personagem
	// propriamente dita ou o narrador
	private String personagem;
	private String fala;
	
	public AcaoFala(Narrativa narrativa, String personagem, String fala) {
		super(narrativa);
		this.personagem = personagem;
		this.fala = fala;
	}
	
	public void executaAcao() {
		narrativa.mudaFala(personagem, fala);
	}

	@Override
	public String toString() {
		return "AcaoFala [personagem=" + personagem + ", fala=" + fala + "]";
	}
	
} // AcaoFala
