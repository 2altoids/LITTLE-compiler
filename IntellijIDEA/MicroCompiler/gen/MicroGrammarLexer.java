// Generated from C:/Users/alexm/Desktop/Programs/MSU_Classes/2019/Spring/Compilers_CSCI_468_001/labs/MicroCompiler/src\MicroGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroGrammarLexer extends Lexer {
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
		IDENTIFIER=37, WHITESPACE=38, COMMENT=39, KEYWORD=40, OPERATOR=41;
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
			"INTLITERAL", "FLOATLITERAL", "IDENTIFIER", "WHITESPACE", "COMMENT", 
			"KEYWORD", "OPERATOR"
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
			"FLOATLITERAL", "IDENTIFIER", "WHITESPACE", "COMMENT", "KEYWORD", "OPERATOR"
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


	public MicroGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MicroGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00e9\n#\f#\16#\u00ec"+
		"\13#\3#\3#\3$\6$\u00f1\n$\r$\16$\u00f2\3%\6%\u00f6\n%\r%\16%\u00f7\3%"+
		"\3%\6%\u00fc\n%\r%\16%\u00fd\3%\3%\6%\u0102\n%\r%\16%\u0103\5%\u0106\n"+
		"%\3&\3&\7&\u010a\n&\f&\16&\u010d\13&\3\'\6\'\u0110\n\'\r\'\16\'\u0111"+
		"\3\'\3\'\3(\3(\3(\3(\7(\u011a\n(\f(\16(\u011d\13(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0133\n)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u013f\n*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\n\3\2$$\3"+
		"\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\6\2,-//"+
		"\61\61??\6\2*+..=>@@\2\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2"+
		"\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2\2\2\25h\3\2"+
		"\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2\37t\3\2\2\2!w\3\2"+
		"\2\2#\177\3\2\2\2%\u0085\3\2\2\2\'\u0089\3\2\2\2)\u0092\3\2\2\2+\u0097"+
		"\3\2\2\2-\u009d\3\2\2\2/\u00a0\3\2\2\2\61\u00a5\3\2\2\2\63\u00ab\3\2\2"+
		"\2\65\u00b1\3\2\2\2\67\u00ba\3\2\2\29\u00c3\3\2\2\2;\u00c9\3\2\2\2=\u00d0"+
		"\3\2\2\2?\u00d5\3\2\2\2A\u00d9\3\2\2\2C\u00df\3\2\2\2E\u00e6\3\2\2\2G"+
		"\u00f0\3\2\2\2I\u0105\3\2\2\2K\u0107\3\2\2\2M\u010f\3\2\2\2O\u0115\3\2"+
		"\2\2Q\u0132\3\2\2\2S\u013e\3\2\2\2UV\7<\2\2VW\7?\2\2W\4\3\2\2\2XY\7=\2"+
		"\2Y\6\3\2\2\2Z[\7.\2\2[\b\3\2\2\2\\]\7*\2\2]\n\3\2\2\2^_\7+\2\2_\f\3\2"+
		"\2\2`a\7-\2\2a\16\3\2\2\2bc\7/\2\2c\20\3\2\2\2de\7,\2\2e\22\3\2\2\2fg"+
		"\7\61\2\2g\24\3\2\2\2hi\7>\2\2i\26\3\2\2\2jk\7@\2\2k\30\3\2\2\2lm\7?\2"+
		"\2m\32\3\2\2\2no\7#\2\2op\7?\2\2p\34\3\2\2\2qr\7>\2\2rs\7?\2\2s\36\3\2"+
		"\2\2tu\7@\2\2uv\7?\2\2v \3\2\2\2wx\7R\2\2xy\7T\2\2yz\7Q\2\2z{\7I\2\2{"+
		"|\7T\2\2|}\7C\2\2}~\7O\2\2~\"\3\2\2\2\177\u0080\7D\2\2\u0080\u0081\7G"+
		"\2\2\u0081\u0082\7I\2\2\u0082\u0083\7K\2\2\u0083\u0084\7P\2\2\u0084$\3"+
		"\2\2\2\u0085\u0086\7G\2\2\u0086\u0087\7P\2\2\u0087\u0088\7F\2\2\u0088"+
		"&\3\2\2\2\u0089\u008a\7H\2\2\u008a\u008b\7W\2\2\u008b\u008c\7P\2\2\u008c"+
		"\u008d\7E\2\2\u008d\u008e\7V\2\2\u008e\u008f\7K\2\2\u008f\u0090\7Q\2\2"+
		"\u0090\u0091\7P\2\2\u0091(\3\2\2\2\u0092\u0093\7T\2\2\u0093\u0094\7G\2"+
		"\2\u0094\u0095\7C\2\2\u0095\u0096\7F\2\2\u0096*\3\2\2\2\u0097\u0098\7"+
		"Y\2\2\u0098\u0099\7T\2\2\u0099\u009a\7K\2\2\u009a\u009b\7V\2\2\u009b\u009c"+
		"\7G\2\2\u009c,\3\2\2\2\u009d\u009e\7K\2\2\u009e\u009f\7H\2\2\u009f.\3"+
		"\2\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7U\2\2\u00a3"+
		"\u00a4\7G\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a7\7P\2\2\u00a7"+
		"\u00a8\7F\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7H\2\2\u00aa\62\3\2\2\2\u00ab"+
		"\u00ac\7Y\2\2\u00ac\u00ad\7J\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7N\2\2"+
		"\u00af\u00b0\7G\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7"+
		"P\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7Y\2\2\u00b5\u00b6\7J\2\2\u00b6\u00b7"+
		"\7K\2\2\u00b7\u00b8\7N\2\2\u00b8\u00b9\7G\2\2\u00b9\66\3\2\2\2\u00ba\u00bb"+
		"\7E\2\2\u00bb\u00bc\7Q\2\2\u00bc\u00bd\7P\2\2\u00bd\u00be\7V\2\2\u00be"+
		"\u00bf\7K\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7W\2\2\u00c1\u00c2\7G\2\2"+
		"\u00c28\3\2\2\2\u00c3\u00c4\7D\2\2\u00c4\u00c5\7T\2\2\u00c5\u00c6\7G\2"+
		"\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7M\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7"+
		"T\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7W\2\2\u00cd\u00ce"+
		"\7T\2\2\u00ce\u00cf\7P\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7X\2\2\u00d1\u00d2"+
		"\7Q\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7F\2\2\u00d4>\3\2\2\2\u00d5\u00d6"+
		"\7K\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7V\2\2\u00d8@\3\2\2\2\u00d9\u00da"+
		"\7H\2\2\u00da\u00db\7N\2\2\u00db\u00dc\7Q\2\2\u00dc\u00dd\7C\2\2\u00dd"+
		"\u00de\7V\2\2\u00deB\3\2\2\2\u00df\u00e0\7U\2\2\u00e0\u00e1\7V\2\2\u00e1"+
		"\u00e2\7T\2\2\u00e2\u00e3\7K\2\2\u00e3\u00e4\7P\2\2\u00e4\u00e5\7I\2\2"+
		"\u00e5D\3\2\2\2\u00e6\u00ea\7$\2\2\u00e7\u00e9\n\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$\2\2\u00eeF\3\2\2\2\u00ef"+
		"\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3H\3\2\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\7\60\2\2\u00fa\u00fc\t\3\2\2\u00fb\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0106\3\2\2\2\u00ff\u0101\7\60\2\2\u0100\u0102\t\3\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u00f5\3\2\2\2\u0105\u00ff\3\2\2\2\u0106J\3\2\2\2"+
		"\u0107\u010b\t\4\2\2\u0108\u010a\t\5\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cL\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\t\6\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\b\'\2\2\u0114N\3\2\2\2\u0115\u0116\7/\2\2\u0116\u0117\7/\2\2\u0117"+
		"\u011b\3\2\2\2\u0118\u011a\n\7\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\b(\2\2\u011fP\3\2\2\2\u0120\u0133\5!\21\2\u0121"+
		"\u0133\5#\22\2\u0122\u0133\5%\23\2\u0123\u0133\5\'\24\2\u0124\u0133\5"+
		")\25\2\u0125\u0133\5+\26\2\u0126\u0133\5-\27\2\u0127\u0133\5/\30\2\u0128"+
		"\u0133\5\61\31\2\u0129\u0133\5\63\32\2\u012a\u0133\5\65\33\2\u012b\u0133"+
		"\5\67\34\2\u012c\u0133\59\35\2\u012d\u0133\5;\36\2\u012e\u0133\5? \2\u012f"+
		"\u0133\5=\37\2\u0130\u0133\5C\"\2\u0131\u0133\5A!\2\u0132\u0120\3\2\2"+
		"\2\u0132\u0121\3\2\2\2\u0132\u0122\3\2\2\2\u0132\u0123\3\2\2\2\u0132\u0124"+
		"\3\2\2\2\u0132\u0125\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u0127\3\2\2\2\u0132"+
		"\u0128\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012a\3\2\2\2\u0132\u012b\3\2"+
		"\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132"+
		"\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133R\3\2\2\2"+
		"\u0134\u0135\7<\2\2\u0135\u013f\7?\2\2\u0136\u013f\t\b\2\2\u0137\u0138"+
		"\7#\2\2\u0138\u013f\7?\2\2\u0139\u013f\t\t\2\2\u013a\u013b\7>\2\2\u013b"+
		"\u013f\7?\2\2\u013c\u013d\7@\2\2\u013d\u013f\7?\2\2\u013e\u0134\3\2\2"+
		"\2\u013e\u0136\3\2\2\2\u013e\u0137\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013fT\3\2\2\2\16\2\u00ea\u00f2\u00f7\u00fd"+
		"\u0103\u0105\u010b\u0111\u011b\u0132\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}