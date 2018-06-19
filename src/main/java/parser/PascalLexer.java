// Generated from C:/Users/Mateusz/Desktop/Informatyka/Semestr VI/Kompilatory/Pascal_Compiler\Pascal.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CONST=7, DIV=8, DO=9, 
		DOWNTO=10, ELSE=11, END=12, FILE=13, FOR=14, FUNCTION=15, IF=16, INTEGER=17, 
		MOD=18, NIL=19, NOT=20, OF=21, OR=22, PROCEDURE=23, PROGRAM=24, REAL=25, 
		RECORD=26, REPEAT=27, SET=28, THEN=29, TO=30, TYPE=31, UNTIL=32, VAR=33, 
		WHILE=34, WITH=35, PLUS=36, MINUS=37, STAR=38, SLASH=39, ASSIGN=40, COMMA=41, 
		SEMI=42, COLON=43, EQUAL=44, NOT_EQUAL=45, LT=46, LE=47, GE=48, GT=49, 
		LPAREN=50, RPAREN=51, LBRACK=52, LBRACK2=53, RBRACK=54, RBRACK2=55, AT=56, 
		DOT=57, DOTDOT=58, LCURLY=59, RCURLY=60, UNIT=61, INTERFACE=62, USES=63, 
		STRING=64, WS=65, COMMENT_1=66, COMMENT_2=67, IDENT=68, STRING_LITERAL=69, 
		NUM_INT=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AND", "ARRAY", 
		"BEGIN", "BOOLEAN", "CASE", "CHAR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", 
		"END", "FILE", "FOR", "FUNCTION", "IF", "INTEGER", "MOD", "NIL", "NOT", 
		"OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", "SET", 
		"THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", "PLUS", "MINUS", 
		"STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", 
		"LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", 
		"RBRACK2", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", 
		"USES", "STRING", "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", 
		"NUM_INT", "EXPONENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", "'<>'", 
		"'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", 
		"'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CONST", "DIV", 
		"DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "IF", "INTEGER", 
		"MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "RECORD", 
		"REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
		"PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
		"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
		"LBRACK2", "RBRACK", "RBRACK2", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", 
		"UNIT", "INTERFACE", "USES", "STRING", "WS", "COMMENT_1", "COMMENT_2", 
		"IDENT", "STRING_LITERAL", "NUM_INT"
	};
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u0251\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3@\3@\3"+
		"A\3A\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3"+
		"K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\3"+
		"U\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3"+
		"Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\7]\u020f\n"+
		"]\f]\16]\u0212\13]\3]\3]\3]\3]\3]\3^\3^\7^\u021b\n^\f^\16^\u021e\13^\3"+
		"^\3^\3^\3^\3_\3_\7_\u0226\n_\f_\16_\u0229\13_\3`\3`\3`\3`\7`\u022f\n`"+
		"\f`\16`\u0232\13`\3`\3`\3a\6a\u0237\na\ra\16a\u0238\3a\3a\6a\u023d\na"+
		"\ra\16a\u023e\3a\5a\u0242\na\5a\u0244\na\3a\5a\u0247\na\3b\3b\5b\u024b"+
		"\nb\3b\6b\u024e\nb\rb\16b\u024f\4\u0210\u021c\2c\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S"+
		"\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y"+
		"${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091"+
		"\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65\u009d\66\u009f\67\u00a1"+
		"8\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1@\u00b3A\u00b5"+
		"B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3\2\3\2!\4\2CCcc\4\2D"+
		"Ddd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2))\4\2--//\2\u0241\2\67\3\2\2\2\29"+
		"\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2"+
		"\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_"+
		"\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2"+
		"\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2"+
		"\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\3\u00c5\3\2\2\2\5\u00c7\3\2\2\2\7\u00c9\3\2\2\2\t\u00cb\3\2\2\2\13"+
		"\u00cd\3\2\2\2\r\u00cf\3\2\2\2\17\u00d1\3\2\2\2\21\u00d3\3\2\2\2\23\u00d5"+
		"\3\2\2\2\25\u00d7\3\2\2\2\27\u00d9\3\2\2\2\31\u00db\3\2\2\2\33\u00dd\3"+
		"\2\2\2\35\u00df\3\2\2\2\37\u00e1\3\2\2\2!\u00e3\3\2\2\2#\u00e5\3\2\2\2"+
		"%\u00e7\3\2\2\2\'\u00e9\3\2\2\2)\u00eb\3\2\2\2+\u00ed\3\2\2\2-\u00ef\3"+
		"\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f7\3\2\2"+
		"\2\67\u00f9\3\2\2\29\u00fd\3\2\2\2;\u0103\3\2\2\2=\u0109\3\2\2\2?\u0111"+
		"\3\2\2\2A\u0116\3\2\2\2C\u011b\3\2\2\2E\u0121\3\2\2\2G\u0125\3\2\2\2I"+
		"\u0128\3\2\2\2K\u012f\3\2\2\2M\u0134\3\2\2\2O\u0138\3\2\2\2Q\u013d\3\2"+
		"\2\2S\u0141\3\2\2\2U\u014a\3\2\2\2W\u014d\3\2\2\2Y\u0155\3\2\2\2[\u0159"+
		"\3\2\2\2]\u015d\3\2\2\2_\u0161\3\2\2\2a\u0164\3\2\2\2c\u0167\3\2\2\2e"+
		"\u0171\3\2\2\2g\u0179\3\2\2\2i\u017e\3\2\2\2k\u0185\3\2\2\2m\u018c\3\2"+
		"\2\2o\u0190\3\2\2\2q\u0195\3\2\2\2s\u0198\3\2\2\2u\u019d\3\2\2\2w\u01a3"+
		"\3\2\2\2y\u01a7\3\2\2\2{\u01ad\3\2\2\2}\u01b2\3\2\2\2\177\u01b4\3\2\2"+
		"\2\u0081\u01b6\3\2\2\2\u0083\u01b8\3\2\2\2\u0085\u01ba\3\2\2\2\u0087\u01bd"+
		"\3\2\2\2\u0089\u01bf\3\2\2\2\u008b\u01c1\3\2\2\2\u008d\u01c3\3\2\2\2\u008f"+
		"\u01c5\3\2\2\2\u0091\u01c8\3\2\2\2\u0093\u01ca\3\2\2\2\u0095\u01cd\3\2"+
		"\2\2\u0097\u01d0\3\2\2\2\u0099\u01d2\3\2\2\2\u009b\u01d4\3\2\2\2\u009d"+
		"\u01d6\3\2\2\2\u009f\u01d8\3\2\2\2\u00a1\u01db\3\2\2\2\u00a3\u01dd\3\2"+
		"\2\2\u00a5\u01e0\3\2\2\2\u00a7\u01e2\3\2\2\2\u00a9\u01e4\3\2\2\2\u00ab"+
		"\u01e7\3\2\2\2\u00ad\u01e9\3\2\2\2\u00af\u01eb\3\2\2\2\u00b1\u01f0\3\2"+
		"\2\2\u00b3\u01fa\3\2\2\2\u00b5\u01ff\3\2\2\2\u00b7\u0206\3\2\2\2\u00b9"+
		"\u020a\3\2\2\2\u00bb\u0218\3\2\2\2\u00bd\u0223\3\2\2\2\u00bf\u022a\3\2"+
		"\2\2\u00c1\u0236\3\2\2\2\u00c3\u0248\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6"+
		"\4\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\6\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca"+
		"\b\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\n\3\2\2\2\u00cd\u00ce\t\6\2\2\u00ce"+
		"\f\3\2\2\2\u00cf\u00d0\t\7\2\2\u00d0\16\3\2\2\2\u00d1\u00d2\t\b\2\2\u00d2"+
		"\20\3\2\2\2\u00d3\u00d4\t\t\2\2\u00d4\22\3\2\2\2\u00d5\u00d6\t\n\2\2\u00d6"+
		"\24\3\2\2\2\u00d7\u00d8\t\13\2\2\u00d8\26\3\2\2\2\u00d9\u00da\t\f\2\2"+
		"\u00da\30\3\2\2\2\u00db\u00dc\t\r\2\2\u00dc\32\3\2\2\2\u00dd\u00de\t\16"+
		"\2\2\u00de\34\3\2\2\2\u00df\u00e0\t\17\2\2\u00e0\36\3\2\2\2\u00e1\u00e2"+
		"\t\20\2\2\u00e2 \3\2\2\2\u00e3\u00e4\t\21\2\2\u00e4\"\3\2\2\2\u00e5\u00e6"+
		"\t\22\2\2\u00e6$\3\2\2\2\u00e7\u00e8\t\23\2\2\u00e8&\3\2\2\2\u00e9\u00ea"+
		"\t\24\2\2\u00ea(\3\2\2\2\u00eb\u00ec\t\25\2\2\u00ec*\3\2\2\2\u00ed\u00ee"+
		"\t\26\2\2\u00ee,\3\2\2\2\u00ef\u00f0\t\27\2\2\u00f0.\3\2\2\2\u00f1\u00f2"+
		"\t\30\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\t\31\2\2\u00f4\62\3\2\2\2\u00f5"+
		"\u00f6\t\32\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\t\33\2\2\u00f8\66\3\2\2\2"+
		"\u00f9\u00fa\5\3\2\2\u00fa\u00fb\5\35\17\2\u00fb\u00fc\5\t\5\2\u00fc8"+
		"\3\2\2\2\u00fd\u00fe\5\3\2\2\u00fe\u00ff\5%\23\2\u00ff\u0100\5%\23\2\u0100"+
		"\u0101\5\3\2\2\u0101\u0102\5\63\32\2\u0102:\3\2\2\2\u0103\u0104\5\5\3"+
		"\2\u0104\u0105\5\13\6\2\u0105\u0106\5\17\b\2\u0106\u0107\5\23\n\2\u0107"+
		"\u0108\5\35\17\2\u0108<\3\2\2\2\u0109\u010a\5\5\3\2\u010a\u010b\5\37\20"+
		"\2\u010b\u010c\5\37\20\2\u010c\u010d\5\31\r\2\u010d\u010e\5\13\6\2\u010e"+
		"\u010f\5\3\2\2\u010f\u0110\5\35\17\2\u0110>\3\2\2\2\u0111\u0112\5\7\4"+
		"\2\u0112\u0113\5\3\2\2\u0113\u0114\5\'\24\2\u0114\u0115\5\13\6\2\u0115"+
		"@\3\2\2\2\u0116\u0117\5\7\4\2\u0117\u0118\5\21\t\2\u0118\u0119\5\3\2\2"+
		"\u0119\u011a\5%\23\2\u011aB\3\2\2\2\u011b\u011c\5\7\4\2\u011c\u011d\5"+
		"\37\20\2\u011d\u011e\5\35\17\2\u011e\u011f\5\'\24\2\u011f\u0120\5)\25"+
		"\2\u0120D\3\2\2\2\u0121\u0122\5\t\5\2\u0122\u0123\5\23\n\2\u0123\u0124"+
		"\5-\27\2\u0124F\3\2\2\2\u0125\u0126\5\t\5\2\u0126\u0127\5\37\20\2\u0127"+
		"H\3\2\2\2\u0128\u0129\5\t\5\2\u0129\u012a\5\37\20\2\u012a\u012b\5/\30"+
		"\2\u012b\u012c\5\35\17\2\u012c\u012d\5)\25\2\u012d\u012e\5\37\20\2\u012e"+
		"J\3\2\2\2\u012f\u0130\5\13\6\2\u0130\u0131\5\31\r\2\u0131\u0132\5\'\24"+
		"\2\u0132\u0133\5\13\6\2\u0133L\3\2\2\2\u0134\u0135\5\13\6\2\u0135\u0136"+
		"\5\35\17\2\u0136\u0137\5\t\5\2\u0137N\3\2\2\2\u0138\u0139\5\r\7\2\u0139"+
		"\u013a\5\23\n\2\u013a\u013b\5\31\r\2\u013b\u013c\5\13\6\2\u013cP\3\2\2"+
		"\2\u013d\u013e\5\r\7\2\u013e\u013f\5\37\20\2\u013f\u0140\5%\23\2\u0140"+
		"R\3\2\2\2\u0141\u0142\5\r\7\2\u0142\u0143\5+\26\2\u0143\u0144\5\35\17"+
		"\2\u0144\u0145\5\7\4\2\u0145\u0146\5)\25\2\u0146\u0147\5\23\n\2\u0147"+
		"\u0148\5\37\20\2\u0148\u0149\5\35\17\2\u0149T\3\2\2\2\u014a\u014b\5\23"+
		"\n\2\u014b\u014c\5\r\7\2\u014cV\3\2\2\2\u014d\u014e\5\23\n\2\u014e\u014f"+
		"\5\35\17\2\u014f\u0150\5)\25\2\u0150\u0151\5\13\6\2\u0151\u0152\5\17\b"+
		"\2\u0152\u0153\5\13\6\2\u0153\u0154\5%\23\2\u0154X\3\2\2\2\u0155\u0156"+
		"\5\33\16\2\u0156\u0157\5\37\20\2\u0157\u0158\5\t\5\2\u0158Z\3\2\2\2\u0159"+
		"\u015a\5\35\17\2\u015a\u015b\5\23\n\2\u015b\u015c\5\31\r\2\u015c\\\3\2"+
		"\2\2\u015d\u015e\5\35\17\2\u015e\u015f\5\37\20\2\u015f\u0160\5)\25\2\u0160"+
		"^\3\2\2\2\u0161\u0162\5\37\20\2\u0162\u0163\5\r\7\2\u0163`\3\2\2\2\u0164"+
		"\u0165\5\37\20\2\u0165\u0166\5%\23\2\u0166b\3\2\2\2\u0167\u0168\5!\21"+
		"\2\u0168\u0169\5%\23\2\u0169\u016a\5\37\20\2\u016a\u016b\5\7\4\2\u016b"+
		"\u016c\5\13\6\2\u016c\u016d\5\t\5\2\u016d\u016e\5+\26\2\u016e\u016f\5"+
		"%\23\2\u016f\u0170\5\13\6\2\u0170d\3\2\2\2\u0171\u0172\5!\21\2\u0172\u0173"+
		"\5%\23\2\u0173\u0174\5\37\20\2\u0174\u0175\5\17\b\2\u0175\u0176\5%\23"+
		"\2\u0176\u0177\5\3\2\2\u0177\u0178\5\33\16\2\u0178f\3\2\2\2\u0179\u017a"+
		"\5%\23\2\u017a\u017b\5\13\6\2\u017b\u017c\5\3\2\2\u017c\u017d\5\31\r\2"+
		"\u017dh\3\2\2\2\u017e\u017f\5%\23\2\u017f\u0180\5\13\6\2\u0180\u0181\5"+
		"\7\4\2\u0181\u0182\5\37\20\2\u0182\u0183\5%\23\2\u0183\u0184\5\t\5\2\u0184"+
		"j\3\2\2\2\u0185\u0186\5%\23\2\u0186\u0187\5\13\6\2\u0187\u0188\5!\21\2"+
		"\u0188\u0189\5\13\6\2\u0189\u018a\5\3\2\2\u018a\u018b\5)\25\2\u018bl\3"+
		"\2\2\2\u018c\u018d\5\'\24\2\u018d\u018e\5\13\6\2\u018e\u018f\5)\25\2\u018f"+
		"n\3\2\2\2\u0190\u0191\5)\25\2\u0191\u0192\5\21\t\2\u0192\u0193\5\13\6"+
		"\2\u0193\u0194\5\35\17\2\u0194p\3\2\2\2\u0195\u0196\5)\25\2\u0196\u0197"+
		"\5\37\20\2\u0197r\3\2\2\2\u0198\u0199\5)\25\2\u0199\u019a\5\63\32\2\u019a"+
		"\u019b\5!\21\2\u019b\u019c\5\13\6\2\u019ct\3\2\2\2\u019d\u019e\5+\26\2"+
		"\u019e\u019f\5\35\17\2\u019f\u01a0\5)\25\2\u01a0\u01a1\5\23\n\2\u01a1"+
		"\u01a2\5\31\r\2\u01a2v\3\2\2\2\u01a3\u01a4\5-\27\2\u01a4\u01a5\5\3\2\2"+
		"\u01a5\u01a6\5%\23\2\u01a6x\3\2\2\2\u01a7\u01a8\5/\30\2\u01a8\u01a9\5"+
		"\21\t\2\u01a9\u01aa\5\23\n\2\u01aa\u01ab\5\31\r\2\u01ab\u01ac\5\13\6\2"+
		"\u01acz\3\2\2\2\u01ad\u01ae\5/\30\2\u01ae\u01af\5\23\n\2\u01af\u01b0\5"+
		")\25\2\u01b0\u01b1\5\21\t\2\u01b1|\3\2\2\2\u01b2\u01b3\7-\2\2\u01b3~\3"+
		"\2\2\2\u01b4\u01b5\7/\2\2\u01b5\u0080\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7"+
		"\u0082\3\2\2\2\u01b8\u01b9\7\61\2\2\u01b9\u0084\3\2\2\2\u01ba\u01bb\7"+
		"<\2\2\u01bb\u01bc\7?\2\2\u01bc\u0086\3\2\2\2\u01bd\u01be\7.\2\2\u01be"+
		"\u0088\3\2\2\2\u01bf\u01c0\7=\2\2\u01c0\u008a\3\2\2\2\u01c1\u01c2\7<\2"+
		"\2\u01c2\u008c\3\2\2\2\u01c3\u01c4\7?\2\2\u01c4\u008e\3\2\2\2\u01c5\u01c6"+
		"\7>\2\2\u01c6\u01c7\7@\2\2\u01c7\u0090\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9"+
		"\u0092\3\2\2\2\u01ca\u01cb\7>\2\2\u01cb\u01cc\7?\2\2\u01cc\u0094\3\2\2"+
		"\2\u01cd\u01ce\7@\2\2\u01ce\u01cf\7?\2\2\u01cf\u0096\3\2\2\2\u01d0\u01d1"+
		"\7@\2\2\u01d1\u0098\3\2\2\2\u01d2\u01d3\7*\2\2\u01d3\u009a\3\2\2\2\u01d4"+
		"\u01d5\7+\2\2\u01d5\u009c\3\2\2\2\u01d6\u01d7\7]\2\2\u01d7\u009e\3\2\2"+
		"\2\u01d8\u01d9\7*\2\2\u01d9\u01da\7\60\2\2\u01da\u00a0\3\2\2\2\u01db\u01dc"+
		"\7_\2\2\u01dc\u00a2\3\2\2\2\u01dd\u01de\7\60\2\2\u01de\u01df\7+\2\2\u01df"+
		"\u00a4\3\2\2\2\u01e0\u01e1\7B\2\2\u01e1\u00a6\3\2\2\2\u01e2\u01e3\7\60"+
		"\2\2\u01e3\u00a8\3\2\2\2\u01e4\u01e5\7\60\2\2\u01e5\u01e6\7\60\2\2\u01e6"+
		"\u00aa\3\2\2\2\u01e7\u01e8\7}\2\2\u01e8\u00ac\3\2\2\2\u01e9\u01ea\7\177"+
		"\2\2\u01ea\u00ae\3\2\2\2\u01eb\u01ec\5+\26\2\u01ec\u01ed\5\35\17\2\u01ed"+
		"\u01ee\5\23\n\2\u01ee\u01ef\5)\25\2\u01ef\u00b0\3\2\2\2\u01f0\u01f1\5"+
		"\23\n\2\u01f1\u01f2\5\35\17\2\u01f2\u01f3\5)\25\2\u01f3\u01f4\5\13\6\2"+
		"\u01f4\u01f5\5%\23\2\u01f5\u01f6\5\r\7\2\u01f6\u01f7\5\3\2\2\u01f7\u01f8"+
		"\5\7\4\2\u01f8\u01f9\5\13\6\2\u01f9\u00b2\3\2\2\2\u01fa\u01fb\5+\26\2"+
		"\u01fb\u01fc\5\'\24\2\u01fc\u01fd\5\13\6\2\u01fd\u01fe\5\'\24\2\u01fe"+
		"\u00b4\3\2\2\2\u01ff\u0200\5\'\24\2\u0200\u0201\5)\25\2\u0201\u0202\5"+
		"%\23\2\u0202\u0203\5\23\n\2\u0203\u0204\5\35\17\2\u0204\u0205\5\17\b\2"+
		"\u0205\u00b6\3\2\2\2\u0206\u0207\t\34\2\2\u0207\u0208\3\2\2\2\u0208\u0209"+
		"\b\\\2\2\u0209\u00b8\3\2\2\2\u020a\u020b\7*\2\2\u020b\u020c\7,\2\2\u020c"+
		"\u0210\3\2\2\2\u020d\u020f\13\2\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3"+
		"\2\2\2\u0210\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0214\7,\2\2\u0214\u0215\7+\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u0217\b]\2\2\u0217\u00ba\3\2\2\2\u0218\u021c\7}\2\2\u0219\u021b"+
		"\13\2\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021d\3\2\2\2"+
		"\u021c\u021a\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220"+
		"\7\177\2\2\u0220\u0221\3\2\2\2\u0221\u0222\b^\2\2\u0222\u00bc\3\2\2\2"+
		"\u0223\u0227\t\35\2\2\u0224\u0226\t\36\2\2\u0225\u0224\3\2\2\2\u0226\u0229"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u00be\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u0230\7)\2\2\u022b\u022c\7)\2\2\u022c\u022f\7)\2"+
		"\2\u022d\u022f\n\37\2\2\u022e\u022b\3\2\2\2\u022e\u022d\3\2\2\2\u022f"+
		"\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7)\2\2\u0234\u00c0\3\2\2\2\u0235"+
		"\u0237\4\62;\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u0246\3\2\2\2\u023a\u023c\7\60\2\2\u023b"+
		"\u023d\4\62;\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0242\5\u00c3b\2\u0241"+
		"\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u023a\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0247\5\u00c3b\2\u0246"+
		"\u0243\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u00c2\3\2\2\2\u0248\u024a\7g"+
		"\2\2\u0249\u024b\t \2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024d\3\2\2\2\u024c\u024e\4\62;\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u00c4\3\2\2\2\17\2"+
		"\u0210\u021c\u0227\u022e\u0230\u0238\u023e\u0241\u0243\u0246\u024a\u024f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}