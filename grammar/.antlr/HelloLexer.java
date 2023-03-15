// Generated from /home/makowskitomasz/Kompilatory/logotoma/grammar/Hello.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
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
			"T__33", "NAME", "SIGN_OPERATORS", "ARITMETIC_OPERATORS", "NEGATION_OPERATOR", 
			"LOGIC_OPERATORS", "COMPARISON_OPERATORS", "SHAPE", "BOOL", "STRING", 
			"NUMBER", "EOL", "WS"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u015d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\7$\u0118\n$\f$\16$\u011b\13$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u012c\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u013b\n"+
		"*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0146\n+\3,\6,\u0149\n,\r,\16,\u014a\3"+
		"-\6-\u014e\n-\r-\16-\u014f\3.\5.\u0153\n.\3.\3.\3/\6/\u0158\n/\r/\16/"+
		"\u0159\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\13\4\2"+
		"C\\c|\5\2\62;C\\c|\4\2--//\5\2\'\',,\61\61\4\2((~~\4\2>>@@\7\2/\60\62"+
		";C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0166\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7d\3\2\2\2\ti\3\2\2"+
		"\2\13k\3\2\2\2\rm\3\2\2\2\17s\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25\177\3"+
		"\2\2\2\27\u008b\3\2\2\2\31\u0091\3\2\2\2\33\u009d\3\2\2\2\35\u00a3\3\2"+
		"\2\2\37\u00ae\3\2\2\2!\u00b4\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba"+
		"\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c2\3\2\2\2/\u00c8\3\2\2\2\61"+
		"\u00cd\3\2\2\2\63\u00d3\3\2\2\2\65\u00da\3\2\2\2\67\u00e1\3\2\2\29\u00e3"+
		"\3\2\2\2;\u00e5\3\2\2\2=\u00ef\3\2\2\2?\u00f4\3\2\2\2A\u00fb\3\2\2\2C"+
		"\u0103\3\2\2\2E\u0110\3\2\2\2G\u0115\3\2\2\2I\u011c\3\2\2\2K\u011e\3\2"+
		"\2\2M\u0120\3\2\2\2O\u0122\3\2\2\2Q\u012b\3\2\2\2S\u013a\3\2\2\2U\u0145"+
		"\3\2\2\2W\u0148\3\2\2\2Y\u014d\3\2\2\2[\u0152\3\2\2\2]\u0157\3\2\2\2_"+
		"`\7%\2\2`\4\3\2\2\2ab\7o\2\2bc\7x\2\2c\6\3\2\2\2de\7o\2\2ef\7q\2\2fg\7"+
		"x\2\2gh\7g\2\2h\b\3\2\2\2ij\7-\2\2j\n\3\2\2\2kl\7/\2\2l\f\3\2\2\2mn\7"+
		"r\2\2no\7c\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2r\16\3\2\2\2st\7n\2\2tu\7k\2"+
		"\2uv\7p\2\2vw\7g\2\2w\20\3\2\2\2xy\7\"\2\2y\22\3\2\2\2z{\7u\2\2{|\7c\2"+
		"\2|}\7x\2\2}~\7g\2\2~\24\3\2\2\2\177\u0080\7d\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7w\2\2\u0082\u0083\7u\2\2\u0083\u0084\7j\2\2\u0084\u0085\7/\2\2"+
		"\u0085\u0086\7u\2\2\u0086\u0087\7j\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7r\2\2\u0089\u008a\7g\2\2\u008a\26\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7/\2\2\u008e\u008f\7u\2\2\u008f\u0090\7j\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7j\2\2\u0096\u0097\7/\2\2\u0097\u0098\7e\2\2"+
		"\u0098\u0099\7q\2\2\u0099\u009a\7n\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7t\2\2\u009c\32\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7u\2\2\u009f\u00a0"+
		"\7/\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7n\2\2\u00a2\34\3\2\2\2\u00a3\u00a4"+
		"\7d\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"\u00a8\7j\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00ac\7|\2\2\u00ac\u00ad\7g\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7"+
		"d\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3"+
		"\7|\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7*\2\2\u00b5\"\3\2\2\2\u00b6\u00b7"+
		"\7.\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7"+
		"$\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd*\3\2\2\2\u00be\u00bf\7\""+
		"\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7\"\2\2\u00c1,\3\2\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7r\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7t\2\2"+
		"\u00d2\62\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7"+
		"o\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9\64"+
		"\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7i\2\2\u00e0\66\3\2\2\2\u00e1"+
		"\u00e2\7}\2\2\u00e28\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4:\3\2\2\2\u00e5"+
		"\u00e6\7\"\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2"+
		"\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7\"\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f3\7*\2\2\u00f3>\3\2\2\2\u00f4\u00f5"+
		"\7n\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7r\2\2\u00f8"+
		"\u00f9\7\"\2\2\u00f9\u00fa\7*\2\2\u00fa@\3\2\2\2\u00fb\u00fc\7+\2\2\u00fc"+
		"\u00fd\7\"\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7o\2"+
		"\2\u0100\u0101\7g\2\2\u0101\u0102\7u\2\2\u0102B\3\2\2\2\u0103\u0104\7"+
		"n\2\2\u0104\u0105\7q\2\2\u0105\u0106\7q\2\2\u0106\u0107\7r\2\2\u0107\u0108"+
		"\7\"\2\2\u0108\u0109\7y\2\2\u0109\u010a\7j\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7n\2\2\u010c\u010d\7g\2\2\u010d\u010e\7\"\2\2\u010e\u010f\7*\2"+
		"\2\u010fD\3\2\2\2\u0110\u0111\7g\2\2\u0111\u0112\7n\2\2\u0112\u0113\7"+
		"u\2\2\u0113\u0114\7g\2\2\u0114F\3\2\2\2\u0115\u0119\t\2\2\2\u0116\u0118"+
		"\t\3\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011aH\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\t\4\2\2"+
		"\u011dJ\3\2\2\2\u011e\u011f\t\5\2\2\u011fL\3\2\2\2\u0120\u0121\7#\2\2"+
		"\u0121N\3\2\2\2\u0122\u0123\t\6\2\2\u0123P\3\2\2\2\u0124\u0125\7?\2\2"+
		"\u0125\u012c\7?\2\2\u0126\u012c\t\7\2\2\u0127\u0128\7>\2\2\u0128\u012c"+
		"\7?\2\2\u0129\u012a\7@\2\2\u012a\u012c\7?\2\2\u012b\u0124\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012cR\3\2\2\2"+
		"\u012d\u012e\7E\2\2\u012e\u012f\7c\2\2\u012f\u0130\7n\2\2\u0130\u0131"+
		"\7k\2\2\u0131\u0132\7i\2\2\u0132\u0133\7t\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7h\2\2\u0135\u0136\7k\2\2\u0136\u013b\7e\2\2\u0137\u0138\7F\2\2"+
		"\u0138\u0139\7q\2\2\u0139\u013b\7v\2\2\u013a\u012d\3\2\2\2\u013a\u0137"+
		"\3\2\2\2\u013bT\3\2\2\2\u013c\u013d\7V\2\2\u013d\u013e\7t\2\2\u013e\u013f"+
		"\7w\2\2\u013f\u0146\7g\2\2\u0140\u0141\7H\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7n\2\2\u0143\u0144\7u\2\2\u0144\u0146\7g\2\2\u0145\u013c\3\2\2"+
		"\2\u0145\u0140\3\2\2\2\u0146V\3\2\2\2\u0147\u0149\t\b\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"X\3\2\2\2\u014c\u014e\t\t\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150Z\3\2\2\2\u0151\u0153\7"+
		"\17\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\7\f\2\2\u0155\\\3\2\2\2\u0156\u0158\t\n\2\2\u0157\u0156\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\b/\2\2\u015c^\3\2\2\2\13\2\u0119\u012b\u013a\u0145"+
		"\u014a\u014f\u0152\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}