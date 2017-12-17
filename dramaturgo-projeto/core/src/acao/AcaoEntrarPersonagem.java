package acao;

import modelos.Narrativa;

public class AcaoEntrarPersonagem extends Acao {
	
	private int indexPersonagem;
	
	public AcaoEntrarPersonagem(Narrativa narrativa, String nomeEmocao) {
		super(narrativa);
		indexPersonagem = narrativa.indexDaPersonagem(nomeEmocao);
	}
	
	public void executaAcao() {
		narrativa.entraEmCena(indexPersonagem);
	}

	@Override
	public String toString() {
		return "AcaoEntrarPersonagem [indexPersonagem=" + indexPersonagem + "]";
	}
	
} // AcaoEntrarPersonagem
