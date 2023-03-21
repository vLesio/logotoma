// Generated from d:\Projects\logotoma\grammar\test.g4 by ANTLR 4.9.2
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
		T__31=32, T__32=33, T__33=34, SIGN_OPERATORS=35, NUMBER=36, ARITMETIC_OPERATORS=37, 
		NEGATION_OPERATOR=38, LOGIC_OPERATORS=39, COMPARISON_OPERATORS=40, BOOL=41, 
		SHAPE=42, STRING=43, EOL=44, WS=45;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_command = 2, RULE_move = 3, RULE_assign = 4, 
		RULE_paint = 5, RULE_save = 6, RULE_brush_shape = 7, RULE_brush_color = 8, 
		RULE_brush_size = 9, RULE_linee = 10, RULE_circle = 11, RULE_color = 12, 
		RULE_type_name = 13, RULE_name = 14, RULE_value = 15, RULE_ife = 16, RULE_loope = 17, 
		RULE_whilee = 18, RULE_elsee = 19, RULE_signExpression = 20, RULE_multiplyingExpression = 21, 
		RULE_nestedExpression = 22, RULE_expression = 23, RULE_logic_expression = 24, 
		RULE_number = 25, RULE_bool = 26, RULE_deref = 27, RULE_string = 28, RULE_block = 29, 
		RULE_function = 30, RULE_f_call = 31, RULE_comment = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "command", "move", "assign", "paint", "save", "brush_shape", 
			"brush_color", "brush_size", "linee", "circle", "color", "type_name", 
			"name", "value", "ife", "loope", "whilee", "elsee", "signExpression", 
			"multiplyingExpression", "nestedExpression", "expression", "logic_expression", 
			"number", "bool", "deref", "string", "block", "function", "f_call", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mv'", "'move'", "'#'", "'='", "'paint'", "'save'", "'brush-shape'", 
			"'bs-sh'", "'brush-color'", "'bs-cl'", "'brush-size'", "'bs-sz'", "'line'", 
			"'circle'", "'('", "','", "')'", "'shape'", "'bool'", "'color'", "'number'", 
			"'string'", "'if'", "'loop'", "'times'", "'loop while'", "'else'", "'+'", 
			"'-'", "'*'", "'/'", "'{'", "'}'", "'pattern'", null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "SIGN_OPERATORS", 
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
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << STRING))) != 0)) {
						{
						setState(66);
						line();
						}
					}

					setState(70); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(69);
							match(EOL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(72); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << STRING))) != 0)) {
				{
				setState(78);
				line();
				}
			}

			setState(81);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case T__5:
			case T__8:
			case T__9:
			case T__12:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				command();
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					comment();
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				move();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				f_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				brush_color();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				loope();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				ife();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				whilee();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				elsee();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				paint();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(100);
				linee();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(101);
				save();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(102);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(106);
				match(T__2);
				}
			}

			setState(109);
			value();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(110);
				match(T__2);
				}
			}

			setState(113);
			value();
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				type_name();
				setState(116);
				deref();
				setState(117);
				match(T__3);
				setState(118);
				value();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				deref();
				setState(121);
				match(T__3);
				setState(122);
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
			setState(126);
			match(T__4);
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
			setState(128);
			match(T__5);
			setState(129);
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
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
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
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			value();
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
			setState(140);
			match(T__12);
			setState(141);
			value();
			setState(142);
			value();
			setState(143);
			value();
			setState(144);
			value();
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
			setState(146);
			match(T__13);
			setState(147);
			value();
			setState(148);
			value();
			setState(149);
			value();
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__14);
				setState(152);
				value();
				setState(153);
				match(T__15);
				setState(154);
				value();
				setState(155);
				match(T__15);
				setState(156);
				value();
				setState(157);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__14);
				setState(160);
				value();
				setState(161);
				match(T__15);
				setState(162);
				value();
				setState(163);
				match(T__15);
				setState(164);
				value();
				setState(165);
				match(T__15);
				setState(166);
				value();
				setState(167);
				match(T__16);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 32, RULE_ife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__22);
			setState(181);
			match(T__14);
			setState(182);
			value();
			setState(183);
			match(T__16);
			setState(184);
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
		enterRule(_localctx, 34, RULE_loope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__23);
			setState(187);
			value();
			setState(188);
			match(T__24);
			setState(189);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 36, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__25);
			setState(192);
			value();
			setState(193);
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
		enterRule(_localctx, 38, RULE_elsee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__26);
			setState(196);
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

	public static class SignExpressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpression; }
	}

	public final SignExpressionContext signExpression() throws RecognitionException {
		SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_signExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGN_OPERATORS:
			case NUMBER:
				{
				setState(204);
				number();
				}
				break;
			case STRING:
				{
				setState(205);
				deref();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				{
				setState(206);
				function();
				}
				break;
			case T__14:
				{
				setState(207);
				match(T__14);
				setState(208);
				expression();
				setState(209);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<SignExpressionContext> signExpression() {
			return getRuleContexts(SignExpressionContext.class);
		}
		public SignExpressionContext signExpression(int i) {
			return getRuleContext(SignExpressionContext.class,i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			signExpression();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				signExpression();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NestedExpressionContext extends ParserRuleContext {
		public NestedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpression; }
	}

	public final NestedExpressionContext nestedExpression() throws RecognitionException {
		NestedExpressionContext _localctx = new NestedExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nestedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				multiplyingExpression();
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						multiplyingExpression();
						}
						} 
					}
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				logic_expression(0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_logic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(235);
				bool();
				}
				break;
			case NEGATION_OPERATOR:
				{
				setState(236);
				match(NEGATION_OPERATOR);
				setState(237);
				logic_expression(3);
				}
				break;
			case STRING:
				{
				setState(238);
				deref();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(241);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(242);
						match(LOGIC_OPERATORS);
						setState(243);
						logic_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Logic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expression);
						setState(244);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(245);
						match(COMPARISON_OPERATORS);
						setState(246);
						logic_expression(2);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 50, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(252);
				match(SIGN_OPERATORS);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(testParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 54, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 56, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__31);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				line();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(268);
					match(EOL);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << STRING))) != 0) );
			setState(278);
			match(T__32);
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
		enterRule(_localctx, 60, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			type_name();
			setState(281);
			match(T__33);
			setState(282);
			name();
			setState(283);
			match(T__14);
			setState(284);
			type_name();
			setState(285);
			deref();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(286);
				match(T__15);
				setState(287);
				type_name();
				setState(288);
				deref();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(T__16);
			setState(296);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_f_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			name();
			setState(299);
			match(T__14);
			setState(300);
			value();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(301);
				match(T__15);
				setState(302);
				value();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(T__16);
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
		enterRule(_localctx, 64, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__2);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					match(STRING);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 24:
			return logic_expression_sempred((Logic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expression_sempred(Logic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\6\2I\n\2\r\2\16\2J\6\2M\n\2\r\2\16\2N\3\2"+
		"\5\2R\n\2\3\2\3\2\3\3\3\3\5\3X\n\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\5\3\5\5\5n\n\5\3\5\3\5\5\5r"+
		"\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ac\n\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\5\21\u00b5\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\7\26"+
		"\u00ca\n\26\f\26\16\26\u00cd\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00d6\n\26\3\27\3\27\3\27\7\27\u00db\n\27\f\27\16\27\u00de\13\27"+
		"\3\30\3\30\3\31\3\31\3\31\7\31\u00e5\n\31\f\31\16\31\u00e8\13\31\3\31"+
		"\5\31\u00eb\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00f2\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\7\32\u00fa\n\32\f\32\16\32\u00fd\13\32\3\33\7\33\u0100"+
		"\n\33\f\33\16\33\u0103\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3\37\7\37\u0110\n\37\f\37\16\37\u0113\13\37\6\37\u0115\n\37\r"+
		"\37\16\37\u0116\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0125\n \f"+
		" \16 \u0128\13 \3 \3 \3 \3!\3!\3!\3!\3!\7!\u0132\n!\f!\16!\u0135\13!\3"+
		"!\3!\3\"\3\"\7\"\u013b\n\"\f\"\16\"\u013e\13\"\3\"\2\3\62#\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\3\2\3\4\3\2"+
		"\t\n\3\2\13\f\3\2\r\16\3\2\24\30\3\2\36\37\3\2 !\2\u0147\2L\3\2\2\2\4"+
		"Z\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\n~\3\2\2\2\f\u0080\3\2\2\2\16\u0082\3"+
		"\2\2\2\20\u0085\3\2\2\2\22\u0088\3\2\2\2\24\u008b\3\2\2\2\26\u008e\3\2"+
		"\2\2\30\u0094\3\2\2\2\32\u00ab\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2\2"+
		"\2 \u00b4\3\2\2\2\"\u00b6\3\2\2\2$\u00bc\3\2\2\2&\u00c1\3\2\2\2(\u00c5"+
		"\3\2\2\2*\u00cb\3\2\2\2,\u00d7\3\2\2\2.\u00df\3\2\2\2\60\u00ea\3\2\2\2"+
		"\62\u00f1\3\2\2\2\64\u0101\3\2\2\2\66\u0106\3\2\2\28\u0108\3\2\2\2:\u010a"+
		"\3\2\2\2<\u010c\3\2\2\2>\u011a\3\2\2\2@\u012c\3\2\2\2B\u0138\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\7.\2\2HG\3\2\2\2IJ\3\2\2\2J"+
		"H\3\2\2\2JK\3\2\2\2KM\3\2\2\2LE\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PR\5\4\3\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\2\2\3T\3\3\2\2"+
		"\2UW\5\6\4\2VX\5B\"\2WV\3\2\2\2WX\3\2\2\2X[\3\2\2\2Y[\5B\"\2ZU\3\2\2\2"+
		"ZY\3\2\2\2[\5\3\2\2\2\\j\5\b\5\2]j\5> \2^j\5@!\2_j\5\22\n\2`j\5\n\6\2"+
		"aj\5$\23\2bj\5\"\22\2cj\5&\24\2dj\5(\25\2ej\5\f\7\2fj\5\26\f\2gj\5\16"+
		"\b\2hj\5\30\r\2i\\\3\2\2\2i]\3\2\2\2i^\3\2\2\2i_\3\2\2\2i`\3\2\2\2ia\3"+
		"\2\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3"+
		"\2\2\2j\7\3\2\2\2km\t\2\2\2ln\7\5\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oq"+
		"\5 \21\2pr\7\5\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\5 \21\2t\t\3\2\2\2"+
		"uv\5\34\17\2vw\58\35\2wx\7\6\2\2xy\5 \21\2y\177\3\2\2\2z{\58\35\2{|\7"+
		"\6\2\2|}\5 \21\2}\177\3\2\2\2~u\3\2\2\2~z\3\2\2\2\177\13\3\2\2\2\u0080"+
		"\u0081\7\7\2\2\u0081\r\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0084\5:\36\2"+
		"\u0084\17\3\2\2\2\u0085\u0086\t\3\2\2\u0086\u0087\7,\2\2\u0087\21\3\2"+
		"\2\2\u0088\u0089\t\4\2\2\u0089\u008a\5\32\16\2\u008a\23\3\2\2\2\u008b"+
		"\u008c\t\5\2\2\u008c\u008d\5 \21\2\u008d\25\3\2\2\2\u008e\u008f\7\17\2"+
		"\2\u008f\u0090\5 \21\2\u0090\u0091\5 \21\2\u0091\u0092\5 \21\2\u0092\u0093"+
		"\5 \21\2\u0093\27\3\2\2\2\u0094\u0095\7\20\2\2\u0095\u0096\5 \21\2\u0096"+
		"\u0097\5 \21\2\u0097\u0098\5 \21\2\u0098\31\3\2\2\2\u0099\u009a\7\21\2"+
		"\2\u009a\u009b\5 \21\2\u009b\u009c\7\22\2\2\u009c\u009d\5 \21\2\u009d"+
		"\u009e\7\22\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\23\2\2\u00a0\u00ac\3"+
		"\2\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\7\22\2\2\u00a4"+
		"\u00a5\5 \21\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\7"+
		"\22\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\7\23\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u0099\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\t\6\2"+
		"\2\u00ae\35\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\37\3\2\2\2\u00b1\u00b5\5"+
		"\60\31\2\u00b2\u00b5\5:\36\2\u00b3\u00b5\5\32\16\2\u00b4\u00b1\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b7\7"+
		"\31\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\23\2\2"+
		"\u00ba\u00bb\5<\37\2\u00bb#\3\2\2\2\u00bc\u00bd\7\32\2\2\u00bd\u00be\5"+
		" \21\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\5<\37\2\u00c0%\3\2\2\2\u00c1\u00c2"+
		"\7\34\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\5<\37\2\u00c4\'\3\2\2\2\u00c5"+
		"\u00c6\7\35\2\2\u00c6\u00c7\5<\37\2\u00c7)\3\2\2\2\u00c8\u00ca\t\7\2\2"+
		"\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d6\5\64\33\2"+
		"\u00cf\u00d6\58\35\2\u00d0\u00d6\5> \2\u00d1\u00d2\7\21\2\2\u00d2\u00d3"+
		"\5\60\31\2\u00d3\u00d4\7\23\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00ce\3\2\2"+
		"\2\u00d5\u00cf\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6+"+
		"\3\2\2\2\u00d7\u00dc\5*\26\2\u00d8\u00d9\t\b\2\2\u00d9\u00db\5*\26\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd-\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0/\3\2"+
		"\2\2\u00e1\u00e6\5,\27\2\u00e2\u00e3\t\7\2\2\u00e3\u00e5\5,\27\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\5\62\32\2\u00ea"+
		"\u00e1\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\61\3\2\2\2\u00ec\u00ed\b\32\1"+
		"\2\u00ed\u00f2\5\66\34\2\u00ee\u00ef\7(\2\2\u00ef\u00f2\5\62\32\5\u00f0"+
		"\u00f2\58\35\2\u00f1\u00ec\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00fb\3\2\2\2\u00f3\u00f4\f\6\2\2\u00f4\u00f5\7)\2\2\u00f5"+
		"\u00fa\5\62\32\7\u00f6\u00f7\f\3\2\2\u00f7\u00f8\7*\2\2\u00f8\u00fa\5"+
		"\62\32\4\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\63\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fe\u0100\7%\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\7&\2\2\u0105\65\3\2\2\2\u0106\u0107\7+\2\2\u0107\67\3\2\2\2\u0108"+
		"\u0109\7-\2\2\u01099\3\2\2\2\u010a\u010b\7-\2\2\u010b;\3\2\2\2\u010c\u0114"+
		"\7\"\2\2\u010d\u0111\5\4\3\2\u010e\u0110\7.\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u010d\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7#"+
		"\2\2\u0119=\3\2\2\2\u011a\u011b\5\34\17\2\u011b\u011c\7$\2\2\u011c\u011d"+
		"\5\36\20\2\u011d\u011e\7\21\2\2\u011e\u011f\5\34\17\2\u011f\u0126\58\35"+
		"\2\u0120\u0121\7\22\2\2\u0121\u0122\5\34\17\2\u0122\u0123\58\35\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7\23\2\2\u012a\u012b\5<\37\2\u012b?\3\2\2\2\u012c\u012d\5\36\20"+
		"\2\u012d\u012e\7\21\2\2\u012e\u0133\5 \21\2\u012f\u0130\7\22\2\2\u0130"+
		"\u0132\5 \21\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\7\23\2\2\u0137A\3\2\2\2\u0138\u013c\7\5\2\2\u0139\u013b\7-\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013dC\3\2\2\2\u013e\u013c\3\2\2\2\34EJNQWZimq~\u00ab\u00b4\u00cb"+
		"\u00d5\u00dc\u00e6\u00ea\u00f1\u00f9\u00fb\u0101\u0111\u0116\u0126\u0133"+
		"\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}