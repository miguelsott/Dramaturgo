package acao;

import modelos.Narrativa;

public class AcaoTocarSom extends Acao {

	private int indexSom;
	
	public AcaoTocarSom(Narrativa narrativa, String som) {
		super(narrativa);
		
		// Pega index da musica a partir do seu nome
		indexSom = narrativa.indexDoSom(som);
	}
	
	public void executaAcao() {
		narrativa.mudaSomAtual(indexSom);
	}

	@Override
	public String toString() {
		return "AcaoTocarSom [indexSom=" + indexSom + "]";
	}
	
} // AcaoTocarSom