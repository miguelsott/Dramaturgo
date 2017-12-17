// Generated from Dramaturgo.g4 by ANTLR 4.7
package dramaturgo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DramaturgoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, CADEIA=26, PERSONAGEM=27, IDENT=28, NUM=29, WS=30;
	public static final int
		RULE_programa = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_titulo = 3, 
		RULE_personagens = 4, RULE_cenarios = 5, RULE_recursos = 6, RULE_cena = 7, 
		RULE_nome_cena = 8, RULE_mais_cenas = 9, RULE_mais_personagens = 10, RULE_mais_cenarios = 11, 
		RULE_recurso = 12, RULE_mais_recursos = 13, RULE_narrativa = 14, RULE_pulo = 15, 
		RULE_estado_personagem = 16, RULE_tipo_som = 17, RULE_entrelinhas = 18, 
		RULE_dialogo = 19, RULE_escolha = 20, RULE_mais_escolhas = 21, RULE_novo_cenario = 22, 
		RULE_nova_entrada = 23, RULE_mudanca_emocao = 24, RULE_nova_saida = 25, 
		RULE_nova_musica = 26, RULE_novo_som = 27, RULE_outra_entrada = 28, RULE_outra_mudanca = 29, 
		RULE_outra_saida = 30;
	public static final String[] ruleNames = {
		"programa", "cabecalho", "corpo", "titulo", "personagens", "cenarios", 
		"recursos", "cena", "nome_cena", "mais_cenas", "mais_personagens", "mais_cenarios", 
		"recurso", "mais_recursos", "narrativa", "pulo", "estado_personagem", 
		"tipo_som", "entrelinhas", "dialogo", "escolha", "mais_escolhas", "novo_cenario", 
		"nova_entrada", "mudanca_emocao", "nova_saida", "nova_musica", "novo_som", 
		"outra_entrada", "outra_mudanca", "outra_saida"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FIM'", "'TITULO:'", "'PERSONAGENS:'", "'.'", "'CENARIOS:'", "'RECURSOS:'", 
		"'-'", "'CENA'", "','", "'='", "'('", "')'", "'PULE'", "'PULO FIM'", "'['", 
		"']'", "'musica'", "'som'", "'ESCOLHA:'", "'va'", "'para'", "'cenario'", 
		"'entra'", "'sai'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CADEIA", "PERSONAGEM", "IDENT", "NUM", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Dramaturgo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DramaturgoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CabecalhoContext cabecalho() {
			return getRuleContext(CabecalhoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			cabecalho();
			setState(63);
			corpo();
			setState(64);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabecalhoContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public PersonagensContext personagens() {
			return getRuleContext(PersonagensContext.class,0);
		}
		public CenariosContext cenarios() {
			return getRuleContext(CenariosContext.class,0);
		}
		public RecursosContext recursos() {
			return getRuleContext(RecursosContext.class,0);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitCabecalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitCabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			titulo();
			setState(67);
			personagens();
			setState(68);
			cenarios();
			setState(69);
			recursos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public CenaContext cena() {
			return getRuleContext(CenaContext.class,0);
		}
		public Mais_cenasContext mais_cenas() {
			return getRuleContext(Mais_cenasContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			cena();
			setState(72);
			mais_cenas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(DramaturgoParser.CADEIA, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
			setState(75);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonagensContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(DramaturgoParser.PERSONAGEM, 0); }
		public Mais_personagensContext mais_personagens() {
			return getRuleContext(Mais_personagensContext.class,0);
		}
		public PersonagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterPersonagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitPersonagens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitPersonagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonagensContext personagens() throws RecognitionException {
		PersonagensContext _localctx = new PersonagensContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_personagens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(78);
			match(PERSONAGEM);
			setState(79);
			mais_personagens();
			setState(80);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CenariosContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Mais_cenariosContext mais_cenarios() {
			return getRuleContext(Mais_cenariosContext.class,0);
		}
		public CenariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cenarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterCenarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitCenarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitCenarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenariosContext cenarios() throws RecognitionException {
		CenariosContext _localctx = new CenariosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cenarios);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(83);
			match(IDENT);
			setState(84);
			mais_cenarios();
			setState(85);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursosContext extends ParserRuleContext {
		public RecursoContext recurso() {
			return getRuleContext(RecursoContext.class,0);
		}
		public Mais_recursosContext mais_recursos() {
			return getRuleContext(Mais_recursosContext.class,0);
		}
		public RecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterRecursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitRecursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursosContext recursos() throws RecognitionException {
		RecursosContext _localctx = new RecursosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recursos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(88);
			recurso();
			setState(89);
			mais_recursos();
			setState(90);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CenaContext extends ParserRuleContext {
		public Nome_cenaContext nome_cena() {
			return getRuleContext(Nome_cenaContext.class,0);
		}
		public NarrativaContext narrativa() {
			return getRuleContext(NarrativaContext.class,0);
		}
		public PuloContext pulo() {
			return getRuleContext(PuloContext.class,0);
		}
		public CenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterCena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitCena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitCena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenaContext cena() throws RecognitionException {
		CenaContext _localctx = new CenaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__6);
			setState(93);
			nome_cena();
			setState(94);
			match(T__6);
			setState(95);
			narrativa();
			setState(96);
			pulo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nome_cenaContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DramaturgoParser.NUM, 0); }
		public Nome_cenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_cena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNome_cena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNome_cena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNome_cena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_cenaContext nome_cena() throws RecognitionException {
		Nome_cenaContext _localctx = new Nome_cenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nome_cena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__7);
			setState(99);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_cenasContext extends ParserRuleContext {
		public CenaContext cena() {
			return getRuleContext(CenaContext.class,0);
		}
		public Mais_cenasContext mais_cenas() {
			return getRuleContext(Mais_cenasContext.class,0);
		}
		public Mais_cenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_cenas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterMais_cenas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitMais_cenas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitMais_cenas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_cenasContext mais_cenas() throws RecognitionException {
		Mais_cenasContext _localctx = new Mais_cenasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mais_cenas);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				cena();
				setState(102);
				mais_cenas();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_personagensContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(DramaturgoParser.PERSONAGEM, 0); }
		public Mais_personagensContext mais_personagens() {
			return getRuleContext(Mais_personagensContext.class,0);
		}
		public Mais_personagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_personagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterMais_personagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitMais_personagens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitMais_personagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_personagensContext mais_personagens() throws RecognitionException {
		Mais_personagensContext _localctx = new Mais_personagensContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mais_personagens);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__8);
				setState(108);
				match(PERSONAGEM);
				setState(109);
				mais_personagens();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_cenariosContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Mais_cenariosContext mais_cenarios() {
			return getRuleContext(Mais_cenariosContext.class,0);
		}
		public Mais_cenariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_cenarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterMais_cenarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitMais_cenarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitMais_cenarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_cenariosContext mais_cenarios() throws RecognitionException {
		Mais_cenariosContext _localctx = new Mais_cenariosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_cenarios);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__8);
				setState(114);
				match(IDENT);
				setState(115);
				mais_cenarios();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursoContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(DramaturgoParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Tipo_somContext tipo_som() {
			return getRuleContext(Tipo_somContext.class,0);
		}
		public RecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursoContext recurso() throws RecognitionException {
		RecursoContext _localctx = new RecursoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recurso);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				estado_personagem();
				setState(120);
				match(T__9);
				setState(121);
				match(CADEIA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(IDENT);
				setState(124);
				match(T__9);
				setState(125);
				match(CADEIA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(IDENT);
				setState(127);
				match(T__10);
				setState(128);
				tipo_som();
				setState(129);
				match(T__11);
				setState(130);
				match(T__9);
				setState(131);
				match(CADEIA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_recursosContext extends ParserRuleContext {
		public RecursoContext recurso() {
			return getRuleContext(RecursoContext.class,0);
		}
		public Mais_recursosContext mais_recursos() {
			return getRuleContext(Mais_recursosContext.class,0);
		}
		public Mais_recursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterMais_recursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitMais_recursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitMais_recursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_recursosContext mais_recursos() throws RecognitionException {
		Mais_recursosContext _localctx = new Mais_recursosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mais_recursos);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(136);
				recurso();
				setState(137);
				mais_recursos();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NarrativaContext extends ParserRuleContext {
		public EntrelinhasContext entrelinhas() {
			return getRuleContext(EntrelinhasContext.class,0);
		}
		public NarrativaContext narrativa() {
			return getRuleContext(NarrativaContext.class,0);
		}
		public DialogoContext dialogo() {
			return getRuleContext(DialogoContext.class,0);
		}
		public EscolhaContext escolha() {
			return getRuleContext(EscolhaContext.class,0);
		}
		public NarrativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_narrativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNarrativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNarrativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNarrativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NarrativaContext narrativa() throws RecognitionException {
		NarrativaContext _localctx = new NarrativaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_narrativa);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				entrelinhas();
				setState(143);
				narrativa();
				}
				break;
			case CADEIA:
			case PERSONAGEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				dialogo();
				setState(146);
				narrativa();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				escolha();
				setState(149);
				narrativa();
				}
				break;
			case T__0:
			case T__6:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PuloContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DramaturgoParser.NUM, 0); }
		public PuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterPulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitPulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitPulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuloContext pulo() throws RecognitionException {
		PuloContext _localctx = new PuloContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pulo);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__12);
				setState(155);
				match(NUM);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__13);
				}
				break;
			case T__0:
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Estado_personagemContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(DramaturgoParser.PERSONAGEM, 0); }
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Estado_personagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterEstado_personagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitEstado_personagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitEstado_personagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estado_personagemContext estado_personagem() throws RecognitionException {
		Estado_personagemContext _localctx = new Estado_personagemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_estado_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(PERSONAGEM);
			setState(161);
			match(T__14);
			setState(162);
			match(IDENT);
			setState(163);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_somContext extends ParserRuleContext {
		public Tipo_somContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_som; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterTipo_som(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitTipo_som(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitTipo_som(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_somContext tipo_som() throws RecognitionException {
		Tipo_somContext _localctx = new Tipo_somContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo_som);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntrelinhasContext extends ParserRuleContext {
		public Novo_cenarioContext novo_cenario() {
			return getRuleContext(Novo_cenarioContext.class,0);
		}
		public Nova_entradaContext nova_entrada() {
			return getRuleContext(Nova_entradaContext.class,0);
		}
		public Mudanca_emocaoContext mudanca_emocao() {
			return getRuleContext(Mudanca_emocaoContext.class,0);
		}
		public Nova_saidaContext nova_saida() {
			return getRuleContext(Nova_saidaContext.class,0);
		}
		public Nova_musicaContext nova_musica() {
			return getRuleContext(Nova_musicaContext.class,0);
		}
		public Novo_somContext novo_som() {
			return getRuleContext(Novo_somContext.class,0);
		}
		public EntrelinhasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrelinhas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterEntrelinhas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitEntrelinhas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitEntrelinhas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntrelinhasContext entrelinhas() throws RecognitionException {
		EntrelinhasContext _localctx = new EntrelinhasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_entrelinhas);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				novo_cenario();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				nova_entrada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				mudanca_emocao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				nova_saida();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				nova_musica();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				novo_som();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DialogoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(DramaturgoParser.CADEIA, 0); }
		public TerminalNode PERSONAGEM() { return getToken(DramaturgoParser.PERSONAGEM, 0); }
		public DialogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterDialogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitDialogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitDialogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialogoContext dialogo() throws RecognitionException {
		DialogoContext _localctx = new DialogoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dialogo);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(CADEIA);
				}
				break;
			case PERSONAGEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(PERSONAGEM);
				setState(177);
				match(T__6);
				setState(178);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscolhaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(DramaturgoParser.CADEIA, 0); }
		public Nome_cenaContext nome_cena() {
			return getRuleContext(Nome_cenaContext.class,0);
		}
		public Mais_escolhasContext mais_escolhas() {
			return getRuleContext(Mais_escolhasContext.class,0);
		}
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitEscolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_escolha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__18);
			setState(182);
			match(CADEIA);
			setState(183);
			match(T__6);
			setState(184);
			match(T__19);
			setState(185);
			match(T__20);
			setState(186);
			nome_cena();
			setState(187);
			mais_escolhas();
			setState(188);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_escolhasContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(DramaturgoParser.CADEIA, 0); }
		public Nome_cenaContext nome_cena() {
			return getRuleContext(Nome_cenaContext.class,0);
		}
		public Mais_escolhasContext mais_escolhas() {
			return getRuleContext(Mais_escolhasContext.class,0);
		}
		public Mais_escolhasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_escolhas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterMais_escolhas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitMais_escolhas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitMais_escolhas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_escolhasContext mais_escolhas() throws RecognitionException {
		Mais_escolhasContext _localctx = new Mais_escolhasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mais_escolhas);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__8);
				setState(191);
				match(CADEIA);
				setState(192);
				match(T__6);
				setState(193);
				match(T__19);
				setState(194);
				match(T__20);
				setState(195);
				nome_cena();
				setState(196);
				mais_escolhas();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Novo_cenarioContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Novo_cenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novo_cenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNovo_cenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNovo_cenario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNovo_cenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Novo_cenarioContext novo_cenario() throws RecognitionException {
		Novo_cenarioContext _localctx = new Novo_cenarioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_novo_cenario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__10);
			setState(202);
			match(T__21);
			setState(203);
			match(IDENT);
			setState(204);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nova_entradaContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public Outra_entradaContext outra_entrada() {
			return getRuleContext(Outra_entradaContext.class,0);
		}
		public Nova_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNova_entrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNova_entrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNova_entrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nova_entradaContext nova_entrada() throws RecognitionException {
		Nova_entradaContext _localctx = new Nova_entradaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nova_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__10);
			setState(207);
			match(T__22);
			setState(208);
			estado_personagem();
			setState(209);
			outra_entrada();
			setState(210);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mudanca_emocaoContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public Outra_mudancaContext outra_mudanca() {
			return getRuleContext(Outra_mudancaContext.class,0);
		}
		public Mudanca_emocaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mudanca_emocao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterMudanca_emocao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitMudanca_emocao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitMudanca_emocao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mudanca_emocaoContext mudanca_emocao() throws RecognitionException {
		Mudanca_emocaoContext _localctx = new Mudanca_emocaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mudanca_emocao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__10);
			setState(213);
			estado_personagem();
			setState(214);
			outra_mudanca();
			setState(215);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nova_saidaContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(DramaturgoParser.PERSONAGEM, 0); }
		public Outra_saidaContext outra_saida() {
			return getRuleContext(Outra_saidaContext.class,0);
		}
		public Nova_saidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNova_saida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNova_saida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNova_saida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nova_saidaContext nova_saida() throws RecognitionException {
		Nova_saidaContext _localctx = new Nova_saidaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nova_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__10);
			setState(218);
			match(T__23);
			setState(219);
			match(PERSONAGEM);
			setState(220);
			outra_saida();
			setState(221);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nova_musicaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Nova_musicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_musica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNova_musica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNova_musica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNova_musica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nova_musicaContext nova_musica() throws RecognitionException {
		Nova_musicaContext _localctx = new Nova_musicaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nova_musica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__10);
			setState(224);
			match(T__16);
			setState(225);
			match(IDENT);
			setState(226);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Novo_somContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DramaturgoParser.IDENT, 0); }
		public Novo_somContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novo_som; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterNovo_som(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitNovo_som(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitNovo_som(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Novo_somContext novo_som() throws RecognitionException {
		Novo_somContext _localctx = new Novo_somContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_novo_som);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__10);
			setState(229);
			match(T__17);
			setState(230);
			match(IDENT);
			setState(231);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outra_entradaContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public Outra_entradaContext outra_entrada() {
			return getRuleContext(Outra_entradaContext.class,0);
		}
		public Outra_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outra_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterOutra_entrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitOutra_entrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitOutra_entrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outra_entradaContext outra_entrada() throws RecognitionException {
		Outra_entradaContext _localctx = new Outra_entradaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_outra_entrada);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__24);
				setState(234);
				estado_personagem();
				setState(235);
				outra_entrada();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outra_mudancaContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public Outra_mudancaContext outra_mudanca() {
			return getRuleContext(Outra_mudancaContext.class,0);
		}
		public Outra_mudancaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outra_mudanca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterOutra_mudanca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitOutra_mudanca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitOutra_mudanca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outra_mudancaContext outra_mudanca() throws RecognitionException {
		Outra_mudancaContext _localctx = new Outra_mudancaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_outra_mudanca);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__24);
				setState(241);
				estado_personagem();
				setState(242);
				outra_mudanca();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outra_saidaContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(DramaturgoParser.PERSONAGEM, 0); }
		public Outra_saidaContext outra_saida() {
			return getRuleContext(Outra_saidaContext.class,0);
		}
		public Outra_saidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outra_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).enterOutra_saida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DramaturgoListener ) ((DramaturgoListener)listener).exitOutra_saida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DramaturgoVisitor ) return ((DramaturgoVisitor<? extends T>)visitor).visitOutra_saida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outra_saidaContext outra_saida() throws RecognitionException {
		Outra_saidaContext _localctx = new Outra_saidaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_outra_saida);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__24);
				setState(248);
				match(PERSONAGEM);
				setState(249);
				outra_saida();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\5\fr\n\f\3"+
		"\r\3\r\3\r\3\r\5\rx\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u008f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009b"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b0\n\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00b6\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ca\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u00f1\n\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u00f8\n\37\3 \3 \3 \3 \5 \u00fe\n \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\3\3\2\23\24\2\u00f5\2@\3\2\2\2"+
		"\4D\3\2\2\2\6I\3\2\2\2\bL\3\2\2\2\nO\3\2\2\2\fT\3\2\2\2\16Y\3\2\2\2\20"+
		"^\3\2\2\2\22d\3\2\2\2\24k\3\2\2\2\26q\3\2\2\2\30w\3\2\2\2\32\u0087\3\2"+
		"\2\2\34\u008e\3\2\2\2\36\u009a\3\2\2\2 \u00a0\3\2\2\2\"\u00a2\3\2\2\2"+
		"$\u00a7\3\2\2\2&\u00af\3\2\2\2(\u00b5\3\2\2\2*\u00b7\3\2\2\2,\u00c9\3"+
		"\2\2\2.\u00cb\3\2\2\2\60\u00d0\3\2\2\2\62\u00d6\3\2\2\2\64\u00db\3\2\2"+
		"\2\66\u00e1\3\2\2\28\u00e6\3\2\2\2:\u00f0\3\2\2\2<\u00f7\3\2\2\2>\u00fd"+
		"\3\2\2\2@A\5\4\3\2AB\5\6\4\2BC\7\3\2\2C\3\3\2\2\2DE\5\b\5\2EF\5\n\6\2"+
		"FG\5\f\7\2GH\5\16\b\2H\5\3\2\2\2IJ\5\20\t\2JK\5\24\13\2K\7\3\2\2\2LM\7"+
		"\4\2\2MN\7\34\2\2N\t\3\2\2\2OP\7\5\2\2PQ\7\35\2\2QR\5\26\f\2RS\7\6\2\2"+
		"S\13\3\2\2\2TU\7\7\2\2UV\7\36\2\2VW\5\30\r\2WX\7\6\2\2X\r\3\2\2\2YZ\7"+
		"\b\2\2Z[\5\32\16\2[\\\5\34\17\2\\]\7\6\2\2]\17\3\2\2\2^_\7\t\2\2_`\5\22"+
		"\n\2`a\7\t\2\2ab\5\36\20\2bc\5 \21\2c\21\3\2\2\2de\7\n\2\2ef\7\37\2\2"+
		"f\23\3\2\2\2gh\5\20\t\2hi\5\24\13\2il\3\2\2\2jl\3\2\2\2kg\3\2\2\2kj\3"+
		"\2\2\2l\25\3\2\2\2mn\7\13\2\2no\7\35\2\2or\5\26\f\2pr\3\2\2\2qm\3\2\2"+
		"\2qp\3\2\2\2r\27\3\2\2\2st\7\13\2\2tu\7\36\2\2ux\5\30\r\2vx\3\2\2\2ws"+
		"\3\2\2\2wv\3\2\2\2x\31\3\2\2\2yz\5\"\22\2z{\7\f\2\2{|\7\34\2\2|\u0088"+
		"\3\2\2\2}~\7\36\2\2~\177\7\f\2\2\177\u0088\7\34\2\2\u0080\u0081\7\36\2"+
		"\2\u0081\u0082\7\r\2\2\u0082\u0083\5$\23\2\u0083\u0084\7\16\2\2\u0084"+
		"\u0085\7\f\2\2\u0085\u0086\7\34\2\2\u0086\u0088\3\2\2\2\u0087y\3\2\2\2"+
		"\u0087}\3\2\2\2\u0087\u0080\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\7\13"+
		"\2\2\u008a\u008b\5\32\16\2\u008b\u008c\5\34\17\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\35\3\2\2"+
		"\2\u0090\u0091\5&\24\2\u0091\u0092\5\36\20\2\u0092\u009b\3\2\2\2\u0093"+
		"\u0094\5(\25\2\u0094\u0095\5\36\20\2\u0095\u009b\3\2\2\2\u0096\u0097\5"+
		"*\26\2\u0097\u0098\5\36\20\2\u0098\u009b\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0090\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\37\3\2\2\2\u009c\u009d\7\17\2\2\u009d\u00a1\7\37\2\2\u009e"+
		"\u00a1\7\20\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4"+
		"\7\21\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6\7\22\2\2\u00a6#\3\2\2\2\u00a7"+
		"\u00a8\t\2\2\2\u00a8%\3\2\2\2\u00a9\u00b0\5.\30\2\u00aa\u00b0\5\60\31"+
		"\2\u00ab\u00b0\5\62\32\2\u00ac\u00b0\5\64\33\2\u00ad\u00b0\5\66\34\2\u00ae"+
		"\u00b0\58\35\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2"+
		"\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\'\3\2\2\2\u00b1\u00b6\7\34\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4\7\t\2"+
		"\2\u00b4\u00b6\7\34\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6"+
		")\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\7\t\2"+
		"\2\u00ba\u00bb\7\26\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00bd\5\22\n\2\u00bd"+
		"\u00be\5,\27\2\u00be\u00bf\7\6\2\2\u00bf+\3\2\2\2\u00c0\u00c1\7\13\2\2"+
		"\u00c1\u00c2\7\34\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5"+
		"\7\27\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\5,\27\2\u00c7\u00ca\3\2\2\2"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca-\3"+
		"\2\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00ce\7\36\2\2\u00ce"+
		"\u00cf\7\16\2\2\u00cf/\3\2\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2\7\31\2"+
		"\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\5:\36\2\u00d4\u00d5\7\16\2\2\u00d5"+
		"\61\3\2\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\5<\37"+
		"\2\u00d9\u00da\7\16\2\2\u00da\63\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc\u00dd"+
		"\7\32\2\2\u00dd\u00de\7\35\2\2\u00de\u00df\5> \2\u00df\u00e0\7\16\2\2"+
		"\u00e0\65\3\2\2\2\u00e1\u00e2\7\r\2\2\u00e2\u00e3\7\23\2\2\u00e3\u00e4"+
		"\7\36\2\2\u00e4\u00e5\7\16\2\2\u00e5\67\3\2\2\2\u00e6\u00e7\7\r\2\2\u00e7"+
		"\u00e8\7\24\2\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\7\16\2\2\u00ea9\3\2\2"+
		"\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\5:\36\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1;\3\2\2\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5"+
		"\5<\37\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8=\3\2\2\2\u00f9\u00fa\7\33\2\2\u00fa\u00fb\7\35\2"+
		"\2\u00fb\u00fe\5> \2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe?\3\2\2\2\17kqw\u0087\u008e\u009a\u00a0\u00af\u00b5\u00c9"+
		"\u00f0\u00f7\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}