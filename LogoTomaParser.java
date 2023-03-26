// Generated from LogoToma.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogoTomaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, SIGN_OPERATORS=34, NUMBER=35, MULTIPLYING_OPERATORS=36, 
		SUM_OPERATORS=37, NEGATION_OPERATOR=38, LOGIC_OPERATORS=39, COMPARISON_OPERATORS=40, 
		BOOL=41, STRING=42, EOL=43, COMMENT=44, WS=45;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_command = 2, RULE_engine = 3, RULE_wheel = 4, 
		RULE_spray = 5, RULE_spray_color = 6, RULE_spray_size = 7, RULE_sleep = 8, 
		RULE_cast = 9, RULE_object = 10, RULE_assign = 11, RULE_save = 12, RULE_color = 13, 
		RULE_type_name = 14, RULE_name = 15, RULE_value = 16, RULE_ife = 17, RULE_loope = 18, 
		RULE_whilee = 19, RULE_elsee = 20, RULE_signExpression = 21, RULE_multiplyingExpression = 22, 
		RULE_expression = 23, RULE_atomicLogicExpression = 24, RULE_comparisonExpression = 25, 
		RULE_logic_expression = 26, RULE_integer = 27, RULE_floate = 28, RULE_bool = 29, 
		RULE_deref = 30, RULE_string = 31, RULE_block = 32, RULE_statement = 33, 
		RULE_function = 34, RULE_f_call = 35, RULE_comment = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "command", "engine", "wheel", "spray", "spray_color", 
			"spray_size", "sleep", "cast", "object", "assign", "save", "color", "type_name", 
			"name", "value", "ife", "loope", "whilee", "elsee", "signExpression", 
			"multiplyingExpression", "expression", "atomicLogicExpression", "comparisonExpression", 
			"logic_expression", "integer", "floate", "bool", "deref", "string", "block", 
			"statement", "function", "f_call", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'engine'", "'on'", "'off'", "'wheel'", "'right'", "'left'", "'spray'", 
			"'spray color'", "'spray size'", "'sleep'", "'cast'", "'->'", "'='", 
			"'save'", "'('", "','", "')'", "'bool'", "'color'", "'int'", "'float'", 
			"'string'", "'\"'", "'if'", "'loop'", "'times'", "'loop while'", "'else'", 
			"'.'", "'{'", "'}'", "'return'", "'pattern'", null, null, null, null, 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "SIGN_OPERATORS", 
			"NUMBER", "MULTIPLYING_OPERATORS", "SUM_OPERATORS", "NEGATION_OPERATOR", 
			"LOGIC_OPERATORS", "COMPARISON_OPERATORS", "BOOL", "STRING", "EOL", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "LogoToma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoTomaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogoTomaParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(LogoTomaParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LogoTomaParser.EOL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitProgram(this);
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
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22050823262098L) != 0)) {
						{
						setState(74);
						line();
						}
					}

					setState(78); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(77);
							match(EOL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(80); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22050823262098L) != 0)) {
				{
				setState(86);
				line();
				}
			}

			setState(89);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				command();
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(92);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				expression();
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
	public static class CommandContext extends ParserRuleContext {
		public EngineContext engine() {
			return getRuleContext(EngineContext.class,0);
		}
		public WheelContext wheel() {
			return getRuleContext(WheelContext.class,0);
		}
		public SprayContext spray() {
			return getRuleContext(SprayContext.class,0);
		}
		public Spray_colorContext spray_color() {
			return getRuleContext(Spray_colorContext.class,0);
		}
		public Spray_sizeContext spray_size() {
			return getRuleContext(Spray_sizeContext.class,0);
		}
		public SleepContext sleep() {
			return getRuleContext(SleepContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
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
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				engine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				wheel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				spray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				spray_color();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				spray_size();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				sleep();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				cast();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				f_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(108);
				assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(109);
				loope();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(110);
				ife();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(111);
				whilee();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(112);
				elsee();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(113);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EngineContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitEngine(this);
		}
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_engine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(117);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(118);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(119);
				deref();
				}
				break;
			case 4:
				{
				setState(120);
				f_call();
				}
				break;
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
	public static class WheelContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public WheelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterWheel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitWheel(this);
		}
	}

	public final WheelContext wheel() throws RecognitionException {
		WheelContext _localctx = new WheelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wheel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__3);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(124);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(125);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(126);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(127);
				deref();
				}
				break;
			case 5:
				{
				setState(128);
				f_call();
				}
				break;
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
	public static class SprayContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public SprayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterSpray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitSpray(this);
		}
	}

	public final SprayContext spray() throws RecognitionException {
		SprayContext _localctx = new SprayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_spray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__6);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(132);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(133);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(134);
				deref();
				}
				break;
			case 4:
				{
				setState(135);
				f_call();
				}
				break;
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
	public static class Spray_colorContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public Spray_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spray_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterSpray_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitSpray_color(this);
		}
	}

	public final Spray_colorContext spray_color() throws RecognitionException {
		Spray_colorContext _localctx = new Spray_colorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_spray_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__7);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(139);
				color();
				}
				break;
			case 2:
				{
				setState(140);
				deref();
				}
				break;
			case 3:
				{
				setState(141);
				f_call();
				}
				break;
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
	public static class Spray_sizeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Spray_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spray_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterSpray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitSpray_size(this);
		}
	}

	public final Spray_sizeContext spray_size() throws RecognitionException {
		Spray_sizeContext _localctx = new Spray_sizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spray_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__8);
			setState(145);
			expression();
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
	public static class SleepContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SleepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sleep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterSleep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitSleep(this);
		}
	}

	public final SleepContext sleep() throws RecognitionException {
		SleepContext _localctx = new SleepContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sleep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__9);
			setState(148);
			expression();
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
	public static class CastContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__10);
			setState(151);
			object();
			setState(152);
			match(T__11);
			setState(153);
			type_name();
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
	public static class ObjectContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			deref();
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
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				type_name();
				setState(158);
				deref();
				setState(159);
				match(T__12);
				setState(160);
				value();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				deref();
				setState(163);
				match(T__12);
				setState(164);
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
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitSave(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__13);
			setState(169);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			value();
			setState(173);
			match(T__15);
			setState(174);
			value();
			setState(175);
			match(T__15);
			setState(176);
			value();
			setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_nameContext extends ParserRuleContext {
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
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
		public TerminalNode STRING() { return getToken(LogoTomaParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__22);
				setState(184);
				string();
				setState(185);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				logic_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterIfe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitIfe(this);
		}
	}

	public final IfeContext ife() throws RecognitionException {
		IfeContext _localctx = new IfeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__23);
			setState(193);
			match(T__14);
			setState(194);
			value();
			setState(195);
			match(T__16);
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
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterLoope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitLoope(this);
		}
	}

	public final LoopeContext loope() throws RecognitionException {
		LoopeContext _localctx = new LoopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__24);
			setState(199);
			value();
			setState(200);
			match(T__25);
			setState(201);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterWhilee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitWhilee(this);
		}
	}

	public final WhileeContext whilee() throws RecognitionException {
		WhileeContext _localctx = new WhileeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__26);
			setState(204);
			value();
			setState(205);
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
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterElsee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitElsee(this);
		}
	}

	public final ElseeContext elsee() throws RecognitionException {
		ElseeContext _localctx = new ElseeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elsee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__27);
			setState(208);
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
	public static class SignExpressionContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloateContext floate() {
			return getRuleContext(FloateContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaParser.SIGN_OPERATORS, i);
		}
		public SignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterSignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitSignExpression(this);
		}
	}

	public final SignExpressionContext signExpression() throws RecognitionException {
		SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_signExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(SIGN_OPERATORS);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(216);
				integer();
				}
				break;
			case 2:
				{
				setState(217);
				floate();
				}
				break;
			case 3:
				{
				setState(218);
				deref();
				}
				break;
			case 4:
				{
				setState(219);
				f_call();
				}
				break;
			case 5:
				{
				setState(220);
				match(T__14);
				setState(221);
				expression();
				setState(222);
				match(T__16);
				}
				break;
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
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<SignExpressionContext> signExpression() {
			return getRuleContexts(SignExpressionContext.class);
		}
		public SignExpressionContext signExpression(int i) {
			return getRuleContext(SignExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLYING_OPERATORS() { return getTokens(LogoTomaParser.MULTIPLYING_OPERATORS); }
		public TerminalNode MULTIPLYING_OPERATORS(int i) {
			return getToken(LogoTomaParser.MULTIPLYING_OPERATORS, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			signExpression();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLYING_OPERATORS) {
				{
				{
				setState(227);
				match(MULTIPLYING_OPERATORS);
				setState(228);
				signExpression();
				}
				}
				setState(233);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaParser.SIGN_OPERATORS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			multiplyingExpression();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					match(SIGN_OPERATORS);
					setState(236);
					multiplyingExpression();
					}
					} 
				}
				setState(241);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicLogicExpressionContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloateContext floate() {
			return getRuleContext(FloateContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public AtomicLogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicLogicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterAtomicLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitAtomicLogicExpression(this);
		}
	}

	public final AtomicLogicExpressionContext atomicLogicExpression() throws RecognitionException {
		AtomicLogicExpressionContext _localctx = new AtomicLogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atomicLogicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(242);
				deref();
				}
				break;
			case 2:
				{
				setState(243);
				bool();
				}
				break;
			case 3:
				{
				setState(244);
				integer();
				}
				break;
			case 4:
				{
				setState(245);
				floate();
				}
				break;
			case 5:
				{
				setState(246);
				f_call();
				}
				break;
			case 6:
				{
				setState(247);
				expression();
				}
				break;
			case 7:
				{
				setState(248);
				match(T__14);
				setState(249);
				logic_expression();
				setState(250);
				match(T__16);
				}
				break;
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
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AtomicLogicExpressionContext> atomicLogicExpression() {
			return getRuleContexts(AtomicLogicExpressionContext.class);
		}
		public AtomicLogicExpressionContext atomicLogicExpression(int i) {
			return getRuleContext(AtomicLogicExpressionContext.class,i);
		}
		public TerminalNode COMPARISON_OPERATORS() { return getToken(LogoTomaParser.COMPARISON_OPERATORS, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			atomicLogicExpression();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPARISON_OPERATORS) {
				{
				setState(255);
				match(COMPARISON_OPERATORS);
				setState(256);
				atomicLogicExpression();
				}
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
	public static class Logic_expressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> NEGATION_OPERATOR() { return getTokens(LogoTomaParser.NEGATION_OPERATOR); }
		public TerminalNode NEGATION_OPERATOR(int i) {
			return getToken(LogoTomaParser.NEGATION_OPERATOR, i);
		}
		public List<TerminalNode> LOGIC_OPERATORS() { return getTokens(LogoTomaParser.LOGIC_OPERATORS); }
		public TerminalNode LOGIC_OPERATORS(int i) {
			return getToken(LogoTomaParser.LOGIC_OPERATORS, i);
		}
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterLogic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitLogic_expression(this);
		}
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logic_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION_OPERATOR) {
				{
				setState(259);
				match(NEGATION_OPERATOR);
				}
			}

			setState(262);
			comparisonExpression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_OPERATORS) {
				{
				{
				setState(263);
				match(LOGIC_OPERATORS);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATION_OPERATOR) {
					{
					setState(264);
					match(NEGATION_OPERATOR);
					}
				}

				setState(267);
				comparisonExpression();
				}
				}
				setState(272);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LogoTomaParser.NUMBER, 0); }
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaParser.SIGN_OPERATORS, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(273);
				match(SIGN_OPERATORS);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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
	public static class FloateContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(LogoTomaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LogoTomaParser.NUMBER, i);
		}
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaParser.SIGN_OPERATORS, i);
		}
		public FloateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterFloate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitFloate(this);
		}
	}

	public final FloateContext floate() throws RecognitionException {
		FloateContext _localctx = new FloateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_floate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(281);
				match(SIGN_OPERATORS);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(NUMBER);
			setState(288);
			match(T__28);
			setState(289);
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
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(LogoTomaParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		public TerminalNode STRING() { return getToken(LogoTomaParser.STRING, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitDeref(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		public TerminalNode STRING() { return getToken(LogoTomaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__29);
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				statement();
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 22055118229394L) != 0) );
			setState(303);
			match(T__30);
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
	public static class StatementContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(LogoTomaParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LogoTomaParser.EOL, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__13:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__32:
			case SIGN_OPERATORS:
			case NUMBER:
			case STRING:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				line();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(306);
					match(EOL);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__31);
				setState(313);
				value();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(314);
					match(EOL);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class FunctionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
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
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) {
				{
				setState(322);
				type_name();
				}
			}

			setState(325);
			match(T__32);
			setState(326);
			name();
			setState(327);
			match(T__14);
			setState(328);
			type_name();
			setState(329);
			deref();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(330);
				match(T__15);
				setState(331);
				type_name();
				setState(332);
				deref();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(T__16);
			setState(340);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterF_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitF_call(this);
		}
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_f_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			name();
			setState(343);
			match(T__14);
			setState(344);
			value();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(345);
				match(T__15);
				setState(346);
				value();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(LogoTomaParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTomaListener ) ((LogoTomaListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(COMMENT);
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
		"\u0004\u0001-\u0165\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0003\u0000L\b\u0000\u0001\u0000\u0004"+
		"\u0000O\b\u0000\u000b\u0000\f\u0000P\u0004\u0000S\b\u0000\u000b\u0000"+
		"\f\u0000T\u0001\u0000\u0003\u0000X\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001^\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002s\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003z\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008f\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00bf\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0005\u0015\u00d4"+
		"\b\u0015\n\u0015\f\u0015\u00d7\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00e1\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00e6\b"+
		"\u0016\n\u0016\f\u0016\u00e9\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00ee\b\u0017\n\u0017\f\u0017\u00f1\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00fd\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0102\b\u0019\u0001\u001a\u0003\u001a\u0105"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u010a\b\u001a"+
		"\u0001\u001a\u0005\u001a\u010d\b\u001a\n\u001a\f\u001a\u0110\t\u001a\u0001"+
		"\u001b\u0005\u001b\u0113\b\u001b\n\u001b\f\u001b\u0116\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0005\u001c\u011b\b\u001c\n\u001c\f\u001c\u011e"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0004"+
		" \u012c\b \u000b \f \u012d\u0001 \u0001 \u0001!\u0001!\u0005!\u0134\b"+
		"!\n!\f!\u0137\t!\u0001!\u0001!\u0001!\u0005!\u013c\b!\n!\f!\u013f\t!\u0003"+
		"!\u0141\b!\u0001\"\u0003\"\u0144\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u014f\b\"\n\"\f\"\u0152\t\""+
		"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u015c"+
		"\b#\n#\f#\u015f\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0000\u0000%\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFH\u0000\u0001\u0001\u0000\u0012\u0016\u017e"+
		"\u0000R\u0001\u0000\u0000\u0000\u0002a\u0001\u0000\u0000\u0000\u0004r"+
		"\u0001\u0000\u0000\u0000\u0006t\u0001\u0000\u0000\u0000\b{\u0001\u0000"+
		"\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000"+
		"\u0000\u000e\u0090\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000"+
		"\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u009b\u0001\u0000\u0000"+
		"\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000"+
		"\u0000\u001a\u00ab\u0001\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000"+
		"\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00be\u0001\u0000\u0000\u0000"+
		"\"\u00c0\u0001\u0000\u0000\u0000$\u00c6\u0001\u0000\u0000\u0000&\u00cb"+
		"\u0001\u0000\u0000\u0000(\u00cf\u0001\u0000\u0000\u0000*\u00d5\u0001\u0000"+
		"\u0000\u0000,\u00e2\u0001\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u0000"+
		"0\u00fc\u0001\u0000\u0000\u00002\u00fe\u0001\u0000\u0000\u00004\u0104"+
		"\u0001\u0000\u0000\u00006\u0114\u0001\u0000\u0000\u00008\u011c\u0001\u0000"+
		"\u0000\u0000:\u0123\u0001\u0000\u0000\u0000<\u0125\u0001\u0000\u0000\u0000"+
		">\u0127\u0001\u0000\u0000\u0000@\u0129\u0001\u0000\u0000\u0000B\u0140"+
		"\u0001\u0000\u0000\u0000D\u0143\u0001\u0000\u0000\u0000F\u0156\u0001\u0000"+
		"\u0000\u0000H\u0162\u0001\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000"+
		"KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000"+
		"\u0000MO\u0005+\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RK\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000"+
		"VX\u0003\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u0000\u0000\u0001Z\u0001\u0001"+
		"\u0000\u0000\u0000[]\u0003\u0004\u0002\u0000\\^\u0003H$\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^b\u0001\u0000\u0000\u0000"+
		"_b\u0003H$\u0000`b\u0003.\u0017\u0000a[\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0003\u0001\u0000\u0000"+
		"\u0000cs\u0003\u0006\u0003\u0000ds\u0003\b\u0004\u0000es\u0003\n\u0005"+
		"\u0000fs\u0003\f\u0006\u0000gs\u0003\u000e\u0007\u0000hs\u0003\u0010\b"+
		"\u0000is\u0003\u0012\t\u0000js\u0003D\"\u0000ks\u0003F#\u0000ls\u0003"+
		"\u0016\u000b\u0000ms\u0003$\u0012\u0000ns\u0003\"\u0011\u0000os\u0003"+
		"&\u0013\u0000ps\u0003(\u0014\u0000qs\u0003\u0018\f\u0000rc\u0001\u0000"+
		"\u0000\u0000rd\u0001\u0000\u0000\u0000re\u0001\u0000\u0000\u0000rf\u0001"+
		"\u0000\u0000\u0000rg\u0001\u0000\u0000\u0000rh\u0001\u0000\u0000\u0000"+
		"ri\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000"+
		"\u0000rl\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000rn\u0001\u0000"+
		"\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000ty\u0005\u0001\u0000"+
		"\u0000uz\u0005\u0002\u0000\u0000vz\u0005\u0003\u0000\u0000wz\u0003<\u001e"+
		"\u0000xz\u0003F#\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0007\u0001\u0000"+
		"\u0000\u0000{\u0081\u0005\u0004\u0000\u0000|\u0082\u0005\u0005\u0000\u0000"+
		"}\u0082\u0005\u0006\u0000\u0000~\u0082\u0005\u0003\u0000\u0000\u007f\u0082"+
		"\u0003<\u001e\u0000\u0080\u0082\u0003F#\u0000\u0081|\u0001\u0000\u0000"+
		"\u0000\u0081}\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\t\u0001\u0000\u0000\u0000\u0083\u0088\u0005\u0007\u0000\u0000\u0084\u0089"+
		"\u0005\u0002\u0000\u0000\u0085\u0089\u0005\u0003\u0000\u0000\u0086\u0089"+
		"\u0003<\u001e\u0000\u0087\u0089\u0003F#\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u000b\u0001\u0000"+
		"\u0000\u0000\u008a\u008e\u0005\b\u0000\u0000\u008b\u008f\u0003\u001a\r"+
		"\u0000\u008c\u008f\u0003<\u001e\u0000\u008d\u008f\u0003F#\u0000\u008e"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\t\u0000\u0000\u0091\u0092\u0003.\u0017\u0000\u0092\u000f\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094\u0095\u0003."+
		"\u0017\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b"+
		"\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099\u0005\f\u0000"+
		"\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a\u0013\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0003<\u001e\u0000\u009c\u0015\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0003\u001c\u000e\u0000\u009e\u009f\u0003<\u001e\u0000\u009f"+
		"\u00a0\u0005\r\u0000\u0000\u00a0\u00a1\u0003 \u0010\u0000\u00a1\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003<\u001e\u0000\u00a3\u00a4\u0005"+
		"\r\u0000\u0000\u00a4\u00a5\u0003 \u0010\u0000\u00a5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u000e"+
		"\u0000\u0000\u00a9\u00aa\u0003>\u001f\u0000\u00aa\u0019\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000\u00ac\u00ad\u0003 \u0010\u0000"+
		"\u00ad\u00ae\u0005\u0010\u0000\u0000\u00ae\u00af\u0003 \u0010\u0000\u00af"+
		"\u00b0\u0005\u0010\u0000\u0000\u00b0\u00b1\u0003 \u0010\u0000\u00b1\u00b2"+
		"\u0005\u0011\u0000\u0000\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0007\u0000\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005*\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0017\u0000\u0000\u00b8\u00b9\u0003>\u001f\u0000\u00b9\u00ba\u0005\u0017"+
		"\u0000\u0000\u00ba\u00bf\u0001\u0000\u0000\u0000\u00bb\u00bf\u00034\u001a"+
		"\u0000\u00bc\u00bf\u0003.\u0017\u0000\u00bd\u00bf\u0003\u001a\r\u0000"+
		"\u00be\u00b7\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf!\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0018\u0000\u0000\u00c1"+
		"\u00c2\u0005\u000f\u0000\u0000\u00c2\u00c3\u0003 \u0010\u0000\u00c3\u00c4"+
		"\u0005\u0011\u0000\u0000\u00c4\u00c5\u0003@ \u0000\u00c5#\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\u0019\u0000\u0000\u00c7\u00c8\u0003 \u0010"+
		"\u0000\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9\u00ca\u0003@ \u0000\u00ca"+
		"%\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u001b\u0000\u0000\u00cc\u00cd"+
		"\u0003 \u0010\u0000\u00cd\u00ce\u0003@ \u0000\u00ce\'\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0003@ \u0000\u00d1"+
		")\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005\"\u0000\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00e0"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00e1"+
		"\u00036\u001b\u0000\u00d9\u00e1\u00038\u001c\u0000\u00da\u00e1\u0003<"+
		"\u001e\u0000\u00db\u00e1\u0003F#\u0000\u00dc\u00dd\u0005\u000f\u0000\u0000"+
		"\u00dd\u00de\u0003.\u0017\u0000\u00de\u00df\u0005\u0011\u0000\u0000\u00df"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0"+
		"\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e1"+
		"+\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003*\u0015\u0000\u00e3\u00e4\u0005"+
		"$\u0000\u0000\u00e4\u00e6\u0003*\u0015\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8-\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ef\u0003,\u0016\u0000\u00eb"+
		"\u00ec\u0005\"\u0000\u0000\u00ec\u00ee\u0003,\u0016\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0/\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00fd\u0003"+
		"<\u001e\u0000\u00f3\u00fd\u0003:\u001d\u0000\u00f4\u00fd\u00036\u001b"+
		"\u0000\u00f5\u00fd\u00038\u001c\u0000\u00f6\u00fd\u0003F#\u0000\u00f7"+
		"\u00fd\u0003.\u0017\u0000\u00f8\u00f9\u0005\u000f\u0000\u0000\u00f9\u00fa"+
		"\u00034\u001a\u0000\u00fa\u00fb\u0005\u0011\u0000\u0000\u00fb\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f2\u0001\u0000\u0000\u0000\u00fc\u00f3\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00f5\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd1\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u00030\u0018\u0000\u00ff\u0100\u0005(\u0000\u0000"+
		"\u0100\u0102\u00030\u0018\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u01023\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0005&\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010e\u0003"+
		"2\u0019\u0000\u0107\u0109\u0005\'\u0000\u0000\u0108\u010a\u0005&\u0000"+
		"\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u00032\u0019\u0000"+
		"\u010c\u0107\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f5\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u0113\u0005\"\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0005#\u0000\u0000\u01187\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0005\"\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0005#\u0000\u0000"+
		"\u0120\u0121\u0005\u001d\u0000\u0000\u0121\u0122\u0005#\u0000\u0000\u0122"+
		"9\u0001\u0000\u0000\u0000\u0123\u0124\u0005)\u0000\u0000\u0124;\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0005*\u0000\u0000\u0126=\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005*\u0000\u0000\u0128?\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0005\u001e\u0000\u0000\u012a\u012c\u0003B!\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005\u001f\u0000\u0000\u0130A\u0001\u0000"+
		"\u0000\u0000\u0131\u0135\u0003\u0002\u0001\u0000\u0132\u0134\u0005+\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0141\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005 \u0000\u0000\u0139\u013d\u0003 \u0010\u0000\u013a"+
		"\u013c\u0005+\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013f"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u0131\u0001\u0000\u0000\u0000\u0140\u0138"+
		"\u0001\u0000\u0000\u0000\u0141C\u0001\u0000\u0000\u0000\u0142\u0144\u0003"+
		"\u001c\u000e\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"!\u0000\u0000\u0146\u0147\u0003\u001e\u000f\u0000\u0147\u0148\u0005\u000f"+
		"\u0000\u0000\u0148\u0149\u0003\u001c\u000e\u0000\u0149\u0150\u0003<\u001e"+
		"\u0000\u014a\u014b\u0005\u0010\u0000\u0000\u014b\u014c\u0003\u001c\u000e"+
		"\u0000\u014c\u014d\u0003<\u001e\u0000\u014d\u014f\u0001\u0000\u0000\u0000"+
		"\u014e\u014a\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005\u0011\u0000\u0000\u0154\u0155\u0003@ \u0000\u0155E"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0003\u001e\u000f\u0000\u0157\u0158"+
		"\u0005\u000f\u0000\u0000\u0158\u015d\u0003 \u0010\u0000\u0159\u015a\u0005"+
		"\u0010\u0000\u0000\u015a\u015c\u0003 \u0010\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0011"+
		"\u0000\u0000\u0161G\u0001\u0000\u0000\u0000\u0162\u0163\u0005,\u0000\u0000"+
		"\u0163I\u0001\u0000\u0000\u0000\u001fKPTW]ary\u0081\u0088\u008e\u00a6"+
		"\u00be\u00d5\u00e0\u00e7\u00ef\u00fc\u0101\u0104\u0109\u010e\u0114\u011c"+
		"\u012d\u0135\u013d\u0140\u0143\u0150\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}