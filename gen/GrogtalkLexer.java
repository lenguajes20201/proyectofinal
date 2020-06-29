// Generated from D:/Users/ACER/Documents/2020-1_SEMESTRE_9/Lenguajes de programacion/proyectofinal/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrogtalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, L_BRACKET=3, R_BRACKET=4, L_SPAR=5, R_SPAR=6, L_PAR=7, 
		R_PAR=8, COMMA=9, COLON=10, PLUS=11, MINUS=12, STRING=13, K_NAME=14, K_SIZE=15, 
		K_TYPE=16, K_TAGS=17, K_ALIGNMENT=18, K_ARMORCLASS=19, K_HITPOINTS=20, 
		K_SPEED=21, K_SENSES=22, K_ABILITIES=23, K_SAVINGTHROW=24, K_SKILLS=25, 
		K_DAMIM=26, K_DAMRES=27, K_DAMVUL=28, K_CONDIM=29, K_LANGS=30, K_CHALLENGE=31, 
		K_SPECIALTRAITS=32, K_ACTIONS=33, K_REACTIONS=34, K_L_ACTIONS=35, WS=36, 
		INT=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "L_BRACKET", "R_BRACKET", "L_SPAR", "R_SPAR", "L_PAR", 
			"R_PAR", "COMMA", "COLON", "PLUS", "MINUS", "STRING", "K_NAME", "K_SIZE", 
			"K_TYPE", "K_TAGS", "K_ALIGNMENT", "K_ARMORCLASS", "K_HITPOINTS", "K_SPEED", 
			"K_SENSES", "K_ABILITIES", "K_SAVINGTHROW", "K_SKILLS", "K_DAMIM", "K_DAMRES", 
			"K_DAMVUL", "K_CONDIM", "K_LANGS", "K_CHALLENGE", "K_SPECIALTRAITS", 
			"K_ACTIONS", "K_REACTIONS", "K_L_ACTIONS", "WS", "INT", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'d'", "'D'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", 
			"':'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "L_BRACKET", "R_BRACKET", "L_SPAR", "R_SPAR", "L_PAR", 
			"R_PAR", "COMMA", "COLON", "PLUS", "MINUS", "STRING", "K_NAME", "K_SIZE", 
			"K_TYPE", "K_TAGS", "K_ALIGNMENT", "K_ARMORCLASS", "K_HITPOINTS", "K_SPEED", 
			"K_SENSES", "K_ABILITIES", "K_SAVINGTHROW", "K_SKILLS", "K_DAMIM", "K_DAMRES", 
			"K_DAMVUL", "K_CONDIM", "K_LANGS", "K_CHALLENGE", "K_SPECIALTRAITS", 
			"K_ACTIONS", "K_REACTIONS", "K_L_ACTIONS", "WS", "INT"
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


	    int abilityCount;


	public GrogtalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grogtalk.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u020b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u009c\n"+
		"\16\f\16\16\16\u009f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00d5\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00e4\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0119\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0194\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\6%\u01c8\n%\r%\16%\u01c9"+
		"\3%\3%\3&\3&\3&\7&\u01d1\n&\f&\16&\u01d4\13&\5&\u01d6\n&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q\2"+
		"S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\3\2 \3\2$$\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2CCcc\4\2DDdd\4\2E"+
		"Eee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01fb\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2\2\2\7\u0085\3\2\2\2\t\u0087"+
		"\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3"+
		"\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2"+
		"\2\2\33\u0099\3\2\2\2\35\u00a2\3\2\2\2\37\u00a7\3\2\2\2!\u00ac\3\2\2\2"+
		"#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'\u00d4\3\2\2\2)\u00e3\3\2\2\2+\u00e5\3"+
		"\2\2\2-\u00eb\3\2\2\2/\u00f2\3\2\2\2\61\u0118\3\2\2\2\63\u011a\3\2\2\2"+
		"\65\u0121\3\2\2\2\67\u0132\3\2\2\29\u0144\3\2\2\2;\u0158\3\2\2\2=\u016c"+
		"\3\2\2\2?\u0193\3\2\2\2A\u0195\3\2\2\2C\u01a3\3\2\2\2E\u01ab\3\2\2\2G"+
		"\u01b5\3\2\2\2I\u01c7\3\2\2\2K\u01d5\3\2\2\2M\u01d7\3\2\2\2O\u01d9\3\2"+
		"\2\2Q\u01db\3\2\2\2S\u01dd\3\2\2\2U\u01df\3\2\2\2W\u01e1\3\2\2\2Y\u01e3"+
		"\3\2\2\2[\u01e5\3\2\2\2]\u01e7\3\2\2\2_\u01e9\3\2\2\2a\u01eb\3\2\2\2c"+
		"\u01ed\3\2\2\2e\u01ef\3\2\2\2g\u01f1\3\2\2\2i\u01f3\3\2\2\2k\u01f5\3\2"+
		"\2\2m\u01f7\3\2\2\2o\u01f9\3\2\2\2q\u01fb\3\2\2\2s\u01fd\3\2\2\2u\u01ff"+
		"\3\2\2\2w\u0201\3\2\2\2y\u0203\3\2\2\2{\u0205\3\2\2\2}\u0207\3\2\2\2\177"+
		"\u0209\3\2\2\2\u0081\u0082\7f\2\2\u0082\4\3\2\2\2\u0083\u0084\7F\2\2\u0084"+
		"\6\3\2\2\2\u0085\u0086\7}\2\2\u0086\b\3\2\2\2\u0087\u0088\7\177\2\2\u0088"+
		"\n\3\2\2\2\u0089\u008a\7]\2\2\u008a\f\3\2\2\2\u008b\u008c\7_\2\2\u008c"+
		"\16\3\2\2\2\u008d\u008e\7*\2\2\u008e\20\3\2\2\2\u008f\u0090\7+\2\2\u0090"+
		"\22\3\2\2\2\u0091\u0092\7.\2\2\u0092\24\3\2\2\2\u0093\u0094\7<\2\2\u0094"+
		"\26\3\2\2\2\u0095\u0096\7-\2\2\u0096\30\3\2\2\2\u0097\u0098\7/\2\2\u0098"+
		"\32\3\2\2\2\u0099\u009d\7$\2\2\u009a\u009c\n\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1\34\3\2\2\2\u00a2"+
		"\u00a3\5g\64\2\u00a3\u00a4\5M\'\2\u00a4\u00a5\5e\63\2\u00a5\u00a6\5U+"+
		"\2\u00a6\36\3\2\2\2\u00a7\u00a8\5q9\2\u00a8\u00a9\5]/\2\u00a9\u00aa\5"+
		"\177@\2\u00aa\u00ab\5U+\2\u00ab \3\2\2\2\u00ac\u00ad\5s:\2\u00ad\u00ae"+
		"\5}?\2\u00ae\u00af\5k\66\2\u00af\u00b0\5U+\2\u00b0\"\3\2\2\2\u00b1\u00b2"+
		"\5s:\2\u00b2\u00b3\5M\'\2\u00b3\u00b4\5Y-\2\u00b4\u00b5\5q9\2\u00b5\u00bb"+
		"\3\2\2\2\u00b6\u00b7\5s:\2\u00b7\u00b8\5M\'\2\u00b8\u00b9\5Y-\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb$\3\2\2\2"+
		"\u00bc\u00bd\5M\'\2\u00bd\u00be\5c\62\2\u00be\u00bf\5]/\2\u00bf\u00c0"+
		"\5Y-\2\u00c0\u00c1\5g\64\2\u00c1\u00c2\5e\63\2\u00c2\u00c3\5U+\2\u00c3"+
		"\u00c4\5g\64\2\u00c4\u00c5\5s:\2\u00c5&\3\2\2\2\u00c6\u00c7\5M\'\2\u00c7"+
		"\u00c8\5o8\2\u00c8\u00c9\5e\63\2\u00c9\u00ca\5i\65\2\u00ca\u00cb\5o8\2"+
		"\u00cb\u00cc\5Q)\2\u00cc\u00cd\5c\62\2\u00cd\u00ce\5M\'\2\u00ce\u00cf"+
		"\5q9\2\u00cf\u00d0\5q9\2\u00d0\u00d5\3\2\2\2\u00d1\u00d2\5M\'\2\u00d2"+
		"\u00d3\5Q)\2\u00d3\u00d5\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00d1\3\2\2"+
		"\2\u00d5(\3\2\2\2\u00d6\u00d7\5[.\2\u00d7\u00d8\5]/\2\u00d8\u00d9\5s:"+
		"\2\u00d9\u00da\5k\66\2\u00da\u00db\5i\65\2\u00db\u00dc\5]/\2\u00dc\u00dd"+
		"\5g\64\2\u00dd\u00de\5s:\2\u00de\u00df\5q9\2\u00df\u00e4\3\2\2\2\u00e0"+
		"\u00e1\5[.\2\u00e1\u00e2\5k\66\2\u00e2\u00e4\3\2\2\2\u00e3\u00d6\3\2\2"+
		"\2\u00e3\u00e0\3\2\2\2\u00e4*\3\2\2\2\u00e5\u00e6\5q9\2\u00e6\u00e7\5"+
		"k\66\2\u00e7\u00e8\5U+\2\u00e8\u00e9\5U+\2\u00e9\u00ea\5S*\2\u00ea,\3"+
		"\2\2\2\u00eb\u00ec\5q9\2\u00ec\u00ed\5U+\2\u00ed\u00ee\5g\64\2\u00ee\u00ef"+
		"\5q9\2\u00ef\u00f0\5U+\2\u00f0\u00f1\5q9\2\u00f1.\3\2\2\2\u00f2\u00f3"+
		"\5M\'\2\u00f3\u00f4\5O(\2\u00f4\u00f5\5]/\2\u00f5\u00f6\5c\62\2\u00f6"+
		"\u00f7\5]/\2\u00f7\u00f8\5s:\2\u00f8\u00f9\5]/\2\u00f9\u00fa\5U+\2\u00fa"+
		"\u00fb\5q9\2\u00fb\60\3\2\2\2\u00fc\u00fd\5q9\2\u00fd\u00fe\5M\'\2\u00fe"+
		"\u00ff\5w<\2\u00ff\u0100\5]/\2\u0100\u0101\5g\64\2\u0101\u0102\5Y-\2\u0102"+
		"\u0103\5s:\2\u0103\u0104\5[.\2\u0104\u0105\5o8\2\u0105\u0106\5i\65\2\u0106"+
		"\u0107\5y=\2\u0107\u0108\5q9\2\u0108\u0119\3\2\2\2\u0109\u010a\5q9\2\u010a"+
		"\u010b\5M\'\2\u010b\u010c\5w<\2\u010c\u010d\5]/\2\u010d\u010e\5g\64\2"+
		"\u010e\u010f\5Y-\2\u010f\u0110\5s:\2\u0110\u0111\5[.\2\u0111\u0112\5o"+
		"8\2\u0112\u0113\5i\65\2\u0113\u0114\5y=\2\u0114\u0119\3\2\2\2\u0115\u0116"+
		"\5q9\2\u0116\u0117\5s:\2\u0117\u0119\3\2\2\2\u0118\u00fc\3\2\2\2\u0118"+
		"\u0109\3\2\2\2\u0118\u0115\3\2\2\2\u0119\62\3\2\2\2\u011a\u011b\5q9\2"+
		"\u011b\u011c\5a\61\2\u011c\u011d\5]/\2\u011d\u011e\5c\62\2\u011e\u011f"+
		"\5c\62\2\u011f\u0120\5q9\2\u0120\64\3\2\2\2\u0121\u0122\5S*\2\u0122\u0123"+
		"\5M\'\2\u0123\u0124\5e\63\2\u0124\u0125\5M\'\2\u0125\u0126\5Y-\2\u0126"+
		"\u0127\5U+\2\u0127\u0128\5]/\2\u0128\u0129\5e\63\2\u0129\u012a\5e\63\2"+
		"\u012a\u012b\5u;\2\u012b\u012c\5g\64\2\u012c\u012d\5]/\2\u012d\u012e\5"+
		"s:\2\u012e\u012f\5]/\2\u012f\u0130\5U+\2\u0130\u0131\5q9\2\u0131\66\3"+
		"\2\2\2\u0132\u0133\5S*\2\u0133\u0134\5M\'\2\u0134\u0135\5e\63\2\u0135"+
		"\u0136\5M\'\2\u0136\u0137\5Y-\2\u0137\u0138\5U+\2\u0138\u0139\5o8\2\u0139"+
		"\u013a\5U+\2\u013a\u013b\5q9\2\u013b\u013c\5]/\2\u013c\u013d\5q9\2\u013d"+
		"\u013e\5s:\2\u013e\u013f\5M\'\2\u013f\u0140\5g\64\2\u0140\u0141\5Q)\2"+
		"\u0141\u0142\5U+\2\u0142\u0143\5q9\2\u01438\3\2\2\2\u0144\u0145\5S*\2"+
		"\u0145\u0146\5M\'\2\u0146\u0147\5e\63\2\u0147\u0148\5M\'\2\u0148\u0149"+
		"\5Y-\2\u0149\u014a\5U+\2\u014a\u014b\5w<\2\u014b\u014c\5u;\2\u014c\u014d"+
		"\5c\62\2\u014d\u014e\5g\64\2\u014e\u014f\5U+\2\u014f\u0150\5o8\2\u0150"+
		"\u0151\5M\'\2\u0151\u0152\5O(\2\u0152\u0153\5]/\2\u0153\u0154\5c\62\2"+
		"\u0154\u0155\5]/\2\u0155\u0156\5U+\2\u0156\u0157\5q9\2\u0157:\3\2\2\2"+
		"\u0158\u0159\5Q)\2\u0159\u015a\5i\65\2\u015a\u015b\5g\64\2\u015b\u015c"+
		"\5S*\2\u015c\u015d\5]/\2\u015d\u015e\5s:\2\u015e\u015f\5]/\2\u015f\u0160"+
		"\5i\65\2\u0160\u0161\5g\64\2\u0161\u0162\5]/\2\u0162\u0163\5e\63\2\u0163"+
		"\u0164\5e\63\2\u0164\u0165\5u;\2\u0165\u0166\5g\64\2\u0166\u0167\5]/\2"+
		"\u0167\u0168\5s:\2\u0168\u0169\5]/\2\u0169\u016a\5U+\2\u016a\u016b\5q"+
		"9\2\u016b<\3\2\2\2\u016c\u016d\5c\62\2\u016d\u016e\5M\'\2\u016e\u016f"+
		"\5g\64\2\u016f\u0170\5Y-\2\u0170\u0171\5u;\2\u0171\u0172\5M\'\2\u0172"+
		"\u0173\5Y-\2\u0173\u0174\5U+\2\u0174\u0175\5q9\2\u0175>\3\2\2\2\u0176"+
		"\u0177\5Q)\2\u0177\u0178\5[.\2\u0178\u0179\5M\'\2\u0179\u017a\5c\62\2"+
		"\u017a\u017b\5c\62\2\u017b\u017c\5U+\2\u017c\u017d\5g\64\2\u017d\u017e"+
		"\5Y-\2\u017e\u017f\5U+\2\u017f\u0194\3\2\2\2\u0180\u0181\5Q)\2\u0181\u0182"+
		"\5[.\2\u0182\u0183\5M\'\2\u0183\u0184\5c\62\2\u0184\u0185\5c\62\2\u0185"+
		"\u0186\5U+\2\u0186\u0187\5g\64\2\u0187\u0188\5Y-\2\u0188\u0189\5U+\2\u0189"+
		"\u018a\5o8\2\u018a\u018b\5M\'\2\u018b\u018c\5s:\2\u018c\u018d\5]/\2\u018d"+
		"\u018e\5g\64\2\u018e\u018f\5Y-\2\u018f\u0194\3\2\2\2\u0190\u0191\5Q)\2"+
		"\u0191\u0192\5o8\2\u0192\u0194\3\2\2\2\u0193\u0176\3\2\2\2\u0193\u0180"+
		"\3\2\2\2\u0193\u0190\3\2\2\2\u0194@\3\2\2\2\u0195\u0196\5q9\2\u0196\u0197"+
		"\5k\66\2\u0197\u0198\5U+\2\u0198\u0199\5Q)\2\u0199\u019a\5]/\2\u019a\u019b"+
		"\5M\'\2\u019b\u019c\5c\62\2\u019c\u019d\5s:\2\u019d\u019e\5o8\2\u019e"+
		"\u019f\5M\'\2\u019f\u01a0\5]/\2\u01a0\u01a1\5s:\2\u01a1\u01a2\5q9\2\u01a2"+
		"B\3\2\2\2\u01a3\u01a4\5M\'\2\u01a4\u01a5\5Q)\2\u01a5\u01a6\5s:\2\u01a6"+
		"\u01a7\5]/\2\u01a7\u01a8\5i\65\2\u01a8\u01a9\5g\64\2\u01a9\u01aa\5q9\2"+
		"\u01aaD\3\2\2\2\u01ab\u01ac\5o8\2\u01ac\u01ad\5U+\2\u01ad\u01ae\5M\'\2"+
		"\u01ae\u01af\5Q)\2\u01af\u01b0\5s:\2\u01b0\u01b1\5]/\2\u01b1\u01b2\5i"+
		"\65\2\u01b2\u01b3\5g\64\2\u01b3\u01b4\5q9\2\u01b4F\3\2\2\2\u01b5\u01b6"+
		"\5c\62\2\u01b6\u01b7\5U+\2\u01b7\u01b8\5Y-\2\u01b8\u01b9\5U+\2\u01b9\u01ba"+
		"\5g\64\2\u01ba\u01bb\5S*\2\u01bb\u01bc\5M\'\2\u01bc\u01bd\5o8\2\u01bd"+
		"\u01be\5}?\2\u01be\u01bf\5M\'\2\u01bf\u01c0\5Q)\2\u01c0\u01c1\5s:\2\u01c1"+
		"\u01c2\5]/\2\u01c2\u01c3\5i\65\2\u01c3\u01c4\5g\64\2\u01c4\u01c5\5q9\2"+
		"\u01c5H\3\2\2\2\u01c6\u01c8\t\3\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cc\b%\2\2\u01ccJ\3\2\2\2\u01cd\u01d6\7\62\2\2\u01ce\u01d2\t\4\2\2"+
		"\u01cf\u01d1\t\5\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01cd\3\2\2\2\u01d5\u01ce\3\2\2\2\u01d6L\3\2\2\2\u01d7\u01d8\t\6\2\2"+
		"\u01d8N\3\2\2\2\u01d9\u01da\t\7\2\2\u01daP\3\2\2\2\u01db\u01dc\t\b\2\2"+
		"\u01dcR\3\2\2\2\u01dd\u01de\t\t\2\2\u01deT\3\2\2\2\u01df\u01e0\t\n\2\2"+
		"\u01e0V\3\2\2\2\u01e1\u01e2\t\13\2\2\u01e2X\3\2\2\2\u01e3\u01e4\t\f\2"+
		"\2\u01e4Z\3\2\2\2\u01e5\u01e6\t\r\2\2\u01e6\\\3\2\2\2\u01e7\u01e8\t\16"+
		"\2\2\u01e8^\3\2\2\2\u01e9\u01ea\t\17\2\2\u01ea`\3\2\2\2\u01eb\u01ec\t"+
		"\20\2\2\u01ecb\3\2\2\2\u01ed\u01ee\t\21\2\2\u01eed\3\2\2\2\u01ef\u01f0"+
		"\t\22\2\2\u01f0f\3\2\2\2\u01f1\u01f2\t\23\2\2\u01f2h\3\2\2\2\u01f3\u01f4"+
		"\t\24\2\2\u01f4j\3\2\2\2\u01f5\u01f6\t\25\2\2\u01f6l\3\2\2\2\u01f7\u01f8"+
		"\t\26\2\2\u01f8n\3\2\2\2\u01f9\u01fa\t\27\2\2\u01fap\3\2\2\2\u01fb\u01fc"+
		"\t\30\2\2\u01fcr\3\2\2\2\u01fd\u01fe\t\31\2\2\u01fet\3\2\2\2\u01ff\u0200"+
		"\t\32\2\2\u0200v\3\2\2\2\u0201\u0202\t\33\2\2\u0202x\3\2\2\2\u0203\u0204"+
		"\t\34\2\2\u0204z\3\2\2\2\u0205\u0206\t\35\2\2\u0206|\3\2\2\2\u0207\u0208"+
		"\t\36\2\2\u0208~\3\2\2\2\u0209\u020a\t\37\2\2\u020a\u0080\3\2\2\2\f\2"+
		"\u009d\u00ba\u00d4\u00e3\u0118\u0193\u01c9\u01d2\u01d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}