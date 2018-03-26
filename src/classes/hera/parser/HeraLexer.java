// Generated from HeraLexer.g4 by ANTLR 4.4
package hera.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATOM=1, NOT=2, OR=3, AND=4, IMPL=5, AFFECTS=6, AFFECTSPOS=7, AFFECTSNEG=8, 
		I=9, GOAL=10, MEANS=11, CAUSES=12, PCAUSES=13, SCAUSES=14, EXPLAINS=15, 
		PREVENTS=16, INTERVENTION=17, EXISTS=18, FORALL=19, GT=20, GEQ=21, MUST=22, 
		MAY=23, K=24, CONSEQUENCE=25, U=26, DR=27, DB=28, MINUS=29, SUB=30, ADD=31, 
		INT=32, WORD=33, QUOTE=34, COMMA=35, OPEN=36, CLOSE=37, COMMENT=38, LINE_COMMENT=39, 
		NEWLINE=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"ATOM", "NOT", "OR", "AND", "IMPL", "AFFECTS", "AFFECTSPOS", "AFFECTSNEG", 
		"I", "GOAL", "MEANS", "CAUSES", "PCAUSES", "SCAUSES", "EXPLAINS", "PREVENTS", 
		"INTERVENTION", "EXISTS", "FORALL", "GT", "GEQ", "MUST", "MAY", "K", "CONSEQUENCE", 
		"U", "DR", "DB", "MINUS", "SUB", "ADD", "INT", "WORD", "QUOTE", "COMMA", 
		"OPEN", "CLOSE", "COMMENT", "LINE_COMMENT", "NEWLINE", "WS"
	};


	public HeraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HeraLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\6!\u010f\n!\r!\16!\u0110\3\"\6\"\u0114\n\"\r\"\16\"\u0115\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\7\'\u0124\n\'\f\'\16\'\u0127\13\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0132\n(\f(\16(\u0135\13(\3(\3(\3)\5)"+
		"\u013a\n)\3)\3)\3)\3)\3*\3*\3*\3*\3\u0125\2+\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+\3\2\5\6\2\62;C\\aac|\3\2\f\f\4\2\13\13\"\"\u0147\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7"+
		"^\3\2\2\2\ta\3\2\2\2\13e\3\2\2\2\rj\3\2\2\2\17r\3\2\2\2\21}\3\2\2\2\23"+
		"\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008f\3\2\2\2\31\u0095\3\2\2\2\33\u009c"+
		"\3\2\2\2\35\u00a4\3\2\2\2\37\u00ac\3\2\2\2!\u00b5\3\2\2\2#\u00be\3\2\2"+
		"\2%\u00cb\3\2\2\2\'\u00d2\3\2\2\2)\u00d9\3\2\2\2+\u00dc\3\2\2\2-\u00e0"+
		"\3\2\2\2/\u00e5\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb\3\2\2\2\65\u00f7\3\2"+
		"\2\2\67\u00f9\3\2\2\29\u00fc\3\2\2\2;\u00ff\3\2\2\2=\u0105\3\2\2\2?\u0109"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0113\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I"+
		"\u011b\3\2\2\2K\u011d\3\2\2\2M\u011f\3\2\2\2O\u012d\3\2\2\2Q\u0139\3\2"+
		"\2\2S\u013f\3\2\2\2UV\7C\2\2VW\7v\2\2WX\7q\2\2XY\7o\2\2Y\4\3\2\2\2Z[\7"+
		"P\2\2[\\\7q\2\2\\]\7v\2\2]\6\3\2\2\2^_\7Q\2\2_`\7t\2\2`\b\3\2\2\2ab\7"+
		"C\2\2bc\7p\2\2cd\7f\2\2d\n\3\2\2\2ef\7K\2\2fg\7o\2\2gh\7r\2\2hi\7n\2\2"+
		"i\f\3\2\2\2jk\7C\2\2kl\7h\2\2lm\7h\2\2mn\7g\2\2no\7e\2\2op\7v\2\2pq\7"+
		"u\2\2q\16\3\2\2\2rs\7C\2\2st\7h\2\2tu\7h\2\2uv\7g\2\2vw\7e\2\2wx\7v\2"+
		"\2xy\7u\2\2yz\7R\2\2z{\7q\2\2{|\7u\2\2|\20\3\2\2\2}~\7C\2\2~\177\7h\2"+
		"\2\177\u0080\7h\2\2\u0080\u0081\7g\2\2\u0081\u0082\7e\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7u\2\2\u0084\u0085\7P\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\7i\2\2\u0087\22\3\2\2\2\u0088\u0089\7K\2\2\u0089\24\3\2\2\2\u008a"+
		"\u008b\7I\2\2\u008b\u008c\7q\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2"+
		"\u008e\26\3\2\2\2\u008f\u0090\7O\2\2\u0090\u0091\7g\2\2\u0091\u0092\7"+
		"c\2\2\u0092\u0093\7p\2\2\u0093\u0094\7u\2\2\u0094\30\3\2\2\2\u0095\u0096"+
		"\7E\2\2\u0096\u0097\7c\2\2\u0097\u0098\7w\2\2\u0098\u0099\7u\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7u\2\2\u009b\32\3\2\2\2\u009c\u009d\7R\2\2\u009d"+
		"\u009e\7E\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\u00a3\7u\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7"+
		"U\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9"+
		"\7u\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7u\2\2\u00ab\36\3\2\2\2\u00ac\u00ad"+
		"\7G\2\2\u00ad\u00ae\7z\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7u\2\2"+
		"\u00b4 \3\2\2\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2"+
		"\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7u\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0"+
		"\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7x\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7v\2\2"+
		"\u00c7\u00c8\7k\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7p\2\2\u00ca$\3\2\2"+
		"\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7z\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf"+
		"\7u\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7u\2\2\u00d1&\3\2\2\2\u00d2\u00d3"+
		"\7H\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7n\2\2\u00d8(\3\2\2\2\u00d9\u00da\7I\2\2\u00da"+
		"\u00db\7v\2\2\u00db*\3\2\2\2\u00dc\u00dd\7I\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7s\2\2\u00df,\3\2\2\2\u00e0\u00e1\7O\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7O\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7{\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7M\2\2\u00ea"+
		"\62\3\2\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7u\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7s\2\2\u00f1\u00f2\7w\2\2"+
		"\u00f2\u00f3\7g\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7W\2\2\u00f8\66\3\2\2\2\u00f9\u00fa"+
		"\7F\2\2\u00fa\u00fb\7T\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7F\2\2\u00fd\u00fe"+
		"\7D\2\2\u00fe:\3\2\2\2\u00ff\u0100\7O\2\2\u0100\u0101\7k\2\2\u0101\u0102"+
		"\7p\2\2\u0102\u0103\7w\2\2\u0103\u0104\7u\2\2\u0104<\3\2\2\2\u0105\u0106"+
		"\7U\2\2\u0106\u0107\7w\2\2\u0107\u0108\7d\2\2\u0108>\3\2\2\2\u0109\u010a"+
		"\7C\2\2\u010a\u010b\7f\2\2\u010b\u010c\7f\2\2\u010c@\3\2\2\2\u010d\u010f"+
		"\4\62;\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111B\3\2\2\2\u0112\u0114\t\2\2\2\u0113\u0112\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116D\3"+
		"\2\2\2\u0117\u0118\7)\2\2\u0118F\3\2\2\2\u0119\u011a\7.\2\2\u011aH\3\2"+
		"\2\2\u011b\u011c\7*\2\2\u011cJ\3\2\2\2\u011d\u011e\7+\2\2\u011eL\3\2\2"+
		"\2\u011f\u0120\7\61\2\2\u0120\u0121\7,\2\2\u0121\u0125\3\2\2\2\u0122\u0124"+
		"\13\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129"+
		"\7,\2\2\u0129\u012a\7\61\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b\'\2\2\u012c"+
		"N\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f\7\61\2\2\u012f\u0133\3\2\2"+
		"\2\u0130\u0132\n\3\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\b(\2\2\u0137P\3\2\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\f\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\b)\2\2\u013eR\3\2\2\2\u013f\u0140\t\4\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0142\b*\2\2\u0142T\3\2\2\2\b\2\u0110\u0115\u0125\u0133"+
		"\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}