package acao;

import modelos.Narrativa;

public class AcaoSairPersonagem extends Acao {
	
	// A saida de personagens eh feita utilizando o index do personagem em cena.
	private int indexPersonagemEmCena;
	private String nome;
	
	public AcaoSairPersonagem(Narrativa narrativa, String nome) {
		super(narrativa);
		this.nome = nome;
	}
	
	// Os personagens sao salvos em narrativa com nome + emocao concatenados.
	// Isso deve ser tratado ja que a saida de personagem eh feita chamando
	// apenas seu nome.
	public void executaAcao() {
		indexPersonagemEmCena = narrativa.indexDaPersonagemEmCena(nome);
		narrativa.saiDeCena(indexPersonagemEmCena);
	}

	@Override
	public String toString() {
		return "AcaoSairPersonagem [indexPersonagem=" + indexPersonagemEmCena + "]";
	}
		
} // AcaoSairPersonagem
