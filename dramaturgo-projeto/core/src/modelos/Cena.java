package modelos;

import java.util.LinkedList;
import java.util.List;

import acao.Acao;

public class Cena {
	
	// Como eh obrigatorio que as cenas sejam nomeadas apenas
	// por numeros e sequencialmente, eh salvo apenas o numero
	// dela como nome identificador.
    private int nome;
    // Lista de acoes que sao presentes nessa cena.
    // Uma acao pode ser entrada de personagem,
    // tocar uma musica, trocar um cenario, etc.
    List<Acao> acoes;
    
    public Cena(int nome) {
    	this.nome = nome;
    	acoes = new LinkedList<Acao>();
    }
    
    public int getNome() {
        return nome;
    }
    
    public void setNome(int nome) {
        this.nome = nome;
    }
    
    public void addAcao(Acao acao) {
    	acoes.add(acao);
    }
    
    public Acao getAcao(int acaoAtual) {
    	if(acaoAtual < acoes.size()) {
    		Acao acao = acoes.get(acaoAtual);
    		return acao;
    	} else {
			return null;
    	}
    }

	@Override
	public String toString() {
		return "Cena [nome=" + nome + ", acoes=" + acoes + "]";
	}
    
} // Cena