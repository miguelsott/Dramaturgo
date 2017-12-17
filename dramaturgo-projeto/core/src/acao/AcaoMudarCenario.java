package acao;

import modelos.Narrativa;

public class AcaoMudarCenario extends Acao {
	
	private int indexCenario;
	
	public AcaoMudarCenario(Narrativa narrativa, String nome) {
		super(narrativa);
		// Pega index do cenario a partir do seu nome
		indexCenario = narrativa.indexDoCenario(nome);
	}
	
	public void executaAcao() {
		narrativa.mudaCenarioAtual(indexCenario);
	}

	@Override
	public String toString() {
		return "AcaoMudarCenario [indexCenario=" + indexCenario + "]";
	}
	
} // AcaoMudarCenario
