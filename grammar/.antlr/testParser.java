// Generated from /home/makowskitomasz/Kompilatory/logotoma/grammar/test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, SIGN_OPERATORS=33, NUMBER=34, ARITMETIC_OPERATORS=35, NEGATION_OPERATOR=36, 
		LOGIC_OPERATORS=37, COMPARISON_OPERATORS=38, BOOL=39, SHAPE=40, STRING=41, 
		EOL=42, WS=43;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_command = 2, RULE_move = 3, RULE_assign = 4, 
		RULE_paint = 5, RULE_save = 6, RULE_brush_shape = 7, RULE_brush_color = 8, 
		RULE_brush_size = 9, RULE_linee = 10, RULE_circle = 11, RULE_color = 12, 
		RULE_number = 13, RULE_type_name = 14, RULE_name = 15, RULE_value = 16, 
		RULE_ife = 17, RULE_loope = 18, RULE_whilee = 19, RULE_elsee = 20, RULE_aritmetic_expression = 21, 
		RULE_logic_expression = 22, RULE_bool = 23, RULE_deref = 24, RULE_string = 25, 
		RULE_block = 26, RULE_function = 27, RULE_f_call = 28, RULE_comment = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "command", "move", "assign", "paint", "save", "brush_shape", 
			"brush_color", "brush_size", "linee", "circle", "color", "number", "type_name", 
			"name", "value", "ife", "loope", "whilee", "elsee", "aritmetic_expression", 
			"logic_expression", "bool", "deref", "string", "block", "function", "f_call", 
			"comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mv'", "'move'", "'+'", "'-'", "'='", "'paint'", "'save'", "'brush-shape'", 
			"'bs-sh'", "'brush-color'", "'bs-cl'", "'brush-size'", "'bs-sz'", "'line'", 
			"'circle'", "','", "'('", "')'", "'shape'", "'bool'", "'color'", "'number'", 
			"'string'", "'if'", "'loop'", "'times'", "'loop while'", "'else'", "'{'", 
			"'}'", "'pattern'", "'#'", null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "SIGN_OPERATORS", 
			"NUMBER", "ARITMETIC_OPERATORS", "NEGATION_OPERATOR", "LOGIC_OPERATORS", 
			"COMPARISON_OPERATORS", "BOOL", "SHAPE", "STRING", "EOL", "WS"
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(testParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(testParser.EOL, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << STRING))) != 0)) {
						{
						setState(60);
						line();
						}
					}

					setState(64); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(63);
							match(EOL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(66); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << STRING))) != 0)) {
				{
				setState(72);
				line();
				}
			}

			setState(75);
			match(EOF);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__9:
			case T__10:
			case T__13:
			case T__14:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				command();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(78);
					comment();
					}
					break;
				}
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
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
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public Brush_colorContext brush_color() {
			return getRuleContext(Brush_colorContext.class,0);
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
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				move();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				f_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				brush_color();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				loope();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				ife();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				whilee();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				elsee();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				paint();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				linee();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
				save();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				circle();
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

	public static class MoveContext extends ParserRuleContext {
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
			if (_la==T__2 || _la==T__3) {
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
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
			aritmetic_expression(0);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
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
		enterRule(_localctx, 8, RULE_assign);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				type_name();
				setState(110);
				deref();
				setState(111);
				match(T__4);
				setState(112);
				value();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				deref();
				setState(115);
				match(T__4);
				setState(116);
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
			setState(120);
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
		enterRule(_localctx, 12, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(123);
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
		public TerminalNode SHAPE() { return getToken(testParser.SHAPE, 0); }
		public Brush_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_shape; }
	}

	public final Brush_shapeContext brush_shape() throws RecognitionException {
		Brush_shapeContext _localctx = new Brush_shapeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_brush_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
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
		enterRule(_localctx, 16, RULE_brush_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
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
		enterRule(_localctx, 18, RULE_brush_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
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
		enterRule(_localctx, 20, RULE_linee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__13);
			setState(135);
			aritmetic_expression(0);
			setState(136);
			aritmetic_expression(0);
			setState(137);
			aritmetic_expression(0);
			setState(138);
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

	public static class CircleContext extends ParserRuleContext {
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_circle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__14);
			setState(141);
			aritmetic_expression(0);
			setState(142);
			match(T__15);
			setState(143);
			aritmetic_expression(0);
			setState(144);
			match(T__15);
			setState(145);
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
		enterRule(_localctx, 24, RULE_color);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__16);
				setState(148);
				number();
				setState(149);
				match(T__15);
				setState(150);
				number();
				setState(151);
				match(T__15);
				setState(152);
				number();
				setState(153);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__16);
				setState(156);
				number();
				setState(157);
				match(T__15);
				setState(158);
				number();
				setState(159);
				match(T__15);
				setState(160);
				number();
				setState(161);
				match(T__15);
				setState(162);
				number();
				setState(163);
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
		public TerminalNode NUMBER() { return getToken(testParser.NUMBER, 0); }
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(testParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(testParser.SIGN_OPERATORS, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(167);
				match(SIGN_OPERATORS);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(STRING);
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
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				aritmetic_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				logic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				deref();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				color();
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
		enterRule(_localctx, 34, RULE_ife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__23);
			setState(187);
			match(T__16);
			setState(188);
			logic_expression(0);
			setState(189);
			match(T__17);
			setState(190);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 36, RULE_loope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__24);
			setState(193);
			value();
			setState(194);
			match(T__25);
			setState(195);
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
		enterRule(_localctx, 38, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__26);
			setState(198);
			logic_expression(0);
			setState(199);
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
		enterRule(_localctx, 40, RULE_elsee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__27);
			setState(202);
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
		public TerminalNode ARITMETIC_OPERATORS() { return getToken(testParser.ARITMETIC_OPERATORS, 0); }
		public TerminalNode SIGN_OPERATORS() { return getToken(testParser.SIGN_OPERATORS, 0); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_aritmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGN_OPERATORS:
			case NUMBER:
				{
				setState(205);
				number();
				}
				break;
			case STRING:
				{
				setState(206);
				deref();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Aritmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aritmetic_expression);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(ARITMETIC_OPERATORS);
						setState(211);
						aritmetic_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Aritmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aritmetic_expression);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						match(SIGN_OPERATORS);
						setState(214);
						aritmetic_expression(4);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode NEGATION_OPERATOR() { return getToken(testParser.NEGATION_OPERATOR, 0); }
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
		public TerminalNode ARITMETIC_OPERATORS() { return getToken(testParser.ARITMETIC_OPERATORS, 0); }
		public TerminalNode LOGIC_OPERATORS() { return getToken(testParser.LOGIC_OPERATORS, 0); }
		public TerminalNode COMPARISON_OPERATORS() { return getToken(testParser.COMPARISON_OPERATORS, 0); }
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(221);
				bool();
				}
				break;
			case NEGATION_OPERATOR:
				{
				setState(222);
				match(NEGATION_OPERATOR);
				setState(223);
				logic_expression(4);
				}
				break;
			case STRING:
				{
				setState(224);
				deref();
				}
				break;
			case SIGN_OPERATORS:
			case NUMBER:
				{
				setState(225);
				number();
				setState(226);
				match(ARITMETIC_OPERATORS);
				setState(227);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(231);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(232);
						match(LOGIC_OPERATORS);
						setState(233);
						logic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(235);
						match(COMPARISON_OPERATORS);
						setState(236);
						logic_expression(2);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(testParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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

	public static class DerefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(STRING);
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
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(STRING);
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
		public List<TerminalNode> EOL() { return getTokens(testParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(testParser.EOL, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__28);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				line();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(250);
					match(EOL);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << STRING))) != 0) );
			setState(260);
			match(T__29);
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
		enterRule(_localctx, 54, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			type_name();
			setState(263);
			match(T__30);
			setState(264);
			name();
			setState(265);
			match(T__16);
			setState(266);
			type_name();
			setState(267);
			deref();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(268);
				match(T__15);
				setState(269);
				type_name();
				setState(270);
				deref();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class F_callContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_f_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			name();
			setState(281);
			match(T__16);
			setState(282);
			aritmetic_expression(0);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(283);
				match(T__15);
				setState(284);
				aritmetic_expression(0);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(T__17);
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
		public List<TerminalNode> STRING() { return getTokens(testParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(testParser.STRING, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__31);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(STRING);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return aritmetic_expression_sempred((Aritmetic_expressionContext)_localctx, predIndex);
		case 22:
			return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aritmetic_expression_sempred(Aritmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\5\2@"+
		"\n\2\3\2\6\2C\n\2\r\2\16\2D\6\2G\n\2\r\2\16\2H\3\2\5\2L\n\2\3\2\3\2\3"+
		"\3\3\3\5\3R\n\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4d\n\4\3\5\3\5\5\5h\n\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6y\n\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\17\7\17\u00ab\n\17\f"+
		"\17\16\17\u00ae\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00d2\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e8\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00f0\n\30\f\30\16\30\u00f3\13\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u00fe\n\34\f\34\16\34\u0101\13"+
		"\34\6\34\u0103\n\34\r\34\16\34\u0104\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0113\n\35\f\35\16\35\u0116\13\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\7\36\u0120\n\36\f\36\16\36\u0123\13"+
		"\36\3\36\3\36\3\37\3\37\7\37\u0129\n\37\f\37\16\37\u012c\13\37\3\37\2"+
		"\4,. \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2"+
		"\b\3\2\3\4\3\2\5\6\3\2\n\13\3\2\f\r\3\2\16\17\3\2\25\31\2\u0137\2F\3\2"+
		"\2\2\4T\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\nx\3\2\2\2\fz\3\2\2\2\16|\3\2\2"+
		"\2\20\177\3\2\2\2\22\u0082\3\2\2\2\24\u0085\3\2\2\2\26\u0088\3\2\2\2\30"+
		"\u008e\3\2\2\2\32\u00a7\3\2\2\2\34\u00ac\3\2\2\2\36\u00b1\3\2\2\2 \u00b3"+
		"\3\2\2\2\"\u00ba\3\2\2\2$\u00bc\3\2\2\2&\u00c2\3\2\2\2(\u00c7\3\2\2\2"+
		"*\u00cb\3\2\2\2,\u00d1\3\2\2\2.\u00e7\3\2\2\2\60\u00f4\3\2\2\2\62\u00f6"+
		"\3\2\2\2\64\u00f8\3\2\2\2\66\u00fa\3\2\2\28\u0108\3\2\2\2:\u011a\3\2\2"+
		"\2<\u0126\3\2\2\2>@\5\4\3\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\7,\2\2BA\3"+
		"\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F?\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\4\3\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7"+
		"\2\2\3N\3\3\2\2\2OQ\5\6\4\2PR\5<\37\2QP\3\2\2\2QR\3\2\2\2RU\3\2\2\2SU"+
		"\5<\37\2TO\3\2\2\2TS\3\2\2\2U\5\3\2\2\2Vd\5\b\5\2Wd\58\35\2Xd\5:\36\2"+
		"Yd\5\22\n\2Zd\5\n\6\2[d\5&\24\2\\d\5$\23\2]d\5(\25\2^d\5*\26\2_d\5\f\7"+
		"\2`d\5\26\f\2ad\5\16\b\2bd\5\30\r\2cV\3\2\2\2cW\3\2\2\2cX\3\2\2\2cY\3"+
		"\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`"+
		"\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\7\3\2\2\2eg\t\2\2\2fh\t\3\2\2gf\3\2\2\2"+
		"gh\3\2\2\2hi\3\2\2\2ik\5,\27\2jl\t\3\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2"+
		"mn\5,\27\2n\t\3\2\2\2op\5\36\20\2pq\5\62\32\2qr\7\7\2\2rs\5\"\22\2sy\3"+
		"\2\2\2tu\5\62\32\2uv\7\7\2\2vw\5\"\22\2wy\3\2\2\2xo\3\2\2\2xt\3\2\2\2"+
		"y\13\3\2\2\2z{\7\b\2\2{\r\3\2\2\2|}\7\t\2\2}~\5\64\33\2~\17\3\2\2\2\177"+
		"\u0080\t\4\2\2\u0080\u0081\7*\2\2\u0081\21\3\2\2\2\u0082\u0083\t\5\2\2"+
		"\u0083\u0084\5\32\16\2\u0084\23\3\2\2\2\u0085\u0086\t\6\2\2\u0086\u0087"+
		"\5\34\17\2\u0087\25\3\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\5,\27\2\u008a"+
		"\u008b\5,\27\2\u008b\u008c\5,\27\2\u008c\u008d\5,\27\2\u008d\27\3\2\2"+
		"\2\u008e\u008f\7\21\2\2\u008f\u0090\5,\27\2\u0090\u0091\7\22\2\2\u0091"+
		"\u0092\5,\27\2\u0092\u0093\7\22\2\2\u0093\u0094\5,\27\2\u0094\31\3\2\2"+
		"\2\u0095\u0096\7\23\2\2\u0096\u0097\5\34\17\2\u0097\u0098\7\22\2\2\u0098"+
		"\u0099\5\34\17\2\u0099\u009a\7\22\2\2\u009a\u009b\5\34\17\2\u009b\u009c"+
		"\7\24\2\2\u009c\u00a8\3\2\2\2\u009d\u009e\7\23\2\2\u009e\u009f\5\34\17"+
		"\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7\22\2\2\u00a2"+
		"\u00a3\5\34\17\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6"+
		"\7\24\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0095\3\2\2\2\u00a7\u009d\3\2\2\2"+
		"\u00a8\33\3\2\2\2\u00a9\u00ab\7#\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\t\7\2\2"+
		"\u00b2\37\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4!\3\2\2\2\u00b5\u00bb\5,\27"+
		"\2\u00b6\u00bb\5.\30\2\u00b7\u00bb\5\64\33\2\u00b8\u00bb\5\62\32\2\u00b9"+
		"\u00bb\5\32\16\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00bd"+
		"\7\32\2\2\u00bd\u00be\7\23\2\2\u00be\u00bf\5.\30\2\u00bf\u00c0\7\24\2"+
		"\2\u00c0\u00c1\5\66\34\2\u00c1%\3\2\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4"+
		"\5\"\22\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\5\66\34\2\u00c6\'\3\2\2\2\u00c7"+
		"\u00c8\7\35\2\2\u00c8\u00c9\5.\30\2\u00c9\u00ca\5\66\34\2\u00ca)\3\2\2"+
		"\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\5\66\34\2\u00cd+\3\2\2\2\u00ce\u00cf"+
		"\b\27\1\2\u00cf\u00d2\5\34\17\2\u00d0\u00d2\5\62\32\2\u00d1\u00ce\3\2"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00db\3\2\2\2\u00d3\u00d4\f\6\2\2\u00d4"+
		"\u00d5\7%\2\2\u00d5\u00da\5,\27\7\u00d6\u00d7\f\5\2\2\u00d7\u00d8\7#\2"+
		"\2\u00d8\u00da\5,\27\6\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc-\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\b\30\1\2\u00df\u00e8\5\60\31\2\u00e0\u00e1"+
		"\7&\2\2\u00e1\u00e8\5.\30\6\u00e2\u00e8\5\62\32\2\u00e3\u00e4\5\34\17"+
		"\2\u00e4\u00e5\7%\2\2\u00e5\u00e6\5\34\17\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00de\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e8\u00f1\3\2\2\2\u00e9\u00ea\f\7\2\2\u00ea\u00eb\7\'\2\2\u00eb"+
		"\u00f0\5.\30\b\u00ec\u00ed\f\3\2\2\u00ed\u00ee\7(\2\2\u00ee\u00f0\5.\30"+
		"\4\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2/\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7)\2\2\u00f5\61\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7\63\3\2\2\2\u00f8"+
		"\u00f9\7+\2\2\u00f9\65\3\2\2\2\u00fa\u0102\7\37\2\2\u00fb\u00ff\5\4\3"+
		"\2\u00fc\u00fe\7,\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7 \2\2\u0107\67\3\2\2\2\u0108\u0109"+
		"\5\36\20\2\u0109\u010a\7!\2\2\u010a\u010b\5 \21\2\u010b\u010c\7\23\2\2"+
		"\u010c\u010d\5\36\20\2\u010d\u0114\5\62\32\2\u010e\u010f\7\22\2\2\u010f"+
		"\u0110\5\36\20\2\u0110\u0111\5\62\32\2\u0111\u0113\3\2\2\2\u0112\u010e"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\24\2\2\u0118\u0119\5"+
		"\66\34\2\u01199\3\2\2\2\u011a\u011b\5 \21\2\u011b\u011c\7\23\2\2\u011c"+
		"\u0121\5,\27\2\u011d\u011e\7\22\2\2\u011e\u0120\5,\27\2\u011f\u011d\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\24\2\2\u0125;\3\2\2\2"+
		"\u0126\u012a\7\"\2\2\u0127\u0129\7+\2\2\u0128\u0127\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b=\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\32?DHKQTcgkx\u00a7\u00ac\u00ba\u00d1\u00d9\u00db\u00e7"+
		"\u00ef\u00f1\u00ff\u0104\u0114\u0121\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}