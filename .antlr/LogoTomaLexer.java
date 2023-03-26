// Generated from /home/makowskitomasz/Kompilatory/logotoma/LogoToma.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoTomaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"SIGN_OPERATORS", "NUMBER", "MULTIPLYING_OPERATORS", "SUM_OPERATORS", 
			"NEGATION_OPERATOR", "LOGIC_OPERATORS", "COMPARISON_OPERATORS", "BOOL", 
			"STRING", "EOL", "COMMENT", "WS"
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


	public LogoTomaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogoToma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"$\6$\u0109\n$\r$\16$\u010a\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u011c\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0127\n*\3+\6+\u012a\n"+
		"+\r+\16+\u012b\3,\5,\u012f\n,\3,\3,\3-\3-\7-\u0135\n-\f-\16-\u0138\13"+
		"-\3.\6.\u013b\n.\r.\16.\u013c\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/\3\2\n\4\2--//\3\2\62;\5\2\'\',,\61\61\4\2((~~\4\2>>@@\7\2\60\60"+
		"\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0148\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5d\3\2\2\2\7g\3\2\2\2\tk\3\2\2\2\13"+
		"q\3\2\2\2\rw\3\2\2\2\17|\3\2\2\2\21\u0082\3\2\2\2\23\u008e\3\2\2\2\25"+
		"\u0099\3\2\2\2\27\u009f\3\2\2\2\31\u00a4\3\2\2\2\33\u00a7\3\2\2\2\35\u00a9"+
		"\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00b4\3\2\2\2"+
		"\'\u00b9\3\2\2\2)\u00bf\3\2\2\2+\u00c3\3\2\2\2-\u00c9\3\2\2\2/\u00d0\3"+
		"\2\2\2\61\u00d2\3\2\2\2\63\u00d5\3\2\2\2\65\u00da\3\2\2\2\67\u00e0\3\2"+
		"\2\29\u00eb\3\2\2\2;\u00f0\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6"+
		"\3\2\2\2C\u00fd\3\2\2\2E\u0105\3\2\2\2G\u0108\3\2\2\2I\u010c\3\2\2\2K"+
		"\u010e\3\2\2\2M\u0110\3\2\2\2O\u0112\3\2\2\2Q\u011b\3\2\2\2S\u0126\3\2"+
		"\2\2U\u0129\3\2\2\2W\u012e\3\2\2\2Y\u0132\3\2\2\2[\u013a\3\2\2\2]^\7g"+
		"\2\2^_\7p\2\2_`\7i\2\2`a\7k\2\2ab\7p\2\2bc\7g\2\2c\4\3\2\2\2de\7q\2\2"+
		"ef\7p\2\2f\6\3\2\2\2gh\7q\2\2hi\7h\2\2ij\7h\2\2j\b\3\2\2\2kl\7y\2\2lm"+
		"\7j\2\2mn\7g\2\2no\7g\2\2op\7n\2\2p\n\3\2\2\2qr\7t\2\2rs\7k\2\2st\7i\2"+
		"\2tu\7j\2\2uv\7v\2\2v\f\3\2\2\2wx\7n\2\2xy\7g\2\2yz\7h\2\2z{\7v\2\2{\16"+
		"\3\2\2\2|}\7u\2\2}~\7r\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\u0081\7"+
		"{\2\2\u0081\20\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7r\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7c\2\2\u0086\u0087\7{\2\2\u0087\u0088\7\"\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7q\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2"+
		"\u008c\u008d\7t\2\2\u008d\22\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090\7"+
		"r\2\2\u0090\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092\u0093\7{\2\2\u0093\u0094"+
		"\7\"\2\2\u0094\u0095\7u\2\2\u0095\u0096\7k\2\2\u0096\u0097\7|\2\2\u0097"+
		"\u0098\7g\2\2\u0098\24\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7g\2\2\u009d\u009e\7r\2\2\u009e\26\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\30\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7@\2\2\u00a6\32\3\2\2"+
		"\2\u00a7\u00a8\7?\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7g\2\2\u00ad\36\3\2\2\2\u00ae\u00af"+
		"\7*\2\2\u00af \3\2\2\2\u00b0\u00b1\7.\2\2\u00b1\"\3\2\2\2\u00b2\u00b3"+
		"\7+\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7n\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be"+
		"(\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"*\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\u00cf\7i\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\60\3\2\2\2"+
		"\u00d2\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7"+
		"n\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7r\2\2\u00d9\64"+
		"\3\2\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7o\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7u\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7\"\2"+
		"\2\u00e5\u00e6\7y\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9"+
		"\7n\2\2\u00e9\u00ea\7g\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef:\3\2\2\2\u00f0\u00f1"+
		"\7\60\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7}\2\2\u00f3>\3\2\2\2\u00f4\u00f5"+
		"\7\177\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7p\2\2"+
		"\u00fcB\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7v\2"+
		"\2\u0100\u0101\7v\2\2\u0101\u0102\7g\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7p\2\2\u0104D\3\2\2\2\u0105\u0106\t\2\2\2\u0106F\3\2\2\2\u0107\u0109"+
		"\t\3\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010bH\3\2\2\2\u010c\u010d\t\4\2\2\u010dJ\3\2\2\2\u010e"+
		"\u010f\t\2\2\2\u010fL\3\2\2\2\u0110\u0111\7#\2\2\u0111N\3\2\2\2\u0112"+
		"\u0113\t\5\2\2\u0113P\3\2\2\2\u0114\u0115\7?\2\2\u0115\u011c\7?\2\2\u0116"+
		"\u011c\t\6\2\2\u0117\u0118\7>\2\2\u0118\u011c\7?\2\2\u0119\u011a\7@\2"+
		"\2\u011a\u011c\7?\2\2\u011b\u0114\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0117"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011cR\3\2\2\2\u011d\u011e\7V\2\2\u011e\u011f"+
		"\7t\2\2\u011f\u0120\7w\2\2\u0120\u0127\7g\2\2\u0121\u0122\7H\2\2\u0122"+
		"\u0123\7c\2\2\u0123\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0127\7g\2\2"+
		"\u0126\u011d\3\2\2\2\u0126\u0121\3\2\2\2\u0127T\3\2\2\2\u0128\u012a\t"+
		"\7\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cV\3\2\2\2\u012d\u012f\7\17\2\2\u012e\u012d\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\f\2\2\u0131X\3"+
		"\2\2\2\u0132\u0136\7%\2\2\u0133\u0135\n\b\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137Z\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0139\u013b\t\t\2\2\u013a\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\b.\2\2\u013f\\\3\2\2\2\n\2\u010a\u011b\u0126\u012b\u012e\u0136"+
		"\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}