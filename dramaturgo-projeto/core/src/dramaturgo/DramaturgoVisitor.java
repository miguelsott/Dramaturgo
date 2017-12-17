// Generated from Dramaturgo.g4 by ANTLR 4.7
package dramaturgo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DramaturgoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DramaturgoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(DramaturgoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalho(DramaturgoParser.CabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(DramaturgoParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(DramaturgoParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#personagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonagens(DramaturgoParser.PersonagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#cenarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenarios(DramaturgoParser.CenariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursos(DramaturgoParser.RecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCena(DramaturgoParser.CenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#nome_cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_cena(DramaturgoParser.Nome_cenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#mais_cenas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_cenas(DramaturgoParser.Mais_cenasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#mais_personagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_personagens(DramaturgoParser.Mais_personagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#mais_cenarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_cenarios(DramaturgoParser.Mais_cenariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#recurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurso(DramaturgoParser.RecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#mais_recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_recursos(DramaturgoParser.Mais_recursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#narrativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNarrativa(DramaturgoParser.NarrativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#pulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPulo(DramaturgoParser.PuloContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#estado_personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstado_personagem(DramaturgoParser.Estado_personagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#tipo_som}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_som(DramaturgoParser.Tipo_somContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#entrelinhas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrelinhas(DramaturgoParser.EntrelinhasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#dialogo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogo(DramaturgoParser.DialogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#escolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(DramaturgoParser.EscolhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#mais_escolhas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_escolhas(DramaturgoParser.Mais_escolhasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#novo_cenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovo_cenario(DramaturgoParser.Novo_cenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#nova_entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNova_entrada(DramaturgoParser.Nova_entradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#mudanca_emocao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMudanca_emocao(DramaturgoParser.Mudanca_emocaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#nova_saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNova_saida(DramaturgoParser.Nova_saidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#nova_musica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNova_musica(DramaturgoParser.Nova_musicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#novo_som}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovo_som(DramaturgoParser.Novo_somContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#outra_entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutra_entrada(DramaturgoParser.Outra_entradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#outra_mudanca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutra_mudanca(DramaturgoParser.Outra_mudancaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DramaturgoParser#outra_saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutra_saida(DramaturgoParser.Outra_saidaContext ctx);
}