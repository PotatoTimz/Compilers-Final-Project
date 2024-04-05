// Generated from java-escape by ANTLR 4.11.1

import backend.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, NUMBER=35, WORDQUOTE=36, WORD=37, EQUAL=38, 
		SEMICOLUMN=39, OP=40, WHITESPACE=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_forLoop = 2, RULE_ifelse = 3, 
		RULE_funcDeclare = 4, RULE_funcInvoke = 5, RULE_funcBody = 6, RULE_declareParameterName = 7, 
		RULE_declareParameters = 8, RULE_assignment = 9, RULE_print = 10, RULE_expression = 11, 
		RULE_listString = 12, RULE_listInt = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "forLoop", "ifelse", "funcDeclare", "funcInvoke", 
			"funcBody", "declareParameterName", "declareParameters", "assignment", 
			"print", "expression", "listString", "listInt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'('", "'in'", "'..'", "')'", "'if('", "'else'", "'function '", 
			"'{'", "'}'", "', '", "'()'", "'['", "'] = '", "'.add('", "'front'", 
			"'back'", "'print('", "' + '", "' - '", "'-'", "' * '", "' / '", "' ++ '", 
			"' > '", "' == '", "' < '", "'.map('", "'max('", "'min('", "'sum('", 
			"'avg('", "'size('", "']'", null, null, null, "' = '", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"WORDQUOTE", "WORD", "EQUAL", "SEMICOLUMN", "OP", "WHITESPACE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    final Boolean TRUEBOOLEAN = true;
	    final Boolean FALSEBOOLEAN = false;

	    String removeQuotes(String text){
	         text = text.substring(1, text.length() - 1);
	         return text;
	    }
	    String addStrings(String text1, String text2){
	        return text1+text2;
	    }
	    int toInt(String text) {
	        return Integer.parseInt(text);
	    }
	    void display(int value) {
	        System.out.println("> " + value);
	    }

	public PLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expr expr;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			 List <Expr> statements = new ArrayList<Expr>(); 
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				((ProgramContext)_localctx).statement = statement();
				 statements.add(((ProgramContext)_localctx).statement.expr); 
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 257161437510L) != 0 );
			setState(36);
			match(EOF);
			 ((ProgramContext)_localctx).expr =  new Block (
			                            statements
			                        );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr expr;
		public AssignmentContext assignment;
		public PrintContext print;
		public IfelseContext ifelse;
		public FuncDeclareContext funcDeclare;
		public ForLoopContext forLoop;
		public ExpressionContext expression;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(PLParser.SEMICOLUMN, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public FuncDeclareContext funcDeclare() {
			return getRuleContext(FuncDeclareContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((StatementContext)_localctx).assignment = assignment();
				setState(40);
				match(SEMICOLUMN);
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).assignment.expr; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 List <Expr> output = new ArrayList<Expr>(); 
				setState(44);
				((StatementContext)_localctx).print = print();
				setState(45);
				match(SEMICOLUMN);
				 output.add(((StatementContext)_localctx).print.expr); 
				 ((StatementContext)_localctx).expr =  new Output(output); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((StatementContext)_localctx).ifelse = ifelse();
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).ifelse.expr; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				((StatementContext)_localctx).funcDeclare = funcDeclare();
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).funcDeclare.expr; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				((StatementContext)_localctx).forLoop = forLoop();
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).forLoop.expr; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).expr =  ((StatementContext)_localctx).expression.value; 
				setState(60);
				match(SEMICOLUMN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public Expr expr;
		public Token WORD;
		public Token NUMBER;
		public FuncBodyContext funcBody;
		public TerminalNode WORD() { return getToken(PLParser.WORD, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PLParser.NUMBER, i);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			match(T__1);
			setState(66);
			((ForLoopContext)_localctx).WORD = match(WORD);
			setState(67);
			match(T__2);
			setState(68);
			((ForLoopContext)_localctx).NUMBER = match(NUMBER);
			 String start = (((ForLoopContext)_localctx).NUMBER!=null?((ForLoopContext)_localctx).NUMBER.getText():null); 
			setState(70);
			match(T__3);
			setState(71);
			((ForLoopContext)_localctx).NUMBER = match(NUMBER);
			setState(72);
			match(T__4);
			setState(73);
			((ForLoopContext)_localctx).funcBody = funcBody();
			 ((ForLoopContext)_localctx).expr =  new ForLoop(
			                        (((ForLoopContext)_localctx).WORD!=null?((ForLoopContext)_localctx).WORD.getText():null),
			                        new IntLiteral(start),
			                        new IntLiteral((((ForLoopContext)_localctx).NUMBER!=null?((ForLoopContext)_localctx).NUMBER.getText():null)),
			                        ((ForLoopContext)_localctx).funcBody.body
			                        ); 
			        
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfelseContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext expression;
		public FuncBodyContext if_;
		public FuncBodyContext funcBody;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FuncBodyContext> funcBody() {
			return getRuleContexts(FuncBodyContext.class);
		}
		public FuncBodyContext funcBody(int i) {
			return getRuleContext(FuncBodyContext.class,i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);
			setState(77);
			((IfelseContext)_localctx).expression = expression(0);
			setState(78);
			match(T__4);
			setState(79);
			((IfelseContext)_localctx).if_ = ((IfelseContext)_localctx).funcBody = funcBody();
			Expr ifBody = ((IfelseContext)_localctx).funcBody.body;
			setState(81);
			match(T__6);
			setState(82);
			((IfelseContext)_localctx).funcBody = funcBody();
			 ((IfelseContext)_localctx).expr =  new Ifelse(
			                            ((IfelseContext)_localctx).expression.value,
			                            ifBody,
			                            ((IfelseContext)_localctx).funcBody.body
			                            );
			        
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclareContext extends ParserRuleContext {
		public Expr expr;
		public Token funcName;
		public DeclareParameterNameContext declareParameterName;
		public FuncBodyContext funcBody;
		public DeclareParameterNameContext declareParameterName() {
			return getRuleContext(DeclareParameterNameContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode WORD() { return getToken(PLParser.WORD, 0); }
		public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclare; }
	}

	public final FuncDeclareContext funcDeclare() throws RecognitionException {
		FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			((FuncDeclareContext)_localctx).funcName = match(WORD);
			setState(87);
			((FuncDeclareContext)_localctx).declareParameterName = declareParameterName();
			setState(88);
			((FuncDeclareContext)_localctx).funcBody = funcBody();
			((FuncDeclareContext)_localctx).expr =  new Declare(
			                            (((FuncDeclareContext)_localctx).funcName!=null?((FuncDeclareContext)_localctx).funcName.getText():null),
			                            ((FuncDeclareContext)_localctx).declareParameterName.parameters,
			                            ((FuncDeclareContext)_localctx).funcBody.body
			                            );
			        
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvokeContext extends ParserRuleContext {
		public Expr expr;
		public Token funcName;
		public DeclareParametersContext declareParameters;
		public DeclareParametersContext declareParameters() {
			return getRuleContext(DeclareParametersContext.class,0);
		}
		public TerminalNode WORD() { return getToken(PLParser.WORD, 0); }
		public FuncInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoke; }
	}

	public final FuncInvokeContext funcInvoke() throws RecognitionException {
		FuncInvokeContext _localctx = new FuncInvokeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((FuncInvokeContext)_localctx).funcName = match(WORD);
			setState(92);
			((FuncInvokeContext)_localctx).declareParameters = declareParameters();
			 ((FuncInvokeContext)_localctx).expr =  new Invoke( (((FuncInvokeContext)_localctx).funcName!=null?((FuncInvokeContext)_localctx).funcName.getText():null), ((FuncInvokeContext)_localctx).declareParameters.arguements); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyContext extends ParserRuleContext {
		public Expr body;
		public StatementContext statement;
		public ExpressionContext expression;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <Expr> functionBody = new ArrayList<Expr>(); 
			setState(96);
			match(T__8);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(97);
					((FuncBodyContext)_localctx).statement = statement();
					 functionBody.add(((FuncBodyContext)_localctx).statement.expr); 
					}
					break;
				case 2:
					{
					setState(100);
					((FuncBodyContext)_localctx).expression = expression(0);
					 functionBody.add(((FuncBodyContext)_localctx).expression.value); 
					}
					break;
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 257161437510L) != 0 );
			setState(107);
			match(T__9);
			 ((FuncBodyContext)_localctx).body =  new Block(functionBody); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareParameterNameContext extends ParserRuleContext {
		public List<String> parameters;
		public Token WORD;
		public List<TerminalNode> WORD() { return getTokens(PLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PLParser.WORD, i);
		}
		public DeclareParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareParameterName; }
	}

	public final DeclareParameterNameContext declareParameterName() throws RecognitionException {
		DeclareParameterNameContext _localctx = new DeclareParameterNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareParameterName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <String> parameter = new ArrayList<String>(); 
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(111);
				match(T__1);
				setState(112);
				((DeclareParameterNameContext)_localctx).WORD = match(WORD);
				 parameter.add((((DeclareParameterNameContext)_localctx).WORD!=null?((DeclareParameterNameContext)_localctx).WORD.getText():null)); 
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(114);
					match(T__10);
					setState(115);
					((DeclareParameterNameContext)_localctx).WORD = match(WORD);
					 parameter.add((((DeclareParameterNameContext)_localctx).WORD!=null?((DeclareParameterNameContext)_localctx).WORD.getText():null)); 
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__4);
				}
				break;
			case T__11:
				{
				setState(123);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((DeclareParameterNameContext)_localctx).parameters =  parameter; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareParametersContext extends ParserRuleContext {
		public List<Expr> arguements;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclareParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareParameters; }
	}

	public final DeclareParametersContext declareParameters() throws RecognitionException {
		DeclareParametersContext _localctx = new DeclareParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declareParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <Expr> arguement = new ArrayList<Expr>(); 
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(129);
				match(T__1);
				setState(130);
				((DeclareParametersContext)_localctx).expression = expression(0);
				 arguement.add(((DeclareParametersContext)_localctx).expression.value); 
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(132);
					match(T__10);
					setState(133);
					((DeclareParametersContext)_localctx).expression = expression(0);
					 arguement.add(((DeclareParametersContext)_localctx).expression.value); 
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__4);
				}
				break;
			case T__11:
				{
				setState(143);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((DeclareParametersContext)_localctx).arguements =  arguement; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Expr expr;
		public Token WORD;
		public ExpressionContext expression;
		public Token name;
		public ExpressionContext ind;
		public ExpressionContext val;
		public ExpressionContext index;
		public Token toggle;
		public TerminalNode WORD() { return getToken(PLParser.WORD, 0); }
		public TerminalNode EQUAL() { return getToken(PLParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((AssignmentContext)_localctx).WORD = match(WORD);
				setState(149);
				match(EQUAL);
				setState(150);
				((AssignmentContext)_localctx).expression = expression(0);
				 ((AssignmentContext)_localctx).expr =  new Assign((((AssignmentContext)_localctx).WORD!=null?((AssignmentContext)_localctx).WORD.getText():null), ((AssignmentContext)_localctx).expression.value); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((AssignmentContext)_localctx).name = match(WORD);
				setState(154);
				match(T__12);
				setState(155);
				((AssignmentContext)_localctx).ind = expression(0);
				setState(156);
				match(T__13);
				setState(157);
				((AssignmentContext)_localctx).val = expression(0);
				 ((AssignmentContext)_localctx).expr =  new ReassignList(((AssignmentContext)_localctx).ind.value, (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null), ((AssignmentContext)_localctx).val.value); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 String front = ""; 
				setState(161);
				((AssignmentContext)_localctx).name = match(WORD);
				setState(162);
				match(T__14);
				setState(163);
				((AssignmentContext)_localctx).val = expression(0);
				setState(164);
				match(T__10);
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__12:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case NUMBER:
				case WORDQUOTE:
				case WORD:
					{
					setState(165);
					((AssignmentContext)_localctx).index = expression(0);
					}
					break;
				case T__15:
					{
					setState(166);
					((AssignmentContext)_localctx).toggle = match(T__15);
					 front = (((AssignmentContext)_localctx).toggle!=null?((AssignmentContext)_localctx).toggle.getText():null); 
					}
					break;
				case T__16:
					{
					setState(168);
					((AssignmentContext)_localctx).toggle = match(T__16);
					 front = (((AssignmentContext)_localctx).toggle!=null?((AssignmentContext)_localctx).toggle.getText():null); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172);
				match(T__4);
				 
				            if(front == ""){
				                ((AssignmentContext)_localctx).expr =  new ListAddAt(((AssignmentContext)_localctx).index.value, (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null), ((AssignmentContext)_localctx).val.value);
				            }
				            else if (front.equals("front")){
				                ((AssignmentContext)_localctx).expr =  new ListAddFrontBack(TRUEBOOLEAN, (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null), ((AssignmentContext)_localctx).val.value);
				            }
				            else{
				                ((AssignmentContext)_localctx).expr =  new ListAddFrontBack(FALSEBOOLEAN, (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null), ((AssignmentContext)_localctx).val.value);
				            }
				        
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__17);
			setState(178);
			((PrintContext)_localctx).expression = expression(0);
			setState(179);
			match(T__4);
			 ((PrintContext)_localctx).expr =  ((PrintContext)_localctx).expression.value; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expr value;
		public ExpressionContext x;
		public ExpressionContext expression;
		public Token listName;
		public Token funcName;
		public DeclareParametersContext declareParameters;
		public ListStringContext listString;
		public ListIntContext listInt;
		public Token WORD;
		public FuncInvokeContext funcInvoke;
		public Token NUMBER;
		public Token WORDQUOTE;
		public ExpressionContext y;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclareParametersContext declareParameters() {
			return getRuleContext(DeclareParametersContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(PLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PLParser.WORD, i);
		}
		public ListStringContext listString() {
			return getRuleContext(ListStringContext.class,0);
		}
		public ListIntContext listInt() {
			return getRuleContext(ListIntContext.class,0);
		}
		public FuncInvokeContext funcInvoke() {
			return getRuleContext(FuncInvokeContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PLParser.NUMBER, 0); }
		public TerminalNode WORDQUOTE() { return getToken(PLParser.WORDQUOTE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(183);
				match(T__1);
				setState(184);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(185);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).expression.value; 
				}
				break;
			case 2:
				{
				setState(188);
				((ExpressionContext)_localctx).listName = match(WORD);
				setState(189);
				match(T__27);
				setState(190);
				((ExpressionContext)_localctx).funcName = match(WORD);
				setState(191);
				((ExpressionContext)_localctx).declareParameters = declareParameters();
				setState(192);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  new MapList((((ExpressionContext)_localctx).funcName!=null?((ExpressionContext)_localctx).funcName.getText():null), (((ExpressionContext)_localctx).listName!=null?((ExpressionContext)_localctx).listName.getText():null), ((ExpressionContext)_localctx).declareParameters.arguements); 
				}
				break;
			case 3:
				{
				setState(195);
				match(T__28);
				setState(196);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(197);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  new MaxList(((ExpressionContext)_localctx).expression.value); 
				}
				break;
			case 4:
				{
				setState(200);
				match(T__29);
				setState(201);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(202);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  new MinList(((ExpressionContext)_localctx).expression.value); 
				}
				break;
			case 5:
				{
				setState(205);
				match(T__30);
				setState(206);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(207);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  new SumList(((ExpressionContext)_localctx).expression.value); 
				}
				break;
			case 6:
				{
				setState(210);
				match(T__31);
				setState(211);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(212);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  new AverageList(((ExpressionContext)_localctx).expression.value); 
				}
				break;
			case 7:
				{
				setState(215);
				match(T__32);
				setState(216);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(217);
				match(T__4);
				 ((ExpressionContext)_localctx).value =  new CountList(((ExpressionContext)_localctx).expression.value); 
				}
				break;
			case 8:
				{
				setState(220);
				((ExpressionContext)_localctx).listString = listString();
				 ((ExpressionContext)_localctx).value =  new ListStringLiteral(((ExpressionContext)_localctx).listString.group); 
				}
				break;
			case 9:
				{
				setState(223);
				((ExpressionContext)_localctx).listInt = listInt();
				 ((ExpressionContext)_localctx).value =  new ListIntLiteral(((ExpressionContext)_localctx).listInt.group); 
				}
				break;
			case 10:
				{
				setState(226);
				((ExpressionContext)_localctx).WORD = match(WORD);
				setState(227);
				match(T__12);
				setState(228);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(229);
				match(T__33);
				 ((ExpressionContext)_localctx).value =  new DerefList((((ExpressionContext)_localctx).WORD!=null?((ExpressionContext)_localctx).WORD.getText():null), (((ExpressionContext)_localctx).expression.value)); 
				}
				break;
			case 11:
				{
				setState(232);
				((ExpressionContext)_localctx).funcInvoke = funcInvoke();
				 ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).funcInvoke.expr; 
				}
				break;
			case 12:
				{
				setState(235);
				((ExpressionContext)_localctx).NUMBER = match(NUMBER);
				 ((ExpressionContext)_localctx).value =  new IntLiteral((((ExpressionContext)_localctx).NUMBER!=null?((ExpressionContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case 13:
				{
				setState(237);
				((ExpressionContext)_localctx).WORD = match(WORD);
				 ((ExpressionContext)_localctx).value =  new Deref((((ExpressionContext)_localctx).WORD!=null?((ExpressionContext)_localctx).WORD.getText():null)); 
				}
				break;
			case 14:
				{
				setState(239);
				((ExpressionContext)_localctx).WORDQUOTE = match(WORDQUOTE);
				 ((ExpressionContext)_localctx).value =  new StringLiteral(removeQuotes((((ExpressionContext)_localctx).WORDQUOTE!=null?((ExpressionContext)_localctx).WORDQUOTE.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(244);
						match(T__18);
						setState(245);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(22);
						 ((ExpressionContext)_localctx).value =  new Arith(
						                                                                      Operator.ADD,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                    );
						                                                 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(249);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(21);
						 ((ExpressionContext)_localctx).value =  new Arith(
						                                                                      Operator.SUB,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                    );
						                                                 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(254);
						match(T__21);
						setState(255);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(20);
						 ((ExpressionContext)_localctx).value =  new Arith(
						                                                                      Operator.MUL,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                    );
						                                                 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(259);
						match(T__22);
						setState(260);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(19);
						 ((ExpressionContext)_localctx).value =  new Arith(
						                                                                      Operator.DIV,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                    );
						                                                 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(264);
						match(T__23);
						setState(265);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(18);
						 ((ExpressionContext)_localctx).value =  new Arith(
						                                                                      Operator.ADD,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                    );
						                                                 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(269);
						match(T__24);
						setState(270);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(17);
						 ((ExpressionContext)_localctx).value =  new Cmp(
						                                                                      CmpOperators.GT,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                  );
						                                                  
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(274);
						match(T__25);
						setState(275);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(16);
						 ((ExpressionContext)_localctx).value =  new Cmp(
						                                                                      CmpOperators.EQ,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                  );
						                                                  
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(279);
						match(T__26);
						setState(280);
						((ExpressionContext)_localctx).y = ((ExpressionContext)_localctx).expression = expression(15);
						 ((ExpressionContext)_localctx).value =  new Cmp(
						                                                                      CmpOperators.LT,
						                                                                      ((ExpressionContext)_localctx).x.value,
						                                                                      ((ExpressionContext)_localctx).y.value
						                                                                  );
						                                                  
						}
						break;
					}
					} 
				}
				setState(287);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListStringContext extends ParserRuleContext {
		public List<String> group;
		public Token WORDQUOTE;
		public List<TerminalNode> WORDQUOTE() { return getTokens(PLParser.WORDQUOTE); }
		public TerminalNode WORDQUOTE(int i) {
			return getToken(PLParser.WORDQUOTE, i);
		}
		public ListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listString; }
	}

	public final ListStringContext listString() throws RecognitionException {
		ListStringContext _localctx = new ListStringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <String> arrayList = new ArrayList<String>(); 
			setState(289);
			match(T__12);
			setState(290);
			((ListStringContext)_localctx).WORDQUOTE = match(WORDQUOTE);
			 arrayList.add(removeQuotes((((ListStringContext)_localctx).WORDQUOTE!=null?((ListStringContext)_localctx).WORDQUOTE.getText():null))); 
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(292);
				match(T__10);
				setState(293);
				((ListStringContext)_localctx).WORDQUOTE = match(WORDQUOTE);
				 arrayList.add(removeQuotes((((ListStringContext)_localctx).WORDQUOTE!=null?((ListStringContext)_localctx).WORDQUOTE.getText():null))); 
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			match(T__33);
			 ((ListStringContext)_localctx).group =  arrayList; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListIntContext extends ParserRuleContext {
		public List<Integer> group;
		public Token NUMBER;
		public List<TerminalNode> NUMBER() { return getTokens(PLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PLParser.NUMBER, i);
		}
		public ListIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInt; }
	}

	public final ListIntContext listInt() throws RecognitionException {
		ListIntContext _localctx = new ListIntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List <Integer> arrayList = new ArrayList<Integer>(); 
			setState(304);
			match(T__12);
			setState(305);
			((ListIntContext)_localctx).NUMBER = match(NUMBER);
			 arrayList.add(toInt((((ListIntContext)_localctx).NUMBER!=null?((ListIntContext)_localctx).NUMBER.getText():null))); 
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(307);
				match(T__10);
				setState(308);
				((ListIntContext)_localctx).NUMBER = match(NUMBER);
				 arrayList.add(toInt((((ListIntContext)_localctx).NUMBER!=null?((ListIntContext)_localctx).NUMBER.getText():null))); 
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(T__33);
			 ((ListIntContext)_localctx).group =  arrayList; 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006h\b"+
		"\u0006\u000b\u0006\f\u0006i\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007v\b\u0007\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007}\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0089\b\b\n\b\f\b\u008c"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u0091\b\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ab\b\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00b0\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f2\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u011c\b\u000b\n"+
		"\u000b\f\u000b\u011f\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0128\b\f\n\f\f\f\u012b\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0137"+
		"\b\r\n\r\f\r\u013a\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0016"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0001\u0001\u0000\u0014\u0015\u0157\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n[\u0001\u0000"+
		"\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000"+
		"\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000\u0000"+
		"\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00f1\u0001\u0000\u0000\u0000"+
		"\u0018\u0120\u0001\u0000\u0000\u0000\u001a\u012f\u0001\u0000\u0000\u0000"+
		"\u001c \u0006\u0000\uffff\uffff\u0000\u001d\u001e\u0003\u0002\u0001\u0000"+
		"\u001e\u001f\u0006\u0000\uffff\uffff\u0000\u001f!\u0001\u0000\u0000\u0000"+
		" \u001d\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0000\u0000\u0001%&\u0006\u0000\uffff\uffff\u0000&\u0001\u0001\u0000"+
		"\u0000\u0000\'(\u0003\u0012\t\u0000()\u0005\'\u0000\u0000)*\u0006\u0001"+
		"\uffff\uffff\u0000*?\u0001\u0000\u0000\u0000+,\u0006\u0001\uffff\uffff"+
		"\u0000,-\u0003\u0014\n\u0000-.\u0005\'\u0000\u0000./\u0006\u0001\uffff"+
		"\uffff\u0000/0\u0006\u0001\uffff\uffff\u00000?\u0001\u0000\u0000\u0000"+
		"12\u0003\u0006\u0003\u000023\u0006\u0001\uffff\uffff\u00003?\u0001\u0000"+
		"\u0000\u000045\u0003\b\u0004\u000056\u0006\u0001\uffff\uffff\u00006?\u0001"+
		"\u0000\u0000\u000078\u0003\u0004\u0002\u000089\u0006\u0001\uffff\uffff"+
		"\u00009?\u0001\u0000\u0000\u0000:;\u0003\u0016\u000b\u0000;<\u0006\u0001"+
		"\uffff\uffff\u0000<=\u0005\'\u0000\u0000=?\u0001\u0000\u0000\u0000>\'"+
		"\u0001\u0000\u0000\u0000>+\u0001\u0000\u0000\u0000>1\u0001\u0000\u0000"+
		"\u0000>4\u0001\u0000\u0000\u0000>7\u0001\u0000\u0000\u0000>:\u0001\u0000"+
		"\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0005\u0001\u0000\u0000"+
		"AB\u0005\u0002\u0000\u0000BC\u0005%\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"DE\u0005#\u0000\u0000EF\u0006\u0002\uffff\uffff\u0000FG\u0005\u0004\u0000"+
		"\u0000GH\u0005#\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0003\f\u0006"+
		"\u0000JK\u0006\u0002\uffff\uffff\u0000K\u0005\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0006\u0000\u0000MN\u0003\u0016\u000b\u0000NO\u0005\u0005\u0000"+
		"\u0000OP\u0003\f\u0006\u0000PQ\u0006\u0003\uffff\uffff\u0000QR\u0005\u0007"+
		"\u0000\u0000RS\u0003\f\u0006\u0000ST\u0006\u0003\uffff\uffff\u0000T\u0007"+
		"\u0001\u0000\u0000\u0000UV\u0005\b\u0000\u0000VW\u0005%\u0000\u0000WX"+
		"\u0003\u000e\u0007\u0000XY\u0003\f\u0006\u0000YZ\u0006\u0004\uffff\uffff"+
		"\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005%\u0000\u0000\\]\u0003\u0010"+
		"\b\u0000]^\u0006\u0005\uffff\uffff\u0000^\u000b\u0001\u0000\u0000\u0000"+
		"_`\u0006\u0006\uffff\uffff\u0000`g\u0005\t\u0000\u0000ab\u0003\u0002\u0001"+
		"\u0000bc\u0006\u0006\uffff\uffff\u0000ch\u0001\u0000\u0000\u0000de\u0003"+
		"\u0016\u000b\u0000ef\u0006\u0006\uffff\uffff\u0000fh\u0001\u0000\u0000"+
		"\u0000ga\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0005\n\u0000\u0000lm\u0006\u0006\uffff\uffff\u0000"+
		"m\r\u0001\u0000\u0000\u0000n|\u0006\u0007\uffff\uffff\u0000op\u0005\u0002"+
		"\u0000\u0000pq\u0005%\u0000\u0000qw\u0006\u0007\uffff\uffff\u0000rs\u0005"+
		"\u000b\u0000\u0000st\u0005%\u0000\u0000tv\u0006\u0007\uffff\uffff\u0000"+
		"ur\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z}\u0005\u0005\u0000\u0000{}\u0005\f\u0000\u0000|o\u0001\u0000"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0006\u0007\uffff\uffff\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080"+
		"\u0090\u0006\b\uffff\uffff\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082"+
		"\u0083\u0003\u0016\u000b\u0000\u0083\u008a\u0006\b\uffff\uffff\u0000\u0084"+
		"\u0085\u0005\u000b\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086"+
		"\u0087\u0006\b\uffff\uffff\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088"+
		"\u0084\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005\u0005\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0005\f\u0000\u0000\u0090\u0081\u0001\u0000\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0006\b\uffff\uffff\u0000\u0093\u0011\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005%\u0000\u0000\u0095\u0096\u0005&\u0000\u0000\u0096\u0097\u0003\u0016"+
		"\u000b\u0000\u0097\u0098\u0006\t\uffff\uffff\u0000\u0098\u00b0\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005%\u0000\u0000\u009a\u009b\u0005\r\u0000"+
		"\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u0005\u000e\u0000"+
		"\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e\u009f\u0006\t\uffff\uffff"+
		"\u0000\u009f\u00b0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\t\uffff\uffff"+
		"\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2\u00a3\u0005\u000f\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4\u00aa\u0005\u000b\u0000\u0000"+
		"\u00a5\u00ab\u0003\u0016\u000b\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000"+
		"\u00a7\u00ab\u0006\t\uffff\uffff\u0000\u00a8\u00a9\u0005\u0011\u0000\u0000"+
		"\u00a9\u00ab\u0006\t\uffff\uffff\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0005\u0000\u0000"+
		"\u00ad\u00ae\u0006\t\uffff\uffff\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000"+
		"\u00af\u0094\u0001\u0000\u0000\u0000\u00af\u0099\u0001\u0000\u0000\u0000"+
		"\u00af\u00a0\u0001\u0000\u0000\u0000\u00b0\u0013\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0012\u0000\u0000\u00b2\u00b3\u0003\u0016\u000b\u0000"+
		"\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5\u0006\n\uffff\uffff\u0000"+
		"\u00b5\u0015\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u000b\uffff\uffff"+
		"\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00b9\u0003\u0016\u000b"+
		"\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00bb\u0006\u000b\uffff"+
		"\uffff\u0000\u00bb\u00f2\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005%\u0000"+
		"\u0000\u00bd\u00be\u0005\u001c\u0000\u0000\u00be\u00bf\u0005%\u0000\u0000"+
		"\u00bf\u00c0\u0003\u0010\b\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1"+
		"\u00c2\u0006\u000b\uffff\uffff\u0000\u00c2\u00f2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\u001d\u0000\u0000\u00c4\u00c5\u0003\u0016\u000b\u0000"+
		"\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00c7\u0006\u000b\uffff\uffff"+
		"\u0000\u00c7\u00f2\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001e\u0000"+
		"\u0000\u00c9\u00ca\u0003\u0016\u000b\u0000\u00ca\u00cb\u0005\u0005\u0000"+
		"\u0000\u00cb\u00cc\u0006\u000b\uffff\uffff\u0000\u00cc\u00f2\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005\u001f\u0000\u0000\u00ce\u00cf\u0003\u0016"+
		"\u000b\u0000\u00cf\u00d0\u0005\u0005\u0000\u0000\u00d0\u00d1\u0006\u000b"+
		"\uffff\uffff\u0000\u00d1\u00f2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		" \u0000\u0000\u00d3\u00d4\u0003\u0016\u000b\u0000\u00d4\u00d5\u0005\u0005"+
		"\u0000\u0000\u00d5\u00d6\u0006\u000b\uffff\uffff\u0000\u00d6\u00f2\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000\u00d8\u00d9\u0003\u0016"+
		"\u000b\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da\u00db\u0006\u000b"+
		"\uffff\uffff\u0000\u00db\u00f2\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003"+
		"\u0018\f\u0000\u00dd\u00de\u0006\u000b\uffff\uffff\u0000\u00de\u00f2\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0003\u001a\r\u0000\u00e0\u00e1\u0006\u000b"+
		"\uffff\uffff\u0000\u00e1\u00f2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"%\u0000\u0000\u00e3\u00e4\u0005\r\u0000\u0000\u00e4\u00e5\u0003\u0016"+
		"\u000b\u0000\u00e5\u00e6\u0005\"\u0000\u0000\u00e6\u00e7\u0006\u000b\uffff"+
		"\uffff\u0000\u00e7\u00f2\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\n\u0005"+
		"\u0000\u00e9\u00ea\u0006\u000b\uffff\uffff\u0000\u00ea\u00f2\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005#\u0000\u0000\u00ec\u00f2\u0006\u000b\uffff"+
		"\uffff\u0000\u00ed\u00ee\u0005%\u0000\u0000\u00ee\u00f2\u0006\u000b\uffff"+
		"\uffff\u0000\u00ef\u00f0\u0005$\u0000\u0000\u00f0\u00f2\u0006\u000b\uffff"+
		"\uffff\u0000\u00f1\u00b6\u0001\u0000\u0000\u0000\u00f1\u00bc\u0001\u0000"+
		"\u0000\u0000\u00f1\u00c3\u0001\u0000\u0000\u0000\u00f1\u00c8\u0001\u0000"+
		"\u0000\u0000\u00f1\u00cd\u0001\u0000\u0000\u0000\u00f1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00d7\u0001\u0000\u0000\u0000\u00f1\u00dc\u0001\u0000"+
		"\u0000\u0000\u00f1\u00df\u0001\u0000\u0000\u0000\u00f1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u011d\u0001\u0000\u0000\u0000\u00f3\u00f4\n\u0015\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0013\u0000\u0000\u00f5\u00f6\u0003\u0016\u000b"+
		"\u0016\u00f6\u00f7\u0006\u000b\uffff\uffff\u0000\u00f7\u011c\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\n\u0014\u0000\u0000\u00f9\u00fa\u0007\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0003\u0016\u000b\u0015\u00fb\u00fc\u0006\u000b\uffff"+
		"\uffff\u0000\u00fc\u011c\u0001\u0000\u0000\u0000\u00fd\u00fe\n\u0013\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0016\u0000\u0000\u00ff\u0100\u0003\u0016\u000b"+
		"\u0014\u0100\u0101\u0006\u000b\uffff\uffff\u0000\u0101\u011c\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\n\u0012\u0000\u0000\u0103\u0104\u0005\u0017\u0000"+
		"\u0000\u0104\u0105\u0003\u0016\u000b\u0013\u0105\u0106\u0006\u000b\uffff"+
		"\uffff\u0000\u0106\u011c\u0001\u0000\u0000\u0000\u0107\u0108\n\u0011\u0000"+
		"\u0000\u0108\u0109\u0005\u0018\u0000\u0000\u0109\u010a\u0003\u0016\u000b"+
		"\u0012\u010a\u010b\u0006\u000b\uffff\uffff\u0000\u010b\u011c\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\n\u0010\u0000\u0000\u010d\u010e\u0005\u0019\u0000"+
		"\u0000\u010e\u010f\u0003\u0016\u000b\u0011\u010f\u0110\u0006\u000b\uffff"+
		"\uffff\u0000\u0110\u011c\u0001\u0000\u0000\u0000\u0111\u0112\n\u000f\u0000"+
		"\u0000\u0112\u0113\u0005\u001a\u0000\u0000\u0113\u0114\u0003\u0016\u000b"+
		"\u0010\u0114\u0115\u0006\u000b\uffff\uffff\u0000\u0115\u011c\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\n\u000e\u0000\u0000\u0117\u0118\u0005\u001b\u0000"+
		"\u0000\u0118\u0119\u0003\u0016\u000b\u000f\u0119\u011a\u0006\u000b\uffff"+
		"\uffff\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u00f3\u0001\u0000"+
		"\u0000\u0000\u011b\u00f8\u0001\u0000\u0000\u0000\u011b\u00fd\u0001\u0000"+
		"\u0000\u0000\u011b\u0102\u0001\u0000\u0000\u0000\u011b\u0107\u0001\u0000"+
		"\u0000\u0000\u011b\u010c\u0001\u0000\u0000\u0000\u011b\u0111\u0001\u0000"+
		"\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0017\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0006\f\uffff\uffff\u0000\u0121\u0122\u0005\r"+
		"\u0000\u0000\u0122\u0123\u0005$\u0000\u0000\u0123\u0129\u0006\f\uffff"+
		"\uffff\u0000\u0124\u0125\u0005\u000b\u0000\u0000\u0125\u0126\u0005$\u0000"+
		"\u0000\u0126\u0128\u0006\f\uffff\uffff\u0000\u0127\u0124\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005\"\u0000\u0000"+
		"\u012d\u012e\u0006\f\uffff\uffff\u0000\u012e\u0019\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0006\r\uffff\uffff\u0000\u0130\u0131\u0005\r\u0000\u0000"+
		"\u0131\u0132\u0005#\u0000\u0000\u0132\u0138\u0006\r\uffff\uffff\u0000"+
		"\u0133\u0134\u0005\u000b\u0000\u0000\u0134\u0135\u0005#\u0000\u0000\u0135"+
		"\u0137\u0006\r\uffff\uffff\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0137"+
		"\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005\"\u0000\u0000\u013c\u013d"+
		"\u0006\r\uffff\uffff\u0000\u013d\u001b\u0001\u0000\u0000\u0000\u000f\""+
		">giw|\u008a\u0090\u00aa\u00af\u00f1\u011b\u011d\u0129\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}