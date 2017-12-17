package acao;

import modelos.Narrativa;

public class AcaoMudarEmocaoPersonagem extends Acao {
	
	private int indexPersonagemEmCena;
	private int indexPersonagem;
	String nome;
	String emocao;
	
	public AcaoMudarEmocaoPersonagem(Narrativa narrativa, String nome, String emocao) {
		super(narrativa);
		this.nome = nome;
		indexPersonagem = narrativa.indexDaPersonagem(nome + "[" + emocao + "]");
	}
	
	public void executaAcao() {
		indexPersonagemEmCena = narrativa.indexDaPersonagemEmCena(nome);
		narrativa.mudaEmocao(indexPersonagemEmCena, indexPersonagem);
	}
	
} // AcaoMudarEmocaoPersonagem