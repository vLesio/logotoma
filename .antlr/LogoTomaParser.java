// Generated from /home/makowskitomasz/Kompilatory/logotoma/LogoToma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoTomaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << SIGN_OPERATORS) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT))) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << SIGN_OPERATORS) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT))) != 0)) {
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

	public static class Spray_sizeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Spray_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spray_size; }
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

	public static class SleepContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SleepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sleep; }
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

	public static class ObjectContext extends ParserRuleContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
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
			setState(179);
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
		public TerminalNode STRING() { return getToken(LogoTomaParser.STRING, 0); }
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(LogoTomaParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
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

	public static class DerefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LogoTomaParser.STRING, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LogoTomaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << T__32) | (1L << SIGN_OPERATORS) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT))) != 0) );
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) {
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(LogoTomaParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\5\2N\n\2\3\2\6\2Q\n\2\r\2\16\2"+
		"R\6\2U\n\2\r\2\16\2V\3\2\5\2Z\n\2\3\2\3\2\3\3\3\3\5\3`\n\3\3\3\3\3\5\3"+
		"d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"u\n\4\3\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00c1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\7\27\u00d6\n\27\f\27\16"+
		"\27\u00d9\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e3\n\27"+
		"\3\30\3\30\3\30\7\30\u00e8\n\30\f\30\16\30\u00eb\13\30\3\31\3\31\3\31"+
		"\7\31\u00f0\n\31\f\31\16\31\u00f3\13\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00ff\n\32\3\33\3\33\3\33\5\33\u0104\n\33\3"+
		"\34\5\34\u0107\n\34\3\34\3\34\3\34\5\34\u010c\n\34\3\34\7\34\u010f\n\34"+
		"\f\34\16\34\u0112\13\34\3\35\7\35\u0115\n\35\f\35\16\35\u0118\13\35\3"+
		"\35\3\35\3\36\7\36\u011d\n\36\f\36\16\36\u0120\13\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\6\"\u012e\n\"\r\"\16\"\u012f\3\"\3\""+
		"\3#\3#\7#\u0136\n#\f#\16#\u0139\13#\3#\3#\3#\7#\u013e\n#\f#\16#\u0141"+
		"\13#\5#\u0143\n#\3$\5$\u0146\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0151\n"+
		"$\f$\16$\u0154\13$\3$\3$\3$\3%\3%\3%\3%\3%\7%\u015e\n%\f%\16%\u0161\13"+
		"%\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJ\2\3\3\2\24\30\2\u0180\2T\3\2\2\2\4c\3\2\2\2\6"+
		"t\3\2\2\2\bv\3\2\2\2\n}\3\2\2\2\f\u0085\3\2\2\2\16\u008c\3\2\2\2\20\u0092"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u0098\3\2\2\2\26\u009d\3\2\2\2\30\u00a8\3"+
		"\2\2\2\32\u00aa\3\2\2\2\34\u00ad\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2"+
		"\2\"\u00c0\3\2\2\2$\u00c2\3\2\2\2&\u00c8\3\2\2\2(\u00cd\3\2\2\2*\u00d1"+
		"\3\2\2\2,\u00d7\3\2\2\2.\u00e4\3\2\2\2\60\u00ec\3\2\2\2\62\u00fe\3\2\2"+
		"\2\64\u0100\3\2\2\2\66\u0106\3\2\2\28\u0116\3\2\2\2:\u011e\3\2\2\2<\u0125"+
		"\3\2\2\2>\u0127\3\2\2\2@\u0129\3\2\2\2B\u012b\3\2\2\2D\u0142\3\2\2\2F"+
		"\u0145\3\2\2\2H\u0158\3\2\2\2J\u0164\3\2\2\2LN\5\4\3\2ML\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2OQ\7-\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2"+
		"\2\2TM\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\5\4\3\2YX\3\2"+
		"\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\2\2\3\\\3\3\2\2\2]_\5\6\4\2^`\5J&\2_^\3"+
		"\2\2\2_`\3\2\2\2`d\3\2\2\2ad\5J&\2bd\5\60\31\2c]\3\2\2\2ca\3\2\2\2cb\3"+
		"\2\2\2d\5\3\2\2\2eu\5\b\5\2fu\5\n\6\2gu\5\f\7\2hu\5\16\b\2iu\5\20\t\2"+
		"ju\5\22\n\2ku\5\24\13\2lu\5F$\2mu\5H%\2nu\5\30\r\2ou\5&\24\2pu\5$\23\2"+
		"qu\5(\25\2ru\5*\26\2su\5\32\16\2te\3\2\2\2tf\3\2\2\2tg\3\2\2\2th\3\2\2"+
		"\2ti\3\2\2\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2"+
		"\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\7\3\2\2\2v{\7\3\2\2w|\7\4"+
		"\2\2x|\7\5\2\2y|\5> \2z|\5H%\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2"+
		"|\t\3\2\2\2}\u0083\7\6\2\2~\u0084\7\7\2\2\177\u0084\7\b\2\2\u0080\u0084"+
		"\7\5\2\2\u0081\u0084\5> \2\u0082\u0084\5H%\2\u0083~\3\2\2\2\u0083\177"+
		"\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\13\3\2\2\2\u0085\u008a\7\t\2\2\u0086\u008b\7\4\2\2\u0087\u008b\7\5\2"+
		"\2\u0088\u008b\5> \2\u0089\u008b\5H%\2\u008a\u0086\3\2\2\2\u008a\u0087"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\r\3\2\2\2\u008c"+
		"\u0090\7\n\2\2\u008d\u0091\5\34\17\2\u008e\u0091\5> \2\u008f\u0091\5H"+
		"%\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\17\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u0094\5\60\31\2\u0094\21\3\2\2"+
		"\2\u0095\u0096\7\f\2\2\u0096\u0097\5\60\31\2\u0097\23\3\2\2\2\u0098\u0099"+
		"\7\r\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\16\2\2\u009b\u009c\5\36\20"+
		"\2\u009c\25\3\2\2\2\u009d\u009e\5> \2\u009e\27\3\2\2\2\u009f\u00a0\5\36"+
		"\20\2\u00a0\u00a1\5> \2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\5\"\22\2\u00a3"+
		"\u00a9\3\2\2\2\u00a4\u00a5\5> \2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\5\""+
		"\22\2\u00a7\u00a9\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\5@!\2\u00ac\33\3\2\2\2\u00ad"+
		"\u00ae\7\21\2\2\u00ae\u00af\5\"\22\2\u00af\u00b0\7\22\2\2\u00b0\u00b1"+
		"\5\"\22\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4\7\23\2"+
		"\2\u00b4\35\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\37\3\2\2\2\u00b7\u00b8\7"+
		",\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\5@!\2\u00bb\u00bc"+
		"\7\31\2\2\u00bc\u00c1\3\2\2\2\u00bd\u00c1\5\66\34\2\u00be\u00c1\5\60\31"+
		"\2\u00bf\u00c1\5\34\17\2\u00c0\u00b9\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7\32\2\2"+
		"\u00c3\u00c4\7\21\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\7\23\2\2\u00c6"+
		"\u00c7\5B\"\2\u00c7%\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\5\"\22\2"+
		"\u00ca\u00cb\7\34\2\2\u00cb\u00cc\5B\"\2\u00cc\'\3\2\2\2\u00cd\u00ce\7"+
		"\35\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\5B\"\2\u00d0)\3\2\2\2\u00d1\u00d2"+
		"\7\36\2\2\u00d2\u00d3\5B\"\2\u00d3+\3\2\2\2\u00d4\u00d6\7$\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00e2\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e3\58\35\2\u00db\u00e3\5:"+
		"\36\2\u00dc\u00e3\5> \2\u00dd\u00e3\5H%\2\u00de\u00df\7\21\2\2\u00df\u00e0"+
		"\5\60\31\2\u00e0\u00e1\7\23\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00da\3\2\2"+
		"\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de"+
		"\3\2\2\2\u00e3-\3\2\2\2\u00e4\u00e9\5,\27\2\u00e5\u00e6\7&\2\2\u00e6\u00e8"+
		"\5,\27\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea/\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f1\5.\30\2"+
		"\u00ed\u00ee\7$\2\2\u00ee\u00f0\5.\30\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\61\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00ff\5> \2\u00f5\u00ff\5<\37\2\u00f6\u00ff\58\35"+
		"\2\u00f7\u00ff\5:\36\2\u00f8\u00ff\5H%\2\u00f9\u00ff\5\60\31\2\u00fa\u00fb"+
		"\7\21\2\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\7\23\2\2\u00fd\u00ff\3\2\2"+
		"\2\u00fe\u00f4\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f7"+
		"\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff"+
		"\63\3\2\2\2\u0100\u0103\5\62\32\2\u0101\u0102\7*\2\2\u0102\u0104\5\62"+
		"\32\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\65\3\2\2\2\u0105\u0107"+
		"\7(\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0110\5\64\33\2\u0109\u010b\7)\2\2\u010a\u010c\7(\2\2\u010b\u010a\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\5\64\33\2\u010e"+
		"\u0109\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\67\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\7$\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7%\2\2\u011a9\3\2\2\2\u011b"+
		"\u011d\7$\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0122\7%\2\2\u0122\u0123\7\37\2\2\u0123\u0124\7%\2\2\u0124;\3\2\2\2\u0125"+
		"\u0126\7+\2\2\u0126=\3\2\2\2\u0127\u0128\7,\2\2\u0128?\3\2\2\2\u0129\u012a"+
		"\7,\2\2\u012aA\3\2\2\2\u012b\u012d\7 \2\2\u012c\u012e\5D#\2\u012d\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7!\2\2\u0132C\3\2\2\2\u0133\u0137\5\4\3\2\u0134"+
		"\u0136\7-\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0143\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\7\"\2\2\u013b\u013f\5\"\22\2\u013c\u013e\7-\2\2\u013d\u013c\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0133\3\2\2\2\u0142\u013a\3\2"+
		"\2\2\u0143E\3\2\2\2\u0144\u0146\5\36\20\2\u0145\u0144\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7#\2\2\u0148\u0149\5 \21\2\u0149"+
		"\u014a\7\21\2\2\u014a\u014b\5\36\20\2\u014b\u0152\5> \2\u014c\u014d\7"+
		"\22\2\2\u014d\u014e\5\36\20\2\u014e\u014f\5> \2\u014f\u0151\3\2\2\2\u0150"+
		"\u014c\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\23\2\2\u0156"+
		"\u0157\5B\"\2\u0157G\3\2\2\2\u0158\u0159\5 \21\2\u0159\u015a\7\21\2\2"+
		"\u015a\u015f\5\"\22\2\u015b\u015c\7\22\2\2\u015c\u015e\5\"\22\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\23\2\2\u0163"+
		"I\3\2\2\2\u0164\u0165\7.\2\2\u0165K\3\2\2\2!MRVY_ct{\u0083\u008a\u0090"+
		"\u00a8\u00c0\u00d7\u00e2\u00e9\u00f1\u00fe\u0103\u0106\u010b\u0110\u0116"+
		"\u011e\u012f\u0137\u013f\u0142\u0145\u0152\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}