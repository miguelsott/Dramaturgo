package acao;

import modelos.Narrativa;

public class AcaoTocarMusica extends Acao {

	private int indexMusica;
	
	public AcaoTocarMusica(Narrativa narrativa, String musica) {
		super(narrativa);
		
		// Pega index da musica a partir do seu nome
		indexMusica = narrativa.indexDaMusica(musica);
	}
	
	public void executaAcao() {
		narrativa.mudaMusicaAtual(indexMusica);
	}

	@Override
	public String toString() {
		return "AcaoTocarMusica [indexMusica=" + indexMusica + "]";
	}
	
} // AcaoTocaMusica