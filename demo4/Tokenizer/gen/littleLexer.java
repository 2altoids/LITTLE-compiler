// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/STEP1/Tokenizer/grammar\little.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class littleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PROGRAM=16, 
		BEGIN=17, END=18, FUNCTION=19, READ=20, WRITE=21, IF=22, ELSE=23, ENDIF=24, 
		WHILE=25, ENDWHILE=26, CONTINUE=27, BREAK=28, RETURN=29, VOID=30, INT=31, 
		FLOAT=32, STRING=33, STRINGLITERAL=34, INTLITERAL=35, FLOATLITERAL=36, 
		IDENTIFIER=37, WHITESPACE=38, COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "PROGRAM", "BEGIN", 
			"END", "FUNCTION", "READ", "WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
			"CONTINUE", "BREAK", "RETURN", "VOID", "INT", "FLOAT", "STRING", "STRINGLITERAL", 
			"INTLITERAL", "FLOATLITERAL", "IDENTIFIER", "WHITESPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "';'", "','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'PROGRAM'", "'BEGIN'", 
			"'END'", "'FUNCTION'", "'READ'", "'WRITE'", "'IF'", "'ELSE'", "'ENDIF'", 
			"'WHILE'", "'ENDWHILE'", "'CONTINUE'", "'BREAK'", "'RETURN'", "'VOID'", 
			"'INT'", "'FLOAT'", "'STRING'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", 
			"WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", 
			"RETURN", "VOID", "INT", "FLOAT", "STRING", "STRINGLITERAL", "INTLITERAL", 
			"FLOATLITERAL", "IDENTIFIER", "WHITESPACE", "COMMENT"
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


	public littleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "little.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00e5\n#\f#\16#\u00e8\13#\3#\3#\3"+
		"$\6$\u00ed\n$\r$\16$\u00ee\3%\6%\u00f2\n%\r%\16%\u00f3\3%\3%\6%\u00f8"+
		"\n%\r%\16%\u00f9\3%\3%\6%\u00fe\n%\r%\16%\u00ff\5%\u0102\n%\3&\3&\7&\u0106"+
		"\n&\f&\16&\u0109\13&\3\'\6\'\u010c\n\'\r\'\16\'\u010d\3\'\3\'\3(\3(\3"+
		"(\3(\7(\u0116\n(\f(\16(\u0119\13(\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2"+
		"\b\3\2$$\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\2\u0124\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T"+
		"\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21"+
		"`\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2"+
		"\35m\3\2\2\2\37p\3\2\2\2!s\3\2\2\2#{\3\2\2\2%\u0081\3\2\2\2\'\u0085\3"+
		"\2\2\2)\u008e\3\2\2\2+\u0093\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61"+
		"\u00a1\3\2\2\2\63\u00a7\3\2\2\2\65\u00ad\3\2\2\2\67\u00b6\3\2\2\29\u00bf"+
		"\3\2\2\2;\u00c5\3\2\2\2=\u00cc\3\2\2\2?\u00d1\3\2\2\2A\u00d5\3\2\2\2C"+
		"\u00db\3\2\2\2E\u00e2\3\2\2\2G\u00ec\3\2\2\2I\u0101\3\2\2\2K\u0103\3\2"+
		"\2\2M\u010b\3\2\2\2O\u0111\3\2\2\2QR\7<\2\2RS\7?\2\2S\4\3\2\2\2TU\7=\2"+
		"\2U\6\3\2\2\2VW\7.\2\2W\b\3\2\2\2XY\7*\2\2Y\n\3\2\2\2Z[\7+\2\2[\f\3\2"+
		"\2\2\\]\7-\2\2]\16\3\2\2\2^_\7/\2\2_\20\3\2\2\2`a\7,\2\2a\22\3\2\2\2b"+
		"c\7\61\2\2c\24\3\2\2\2de\7>\2\2e\26\3\2\2\2fg\7@\2\2g\30\3\2\2\2hi\7?"+
		"\2\2i\32\3\2\2\2jk\7#\2\2kl\7?\2\2l\34\3\2\2\2mn\7>\2\2no\7?\2\2o\36\3"+
		"\2\2\2pq\7@\2\2qr\7?\2\2r \3\2\2\2st\7R\2\2tu\7T\2\2uv\7Q\2\2vw\7I\2\2"+
		"wx\7T\2\2xy\7C\2\2yz\7O\2\2z\"\3\2\2\2{|\7D\2\2|}\7G\2\2}~\7I\2\2~\177"+
		"\7K\2\2\177\u0080\7P\2\2\u0080$\3\2\2\2\u0081\u0082\7G\2\2\u0082\u0083"+
		"\7P\2\2\u0083\u0084\7F\2\2\u0084&\3\2\2\2\u0085\u0086\7H\2\2\u0086\u0087"+
		"\7W\2\2\u0087\u0088\7P\2\2\u0088\u0089\7E\2\2\u0089\u008a\7V\2\2\u008a"+
		"\u008b\7K\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7P\2\2\u008d(\3\2\2\2\u008e"+
		"\u008f\7T\2\2\u008f\u0090\7G\2\2\u0090\u0091\7C\2\2\u0091\u0092\7F\2\2"+
		"\u0092*\3\2\2\2\u0093\u0094\7Y\2\2\u0094\u0095\7T\2\2\u0095\u0096\7K\2"+
		"\2\u0096\u0097\7V\2\2\u0097\u0098\7G\2\2\u0098,\3\2\2\2\u0099\u009a\7"+
		"K\2\2\u009a\u009b\7H\2\2\u009b.\3\2\2\2\u009c\u009d\7G\2\2\u009d\u009e"+
		"\7N\2\2\u009e\u009f\7U\2\2\u009f\u00a0\7G\2\2\u00a0\60\3\2\2\2\u00a1\u00a2"+
		"\7G\2\2\u00a2\u00a3\7P\2\2\u00a3\u00a4\7F\2\2\u00a4\u00a5\7K\2\2\u00a5"+
		"\u00a6\7H\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7Y\2\2\u00a8\u00a9\7J\2\2\u00a9"+
		"\u00aa\7K\2\2\u00aa\u00ab\7N\2\2\u00ab\u00ac\7G\2\2\u00ac\64\3\2\2\2\u00ad"+
		"\u00ae\7G\2\2\u00ae\u00af\7P\2\2\u00af\u00b0\7F\2\2\u00b0\u00b1\7Y\2\2"+
		"\u00b1\u00b2\7J\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b4\7N\2\2\u00b4\u00b5"+
		"\7G\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8\7Q\2\2\u00b8\u00b9"+
		"\7P\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7P\2\2\u00bc"+
		"\u00bd\7W\2\2\u00bd\u00be\7G\2\2\u00be8\3\2\2\2\u00bf\u00c0\7D\2\2\u00c0"+
		"\u00c1\7T\2\2\u00c1\u00c2\7G\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7M\2\2"+
		"\u00c4:\3\2\2\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7V\2"+
		"\2\u00c8\u00c9\7W\2\2\u00c9\u00ca\7T\2\2\u00ca\u00cb\7P\2\2\u00cb<\3\2"+
		"\2\2\u00cc\u00cd\7X\2\2\u00cd\u00ce\7Q\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0"+
		"\7F\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7P\2\2\u00d3\u00d4"+
		"\7V\2\2\u00d4@\3\2\2\2\u00d5\u00d6\7H\2\2\u00d6\u00d7\7N\2\2\u00d7\u00d8"+
		"\7Q\2\2\u00d8\u00d9\7C\2\2\u00d9\u00da\7V\2\2\u00daB\3\2\2\2\u00db\u00dc"+
		"\7U\2\2\u00dc\u00dd\7V\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7K\2\2\u00df"+
		"\u00e0\7P\2\2\u00e0\u00e1\7I\2\2\u00e1D\3\2\2\2\u00e2\u00e6\7$\2\2\u00e3"+
		"\u00e5\n\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7$\2\2\u00eaF\3\2\2\2\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efH\3\2\2\2"+
		"\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\60\2\2"+
		"\u00f6\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0102\3\2\2\2\u00fb\u00fd\7\60\2\2"+
		"\u00fc\u00fe\t\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00f1\3\2\2\2\u0101"+
		"\u00fb\3\2\2\2\u0102J\3\2\2\2\u0103\u0107\t\4\2\2\u0104\u0106\t\5\2\2"+
		"\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108L\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\t\6\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\'\2\2\u0110N\3\2\2\2\u0111\u0112"+
		"\7/\2\2\u0112\u0113\7/\2\2\u0113\u0117\3\2\2\2\u0114\u0116\n\7\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\b(\2\2\u011b"+
		"P\3\2\2\2\f\2\u00e6\u00ee\u00f3\u00f9\u00ff\u0101\u0107\u010d\u0117\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}