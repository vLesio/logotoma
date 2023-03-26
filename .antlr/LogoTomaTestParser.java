// Generated from /home/makowskitomasz/Kompilatory/logotoma/LogoTomaTest.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoTomaTestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, SIGN_OPERATORS=33, NUMBER=34, MULTIPLYING_OPERATORS=35, SUM_OPERATORS=36, 
		NEGATION_OPERATOR=37, LOGIC_OPERATORS=38, COMPARISON_OPERATORS=39, BOOL=40, 
		STRING=41, EOL=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_command = 2, RULE_engine = 3, RULE_wheel = 4, 
		RULE_spray = 5, RULE_spray_color = 6, RULE_spray_size = 7, RULE_cast = 8, 
		RULE_object = 9, RULE_assign = 10, RULE_save = 11, RULE_color = 12, RULE_type_name = 13, 
		RULE_name = 14, RULE_value = 15, RULE_ife = 16, RULE_loope = 17, RULE_whilee = 18, 
		RULE_elsee = 19, RULE_signExpression = 20, RULE_multiplyingExpression = 21, 
		RULE_expression = 22, RULE_atomicLogicExpression = 23, RULE_comparisonExpression = 24, 
		RULE_logic_expression = 25, RULE_integer = 26, RULE_floate = 27, RULE_bool = 28, 
		RULE_deref = 29, RULE_string = 30, RULE_block = 31, RULE_statement = 32, 
		RULE_function = 33, RULE_f_call = 34, RULE_comment = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "command", "engine", "wheel", "spray", "spray_color", 
			"spray_size", "cast", "object", "assign", "save", "color", "type_name", 
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
			"'spray color'", "'spray size'", "'cast'", "'->'", "'='", "'save'", "'('", 
			"','", "')'", "'bool'", "'color'", "'int'", "'float'", "'string'", "'\"'", 
			"'if'", "'loop'", "'times'", "'loop while'", "'else'", "'.'", "'{'", 
			"'}'", "'return'", "'pattern'", null, null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "SIGN_OPERATORS", 
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
	public String getGrammarFileName() { return "LogoTomaTest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoTomaTestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogoTomaTestParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(LogoTomaTestParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LogoTomaTestParser.EOL, i);
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
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << SIGN_OPERATORS) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT))) != 0)) {
						{
						setState(72);
						line();
						}
					}

					setState(76); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(75);
							match(EOL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(78); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << SIGN_OPERATORS) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT))) != 0)) {
				{
				setState(84);
				line();
				}
			}

			setState(87);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				command();
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(90);
					comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				engine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				wheel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				spray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				spray_color();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				spray_size();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				cast();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				f_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				assign();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				loope();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				ife();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
				whilee();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
				elsee();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(110);
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
		public EngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engine; }
	}

	public final EngineContext engine() throws RecognitionException {
		EngineContext _localctx = new EngineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__0);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	public static class WheelContext extends ParserRuleContext {
		public WheelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheel; }
	}

	public final WheelContext wheel() throws RecognitionException {
		WheelContext _localctx = new WheelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wheel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__3);
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class SprayContext extends ParserRuleContext {
		public SprayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spray; }
	}

	public final SprayContext spray() throws RecognitionException {
		SprayContext _localctx = new SprayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_spray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__6);
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	public static class Spray_colorContext extends ParserRuleContext {
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
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
			setState(122);
			match(T__7);
			setState(123);
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

	public static class Spray_sizeContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(125);
			match(T__8);
			setState(126);
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
		enterRule(_localctx, 16, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			object();
			setState(130);
			match(T__10);
			setState(131);
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
		enterRule(_localctx, 18, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		enterRule(_localctx, 20, RULE_assign);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				type_name();
				setState(136);
				deref();
				setState(137);
				match(T__11);
				setState(138);
				value();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				deref();
				setState(141);
				match(T__11);
				setState(142);
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
		enterRule(_localctx, 22, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__12);
			setState(147);
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
		enterRule(_localctx, 24, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__13);
			setState(150);
			value();
			setState(151);
			match(T__14);
			setState(152);
			value();
			setState(153);
			match(T__14);
			setState(154);
			value();
			setState(155);
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
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		public TerminalNode STRING() { return getToken(LogoTomaTestParser.STRING, 0); }
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
			setState(159);
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
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				logic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(T__21);
				setState(164);
				string();
				setState(165);
				match(T__21);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
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
			setState(170);
			match(T__22);
			setState(171);
			match(T__13);
			setState(172);
			value();
			setState(173);
			match(T__15);
			setState(174);
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
			setState(176);
			match(T__23);
			setState(177);
			value();
			setState(178);
			match(T__24);
			setState(179);
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
			setState(181);
			match(T__25);
			setState(182);
			value();
			setState(183);
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
			setState(185);
			match(T__26);
			setState(186);
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
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaTestParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaTestParser.SIGN_OPERATORS, i);
		}
		public SignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpression; }
	}

	public final SignExpressionContext signExpression() throws RecognitionException {
		SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_signExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(SIGN_OPERATORS);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(194);
				integer();
				}
				break;
			case 2:
				{
				setState(195);
				floate();
				}
				break;
			case 3:
				{
				setState(196);
				deref();
				}
				break;
			case 4:
				{
				setState(197);
				f_call();
				}
				break;
			case 5:
				{
				setState(198);
				match(T__13);
				setState(199);
				expression();
				setState(200);
				match(T__15);
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
		public List<TerminalNode> MULTIPLYING_OPERATORS() { return getTokens(LogoTomaTestParser.MULTIPLYING_OPERATORS); }
		public TerminalNode MULTIPLYING_OPERATORS(int i) {
			return getToken(LogoTomaTestParser.MULTIPLYING_OPERATORS, i);
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
			setState(204);
			signExpression();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLYING_OPERATORS) {
				{
				{
				setState(205);
				match(MULTIPLYING_OPERATORS);
				setState(206);
				signExpression();
				}
				}
				setState(211);
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
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaTestParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaTestParser.SIGN_OPERATORS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			multiplyingExpression();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					match(SIGN_OPERATORS);
					setState(214);
					multiplyingExpression();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public AtomicLogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicLogicExpression; }
	}

	public final AtomicLogicExpressionContext atomicLogicExpression() throws RecognitionException {
		AtomicLogicExpressionContext _localctx = new AtomicLogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atomicLogicExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(220);
				expression();
				}
				break;
			case 2:
				{
				setState(221);
				deref();
				}
				break;
			case 3:
				{
				setState(222);
				bool();
				}
				break;
			case 4:
				{
				setState(223);
				integer();
				}
				break;
			case 5:
				{
				setState(224);
				floate();
				}
				break;
			case 6:
				{
				setState(225);
				f_call();
				}
				break;
			case 7:
				{
				setState(226);
				match(T__13);
				setState(227);
				expression();
				setState(228);
				match(T__15);
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
		public TerminalNode COMPARISON_OPERATORS() { return getToken(LogoTomaTestParser.COMPARISON_OPERATORS, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			atomicLogicExpression();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPARISON_OPERATORS) {
				{
				setState(233);
				match(COMPARISON_OPERATORS);
				setState(234);
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
		public List<TerminalNode> NEGATION_OPERATOR() { return getTokens(LogoTomaTestParser.NEGATION_OPERATOR); }
		public TerminalNode NEGATION_OPERATOR(int i) {
			return getToken(LogoTomaTestParser.NEGATION_OPERATOR, i);
		}
		public List<TerminalNode> LOGIC_OPERATORS() { return getTokens(LogoTomaTestParser.LOGIC_OPERATORS); }
		public TerminalNode LOGIC_OPERATORS(int i) {
			return getToken(LogoTomaTestParser.LOGIC_OPERATORS, i);
		}
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION_OPERATOR) {
				{
				setState(237);
				match(NEGATION_OPERATOR);
				}
			}

			setState(240);
			comparisonExpression();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_OPERATORS) {
				{
				{
				setState(241);
				match(LOGIC_OPERATORS);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEGATION_OPERATOR) {
					{
					setState(242);
					match(NEGATION_OPERATOR);
					}
				}

				setState(245);
				comparisonExpression();
				}
				}
				setState(250);
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
		public TerminalNode NUMBER() { return getToken(LogoTomaTestParser.NUMBER, 0); }
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaTestParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaTestParser.SIGN_OPERATORS, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(251);
				match(SIGN_OPERATORS);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
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
		public List<TerminalNode> NUMBER() { return getTokens(LogoTomaTestParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LogoTomaTestParser.NUMBER, i);
		}
		public List<TerminalNode> SIGN_OPERATORS() { return getTokens(LogoTomaTestParser.SIGN_OPERATORS); }
		public TerminalNode SIGN_OPERATORS(int i) {
			return getToken(LogoTomaTestParser.SIGN_OPERATORS, i);
		}
		public FloateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floate; }
	}

	public final FloateContext floate() throws RecognitionException {
		FloateContext _localctx = new FloateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_floate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIGN_OPERATORS) {
				{
				{
				setState(259);
				match(SIGN_OPERATORS);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(NUMBER);
			setState(266);
			match(T__27);
			setState(267);
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
		public TerminalNode BOOL() { return getToken(LogoTomaTestParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		public TerminalNode STRING() { return getToken(LogoTomaTestParser.STRING, 0); }
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		public TerminalNode STRING() { return getToken(LogoTomaTestParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 62, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__28);
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				statement();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << SIGN_OPERATORS) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT))) != 0) );
			setState(281);
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

	public static class StatementContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(LogoTomaTestParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LogoTomaTestParser.EOL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__12:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case SIGN_OPERATORS:
			case NUMBER:
			case STRING:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				line();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(284);
					match(EOL);
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__30);
				setState(291);
				expression();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(292);
					match(EOL);
					}
					}
					setState(297);
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
		enterRule(_localctx, 66, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			type_name();
			setState(301);
			match(T__31);
			setState(302);
			name();
			setState(303);
			match(T__13);
			setState(304);
			type_name();
			setState(305);
			deref();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(306);
				match(T__14);
				setState(307);
				type_name();
				setState(308);
				deref();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(T__15);
			setState(316);
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
		enterRule(_localctx, 68, RULE_f_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			name();
			setState(319);
			match(T__13);
			setState(320);
			value();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(321);
				match(T__14);
				setState(322);
				value();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(LogoTomaTestParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\5\2L\n\2\3\2\6\2O\n\2\r\2\16\2P\6\2"+
		"S\n\2\r\2\16\2T\3\2\5\2X\n\2\3\2\3\2\3\3\3\3\5\3^\n\3\3\3\3\3\5\3b\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ab\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\7\26\u00c0\n\26\f\26\16\26\u00c3\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00cd\n\26\3\27\3\27\3\27\7\27\u00d2\n\27\f\27\16"+
		"\27\u00d5\13\27\3\30\3\30\3\30\7\30\u00da\n\30\f\30\16\30\u00dd\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e9\n\31\3\32"+
		"\3\32\3\32\5\32\u00ee\n\32\3\33\5\33\u00f1\n\33\3\33\3\33\3\33\5\33\u00f6"+
		"\n\33\3\33\7\33\u00f9\n\33\f\33\16\33\u00fc\13\33\3\34\7\34\u00ff\n\34"+
		"\f\34\16\34\u0102\13\34\3\34\3\34\3\35\7\35\u0107\n\35\f\35\16\35\u010a"+
		"\13\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\6!\u0118\n"+
		"!\r!\16!\u0119\3!\3!\3\"\3\"\7\"\u0120\n\"\f\"\16\"\u0123\13\"\3\"\3\""+
		"\3\"\7\"\u0128\n\"\f\"\16\"\u012b\13\"\5\"\u012d\n\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u0139\n#\f#\16#\u013c\13#\3#\3#\3#\3$\3$\3$\3$\3$\7$"+
		"\u0146\n$\f$\16$\u0149\13$\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\5\3\2\4\5\4\2\5\5\7\b"+
		"\3\2\23\27\2\u015b\2R\3\2\2\2\4a\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\nv\3\2"+
		"\2\2\fy\3\2\2\2\16|\3\2\2\2\20\177\3\2\2\2\22\u0082\3\2\2\2\24\u0087\3"+
		"\2\2\2\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\u0097\3\2\2\2\34\u009f\3\2"+
		"\2\2\36\u00a1\3\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$\u00b2\3\2\2\2&\u00b7"+
		"\3\2\2\2(\u00bb\3\2\2\2*\u00c1\3\2\2\2,\u00ce\3\2\2\2.\u00d6\3\2\2\2\60"+
		"\u00e8\3\2\2\2\62\u00ea\3\2\2\2\64\u00f0\3\2\2\2\66\u0100\3\2\2\28\u0108"+
		"\3\2\2\2:\u010f\3\2\2\2<\u0111\3\2\2\2>\u0113\3\2\2\2@\u0115\3\2\2\2B"+
		"\u012c\3\2\2\2D\u012e\3\2\2\2F\u0140\3\2\2\2H\u014c\3\2\2\2JL\5\4\3\2"+
		"KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\7,\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2QS\3\2\2\2RK\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2"+
		"VX\5\4\3\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\2\2\3Z\3\3\2\2\2[]\5\6\4"+
		"\2\\^\5H%\2]\\\3\2\2\2]^\3\2\2\2^b\3\2\2\2_b\5H%\2`b\5.\30\2a[\3\2\2\2"+
		"a_\3\2\2\2a`\3\2\2\2b\5\3\2\2\2cr\5\b\5\2dr\5\n\6\2er\5\f\7\2fr\5\16\b"+
		"\2gr\5\20\t\2hr\5\22\n\2ir\5D#\2jr\5F$\2kr\5\26\f\2lr\5$\23\2mr\5\"\22"+
		"\2nr\5&\24\2or\5(\25\2pr\5\30\r\2qc\3\2\2\2qd\3\2\2\2qe\3\2\2\2qf\3\2"+
		"\2\2qg\3\2\2\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2"+
		"\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\7\3\2\2\2st\7\3\2\2tu\t\2\2\2u\t\3"+
		"\2\2\2vw\7\6\2\2wx\t\3\2\2x\13\3\2\2\2yz\7\t\2\2z{\t\2\2\2{\r\3\2\2\2"+
		"|}\7\n\2\2}~\5\32\16\2~\17\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\5 \21"+
		"\2\u0081\21\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\5\24\13\2\u0084\u0085"+
		"\7\r\2\2\u0085\u0086\5\34\17\2\u0086\23\3\2\2\2\u0087\u0088\5<\37\2\u0088"+
		"\25\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\5<\37\2\u008b\u008c\7\16"+
		"\2\2\u008c\u008d\5 \21\2\u008d\u0093\3\2\2\2\u008e\u008f\5<\37\2\u008f"+
		"\u0090\7\16\2\2\u0090\u0091\5 \21\2\u0091\u0093\3\2\2\2\u0092\u0089\3"+
		"\2\2\2\u0092\u008e\3\2\2\2\u0093\27\3\2\2\2\u0094\u0095\7\17\2\2\u0095"+
		"\u0096\5> \2\u0096\31\3\2\2\2\u0097\u0098\7\20\2\2\u0098\u0099\5 \21\2"+
		"\u0099\u009a\7\21\2\2\u009a\u009b\5 \21\2\u009b\u009c\7\21\2\2\u009c\u009d"+
		"\5 \21\2\u009d\u009e\7\22\2\2\u009e\33\3\2\2\2\u009f\u00a0\t\4\2\2\u00a0"+
		"\35\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2\37\3\2\2\2\u00a3\u00ab\5\64\33\2"+
		"\u00a4\u00ab\5.\30\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\5> \2\u00a7\u00a8"+
		"\7\30\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\5\32\16\2\u00aa\u00a3\3\2\2"+
		"\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab!"+
		"\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad\u00ae\7\20\2\2\u00ae\u00af\5 \21\2"+
		"\u00af\u00b0\7\22\2\2\u00b0\u00b1\5@!\2\u00b1#\3\2\2\2\u00b2\u00b3\7\32"+
		"\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\33\2\2\u00b5\u00b6\5@!\2\u00b6"+
		"%\3\2\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\5@!\2\u00ba"+
		"\'\3\2\2\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\5@!\2\u00bd)\3\2\2\2\u00be"+
		"\u00c0\7#\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cc\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00cd\5\66\34\2\u00c5\u00cd\58\35\2\u00c6\u00cd\5<\37\2\u00c7\u00cd\5"+
		"F$\2\u00c8\u00c9\7\20\2\2\u00c9\u00ca\5.\30\2\u00ca\u00cb\7\22\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd+\3\2\2\2\u00ce\u00d3"+
		"\5*\26\2\u00cf\u00d0\7%\2\2\u00d0\u00d2\5*\26\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4-\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00db\5,\27\2\u00d7\u00d8\7#\2\2\u00d8\u00da"+
		"\5,\27\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc/\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e9\5.\30\2"+
		"\u00df\u00e9\5<\37\2\u00e0\u00e9\5:\36\2\u00e1\u00e9\5\66\34\2\u00e2\u00e9"+
		"\58\35\2\u00e3\u00e9\5F$\2\u00e4\u00e5\7\20\2\2\u00e5\u00e6\5.\30\2\u00e6"+
		"\u00e7\7\22\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00df\3"+
		"\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8"+
		"\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\61\3\2\2\2\u00ea\u00ed\5\60\31"+
		"\2\u00eb\u00ec\7)\2\2\u00ec\u00ee\5\60\31\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\63\3\2\2\2\u00ef\u00f1\7\'\2\2\u00f0\u00ef\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fa\5\62\32\2\u00f3"+
		"\u00f5\7(\2\2\u00f4\u00f6\7\'\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\5\62\32\2\u00f8\u00f3\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\65\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7#\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104\67\3\2\2\2\u0105\u0107\7#\2\2"+
		"\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7$\2\2\u010c"+
		"\u010d\7\36\2\2\u010d\u010e\7$\2\2\u010e9\3\2\2\2\u010f\u0110\7*\2\2\u0110"+
		";\3\2\2\2\u0111\u0112\7+\2\2\u0112=\3\2\2\2\u0113\u0114\7+\2\2\u0114?"+
		"\3\2\2\2\u0115\u0117\7\37\2\2\u0116\u0118\5B\"\2\u0117\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\7 \2\2\u011cA\3\2\2\2\u011d\u0121\5\4\3\2\u011e\u0120"+
		"\7,\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u012d\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7!"+
		"\2\2\u0125\u0129\5.\30\2\u0126\u0128\7,\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u011d\3\2\2\2\u012c\u0124\3\2\2\2\u012d"+
		"C\3\2\2\2\u012e\u012f\5\34\17\2\u012f\u0130\7\"\2\2\u0130\u0131\5\36\20"+
		"\2\u0131\u0132\7\20\2\2\u0132\u0133\5\34\17\2\u0133\u013a\5<\37\2\u0134"+
		"\u0135\7\21\2\2\u0135\u0136\5\34\17\2\u0136\u0137\5<\37\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\22"+
		"\2\2\u013e\u013f\5@!\2\u013fE\3\2\2\2\u0140\u0141\5\36\20\2\u0141\u0142"+
		"\7\20\2\2\u0142\u0147\5 \21\2\u0143\u0144\7\21\2\2\u0144\u0146\5 \21\2"+
		"\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\22\2\2"+
		"\u014bG\3\2\2\2\u014c\u014d\7-\2\2\u014dI\3\2\2\2\34KPTW]aq\u0092\u00aa"+
		"\u00c1\u00cc\u00d3\u00db\u00e8\u00ed\u00f0\u00f5\u00fa\u0100\u0108\u0119"+
		"\u0121\u0129\u012c\u013a\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}