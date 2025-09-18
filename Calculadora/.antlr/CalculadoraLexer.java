// Generated from d:/Proyectos/ANTLR y C#/Calculadora/Calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, VARIABLE=6, OPRAND=7, INT=8, DOUBLE=9, 
		ADD=10, MINUS=11, MUL=12, MOD=13, DIV=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "VARIABLE", "OPRAND", "INT", 
			"DOUBLE", "ADD", "MINUS", "MUL", "MOD", "DIV", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'print'", "'('", "')'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'%'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "VARIABLE", "OPRAND", "INT", "DOUBLE", 
			"ADD", "MINUS", "MUL", "MOD", "DIV", "WS"
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


	public CalculadoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculadora.g4"; }

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
		"\u0004\u0000\u000f\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u00050\b\u0005"+
		"\n\u0005\f\u00053\t\u0005\u0001\u0006\u0001\u0006\u0003\u00067\b\u0006"+
		"\u0001\u0007\u0004\u0007:\b\u0007\u000b\u0007\f\u0007;\u0001\u0007\u0001"+
		"\u0007\u0004\u0007@\b\u0007\u000b\u0007\f\u0007A\u0005\u0007D\b\u0007"+
		"\n\u0007\f\u0007G\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007"+
		"L\b\u0007\u000b\u0007\f\u0007M\u0003\u0007P\b\u0007\u0001\b\u0004\bS\b"+
		"\b\u000b\b\f\bT\u0001\b\u0001\b\u0004\bY\b\b\u000b\b\f\bZ\u0005\b]\b\b"+
		"\n\b\f\b`\t\b\u0001\b\u0001\b\u0004\bd\b\b\u000b\b\f\be\u0001\b\u0001"+
		"\b\u0004\bj\b\b\u000b\b\f\bk\u0004\bn\b\b\u000b\b\f\bo\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0004\u000e}\b\u000e\u000b\u000e\f\u000e~\u0001\u000e\u0001"+
		"\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0006\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0001\u000009\u0002\u0000XXxx\u0003\u000009AFaf\u0003\u0000"+
		"\t\n\r\r  \u008f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007"+
		")\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001\u0000"+
		"\u0000\u0000\r6\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000\u0000"+
		"\u0011R\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000\u0015s"+
		"\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019w\u0001\u0000"+
		"\u0000\u0000\u001by\u0001\u0000\u0000\u0000\u001d|\u0001\u0000\u0000\u0000"+
		"\u001f \u0005=\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005;\u0000"+
		"\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005p\u0000\u0000$%\u0005r\u0000"+
		"\u0000%&\u0005i\u0000\u0000&\'\u0005n\u0000\u0000\'(\u0005t\u0000\u0000"+
		"(\u0006\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000*\b\u0001\u0000\u0000"+
		"\u0000+,\u0005)\u0000\u0000,\n\u0001\u0000\u0000\u0000-1\u0007\u0000\u0000"+
		"\u0000.0\u0007\u0001\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\f\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000047\u0003\u000f\u0007\u0000"+
		"57\u0003\u0011\b\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7\u000e\u0001\u0000\u0000\u00008:\u0007\u0002\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<E\u0001\u0000\u0000\u0000=?\u0005_\u0000\u0000>@\u0007"+
		"\u0002\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FP\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u00050\u0000\u0000IK\u0007\u0003\u0000\u0000JL\u0007"+
		"\u0004\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000O9\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000P\u0010\u0001"+
		"\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000U^\u0001\u0000\u0000\u0000VX\u0005_\u0000\u0000WY\u0007\u0002\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\V\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ac\u0005.\u0000\u0000bd\u0007\u0002\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fm\u0001\u0000\u0000\u0000gi\u0005_\u0000\u0000hj\u0007\u0002"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mg\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u0012\u0001\u0000\u0000\u0000qr\u0005"+
		"+\u0000\u0000r\u0014\u0001\u0000\u0000\u0000st\u0005-\u0000\u0000t\u0016"+
		"\u0001\u0000\u0000\u0000uv\u0005*\u0000\u0000v\u0018\u0001\u0000\u0000"+
		"\u0000wx\u0005%\u0000\u0000x\u001a\u0001\u0000\u0000\u0000yz\u0005/\u0000"+
		"\u0000z\u001c\u0001\u0000\u0000\u0000{}\u0007\u0005\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0006\u000e\u0000\u0000\u0081\u001e\u0001\u0000\u0000\u0000\u000f"+
		"\u000016;AEMOTZ^eko~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}