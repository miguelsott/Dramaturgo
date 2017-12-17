// Generated from Dramaturgo.g4 by ANTLR 4.7
package dramaturgo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DramaturgoParser}.
 */
public interface DramaturgoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(DramaturgoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(DramaturgoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(DramaturgoParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(DramaturgoParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(DramaturgoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(DramaturgoParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(DramaturgoParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(DramaturgoParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#personagens}.
	 * @param ctx the parse tree
	 */
	void enterPersonagens(DramaturgoParser.PersonagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#personagens}.
	 * @param ctx the parse tree
	 */
	void exitPersonagens(DramaturgoParser.PersonagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#cenarios}.
	 * @param ctx the parse tree
	 */
	void enterCenarios(DramaturgoParser.CenariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#cenarios}.
	 * @param ctx the parse tree
	 */
	void exitCenarios(DramaturgoParser.CenariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#recursos}.
	 * @param ctx the parse tree
	 */
	void enterRecursos(DramaturgoParser.RecursosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#recursos}.
	 * @param ctx the parse tree
	 */
	void exitRecursos(DramaturgoParser.RecursosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#cena}.
	 * @param ctx the parse tree
	 */
	void enterCena(DramaturgoParser.CenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#cena}.
	 * @param ctx the parse tree
	 */
	void exitCena(DramaturgoParser.CenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#nome_cena}.
	 * @param ctx the parse tree
	 */
	void enterNome_cena(DramaturgoParser.Nome_cenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#nome_cena}.
	 * @param ctx the parse tree
	 */
	void exitNome_cena(DramaturgoParser.Nome_cenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#mais_cenas}.
	 * @param ctx the parse tree
	 */
	void enterMais_cenas(DramaturgoParser.Mais_cenasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#mais_cenas}.
	 * @param ctx the parse tree
	 */
	void exitMais_cenas(DramaturgoParser.Mais_cenasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#mais_personagens}.
	 * @param ctx the parse tree
	 */
	void enterMais_personagens(DramaturgoParser.Mais_personagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#mais_personagens}.
	 * @param ctx the parse tree
	 */
	void exitMais_personagens(DramaturgoParser.Mais_personagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#mais_cenarios}.
	 * @param ctx the parse tree
	 */
	void enterMais_cenarios(DramaturgoParser.Mais_cenariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#mais_cenarios}.
	 * @param ctx the parse tree
	 */
	void exitMais_cenarios(DramaturgoParser.Mais_cenariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#recurso}.
	 * @param ctx the parse tree
	 */
	void enterRecurso(DramaturgoParser.RecursoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#recurso}.
	 * @param ctx the parse tree
	 */
	void exitRecurso(DramaturgoParser.RecursoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#mais_recursos}.
	 * @param ctx the parse tree
	 */
	void enterMais_recursos(DramaturgoParser.Mais_recursosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#mais_recursos}.
	 * @param ctx the parse tree
	 */
	void exitMais_recursos(DramaturgoParser.Mais_recursosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#narrativa}.
	 * @param ctx the parse tree
	 */
	void enterNarrativa(DramaturgoParser.NarrativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#narrativa}.
	 * @param ctx the parse tree
	 */
	void exitNarrativa(DramaturgoParser.NarrativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#pulo}.
	 * @param ctx the parse tree
	 */
	void enterPulo(DramaturgoParser.PuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#pulo}.
	 * @param ctx the parse tree
	 */
	void exitPulo(DramaturgoParser.PuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#estado_personagem}.
	 * @param ctx the parse tree
	 */
	void enterEstado_personagem(DramaturgoParser.Estado_personagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#estado_personagem}.
	 * @param ctx the parse tree
	 */
	void exitEstado_personagem(DramaturgoParser.Estado_personagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#tipo_som}.
	 * @param ctx the parse tree
	 */
	void enterTipo_som(DramaturgoParser.Tipo_somContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#tipo_som}.
	 * @param ctx the parse tree
	 */
	void exitTipo_som(DramaturgoParser.Tipo_somContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#entrelinhas}.
	 * @param ctx the parse tree
	 */
	void enterEntrelinhas(DramaturgoParser.EntrelinhasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#entrelinhas}.
	 * @param ctx the parse tree
	 */
	void exitEntrelinhas(DramaturgoParser.EntrelinhasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#dialogo}.
	 * @param ctx the parse tree
	 */
	void enterDialogo(DramaturgoParser.DialogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#dialogo}.
	 * @param ctx the parse tree
	 */
	void exitDialogo(DramaturgoParser.DialogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#escolha}.
	 * @param ctx the parse tree
	 */
	void enterEscolha(DramaturgoParser.EscolhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#escolha}.
	 * @param ctx the parse tree
	 */
	void exitEscolha(DramaturgoParser.EscolhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#mais_escolhas}.
	 * @param ctx the parse tree
	 */
	void enterMais_escolhas(DramaturgoParser.Mais_escolhasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#mais_escolhas}.
	 * @param ctx the parse tree
	 */
	void exitMais_escolhas(DramaturgoParser.Mais_escolhasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#novo_cenario}.
	 * @param ctx the parse tree
	 */
	void enterNovo_cenario(DramaturgoParser.Novo_cenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#novo_cenario}.
	 * @param ctx the parse tree
	 */
	void exitNovo_cenario(DramaturgoParser.Novo_cenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#nova_entrada}.
	 * @param ctx the parse tree
	 */
	void enterNova_entrada(DramaturgoParser.Nova_entradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#nova_entrada}.
	 * @param ctx the parse tree
	 */
	void exitNova_entrada(DramaturgoParser.Nova_entradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#mudanca_emocao}.
	 * @param ctx the parse tree
	 */
	void enterMudanca_emocao(DramaturgoParser.Mudanca_emocaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#mudanca_emocao}.
	 * @param ctx the parse tree
	 */
	void exitMudanca_emocao(DramaturgoParser.Mudanca_emocaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#nova_saida}.
	 * @param ctx the parse tree
	 */
	void enterNova_saida(DramaturgoParser.Nova_saidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#nova_saida}.
	 * @param ctx the parse tree
	 */
	void exitNova_saida(DramaturgoParser.Nova_saidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#nova_musica}.
	 * @param ctx the parse tree
	 */
	void enterNova_musica(DramaturgoParser.Nova_musicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#nova_musica}.
	 * @param ctx the parse tree
	 */
	void exitNova_musica(DramaturgoParser.Nova_musicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#novo_som}.
	 * @param ctx the parse tree
	 */
	void enterNovo_som(DramaturgoParser.Novo_somContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#novo_som}.
	 * @param ctx the parse tree
	 */
	void exitNovo_som(DramaturgoParser.Novo_somContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#outra_entrada}.
	 * @param ctx the parse tree
	 */
	void enterOutra_entrada(DramaturgoParser.Outra_entradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#outra_entrada}.
	 * @param ctx the parse tree
	 */
	void exitOutra_entrada(DramaturgoParser.Outra_entradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#outra_mudanca}.
	 * @param ctx the parse tree
	 */
	void enterOutra_mudanca(DramaturgoParser.Outra_mudancaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#outra_mudanca}.
	 * @param ctx the parse tree
	 */
	void exitOutra_mudanca(DramaturgoParser.Outra_mudancaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DramaturgoParser#outra_saida}.
	 * @param ctx the parse tree
	 */
	void enterOutra_saida(DramaturgoParser.Outra_saidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DramaturgoParser#outra_saida}.
	 * @param ctx the parse tree
	 */
	void exitOutra_saida(DramaturgoParser.Outra_saidaContext ctx);
}