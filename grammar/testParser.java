// Generated from test.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitProgram(this);
		}
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2203787513030L) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2203787513030L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLine(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCommand(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMove(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAssign(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PaintContext extends ParserRuleContext {
		public PaintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterPaint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitPaint(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SaveContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSave(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Brush_shapeContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(testParser.SHAPE, 0); }
		public Brush_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBrush_shape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBrush_shape(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Brush_colorContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public Brush_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBrush_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBrush_color(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Brush_sizeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Brush_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brush_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBrush_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBrush_size(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLinee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLinee(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCircle(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitColor(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitNumber(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitType_name(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitName(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitValue(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterIfe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitIfe(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLoope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLoope(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterWhilee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitWhilee(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterElsee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitElsee(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAritmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAritmetic_expression(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLogic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLogic_expression(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(testParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBool(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DerefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeref(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitString(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBlock(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2203787513030L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunction(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterF_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitF_call(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(testParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(testParser.STRING, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitComment(this);
		}
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
		"\u0004\u0001+\u012c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0003\u0000"+
		">\b\u0000\u0001\u0000\u0004\u0000A\b\u0000\u000b\u0000\f\u0000B\u0004"+
		"\u0000E\b\u0000\u000b\u0000\f\u0000F\u0001\u0000\u0003\u0000J\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001"+
		"\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002b\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003j\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004w\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a6\b\f\u0001\r\u0005\r\u00a9\b\r"+
		"\n\r\f\r\u00ac\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00b9\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00d0\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00d8\b\u0015\n\u0015\f\u0015\u00db\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e6\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00ee"+
		"\b\u0016\n\u0016\f\u0016\u00f1\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u00fc\b\u001a\n\u001a\f\u001a\u00ff\t\u001a\u0004\u001a\u0101"+
		"\b\u001a\u000b\u001a\f\u001a\u0102\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0111\b\u001b\n\u001b"+
		"\f\u001b\u0114\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u011e\b\u001c"+
		"\n\u001c\f\u001c\u0121\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0127\b\u001d\n\u001d\f\u001d\u012a\t\u001d\u0001\u001d"+
		"\u0000\u0002*,\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0006\u0001\u0000"+
		"\u0001\u0002\u0001\u0000\u0003\u0004\u0001\u0000\b\t\u0001\u0000\n\u000b"+
		"\u0001\u0000\f\r\u0001\u0000\u0013\u0017\u0135\u0000D\u0001\u0000\u0000"+
		"\u0000\u0002R\u0001\u0000\u0000\u0000\u0004a\u0001\u0000\u0000\u0000\u0006"+
		"c\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000"+
		"\u0000\fz\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010"+
		"\u0080\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014"+
		"\u0086\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018"+
		"\u00a5\u0001\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000\u001c"+
		"\u00af\u0001\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00b8"+
		"\u0001\u0000\u0000\u0000\"\u00ba\u0001\u0000\u0000\u0000$\u00c0\u0001"+
		"\u0000\u0000\u0000&\u00c5\u0001\u0000\u0000\u0000(\u00c9\u0001\u0000\u0000"+
		"\u0000*\u00cf\u0001\u0000\u0000\u0000,\u00e5\u0001\u0000\u0000\u0000."+
		"\u00f2\u0001\u0000\u0000\u00000\u00f4\u0001\u0000\u0000\u00002\u00f6\u0001"+
		"\u0000\u0000\u00004\u00f8\u0001\u0000\u0000\u00006\u0106\u0001\u0000\u0000"+
		"\u00008\u0118\u0001\u0000\u0000\u0000:\u0124\u0001\u0000\u0000\u0000<"+
		">\u0003\u0002\u0001\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?A\u0005*\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CE\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GI\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0000"+
		"\u0000\u0001L\u0001\u0001\u0000\u0000\u0000MO\u0003\u0004\u0002\u0000"+
		"NP\u0003:\u001d\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QS\u0003:\u001d\u0000RM\u0001\u0000\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000S\u0003\u0001\u0000\u0000\u0000Tb\u0003\u0006"+
		"\u0003\u0000Ub\u00036\u001b\u0000Vb\u00038\u001c\u0000Wb\u0003\u0010\b"+
		"\u0000Xb\u0003\b\u0004\u0000Yb\u0003$\u0012\u0000Zb\u0003\"\u0011\u0000"+
		"[b\u0003&\u0013\u0000\\b\u0003(\u0014\u0000]b\u0003\n\u0005\u0000^b\u0003"+
		"\u0014\n\u0000_b\u0003\f\u0006\u0000`b\u0003\u0016\u000b\u0000aT\u0001"+
		"\u0000\u0000\u0000aU\u0001\u0000\u0000\u0000aV\u0001\u0000\u0000\u0000"+
		"aW\u0001\u0000\u0000\u0000aX\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000"+
		"\u0000aZ\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a\\\u0001\u0000"+
		"\u0000\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0005\u0001\u0000\u0000"+
		"\u0000ce\u0007\u0000\u0000\u0000df\u0007\u0001\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0003"+
		"*\u0015\u0000hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003*\u0015\u0000l\u0007"+
		"\u0001\u0000\u0000\u0000mn\u0003\u001c\u000e\u0000no\u00030\u0018\u0000"+
		"op\u0005\u0005\u0000\u0000pq\u0003 \u0010\u0000qw\u0001\u0000\u0000\u0000"+
		"rs\u00030\u0018\u0000st\u0005\u0005\u0000\u0000tu\u0003 \u0010\u0000u"+
		"w\u0001\u0000\u0000\u0000vm\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000"+
		"\u0000w\t\u0001\u0000\u0000\u0000xy\u0005\u0006\u0000\u0000y\u000b\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0007\u0000\u0000{|\u00032\u0019\u0000|\r\u0001"+
		"\u0000\u0000\u0000}~\u0007\u0002\u0000\u0000~\u007f\u0005(\u0000\u0000"+
		"\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0007\u0003\u0000\u0000"+
		"\u0081\u0082\u0003\u0018\f\u0000\u0082\u0011\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0007\u0004\u0000\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085\u0013"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u0088"+
		"\u0003*\u0015\u0000\u0088\u0089\u0003*\u0015\u0000\u0089\u008a\u0003*"+
		"\u0015\u0000\u008a\u008b\u0003*\u0015\u0000\u008b\u0015\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d\u008e\u0003*\u0015\u0000"+
		"\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0090\u0003*\u0015\u0000\u0090"+
		"\u0091\u0005\u0010\u0000\u0000\u0091\u0092\u0003*\u0015\u0000\u0092\u0017"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0011\u0000\u0000\u0094\u0095"+
		"\u0003\u001a\r\u0000\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u0097\u0003"+
		"\u001a\r\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u0099\u0003\u001a"+
		"\r\u0000\u0099\u009a\u0005\u0012\u0000\u0000\u009a\u00a6\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u0011\u0000\u0000\u009c\u009d\u0003\u001a\r\u0000"+
		"\u009d\u009e\u0005\u0010\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000\u009f"+
		"\u00a0\u0005\u0010\u0000\u0000\u00a0\u00a1\u0003\u001a\r\u0000\u00a1\u00a2"+
		"\u0005\u0010\u0000\u0000\u00a2\u00a3\u0003\u001a\r\u0000\u00a3\u00a4\u0005"+
		"\u0012\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u0093\u0001"+
		"\u0000\u0000\u0000\u00a5\u009b\u0001\u0000\u0000\u0000\u00a6\u0019\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\u0005!\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\"\u0000"+
		"\u0000\u00ae\u001b\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0005\u0000"+
		"\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005)\u0000\u0000"+
		"\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b9\u0003*\u0015\u0000\u00b4"+
		"\u00b9\u0003,\u0016\u0000\u00b5\u00b9\u00032\u0019\u0000\u00b6\u00b9\u0003"+
		"0\u0018\u0000\u00b7\u00b9\u0003\u0018\f\u0000\u00b8\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9!\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0018\u0000"+
		"\u0000\u00bb\u00bc\u0005\u0011\u0000\u0000\u00bc\u00bd\u0003,\u0016\u0000"+
		"\u00bd\u00be\u0005\u0012\u0000\u0000\u00be\u00bf\u00034\u001a\u0000\u00bf"+
		"#\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2"+
		"\u0003 \u0010\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3\u00c4\u0003"+
		"4\u001a\u0000\u00c4%\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u001b\u0000"+
		"\u0000\u00c6\u00c7\u0003,\u0016\u0000\u00c7\u00c8\u00034\u001a\u0000\u00c8"+
		"\'\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001c\u0000\u0000\u00ca\u00cb"+
		"\u00034\u001a\u0000\u00cb)\u0001\u0000\u0000\u0000\u00cc\u00cd\u0006\u0015"+
		"\uffff\uffff\u0000\u00cd\u00d0\u0003\u001a\r\u0000\u00ce\u00d0\u00030"+
		"\u0018\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d9\u0001\u0000\u0000\u0000\u00d1\u00d2\n\u0004\u0000"+
		"\u0000\u00d2\u00d3\u0005#\u0000\u0000\u00d3\u00d8\u0003*\u0015\u0005\u00d4"+
		"\u00d5\n\u0003\u0000\u0000\u00d5\u00d6\u0005!\u0000\u0000\u00d6\u00d8"+
		"\u0003*\u0015\u0004\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da+\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0006\u0016"+
		"\uffff\uffff\u0000\u00dd\u00e6\u0003.\u0017\u0000\u00de\u00df\u0005$\u0000"+
		"\u0000\u00df\u00e6\u0003,\u0016\u0004\u00e0\u00e6\u00030\u0018\u0000\u00e1"+
		"\u00e2\u0003\u001a\r\u0000\u00e2\u00e3\u0005#\u0000\u0000\u00e3\u00e4"+
		"\u0003\u001a\r\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e5\u00de\u0001\u0000\u0000\u0000\u00e5\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e1\u0001\u0000\u0000\u0000\u00e6\u00ef\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\n\u0005\u0000\u0000\u00e8\u00e9\u0005%"+
		"\u0000\u0000\u00e9\u00ee\u0003,\u0016\u0006\u00ea\u00eb\n\u0001\u0000"+
		"\u0000\u00eb\u00ec\u0005&\u0000\u0000\u00ec\u00ee\u0003,\u0016\u0002\u00ed"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0-\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\'\u0000\u0000\u00f3/\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005)\u0000\u0000\u00f51\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005)\u0000\u0000\u00f73\u0001\u0000\u0000\u0000\u00f8"+
		"\u0100\u0005\u001d\u0000\u0000\u00f9\u00fd\u0003\u0002\u0001\u0000\u00fa"+
		"\u00fc\u0005*\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u001e\u0000\u0000\u01055\u0001\u0000\u0000\u0000\u0106\u0107\u0003"+
		"\u001c\u000e\u0000\u0107\u0108\u0005\u001f\u0000\u0000\u0108\u0109\u0003"+
		"\u001e\u000f\u0000\u0109\u010a\u0005\u0011\u0000\u0000\u010a\u010b\u0003"+
		"\u001c\u000e\u0000\u010b\u0112\u00030\u0018\u0000\u010c\u010d\u0005\u0010"+
		"\u0000\u0000\u010d\u010e\u0003\u001c\u000e\u0000\u010e\u010f\u00030\u0018"+
		"\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000"+
		"\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0012\u0000"+
		"\u0000\u0116\u0117\u00034\u001a\u0000\u01177\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0003\u001e\u000f\u0000\u0119\u011a\u0005\u0011\u0000\u0000\u011a"+
		"\u011f\u0003*\u0015\u0000\u011b\u011c\u0005\u0010\u0000\u0000\u011c\u011e"+
		"\u0003*\u0015\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005\u0012\u0000\u0000\u01239\u0001\u0000"+
		"\u0000\u0000\u0124\u0128\u0005 \u0000\u0000\u0125\u0127\u0005)\u0000\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129;\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u0018"+
		"=BFIORaeiv\u00a5\u00aa\u00b8\u00cf\u00d7\u00d9\u00e5\u00ed\u00ef\u00fd"+
		"\u0102\u0112\u011f\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}