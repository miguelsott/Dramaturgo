package acao;

import modelos.Narrativa;

public class AcaoPulo extends Acao {
	
	private int cenaAPular;
	
	public AcaoPulo(Narrativa narrativa, int cenaAPular) {
		super(narrativa);
		this.cenaAPular = cenaAPular;
	}
	
	public void executaAcao() {
		narrativa.pulaCena(cenaAPular);
	}

	@Override
	public String toString() {
		return "AcaoPulo [cenaAPular=" + cenaAPular + "]";
	}
	
} // AcaoPulo
