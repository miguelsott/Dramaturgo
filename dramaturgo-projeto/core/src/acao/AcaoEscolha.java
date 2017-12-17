package acao;

import java.util.LinkedHashMap;
import java.util.Map;

import modelos.Narrativa;

public class AcaoEscolha extends Acao {
	
	Map<String, Integer> escolhas; 
	
/*	// A escolha eh apresentada em forma textual, e
	private String escolha;
	// Vai para a cena abaixo se for escolhida
	private int cenaSeEscolha;
	*/
	public AcaoEscolha(Narrativa narrativa, Map<String, Integer> escolhas) {
		super(narrativa);
		this.escolhas = new LinkedHashMap<String, Integer>();
		this.escolhas = escolhas;
	}

	public void executaAcao() {
		narrativa.addEscolha(escolhas);
	}

	@Override
	public String toString() {
		return "AcaoEscolha [escolhas=" + escolhas + "]";
	}
	
} // AcaoEscolha