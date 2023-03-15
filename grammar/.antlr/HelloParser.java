// Generated from /home/makowskitomasz/Kompilatory/logotoma/grammar/Hello.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, NAME=35, SIGN_OPERATORS=36, ARITMETIC_OPERATORS=37, 
		NEGATION_OPERATOR=38, LOGIC_OPERATORS=39, COMPARISON_OPERATORS=40, SHAPE=41, 
		BOOL=42, STRING=43, NUMBER=44, EOL=45, WS=46;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_command = 2, RULE_comment = 3, RULE_move = 4, 
		RULE_paint = 5, RULE_linee = 6, RULE_save = 7, RULE_brush_shape = 8, RULE_brush_color = 9, 
		RULE_brush_size = 10, RULE_color = 11, RULE_number = 12, RULE_string = 13, 
		RULE_bool = 14, RULE_shape = 15, RULE_aritmetic_expression = 16, RULE_logic_expression = 17, 
		RULE_assign = 18, RULE_type_name = 19, RULE_name = 20, RULE_value = 21, 
		RULE_deref = 22, RULE_block = 23, RULE_function = 24, RULE_ife = 25, RULE_loope = 26, 
		RULE_whilee = 27, RULE_elsee = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "command", "comment", "move", "paint", "linee", "save", 
			"brush_shape", "brush_color", "brush_size", "color", "number", "string", 
			"bool", "shape", "aritmetic_expression", "logic_expression", "assign", 
			"type_name", "name", "value", "deref", "block", "function", "ife", "loope", 
			"whilee", "elsee"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'mv'", "'move'", "'+'", "'-'", "'paint'", "'line'", "' '", 
			"'save'", "'brush-shape'", "'bs-sh'", "'brush-color'", "'bs-cl'", "'brush-size'", 
			"'bs-sz'", "'('", "','", "')'", "'\"'", "'='", "' = '", "'shape'", "'bool'", 
			"'color'", "'number'", "'string'", "'{'", "'}'", "' pattern '", "'if ('", 
			"'loop ('", "') times'", "'loop while ('", "'else'", null, null, null, 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NAME", 
			"SIGN_OPERATORS", "ARITMETIC_OPERATORS", "NEGATION_OPERATOR", "LOGIC_OPERATORS", 
			"COMPARISON_OPERATORS", "SHAPE", "BOOL", "STRING", "NUMBER", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public List<TerminalNode> EOL() { return getTokens(HelloParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(HelloParser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__5:
			case T__6:
			case T__8:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__29:
			case T__30:
			case T__32:
			case T__33:
			case NAME:
			case EOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(59);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << NAME))) != 0)) {
							{
							setState(58);
							line();
							}
						}

						setState(61);
						match(EOL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << NAME))) != 0)) {
					{
					setState(66);
					line();
					}
				}

				setState(69);
				match(EOF);
				}
				break;
			case SIGN_OPERATORS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				number();
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

	public static class LineContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__5:
			case T__6:
			case T__8:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__29:
			case T__30:
			case T__32:
			case T__33:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				command();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(74);
					comment();
					}
					break;
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				comment();
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

	public static class CommandContext extends ParserRuleContext {
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public LoopeContext loope() {
			return getRuleContext(LoopeContext.class,0);
		}
		public IfeContext ife() {
			return getRuleContext(IfeContext.class,0);
		}
		public WhileeContext whilee() {
			return getRuleContext(WhileeContext.class,0);
		}
		public ElseeContext elsee() {
			return getRuleContext(ElseeContext.class,0);
		}
		public PaintContext paint() {
			return getRuleContext(PaintContext.class,0);
		}
		public LineeContext linee() {
			return getRuleContext(LineeContext.class,0);
		}
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				move();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				loope();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				ife();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				whilee();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				elsee();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				paint();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				linee();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				save();
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

	public static class CommentContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					name();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class MoveContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(103);
			number();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(107);
			number();
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

	public static class PaintContext extends ParserRuleContext {
		public PaintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paint; }
	}

	public final PaintContext paint() throws RecognitionException {
		PaintContext _localctx = new PaintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__5);
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

	public static class LineeContext extends ParserRuleContext {
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public LineeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linee; }
	}

	public final LineeContext linee() throws RecognitionException {
		LineeContext _localctx = new LineeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_linee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__6);
			setState(112);
			aritmetic_expression(0);
			setState(113);
			match(T__7);
			setState(114);
			aritmetic_expression(0);
			setState(115);
			match(T__7);
			setState(116);
			aritmetic_expression(0);
			setState(117);
			match(T__7);
			setState(118);
			aritmetic_expression(0);
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

	public static class SaveContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__8);
			setState(121);
			string();
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

	public static class Brush_shapeContext extends ParserRuleContext {
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public Brush_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_shape; }
	}

	public final Brush_shapeContext brush_shape() throws RecognitionException {
		Brush_shapeContext _localctx = new Brush_shapeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_brush_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			shape();
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

	public static class Brush_colorContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Brush_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_color; }
	}

	public final Brush_colorContext brush_color() throws RecognitionException {
		Brush_colorContext _localctx = new Brush_colorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_brush_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			color();
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

	public static class Brush_sizeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Brush_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_size; }
	}

	public final Brush_sizeContext brush_size() throws RecognitionException {
		Brush_sizeContext _localctx = new Brush_sizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_brush_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			number();
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

	public static class ColorContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_color);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__15);
				setState(133);
				number();
				setState(134);
				match(T__16);
				setState(135);
				number();
				setState(136);
				match(T__16);
				setState(137);
				number();
				setState(138);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__15);
				setState(141);
				number();
				setState(142);
				match(T__16);
				setState(143);
				number();
				setState(144);
				match(T__16);
				setState(145);
				number();
				setState(146);
				match(T__16);
				setState(147);
				number();
				setState(148);
				match(T__17);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(HelloParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(HelloParser.SIGN_OPERATORS, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(152);
				match(SIGN_OPERATORS);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(NUMBER);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__18);
			setState(161);
			match(STRING);
			setState(162);
			match(T__18);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(BOOL);
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

	public static class ShapeContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(HelloParser.SHAPE, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(SHAPE);
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

	public static class Aritmetic_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public TerminalNode SIGN_OPERATORS() { return getToken(HelloParser.SIGN_OPERATORS, 0); }
		public TerminalNode ARITMETIC_OPERATORS() { return getToken(HelloParser.ARITMETIC_OPERATORS, 0); }
		public Aritmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_expression; }
	}

	public final Aritmetic_expressionContext aritmetic_expression() throws RecognitionException {
		return aritmetic_expression(0);
	}

	private Aritmetic_expressionContext aritmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Aritmetic_expressionContext _localctx = new Aritmetic_expressionContext(_ctx, _parentState);
		Aritmetic_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_aritmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGN_OPERATORS:
			case NUMBER:
				{
				setState(169);
				number();
				}
				break;
			case NAME:
				{
				setState(170);
				deref();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Aritmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aritmetic_expression);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						match(SIGN_OPERATORS);
						setState(175);
						aritmetic_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Aritmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aritmetic_expression);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(ARITMETIC_OPERATORS);
						setState(178);
						aritmetic_expression(3);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logic_expressionContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NEGATION_OPERATOR() { return getToken(HelloParser.NEGATION_OPERATOR, 0); }
		public List<Logic_expressionContext> logic_expression() {
			return getRuleContexts(Logic_expressionContext.class);
		}
		public Logic_expressionContext logic_expression(int i) {
			return getRuleContext(Logic_expressionContext.class,i);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode ARITMETIC_OPERATORS() { return getToken(HelloParser.ARITMETIC_OPERATORS, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(HelloParser.LOGIC_OPERATORS, 0); }
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		return logic_expression(0);
	}

	private Logic_expressionContext logic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, _parentState);
		Logic_expressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(185);
				bool();
				}
				break;
			case NEGATION_OPERATOR:
				{
				setState(186);
				match(NEGATION_OPERATOR);
				setState(187);
				logic_expression(3);
				}
				break;
			case NAME:
				{
				setState(188);
				deref();
				}
				break;
			case SIGN_OPERATORS:
			case NUMBER:
				{
				setState(189);
				number();
				setState(190);
				match(ARITMETIC_OPERATORS);
				setState(191);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
					setState(195);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(196);
					match(LOGIC_OPERATORS);
					setState(197);
					logic_expression(5);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				type_name();
				setState(204);
				deref();
				setState(205);
				match(T__19);
				setState(206);
				value();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				deref();
				setState(209);
				match(T__20);
				setState(210);
				value();
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

	public static class Type_nameContext extends ParserRuleContext {
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(NAME);
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

	public static class ValueContext extends ParserRuleContext {
		public Aritmetic_expressionContext aritmetic_expression() {
			return getRuleContext(Aritmetic_expressionContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				aritmetic_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				logic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				deref();
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

	public static class DerefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(HelloParser.NAME, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(NAME);
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

	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(HelloParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(HelloParser.EOL, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__26);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				line();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(228);
					match(EOL);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << NAME))) != 0) );
			setState(238);
			match(T__27);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<DerefContext> deref() {
			return getRuleContexts(DerefContext.class);
		}
		public DerefContext deref(int i) {
			return getRuleContext(DerefContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				type_name();
				setState(241);
				match(T__28);
				setState(242);
				name();
				setState(243);
				match(T__15);
				setState(244);
				type_name();
				setState(245);
				match(T__7);
				setState(246);
				deref();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(247);
					match(T__16);
					setState(248);
					type_name();
					setState(249);
					deref();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(T__17);
				setState(257);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				type_name();
				setState(260);
				match(T__28);
				setState(261);
				name();
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

	public static class IfeContext extends ParserRuleContext {
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ife; }
	}

	public final IfeContext ife() throws RecognitionException {
		IfeContext _localctx = new IfeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__29);
			setState(266);
			logic_expression(0);
			setState(267);
			match(T__17);
			setState(268);
			block();
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

	public static class LoopeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loope; }
	}

	public final LoopeContext loope() throws RecognitionException {
		LoopeContext _localctx = new LoopeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__30);
			setState(271);
			number();
			setState(272);
			match(T__31);
			setState(273);
			block();
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

	public static class WhileeContext extends ParserRuleContext {
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilee; }
	}

	public final WhileeContext whilee() throws RecognitionException {
		WhileeContext _localctx = new WhileeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__32);
			setState(276);
			logic_expression(0);
			setState(277);
			match(T__17);
			setState(278);
			block();
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

	public static class ElseeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsee; }
	}

	public final ElseeContext elsee() throws RecognitionException {
		ElseeContext _localctx = new ElseeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elsee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__33);
			setState(281);
			block();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return aritmetic_expression_sempred((Aritmetic_expressionContext)_localctx, predIndex);
		case 17:
			return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aritmetic_expression_sempred(Aritmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\6"+
		"\2A\n\2\r\2\16\2B\3\2\5\2F\n\2\3\2\3\2\5\2J\n\2\3\3\3\3\5\3N\n\3\3\3\5"+
		"\3Q\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\7\5a"+
		"\n\5\f\5\16\5d\13\5\3\6\3\6\5\6h\n\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\7\16\u009c\n\16\f\16\16\16\u009f"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u00ae\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b6\n\22\f\22\16"+
		"\22\u00b9\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c4"+
		"\n\23\3\23\3\23\3\23\7\23\u00c9\n\23\f\23\16\23\u00cc\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d7\n\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\5\27\u00e1\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u00e8"+
		"\n\31\f\31\16\31\u00eb\13\31\6\31\u00ed\n\31\r\31\16\31\u00ee\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00fe\n\32"+
		"\f\32\16\32\u0101\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u010a"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\2\4\"$\37\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:\2\b\3\2\4\5\3\2\6\7\3\2\f\r\3\2\16\17"+
		"\3\2\20\21\3\2\30\34\2\u0123\2I\3\2\2\2\4P\3\2\2\2\6\\\3\2\2\2\b^\3\2"+
		"\2\2\ne\3\2\2\2\fo\3\2\2\2\16q\3\2\2\2\20z\3\2\2\2\22}\3\2\2\2\24\u0080"+
		"\3\2\2\2\26\u0083\3\2\2\2\30\u0098\3\2\2\2\32\u009d\3\2\2\2\34\u00a2\3"+
		"\2\2\2\36\u00a6\3\2\2\2 \u00a8\3\2\2\2\"\u00ad\3\2\2\2$\u00c3\3\2\2\2"+
		"&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00da\3\2\2\2,\u00e0\3\2\2\2.\u00e2\3"+
		"\2\2\2\60\u00e4\3\2\2\2\62\u0109\3\2\2\2\64\u010b\3\2\2\2\66\u0110\3\2"+
		"\2\28\u0115\3\2\2\2:\u011a\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>?\3\2"+
		"\2\2?A\7/\2\2@=\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\5\4"+
		"\3\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GJ\7\2\2\3HJ\5\32\16\2I@\3\2\2\2IH\3"+
		"\2\2\2J\3\3\2\2\2KM\5\6\4\2LN\5\b\5\2ML\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OQ"+
		"\5\b\5\2PK\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2R]\5\n\6\2S]\5\62\32\2T]\5&\24"+
		"\2U]\5\66\34\2V]\5\64\33\2W]\58\35\2X]\5:\36\2Y]\5\f\7\2Z]\5\16\b\2[]"+
		"\5\20\t\2\\R\3\2\2\2\\S\3\2\2\2\\T\3\2\2\2\\U\3\2\2\2\\V\3\2\2\2\\W\3"+
		"\2\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\7\3\2\2\2^b\7\3\2"+
		"\2_a\5*\26\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2"+
		"\2\2eg\t\2\2\2fh\t\3\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\5\32\16\2jl\t"+
		"\3\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\32\16\2n\13\3\2\2\2op\7\b\2\2"+
		"p\r\3\2\2\2qr\7\t\2\2rs\5\"\22\2st\7\n\2\2tu\5\"\22\2uv\7\n\2\2vw\5\""+
		"\22\2wx\7\n\2\2xy\5\"\22\2y\17\3\2\2\2z{\7\13\2\2{|\5\34\17\2|\21\3\2"+
		"\2\2}~\t\4\2\2~\177\5 \21\2\177\23\3\2\2\2\u0080\u0081\t\5\2\2\u0081\u0082"+
		"\5\30\r\2\u0082\25\3\2\2\2\u0083\u0084\t\6\2\2\u0084\u0085\5\32\16\2\u0085"+
		"\27\3\2\2\2\u0086\u0087\7\22\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\23"+
		"\2\2\u0089\u008a\5\32\16\2\u008a\u008b\7\23\2\2\u008b\u008c\5\32\16\2"+
		"\u008c\u008d\7\24\2\2\u008d\u0099\3\2\2\2\u008e\u008f\7\22\2\2\u008f\u0090"+
		"\5\32\16\2\u0090\u0091\7\23\2\2\u0091\u0092\5\32\16\2\u0092\u0093\7\23"+
		"\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\23\2\2\u0095\u0096\5\32\16\2"+
		"\u0096\u0097\7\24\2\2\u0097\u0099\3\2\2\2\u0098\u0086\3\2\2\2\u0098\u008e"+
		"\3\2\2\2\u0099\31\3\2\2\2\u009a\u009c\7&\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\33\3\2\2\2\u00a2\u00a3"+
		"\7\25\2\2\u00a3\u00a4\7-\2\2\u00a4\u00a5\7\25\2\2\u00a5\35\3\2\2\2\u00a6"+
		"\u00a7\7,\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9!\3\2\2\2\u00aa"+
		"\u00ab\b\22\1\2\u00ab\u00ae\5\32\16\2\u00ac\u00ae\5.\30\2\u00ad\u00aa"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b7\3\2\2\2\u00af\u00b0\f\5\2\2\u00b0"+
		"\u00b1\7&\2\2\u00b1\u00b6\5\"\22\6\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7\'"+
		"\2\2\u00b4\u00b6\5\"\22\5\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8#\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\23\1\2\u00bb\u00c4\5\36\20\2\u00bc"+
		"\u00bd\7(\2\2\u00bd\u00c4\5$\23\5\u00be\u00c4\5.\30\2\u00bf\u00c0\5\32"+
		"\16\2\u00c0\u00c1\7\'\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00ba\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6\f\6\2\2\u00c6\u00c7\7)\2\2\u00c7"+
		"\u00c9\5$\23\7\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce"+
		"\5(\25\2\u00ce\u00cf\5.\30\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\5,\27\2"+
		"\u00d1\u00d7\3\2\2\2\u00d2\u00d3\5.\30\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5"+
		"\5,\27\2\u00d5\u00d7\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7"+
		"\'\3\2\2\2\u00d8\u00d9\t\7\2\2\u00d9)\3\2\2\2\u00da\u00db\7%\2\2\u00db"+
		"+\3\2\2\2\u00dc\u00e1\5\"\22\2\u00dd\u00e1\5$\23\2\u00de\u00e1\5\34\17"+
		"\2\u00df\u00e1\5.\30\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1-\3\2\2\2\u00e2\u00e3\7%\2\2\u00e3/"+
		"\3\2\2\2\u00e4\u00ec\7\35\2\2\u00e5\u00e9\5\4\3\2\u00e6\u00e8\7/\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\36\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4"+
		"\7\37\2\2\u00f4\u00f5\5*\26\2\u00f5\u00f6\7\22\2\2\u00f6\u00f7\5(\25\2"+
		"\u00f7\u00f8\7\n\2\2\u00f8\u00ff\5.\30\2\u00f9\u00fa\7\23\2\2\u00fa\u00fb"+
		"\5(\25\2\u00fb\u00fc\5.\30\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\24\2\2\u0103\u0104\5\60\31\2\u0104"+
		"\u010a\3\2\2\2\u0105\u0106\5(\25\2\u0106\u0107\7\37\2\2\u0107\u0108\5"+
		"*\26\2\u0108\u010a\3\2\2\2\u0109\u00f2\3\2\2\2\u0109\u0105\3\2\2\2\u010a"+
		"\63\3\2\2\2\u010b\u010c\7 \2\2\u010c\u010d\5$\23\2\u010d\u010e\7\24\2"+
		"\2\u010e\u010f\5\60\31\2\u010f\65\3\2\2\2\u0110\u0111\7!\2\2\u0111\u0112"+
		"\5\32\16\2\u0112\u0113\7\"\2\2\u0113\u0114\5\60\31\2\u0114\67\3\2\2\2"+
		"\u0115\u0116\7#\2\2\u0116\u0117\5$\23\2\u0117\u0118\7\24\2\2\u0118\u0119"+
		"\5\60\31\2\u01199\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\5\60\31\2\u011c"+
		";\3\2\2\2\31=BEIMP\\bgk\u0098\u009d\u00ad\u00b5\u00b7\u00c3\u00ca\u00d6"+
		"\u00e0\u00e9\u00ee\u00ff\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}