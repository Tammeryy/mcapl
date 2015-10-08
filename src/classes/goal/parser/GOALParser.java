// $ANTLR 3.5.1 /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g 2015-03-13 13:17:59

package goal.parser;

import ail.syntax.ast.*;
import ail.syntax.DefaultAILStructure;
import goal.syntax.ast.*;
import ail.syntax.PredicateIndicator;
import java.util.HashMap;


import mcaplantlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GOALParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIONSPEC", "ADAPTIVE", "ADOPT", 
		"AGOAL", "BAR", "BEL", "BELIEFS", "CLOSE", "COLON", "COMMA", "COMMENT", 
		"CONST", "CURLYCLOSE", "CURLYOPEN", "DEFINE", "DELETE", "DIV", "DO", "DROP", 
		"EQUALS", "EVENT", "EXTERNAL", "GOAL", "GOALA", "GOALS", "HASH", "IF", 
		"INIT", "INSERT", "INTERNAL", "IS", "KNOWLEDGE", "LESS", "LINEAR", "LINEARALL", 
		"LINE_COMMENT", "MAIN", "MINUS", "MODULE", "MODULEFILE", "MULT", "NEWLINE", 
		"NOT", "NUMBER", "OPEN", "ORDER", "PLUS", "POST", "PRE", "PROGRAM", "PROLOGARROW", 
		"RANDOM", "RANDOMALL", "SEMI", "SEND", "SINGLEQUOTE", "SQCLOSE", "SQOPEN", 
		"STOP", "STRING", "THEN", "TRUE", "VAR", "WS", "'#import'", "'->'", "'<-'", 
		"'all'", "'allother'", "'always'", "'exit'", "'exit-module'", "'filter'", 
		"'focus'", "'forall'", "'listall'", "'log'", "'never'", "'new'", "'noaction'", 
		"'nogoals'", "'none'", "'print'", "'select'", "'self'", "'sendonce'", 
		"'some'", "'someother'", "'this'"
	};
	public static final int EOF=-1;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int ACTIONSPEC=4;
	public static final int ADAPTIVE=5;
	public static final int ADOPT=6;
	public static final int AGOAL=7;
	public static final int BAR=8;
	public static final int BEL=9;
	public static final int BELIEFS=10;
	public static final int CLOSE=11;
	public static final int COLON=12;
	public static final int COMMA=13;
	public static final int COMMENT=14;
	public static final int CONST=15;
	public static final int CURLYCLOSE=16;
	public static final int CURLYOPEN=17;
	public static final int DEFINE=18;
	public static final int DELETE=19;
	public static final int DIV=20;
	public static final int DO=21;
	public static final int DROP=22;
	public static final int EQUALS=23;
	public static final int EVENT=24;
	public static final int EXTERNAL=25;
	public static final int GOAL=26;
	public static final int GOALA=27;
	public static final int GOALS=28;
	public static final int HASH=29;
	public static final int IF=30;
	public static final int INIT=31;
	public static final int INSERT=32;
	public static final int INTERNAL=33;
	public static final int IS=34;
	public static final int KNOWLEDGE=35;
	public static final int LESS=36;
	public static final int LINEAR=37;
	public static final int LINEARALL=38;
	public static final int LINE_COMMENT=39;
	public static final int MAIN=40;
	public static final int MINUS=41;
	public static final int MODULE=42;
	public static final int MODULEFILE=43;
	public static final int MULT=44;
	public static final int NEWLINE=45;
	public static final int NOT=46;
	public static final int NUMBER=47;
	public static final int OPEN=48;
	public static final int ORDER=49;
	public static final int PLUS=50;
	public static final int POST=51;
	public static final int PRE=52;
	public static final int PROGRAM=53;
	public static final int PROLOGARROW=54;
	public static final int RANDOM=55;
	public static final int RANDOMALL=56;
	public static final int SEMI=57;
	public static final int SEND=58;
	public static final int SINGLEQUOTE=59;
	public static final int SQCLOSE=60;
	public static final int SQOPEN=61;
	public static final int STOP=62;
	public static final int STRING=63;
	public static final int THEN=64;
	public static final int TRUE=65;
	public static final int VAR=66;
	public static final int WS=67;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GOALParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GOALParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GOALParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g"; }


	private static HashMap<String,Abstract_VarTerm> variables = new HashMap<String,Abstract_VarTerm>();
	private static HashMap<PredicateIndicator,Abstract_MentalState> macros = new HashMap<PredicateIndicator, Abstract_MentalState>();
	private static HashMap<PredicateIndicator,Abstract_Term> macro_subs = new HashMap<PredicateIndicator, Abstract_Term>();
	private String name = "";



	// $ANTLR start "mas"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:53:1: mas returns [Abstract_MAS mas] : MAIN COLON i= id CURLYOPEN ( moduleImport |gm= module )+ CURLYCLOSE ;
	public final Abstract_MAS mas() throws RecognitionException {
		Abstract_MAS mas = null;


		String i =null;
		Abstract_GOALModule gm =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:54:2: ( MAIN COLON i= id CURLYOPEN ( moduleImport |gm= module )+ CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:54:4: MAIN COLON i= id CURLYOPEN ( moduleImport |gm= module )+ CURLYCLOSE
			{
			mas = new Abstract_MAS(); ArrayList<Abstract_GOALAgent> agents = new ArrayList<Abstract_GOALAgent>();
			match(input,MAIN,FOLLOW_MAIN_in_mas74); 
			match(input,COLON,FOLLOW_COLON_in_mas76); 
			pushFollow(FOLLOW_id_in_mas80);
			i=id();
			state._fsp--;

			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_mas82); 
			 Abstract_GOALAgent gl = new Abstract_GOALAgent(i); agents.add(gl);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:57:2: ( moduleImport |gm= module )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==68) ) {
					alt1=1;
				}
				else if ( (LA1_0==EVENT||LA1_0==INIT||LA1_0==MAIN||LA1_0==MODULE) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:57:3: moduleImport
					{
					pushFollow(FOLLOW_moduleImport_in_mas89);
					moduleImport();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:57:18: gm= module
					{
					pushFollow(FOLLOW_module_in_mas95);
					gm=module();
					state._fsp--;

					gl.addModule(gm);
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_mas102); 
			mas.setAgs(agents);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mas;
	}
	// $ANTLR end "mas"



	// $ANTLR start "moduleImport"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:62:1: moduleImport : '#import' MODULEFILE '.' ;
	public final void moduleImport() throws RecognitionException {
		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:63:2: ( '#import' MODULEFILE '.' )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:63:4: '#import' MODULEFILE '.'
			{
			match(input,68,FOLLOW_68_in_moduleImport116); 
			match(input,MODULEFILE,FOLLOW_MODULEFILE_in_moduleImport118); 
			match(input,STOP,FOLLOW_STOP_in_moduleImport120); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "moduleImport"



	// $ANTLR start "module"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:66:1: module returns [Abstract_GOALModule gl] : def= moduleDef ( SQOPEN moduleOption[gl] ( COMMA moduleOption[gl] )* SQCLOSE )? CURLYOPEN ( krImport )? ( knowledge[gl] )? ( beliefs[gl] )? ( goals[gl] )? ( program[gl] )? (as= actionSpecs )? CURLYCLOSE ;
	public final Abstract_GOALModule module() throws RecognitionException {
		Abstract_GOALModule gl = null;


		int def =0;
		ArrayList<Abstract_ActionSpec> as =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:67:2: (def= moduleDef ( SQOPEN moduleOption[gl] ( COMMA moduleOption[gl] )* SQCLOSE )? CURLYOPEN ( krImport )? ( knowledge[gl] )? ( beliefs[gl] )? ( goals[gl] )? ( program[gl] )? (as= actionSpecs )? CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:67:4: def= moduleDef ( SQOPEN moduleOption[gl] ( COMMA moduleOption[gl] )* SQCLOSE )? CURLYOPEN ( krImport )? ( knowledge[gl] )? ( beliefs[gl] )? ( goals[gl] )? ( program[gl] )? (as= actionSpecs )? CURLYCLOSE
			{
			pushFollow(FOLLOW_moduleDef_in_module137);
			def=moduleDef();
			state._fsp--;

			gl = new Abstract_GOALModule(def);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:67:56: ( SQOPEN moduleOption[gl] ( COMMA moduleOption[gl] )* SQCLOSE )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==SQOPEN) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:67:57: SQOPEN moduleOption[gl] ( COMMA moduleOption[gl] )* SQCLOSE
					{
					match(input,SQOPEN,FOLLOW_SQOPEN_in_module142); 
					pushFollow(FOLLOW_moduleOption_in_module144);
					moduleOption(gl);
					state._fsp--;

					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:67:81: ( COMMA moduleOption[gl] )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==COMMA) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:67:82: COMMA moduleOption[gl]
							{
							match(input,COMMA,FOLLOW_COMMA_in_module148); 
							pushFollow(FOLLOW_moduleOption_in_module150);
							moduleOption(gl);
							state._fsp--;

							}
							break;

						default :
							break loop2;
						}
					}

					match(input,SQCLOSE,FOLLOW_SQCLOSE_in_module155); 
					}
					break;

			}

			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_module160); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:12: ( krImport )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==68) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:12: krImport
					{
					pushFollow(FOLLOW_krImport_in_module162);
					krImport();
					state._fsp--;

					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:22: ( knowledge[gl] )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==KNOWLEDGE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:22: knowledge[gl]
					{
					pushFollow(FOLLOW_knowledge_in_module165);
					knowledge(gl);
					state._fsp--;

					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:38: ( beliefs[gl] )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BELIEFS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:38: beliefs[gl]
					{
					pushFollow(FOLLOW_beliefs_in_module170);
					beliefs(gl);
					state._fsp--;

					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:51: ( goals[gl] )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==GOALS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:51: goals[gl]
					{
					pushFollow(FOLLOW_goals_in_module174);
					goals(gl);
					state._fsp--;

					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:62: ( program[gl] )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==PROGRAM) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:68:62: program[gl]
					{
					pushFollow(FOLLOW_program_in_module178);
					program(gl);
					state._fsp--;

					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:69:2: (as= actionSpecs )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ACTIONSPEC) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:69:3: as= actionSpecs
					{
					pushFollow(FOLLOW_actionSpecs_in_module187);
					as=actionSpecs();
					state._fsp--;

					gl.addAllCap(as);
					}
					break;

			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_module195); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return gl;
	}
	// $ANTLR end "module"



	// $ANTLR start "moduleDef"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:73:1: moduleDef returns [int i] : ( MODULE declaration | INIT MODULE | MAIN MODULE | EVENT MODULE );
	public final int moduleDef() throws RecognitionException {
		int i = 0;


		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:74:2: ( MODULE declaration | INIT MODULE | MAIN MODULE | EVENT MODULE )
			int alt10=4;
			switch ( input.LA(1) ) {
			case MODULE:
				{
				alt10=1;
				}
				break;
			case INIT:
				{
				alt10=2;
				}
				break;
			case MAIN:
				{
				alt10=3;
				}
				break;
			case EVENT:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:74:4: MODULE declaration
					{
					match(input,MODULE,FOLLOW_MODULE_in_moduleDef210); 
					pushFollow(FOLLOW_declaration_in_moduleDef212);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:75:4: INIT MODULE
					{
					match(input,INIT,FOLLOW_INIT_in_moduleDef217); 
					match(input,MODULE,FOLLOW_MODULE_in_moduleDef219); 
					i = Abstract_GOALModule.init;
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:76:4: MAIN MODULE
					{
					match(input,MAIN,FOLLOW_MAIN_in_moduleDef226); 
					match(input,MODULE,FOLLOW_MODULE_in_moduleDef228); 
					i = Abstract_GOALModule.main;
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:77:4: EVENT MODULE
					{
					match(input,EVENT,FOLLOW_EVENT_in_moduleDef235); 
					match(input,MODULE,FOLLOW_MODULE_in_moduleDef237); 
					i = Abstract_GOALModule.event;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "moduleDef"



	// $ANTLR start "moduleOption"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:81:1: moduleOption[Abstract_GOALModule gl] : (key= 'exit' '=' value= ( 'always' | 'never' | 'nogoals' | 'noaction' ) |key= 'focus' '=' value= ( 'none' | 'new' | 'select' | 'filter' ) );
	public final void moduleOption(Abstract_GOALModule gl) throws RecognitionException {
		Token key=null;
		Token value=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:82:2: (key= 'exit' '=' value= ( 'always' | 'never' | 'nogoals' | 'noaction' ) |key= 'focus' '=' value= ( 'none' | 'new' | 'select' | 'filter' ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==74) ) {
				alt12=1;
			}
			else if ( (LA12_0==77) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:82:4: key= 'exit' '=' value= ( 'always' | 'never' | 'nogoals' | 'noaction' )
					{
					key=(Token)match(input,74,FOLLOW_74_in_moduleOption256); 
					match(input,EQUALS,FOLLOW_EQUALS_in_moduleOption258); 
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:82:28: ( 'always' | 'never' | 'nogoals' | 'noaction' )
					int alt11=4;
					switch ( input.LA(1) ) {
					case 73:
						{
						alt11=1;
						}
						break;
					case 81:
						{
						alt11=2;
						}
						break;
					case 84:
						{
						alt11=3;
						}
						break;
					case 83:
						{
						alt11=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:82:29: 'always'
							{
							value=(Token)match(input,73,FOLLOW_73_in_moduleOption265); 
							gl.setExitCondition(Abstract_GOALModule.always);
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:83:6: 'never'
							{
							value=(Token)match(input,81,FOLLOW_81_in_moduleOption275); 
							gl.setExitCondition(Abstract_GOALModule.never);
							}
							break;
						case 3 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:84:6: 'nogoals'
							{
							value=(Token)match(input,84,FOLLOW_84_in_moduleOption285); 
							gl.setExitCondition(Abstract_GOALModule.nogoals);
							}
							break;
						case 4 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:85:7: 'noaction'
							{
							value=(Token)match(input,83,FOLLOW_83_in_moduleOption296); 
							gl.setExitCondition(Abstract_GOALModule.noaction);
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:86:4: key= 'focus' '=' value= ( 'none' | 'new' | 'select' | 'filter' )
					{
					key=(Token)match(input,77,FOLLOW_77_in_moduleOption310); 
					match(input,EQUALS,FOLLOW_EQUALS_in_moduleOption312); 
					value=input.LT(1);
					if ( input.LA(1)==76||input.LA(1)==82||input.LA(1)==85||input.LA(1)==87 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "moduleOption"



	// $ANTLR start "krImport"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:89:1: krImport : '#import' ( stringLiteral | singleQuotedStringLiteral ) '.' ;
	public final void krImport() throws RecognitionException {
		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:90:2: ( '#import' ( stringLiteral | singleQuotedStringLiteral ) '.' )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:90:4: '#import' ( stringLiteral | singleQuotedStringLiteral ) '.'
			{
			match(input,68,FOLLOW_68_in_krImport343); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:90:14: ( stringLiteral | singleQuotedStringLiteral )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==STRING) ) {
				alt13=1;
			}
			else if ( (LA13_0==SINGLEQUOTE) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:90:15: stringLiteral
					{
					pushFollow(FOLLOW_stringLiteral_in_krImport346);
					stringLiteral();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:90:31: singleQuotedStringLiteral
					{
					pushFollow(FOLLOW_singleQuotedStringLiteral_in_krImport350);
					singleQuotedStringLiteral();
					state._fsp--;

					}
					break;

			}

			match(input,STOP,FOLLOW_STOP_in_krImport353); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "krImport"



	// $ANTLR start "knowledge"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:93:1: knowledge[Abstract_GOALModule gl] : KNOWLEDGE CURLYOPEN krspec[gl] CURLYCLOSE ;
	public final void knowledge(Abstract_GOALModule gl) throws RecognitionException {
		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:94:2: ( KNOWLEDGE CURLYOPEN krspec[gl] CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:94:4: KNOWLEDGE CURLYOPEN krspec[gl] CURLYCLOSE
			{
			match(input,KNOWLEDGE,FOLLOW_KNOWLEDGE_in_knowledge366); 
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_knowledge368); 
			pushFollow(FOLLOW_krspec_in_knowledge370);
			krspec(gl);
			state._fsp--;

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_knowledge373); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "knowledge"



	// $ANTLR start "krspec"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:97:1: krspec[Abstract_GOALModule gl] : (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+ ;
	public final void krspec(Abstract_GOALModule gl) throws RecognitionException {
		Abstract_LogicalFormula hd =null;
		ArrayList<Abstract_LogicalFormula> body =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:97:31: ( (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+ )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:97:33: (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:97:33: (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==CONST||LA15_0==MINUS||LA15_0==NUMBER||LA15_0==VAR) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:97:34: hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP )
					{
					pushFollow(FOLLOW_atom_in_krspec385);
					hd=atom();
					state._fsp--;

					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:98:2: ( STOP | PROLOGARROW body= no_bracket_literals STOP )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==STOP) ) {
						alt14=1;
					}
					else if ( (LA14_0==PROLOGARROW) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:98:3: STOP
							{
							match(input,STOP,FOLLOW_STOP_in_krspec389); 
							gl.addFact((Abstract_Predicate) hd);
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:99:2: PROLOGARROW body= no_bracket_literals STOP
							{
							match(input,PROLOGARROW,FOLLOW_PROLOGARROW_in_krspec396); 
							pushFollow(FOLLOW_no_bracket_literals_in_krspec400);
							body=no_bracket_literals();
							state._fsp--;

							match(input,STOP,FOLLOW_STOP_in_krspec402); 
							gl.addKRule(new Abstract_Rule((Abstract_Predicate) hd, body));
							}
							break;

					}

					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "krspec"



	// $ANTLR start "beliefs"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:101:1: beliefs[Abstract_GOALModule gl] : BELIEFS CURLYOPEN brspec[gl] CURLYCLOSE ;
	public final void beliefs(Abstract_GOALModule gl) throws RecognitionException {
		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:102:2: ( BELIEFS CURLYOPEN brspec[gl] CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:102:4: BELIEFS CURLYOPEN brspec[gl] CURLYCLOSE
			{
			match(input,BELIEFS,FOLLOW_BELIEFS_in_beliefs418); 
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_beliefs420); 
			pushFollow(FOLLOW_brspec_in_beliefs422);
			brspec(gl);
			state._fsp--;

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_beliefs425); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "beliefs"



	// $ANTLR start "brspec"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:105:1: brspec[Abstract_GOALModule gl] : (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+ ;
	public final void brspec(Abstract_GOALModule gl) throws RecognitionException {
		Abstract_LogicalFormula hd =null;
		ArrayList<Abstract_LogicalFormula> body =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:105:31: ( (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+ )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:105:33: (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:105:33: (hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP ) )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==CONST||LA17_0==MINUS||LA17_0==NUMBER||LA17_0==VAR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:105:34: hd= atom ( STOP | PROLOGARROW body= no_bracket_literals STOP )
					{
					pushFollow(FOLLOW_atom_in_brspec437);
					hd=atom();
					state._fsp--;

					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:106:2: ( STOP | PROLOGARROW body= no_bracket_literals STOP )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==STOP) ) {
						alt16=1;
					}
					else if ( (LA16_0==PROLOGARROW) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:106:3: STOP
							{
							match(input,STOP,FOLLOW_STOP_in_brspec441); 
							gl.addBel((Abstract_Predicate) hd);
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:107:2: PROLOGARROW body= no_bracket_literals STOP
							{
							match(input,PROLOGARROW,FOLLOW_PROLOGARROW_in_brspec448); 
							pushFollow(FOLLOW_no_bracket_literals_in_brspec452);
							body=no_bracket_literals();
							state._fsp--;

							match(input,STOP,FOLLOW_STOP_in_brspec454); 
							gl.addRule(new Abstract_Rule((Abstract_Predicate) hd, body));
							}
							break;

					}

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "brspec"



	// $ANTLR start "goals"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:110:1: goals[Abstract_GOALModule gl] : GOALS CURLYOPEN le= goal_list CURLYCLOSE ;
	public final void goals(Abstract_GOALModule gl) throws RecognitionException {
		ArrayList<Abstract_Term> le =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:111:2: ( GOALS CURLYOPEN le= goal_list CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:111:4: GOALS CURLYOPEN le= goal_list CURLYCLOSE
			{
			match(input,GOALS,FOLLOW_GOALS_in_goals471); 
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_goals473); 
			pushFollow(FOLLOW_goal_list_in_goals477);
			le=goal_list();
			state._fsp--;

			gl.addGoal(le);
			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_goals481); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "goals"



	// $ANTLR start "atom"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:113:1: atom returns [Abstract_LogicalFormula l] : (p= declarationOrCallWithTerms |e= equation );
	public final Abstract_LogicalFormula atom() throws RecognitionException {
		Abstract_LogicalFormula l = null;


		Abstract_Predicate p =null;
		Abstract_Equation e =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:114:2: (p= declarationOrCallWithTerms |e= equation )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==CONST) ) {
				alt18=1;
			}
			else if ( (LA18_0==MINUS||LA18_0==NUMBER||LA18_0==VAR) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:114:4: p= declarationOrCallWithTerms
					{
					pushFollow(FOLLOW_declarationOrCallWithTerms_in_atom497);
					p=declarationOrCallWithTerms();
					state._fsp--;

					l =p;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:115:4: e= equation
					{
					pushFollow(FOLLOW_equation_in_atom506);
					e=equation();
					state._fsp--;

					l = e;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return l;
	}
	// $ANTLR end "atom"



	// $ANTLR start "program"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:119:1: program[Abstract_GOALModule gl] : PROGRAM ( SQOPEN i= ruleEvaluationOrder SQCLOSE )? CURLYOPEN ( macroDef )* ( programRule[gl] )* CURLYCLOSE ;
	public final void program(Abstract_GOALModule gl) throws RecognitionException {
		int i =0;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:120:2: ( PROGRAM ( SQOPEN i= ruleEvaluationOrder SQCLOSE )? CURLYOPEN ( macroDef )* ( programRule[gl] )* CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:120:4: PROGRAM ( SQOPEN i= ruleEvaluationOrder SQCLOSE )? CURLYOPEN ( macroDef )* ( programRule[gl] )* CURLYCLOSE
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program521); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:120:12: ( SQOPEN i= ruleEvaluationOrder SQCLOSE )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==SQOPEN) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:120:13: SQOPEN i= ruleEvaluationOrder SQCLOSE
					{
					match(input,SQOPEN,FOLLOW_SQOPEN_in_program524); 
					pushFollow(FOLLOW_ruleEvaluationOrder_in_program528);
					i=ruleEvaluationOrder();
					state._fsp--;

					gl.setOptionOrder(i);
					match(input,SQCLOSE,FOLLOW_SQCLOSE_in_program532); 
					}
					break;

			}

			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_program538); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:121:12: ( macroDef )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==HASH) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:121:12: macroDef
					{
					pushFollow(FOLLOW_macroDef_in_program540);
					macroDef();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:121:22: ( programRule[gl] )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==IF||(LA21_0 >= 78 && LA21_0 <= 79)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:121:22: programRule[gl]
					{
					pushFollow(FOLLOW_programRule_in_program543);
					programRule(gl);
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_program547); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "ruleEvaluationOrder"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:125:1: ruleEvaluationOrder returns [int i] : SQOPEN ORDER EQUALS ( LINEAR | LINEARALL | RANDOM | RANDOMALL | ADAPTIVE ) SQCLOSE ;
	public final int ruleEvaluationOrder() throws RecognitionException {
		int i = 0;


		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:126:2: ( SQOPEN ORDER EQUALS ( LINEAR | LINEARALL | RANDOM | RANDOMALL | ADAPTIVE ) SQCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:126:4: SQOPEN ORDER EQUALS ( LINEAR | LINEARALL | RANDOM | RANDOMALL | ADAPTIVE ) SQCLOSE
			{
			match(input,SQOPEN,FOLLOW_SQOPEN_in_ruleEvaluationOrder564); 
			match(input,ORDER,FOLLOW_ORDER_in_ruleEvaluationOrder566); 
			match(input,EQUALS,FOLLOW_EQUALS_in_ruleEvaluationOrder568); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:126:24: ( LINEAR | LINEARALL | RANDOM | RANDOMALL | ADAPTIVE )
			int alt22=5;
			switch ( input.LA(1) ) {
			case LINEAR:
				{
				alt22=1;
				}
				break;
			case LINEARALL:
				{
				alt22=2;
				}
				break;
			case RANDOM:
				{
				alt22=3;
				}
				break;
			case RANDOMALL:
				{
				alt22=4;
				}
				break;
			case ADAPTIVE:
				{
				alt22=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:126:26: LINEAR
					{
					match(input,LINEAR,FOLLOW_LINEAR_in_ruleEvaluationOrder572); 
					i =Abstract_GOALModule.linear;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:127:2: LINEARALL
					{
					match(input,LINEARALL,FOLLOW_LINEARALL_in_ruleEvaluationOrder579); 
					i =Abstract_GOALModule.linearall;
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:128:2: RANDOM
					{
					match(input,RANDOM,FOLLOW_RANDOM_in_ruleEvaluationOrder585); 
					i =Abstract_GOALModule.random;
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:129:2: RANDOMALL
					{
					match(input,RANDOMALL,FOLLOW_RANDOMALL_in_ruleEvaluationOrder591); 
					i =Abstract_GOALModule.randomall;
					}
					break;
				case 5 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:130:2: ADAPTIVE
					{
					match(input,ADAPTIVE,FOLLOW_ADAPTIVE_in_ruleEvaluationOrder598); 
					i = Abstract_GOALModule.adaptive;
					}
					break;

			}

			match(input,SQCLOSE,FOLLOW_SQCLOSE_in_ruleEvaluationOrder604); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "ruleEvaluationOrder"



	// $ANTLR start "macroDef"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:133:1: macroDef : HASH DEFINE p= declarationOrCallWithTerms msc= mentalstate STOP ;
	public final void macroDef() throws RecognitionException {
		Abstract_Predicate p =null;
		Abstract_MentalState msc =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:134:2: ( HASH DEFINE p= declarationOrCallWithTerms msc= mentalstate STOP )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:134:4: HASH DEFINE p= declarationOrCallWithTerms msc= mentalstate STOP
			{
			match(input,HASH,FOLLOW_HASH_in_macroDef613); 
			match(input,DEFINE,FOLLOW_DEFINE_in_macroDef615); 
			pushFollow(FOLLOW_declarationOrCallWithTerms_in_macroDef619);
			p=declarationOrCallWithTerms();
			state._fsp--;

			pushFollow(FOLLOW_mentalstate_in_macroDef624);
			msc=mentalstate();
			state._fsp--;

			PredicateIndicator pi = new PredicateIndicator(p.getFunctor(), p.getTermSize()); macros.put(pi, msc);
				macro_subs.put(pi, p);
			match(input,STOP,FOLLOW_STOP_in_macroDef630); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "macroDef"



	// $ANTLR start "programRule"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:140:1: programRule[Abstract_GOALModule gl] : ( IF lf= mentalstatecond THEN (dl= actions STOP | nestedRules[gl] ) | 'forall' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' VAR '<-' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' mentalstatecond '->' VAR DO ( actions STOP | nestedRules[gl] ) ) ;
	public final void programRule(Abstract_GOALModule gl) throws RecognitionException {
		Abstract_MentalState lf =null;
		ArrayList<Abstract_Deed> dl =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:141:2: ( ( IF lf= mentalstatecond THEN (dl= actions STOP | nestedRules[gl] ) | 'forall' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' VAR '<-' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' mentalstatecond '->' VAR DO ( actions STOP | nestedRules[gl] ) ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:141:3: ( IF lf= mentalstatecond THEN (dl= actions STOP | nestedRules[gl] ) | 'forall' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' VAR '<-' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' mentalstatecond '->' VAR DO ( actions STOP | nestedRules[gl] ) )
			{
			Abstract_ActionRule rule = new Abstract_ActionRule();
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:142:2: ( IF lf= mentalstatecond THEN (dl= actions STOP | nestedRules[gl] ) | 'forall' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' VAR '<-' mentalstatecond DO ( actions STOP | nestedRules[gl] ) | 'listall' mentalstatecond '->' VAR DO ( actions STOP | nestedRules[gl] ) )
			int alt27=4;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt27=1;
				}
				break;
			case 78:
				{
				alt27=2;
				}
				break;
			case 79:
				{
				int LA27_3 = input.LA(2);
				if ( (LA27_3==VAR) ) {
					int LA27_4 = input.LA(3);
					if ( (LA27_4==70) ) {
						alt27=3;
					}
					else if ( (LA27_4==STOP) ) {
						alt27=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA27_3==AGOAL||LA27_3==BEL||LA27_3==CONST||(LA27_3 >= GOAL && LA27_3 <= GOALA)||LA27_3==NOT||LA27_3==TRUE||(LA27_3 >= 71 && LA27_3 <= 72)||LA27_3==88||(LA27_3 >= 90 && LA27_3 <= 92)) ) {
					alt27=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:142:3: IF lf= mentalstatecond THEN (dl= actions STOP | nestedRules[gl] )
					{
					match(input,IF,FOLLOW_IF_in_programRule644); 
					pushFollow(FOLLOW_mentalstatecond_in_programRule648);
					lf=mentalstatecond();
					state._fsp--;

					rule.setMentalStateCond(lf);
					match(input,THEN,FOLLOW_THEN_in_programRule652); 
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:142:61: (dl= actions STOP | nestedRules[gl] )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==ADOPT||LA23_0==CONST||LA23_0==DELETE||LA23_0==DROP||LA23_0==EVENT||(LA23_0 >= INIT && LA23_0 <= INSERT)||LA23_0==MAIN||LA23_0==SEND||LA23_0==VAR||(LA23_0 >= 71 && LA23_0 <= 72)||LA23_0==75||LA23_0==80||LA23_0==86||(LA23_0 >= 88 && LA23_0 <= 92)) ) {
						alt23=1;
					}
					else if ( (LA23_0==CURLYOPEN) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:142:63: dl= actions STOP
							{
							pushFollow(FOLLOW_actions_in_programRule658);
							dl=actions();
							state._fsp--;

							rule.setBody(dl);
							match(input,STOP,FOLLOW_STOP_in_programRule662); 
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:142:101: nestedRules[gl]
							{
							pushFollow(FOLLOW_nestedRules_in_programRule666);
							nestedRules(gl);
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:143:4: 'forall' mentalstatecond DO ( actions STOP | nestedRules[gl] )
					{
					match(input,78,FOLLOW_78_in_programRule675); 
					pushFollow(FOLLOW_mentalstatecond_in_programRule677);
					mentalstatecond();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_programRule679); 
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:143:32: ( actions STOP | nestedRules[gl] )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ADOPT||LA24_0==CONST||LA24_0==DELETE||LA24_0==DROP||LA24_0==EVENT||(LA24_0 >= INIT && LA24_0 <= INSERT)||LA24_0==MAIN||LA24_0==SEND||LA24_0==VAR||(LA24_0 >= 71 && LA24_0 <= 72)||LA24_0==75||LA24_0==80||LA24_0==86||(LA24_0 >= 88 && LA24_0 <= 92)) ) {
						alt24=1;
					}
					else if ( (LA24_0==CURLYOPEN) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:143:33: actions STOP
							{
							pushFollow(FOLLOW_actions_in_programRule682);
							actions();
							state._fsp--;

							match(input,STOP,FOLLOW_STOP_in_programRule684); 
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:143:48: nestedRules[gl]
							{
							pushFollow(FOLLOW_nestedRules_in_programRule688);
							nestedRules(gl);
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:144:4: 'listall' VAR '<-' mentalstatecond DO ( actions STOP | nestedRules[gl] )
					{
					match(input,79,FOLLOW_79_in_programRule696); 
					match(input,VAR,FOLLOW_VAR_in_programRule698); 
					match(input,70,FOLLOW_70_in_programRule700); 
					pushFollow(FOLLOW_mentalstatecond_in_programRule702);
					mentalstatecond();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_programRule704); 
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:144:42: ( actions STOP | nestedRules[gl] )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ADOPT||LA25_0==CONST||LA25_0==DELETE||LA25_0==DROP||LA25_0==EVENT||(LA25_0 >= INIT && LA25_0 <= INSERT)||LA25_0==MAIN||LA25_0==SEND||LA25_0==VAR||(LA25_0 >= 71 && LA25_0 <= 72)||LA25_0==75||LA25_0==80||LA25_0==86||(LA25_0 >= 88 && LA25_0 <= 92)) ) {
						alt25=1;
					}
					else if ( (LA25_0==CURLYOPEN) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:144:43: actions STOP
							{
							pushFollow(FOLLOW_actions_in_programRule707);
							actions();
							state._fsp--;

							match(input,STOP,FOLLOW_STOP_in_programRule709); 
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:144:58: nestedRules[gl]
							{
							pushFollow(FOLLOW_nestedRules_in_programRule713);
							nestedRules(gl);
							state._fsp--;

							}
							break;

					}

					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:145:4: 'listall' mentalstatecond '->' VAR DO ( actions STOP | nestedRules[gl] )
					{
					match(input,79,FOLLOW_79_in_programRule722); 
					pushFollow(FOLLOW_mentalstatecond_in_programRule724);
					mentalstatecond();
					state._fsp--;

					match(input,69,FOLLOW_69_in_programRule726); 
					match(input,VAR,FOLLOW_VAR_in_programRule728); 
					match(input,DO,FOLLOW_DO_in_programRule730); 
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:145:42: ( actions STOP | nestedRules[gl] )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ADOPT||LA26_0==CONST||LA26_0==DELETE||LA26_0==DROP||LA26_0==EVENT||(LA26_0 >= INIT && LA26_0 <= INSERT)||LA26_0==MAIN||LA26_0==SEND||LA26_0==VAR||(LA26_0 >= 71 && LA26_0 <= 72)||LA26_0==75||LA26_0==80||LA26_0==86||(LA26_0 >= 88 && LA26_0 <= 92)) ) {
						alt26=1;
					}
					else if ( (LA26_0==CURLYOPEN) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:145:43: actions STOP
							{
							pushFollow(FOLLOW_actions_in_programRule733);
							actions();
							state._fsp--;

							match(input,STOP,FOLLOW_STOP_in_programRule735); 
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:145:58: nestedRules[gl]
							{
							pushFollow(FOLLOW_nestedRules_in_programRule739);
							nestedRules(gl);
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			gl.addPlan(rule);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "programRule"



	// $ANTLR start "nestedRules"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:148:1: nestedRules[Abstract_GOALModule gl] : CURLYOPEN ( programRule[gl] )+ CURLYCLOSE ;
	public final void nestedRules(Abstract_GOALModule gl) throws RecognitionException {
		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:149:2: ( CURLYOPEN ( programRule[gl] )+ CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:149:4: CURLYOPEN ( programRule[gl] )+ CURLYCLOSE
			{
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_nestedRules757); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:149:14: ( programRule[gl] )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==IF||(LA28_0 >= 78 && LA28_0 <= 79)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:149:14: programRule[gl]
					{
					pushFollow(FOLLOW_programRule_in_nestedRules759);
					programRule(gl);
					state._fsp--;

					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_nestedRules763); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nestedRules"



	// $ANTLR start "mentalstatecond"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:153:1: mentalstatecond returns [Abstract_MentalState lf] : ma= basicCondition ( COMMA ms2= basicCondition )* ;
	public final Abstract_MentalState mentalstatecond() throws RecognitionException {
		Abstract_MentalState lf = null;


		Abstract_MentalState ma =null;
		Abstract_MentalState ms2 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:154:2: (ma= basicCondition ( COMMA ms2= basicCondition )* )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:154:4: ma= basicCondition ( COMMA ms2= basicCondition )*
			{
			pushFollow(FOLLOW_basicCondition_in_mentalstatecond781);
			ma=basicCondition();
			state._fsp--;

			Abstract_MentalState ms =  ma;
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:155:2: ( COMMA ms2= basicCondition )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:155:3: COMMA ms2= basicCondition
					{
					match(input,COMMA,FOLLOW_COMMA_in_mentalstatecond787); 
					pushFollow(FOLLOW_basicCondition_in_mentalstatecond791);
					ms2=basicCondition();
					state._fsp--;

					ms = new Abstract_MentalState(ms, Abstract_Guard.and, ms2);
					}
					break;

				default :
					break loop29;
				}
			}

			lf = ms;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lf;
	}
	// $ANTLR end "mentalstatecond"



	// $ANTLR start "mentalstate"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:158:1: mentalstate returns [Abstract_MentalState ms] : (ma= mentalatom | NOT OPEN mentalatom CLOSE | TRUE );
	public final Abstract_MentalState mentalstate() throws RecognitionException {
		Abstract_MentalState ms = null;


		Abstract_MentalState ma =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:159:2: (ma= mentalatom | NOT OPEN mentalatom CLOSE | TRUE )
			int alt30=3;
			switch ( input.LA(1) ) {
			case AGOAL:
			case BEL:
			case CONST:
			case GOAL:
			case GOALA:
			case VAR:
			case 71:
			case 72:
			case 88:
			case 90:
			case 91:
			case 92:
				{
				alt30=1;
				}
				break;
			case NOT:
				{
				alt30=2;
				}
				break;
			case TRUE:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:159:4: ma= mentalatom
					{
					pushFollow(FOLLOW_mentalatom_in_mentalstate814);
					ma=mentalatom();
					state._fsp--;

					ms = new Abstract_MentalState(ma);
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:160:4: NOT OPEN mentalatom CLOSE
					{
					match(input,NOT,FOLLOW_NOT_in_mentalstate821); 
					match(input,OPEN,FOLLOW_OPEN_in_mentalstate823); 
					pushFollow(FOLLOW_mentalatom_in_mentalstate825);
					mentalatom();
					state._fsp--;

					match(input,CLOSE,FOLLOW_CLOSE_in_mentalstate827); 
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:161:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_mentalstate832); 
					ms = new Abstract_MentalState();
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ms;
	}
	// $ANTLR end "mentalstate"



	// $ANTLR start "basicCondition"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:164:1: basicCondition returns [Abstract_MentalState ms] : (ms1= mentalstate |p= declarationOrCallWithTerms );
	public final Abstract_MentalState basicCondition() throws RecognitionException {
		Abstract_MentalState ms = null;


		Abstract_MentalState ms1 =null;
		Abstract_Predicate p =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:165:2: (ms1= mentalstate |p= declarationOrCallWithTerms )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CONST) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==STOP) ) {
					alt31=1;
				}
				else if ( (LA31_1==COMMA||LA31_1==DO||LA31_1==OPEN||LA31_1==THEN||LA31_1==69) ) {
					alt31=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA31_0==AGOAL||LA31_0==BEL||(LA31_0 >= GOAL && LA31_0 <= GOALA)||LA31_0==NOT||(LA31_0 >= TRUE && LA31_0 <= VAR)||(LA31_0 >= 71 && LA31_0 <= 72)||LA31_0==88||(LA31_0 >= 90 && LA31_0 <= 92)) ) {
				alt31=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:165:4: ms1= mentalstate
					{
					pushFollow(FOLLOW_mentalstate_in_basicCondition852);
					ms1=mentalstate();
					state._fsp--;

					ms = ms1;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:166:4: p= declarationOrCallWithTerms
					{
					pushFollow(FOLLOW_declarationOrCallWithTerms_in_basicCondition861);
					p=declarationOrCallWithTerms();
					state._fsp--;

					PredicateIndicator pi = new PredicateIndicator(p.getFunctor(), p.getTermSize());
							Abstract_MentalState macro=macros.get(pi);
							Abstract_Term sub=macro_subs.get(pi);
							Abstract_MentalState k = new Abstract_MentalState(macro, sub, p); ms = k;
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ms;
	}
	// $ANTLR end "basicCondition"



	// $ANTLR start "mentalatom"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:173:1: mentalatom returns [Abstract_MentalState ms] : ( selector STOP )? b= mentalOperator tl= atom_parameters ;
	public final Abstract_MentalState mentalatom() throws RecognitionException {
		Abstract_MentalState ms = null;


		byte b =0;
		Abstract_LogExpr tl =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:174:2: ( ( selector STOP )? b= mentalOperator tl= atom_parameters )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:175:2: ( selector STOP )? b= mentalOperator tl= atom_parameters
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:175:2: ( selector STOP )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==CONST||LA32_0==VAR||(LA32_0 >= 71 && LA32_0 <= 72)||LA32_0==88||(LA32_0 >= 90 && LA32_0 <= 92)) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:175:3: selector STOP
					{
					pushFollow(FOLLOW_selector_in_mentalatom881);
					selector();
					state._fsp--;

					match(input,STOP,FOLLOW_STOP_in_mentalatom883); 
					}
					break;

			}

			pushFollow(FOLLOW_mentalOperator_in_mentalatom889);
			b=mentalOperator();
			state._fsp--;

			pushFollow(FOLLOW_atom_parameters_in_mentalatom893);
			tl=atom_parameters();
			state._fsp--;

			 if (b == Abstract_MentalAtom.agoal) {
				      Abstract_MentalAtom g = new Abstract_MentalAtom(tl, Abstract_BaseAILStructure.AILGoal);
				      Abstract_MentalAtom bl = new Abstract_MentalAtom(tl, Abstract_BaseAILStructure.AILBel);
				      ms = new Abstract_MentalState(new Abstract_MentalState(g), Abstract_Guard.and, new Abstract_MentalState(Abstract_Guard.not, bl));
				   } else if (b == Abstract_MentalAtom.goala) {
				      Abstract_MentalAtom g = new Abstract_MentalAtom(tl, Abstract_BaseAILStructure.AILGoal);
				      Abstract_MentalAtom bl = new Abstract_MentalAtom(tl, Abstract_BaseAILStructure.AILBel);
				      ms = new Abstract_MentalState(new Abstract_MentalState(g), Abstract_Guard.and, new Abstract_MentalState(bl));
				   } else {ms = new Abstract_MentalState(new Abstract_MentalAtom(tl, b));}
				 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ms;
	}
	// $ANTLR end "mentalatom"



	// $ANTLR start "atom_parameters"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:188:1: atom_parameters returns [Abstract_LogExpr ts] : OPEN (t= atom ( COMMA t1= atom | SEMI t1= atom )* |ap= atom_parameters ) CLOSE ;
	public final Abstract_LogExpr atom_parameters() throws RecognitionException {
		Abstract_LogExpr ts = null;


		Abstract_LogicalFormula t =null;
		Abstract_LogicalFormula t1 =null;
		Abstract_LogExpr ap =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:189:2: ( OPEN (t= atom ( COMMA t1= atom | SEMI t1= atom )* |ap= atom_parameters ) CLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:189:4: OPEN (t= atom ( COMMA t1= atom | SEMI t1= atom )* |ap= atom_parameters ) CLOSE
			{
			match(input,OPEN,FOLLOW_OPEN_in_atom_parameters912); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:189:9: (t= atom ( COMMA t1= atom | SEMI t1= atom )* |ap= atom_parameters )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==CONST||LA34_0==MINUS||LA34_0==NUMBER||LA34_0==VAR) ) {
				alt34=1;
			}
			else if ( (LA34_0==OPEN) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:190:2: t= atom ( COMMA t1= atom | SEMI t1= atom )*
					{
					pushFollow(FOLLOW_atom_in_atom_parameters919);
					t=atom();
					state._fsp--;

					Abstract_LogExpr tl = new Abstract_LogExpr(Abstract_LogExpr.none, t);
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:191:2: ( COMMA t1= atom | SEMI t1= atom )*
					loop33:
					while (true) {
						int alt33=3;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==COMMA) ) {
							alt33=1;
						}
						else if ( (LA33_0==SEMI) ) {
							alt33=2;
						}

						switch (alt33) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:191:3: COMMA t1= atom
							{
							match(input,COMMA,FOLLOW_COMMA_in_atom_parameters925); 
							pushFollow(FOLLOW_atom_in_atom_parameters929);
							t1=atom();
							state._fsp--;

							tl = new Abstract_LogExpr(tl, Abstract_LogExpr.and, t1);
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:192:4: SEMI t1= atom
							{
							match(input,SEMI,FOLLOW_SEMI_in_atom_parameters936); 
							pushFollow(FOLLOW_atom_in_atom_parameters942);
							t1=atom();
							state._fsp--;

							tl = new Abstract_LogExpr(tl, Abstract_LogExpr.or, t1);
							}
							break;

						default :
							break loop33;
						}
					}

					 ts = tl;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:194:5: ap= atom_parameters
					{
					pushFollow(FOLLOW_atom_parameters_in_atom_parameters959);
					ap=atom_parameters();
					state._fsp--;

					ts = ap;
					}
					break;

			}

			match(input,CLOSE,FOLLOW_CLOSE_in_atom_parameters967); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ts;
	}
	// $ANTLR end "atom_parameters"



	// $ANTLR start "mentalOperator"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:199:1: mentalOperator returns [byte b] : (op= BEL |op= GOAL |op= AGOAL |op= GOALA );
	public final byte mentalOperator() throws RecognitionException {
		byte b = 0;


		Token op=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:200:2: (op= BEL |op= GOAL |op= AGOAL |op= GOALA )
			int alt35=4;
			switch ( input.LA(1) ) {
			case BEL:
				{
				alt35=1;
				}
				break;
			case GOAL:
				{
				alt35=2;
				}
				break;
			case AGOAL:
				{
				alt35=3;
				}
				break;
			case GOALA:
				{
				alt35=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:200:4: op= BEL
					{
					op=(Token)match(input,BEL,FOLLOW_BEL_in_mentalOperator988); 
					b = Abstract_BaseAILStructure.AILBel;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:201:4: op= GOAL
					{
					op=(Token)match(input,GOAL,FOLLOW_GOAL_in_mentalOperator999); 
					b = Abstract_BaseAILStructure.AILGoal;
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:202:4: op= AGOAL
					{
					op=(Token)match(input,AGOAL,FOLLOW_AGOAL_in_mentalOperator1010); 
					b = Abstract_MentalAtom.agoal;
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:203:4: op= GOALA
					{
					op=(Token)match(input,GOALA,FOLLOW_GOALA_in_mentalOperator1021); 
					b = Abstract_MentalAtom.goala;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return b;
	}
	// $ANTLR end "mentalOperator"



	// $ANTLR start "actions"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:206:1: actions returns [ArrayList<Abstract_Deed> dl] :a= action ( PLUS a1= action )* ;
	public final ArrayList<Abstract_Deed> actions() throws RecognitionException {
		ArrayList<Abstract_Deed> dl = null;


		Abstract_Deed a =null;
		Abstract_Deed a1 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:207:2: (a= action ( PLUS a1= action )* )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:207:4: a= action ( PLUS a1= action )*
			{
			dl = new ArrayList<Abstract_Deed>();
			pushFollow(FOLLOW_action_in_actions1044);
			a=action();
			state._fsp--;

			dl.add(a);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:209:2: ( PLUS a1= action )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==PLUS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:209:3: PLUS a1= action
					{
					match(input,PLUS,FOLLOW_PLUS_in_actions1051); 
					pushFollow(FOLLOW_action_in_actions1055);
					a1=action();
					state._fsp--;

					dl.add(a1);
					}
					break;

				default :
					break loop36;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dl;
	}
	// $ANTLR end "actions"



	// $ANTLR start "action"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:212:1: action returns [Abstract_Deed d] : ( ( selector STOP )? d1= actionOperator tl= parameters |op= 'exit-module' |op= 'log' |op= INIT |op= MAIN |op= EVENT |p= declarationOrCallWithTerms );
	public final Abstract_Deed action() throws RecognitionException {
		Abstract_Deed d = null;


		Token op=null;
		Abstract_Deed d1 =null;
		ArrayList<Abstract_Term> tl =null;
		Abstract_Predicate p =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:213:2: ( ( selector STOP )? d1= actionOperator tl= parameters |op= 'exit-module' |op= 'log' |op= INIT |op= MAIN |op= EVENT |p= declarationOrCallWithTerms )
			int alt38=7;
			switch ( input.LA(1) ) {
			case CONST:
				{
				int LA38_1 = input.LA(2);
				if ( (LA38_1==STOP) ) {
					int LA38_8 = input.LA(3);
					if ( (LA38_8==ADOPT||LA38_8==DELETE||LA38_8==DROP||LA38_8==INSERT||LA38_8==SEND||LA38_8==80||LA38_8==86||LA38_8==89) ) {
						alt38=1;
					}
					else if ( (LA38_8==CURLYCLOSE||LA38_8==IF||(LA38_8 >= 78 && LA38_8 <= 79)) ) {
						alt38=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA38_1==OPEN||LA38_1==PLUS) ) {
					alt38=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ADOPT:
			case DELETE:
			case DROP:
			case INSERT:
			case SEND:
			case VAR:
			case 71:
			case 72:
			case 86:
			case 88:
			case 89:
			case 90:
			case 91:
			case 92:
				{
				alt38=1;
				}
				break;
			case 80:
				{
				int LA38_3 = input.LA(2);
				if ( (LA38_3==OPEN) ) {
					alt38=1;
				}
				else if ( (LA38_3==PLUS||LA38_3==STOP) ) {
					alt38=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 75:
				{
				alt38=2;
				}
				break;
			case INIT:
				{
				alt38=4;
				}
				break;
			case MAIN:
				{
				alt38=5;
				}
				break;
			case EVENT:
				{
				alt38=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:213:4: ( selector STOP )? d1= actionOperator tl= parameters
					{
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:213:4: ( selector STOP )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==CONST||LA37_0==VAR||(LA37_0 >= 71 && LA37_0 <= 72)||LA37_0==88||(LA37_0 >= 90 && LA37_0 <= 92)) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:213:5: selector STOP
							{
							pushFollow(FOLLOW_selector_in_action1075);
							selector();
							state._fsp--;

							match(input,STOP,FOLLOW_STOP_in_action1077); 
							}
							break;

					}

					pushFollow(FOLLOW_actionOperator_in_action1083);
					d1=actionOperator();
					state._fsp--;

					pushFollow(FOLLOW_parameters_in_action1087);
					tl=parameters();
					state._fsp--;

					d1.addParams(tl); d =d1;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:215:4: op= 'exit-module'
					{
					op=(Token)match(input,75,FOLLOW_75_in_action1099); 
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:216:4: op= 'log'
					{
					op=(Token)match(input,80,FOLLOW_80_in_action1108); 
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:217:4: op= INIT
					{
					op=(Token)match(input,INIT,FOLLOW_INIT_in_action1117); 
					}
					break;
				case 5 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:218:4: op= MAIN
					{
					op=(Token)match(input,MAIN,FOLLOW_MAIN_in_action1126); 
					}
					break;
				case 6 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:219:4: op= EVENT
					{
					op=(Token)match(input,EVENT,FOLLOW_EVENT_in_action1135); 
					}
					break;
				case 7 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:220:4: p= declarationOrCallWithTerms
					{
					pushFollow(FOLLOW_declarationOrCallWithTerms_in_action1142);
					p=declarationOrCallWithTerms();
					state._fsp--;

					d = new Abstract_Deed(p);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return d;
	}
	// $ANTLR end "action"



	// $ANTLR start "actionOperator"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:223:1: actionOperator returns [Abstract_Deed d] : (op= 'adopt' |op= 'drop' |op= 'insert' |op= 'delete' |op= 'send' |op= 'sendonce' |op= 'print' |op= 'log' );
	public final Abstract_Deed actionOperator() throws RecognitionException {
		Abstract_Deed d = null;


		Token op=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:224:2: (op= 'adopt' |op= 'drop' |op= 'insert' |op= 'delete' |op= 'send' |op= 'sendonce' |op= 'print' |op= 'log' )
			int alt39=8;
			switch ( input.LA(1) ) {
			case ADOPT:
				{
				alt39=1;
				}
				break;
			case DROP:
				{
				alt39=2;
				}
				break;
			case INSERT:
				{
				alt39=3;
				}
				break;
			case DELETE:
				{
				alt39=4;
				}
				break;
			case SEND:
				{
				alt39=5;
				}
				break;
			case 89:
				{
				alt39=6;
				}
				break;
			case 86:
				{
				alt39=7;
				}
				break;
			case 80:
				{
				alt39=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:224:4: op= 'adopt'
					{
					op=(Token)match(input,ADOPT,FOLLOW_ADOPT_in_actionOperator1163); 
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:225:4: op= 'drop'
					{
					op=(Token)match(input,DROP,FOLLOW_DROP_in_actionOperator1172); 
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:226:4: op= 'insert'
					{
					op=(Token)match(input,INSERT,FOLLOW_INSERT_in_actionOperator1181); 
					d = new Abstract_Deed(Abstract_BaseAILStructure.AILAddition, Abstract_BaseAILStructure.AILBel);
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:227:4: op= 'delete'
					{
					op=(Token)match(input,DELETE,FOLLOW_DELETE_in_actionOperator1192); 
					d = new Abstract_Deed(Abstract_BaseAILStructure.AILDeletion, Abstract_BaseAILStructure.AILBel);
					}
					break;
				case 5 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:228:4: op= 'send'
					{
					op=(Token)match(input,SEND,FOLLOW_SEND_in_actionOperator1204); 
					}
					break;
				case 6 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:229:4: op= 'sendonce'
					{
					op=(Token)match(input,89,FOLLOW_89_in_actionOperator1213); 
					}
					break;
				case 7 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:230:4: op= 'print'
					{
					op=(Token)match(input,86,FOLLOW_86_in_actionOperator1222); 
					d = new Abstract_Deed(new Abstract_PrintAction());
					}
					break;
				case 8 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:231:4: op= 'log'
					{
					op=(Token)match(input,80,FOLLOW_80_in_actionOperator1233); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return d;
	}
	// $ANTLR end "actionOperator"



	// $ANTLR start "selector"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:235:1: selector : ( word |op= 'all' |op= 'allother' |op= 'self' |op= 'some' |op= 'someother' |op= 'this' );
	public final void selector() throws RecognitionException {
		Token op=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:236:2: ( word |op= 'all' |op= 'allother' |op= 'self' |op= 'some' |op= 'someother' |op= 'this' )
			int alt40=7;
			switch ( input.LA(1) ) {
			case CONST:
			case VAR:
				{
				alt40=1;
				}
				break;
			case 71:
				{
				alt40=2;
				}
				break;
			case 72:
				{
				alt40=3;
				}
				break;
			case 88:
				{
				alt40=4;
				}
				break;
			case 90:
				{
				alt40=5;
				}
				break;
			case 91:
				{
				alt40=6;
				}
				break;
			case 92:
				{
				alt40=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:236:4: word
					{
					pushFollow(FOLLOW_word_in_selector1245);
					word();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:237:4: op= 'all'
					{
					op=(Token)match(input,71,FOLLOW_71_in_selector1254); 
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:238:4: op= 'allother'
					{
					op=(Token)match(input,72,FOLLOW_72_in_selector1263); 
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:239:4: op= 'self'
					{
					op=(Token)match(input,88,FOLLOW_88_in_selector1272); 
					}
					break;
				case 5 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:240:4: op= 'some'
					{
					op=(Token)match(input,90,FOLLOW_90_in_selector1281); 
					}
					break;
				case 6 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:241:4: op= 'someother'
					{
					op=(Token)match(input,91,FOLLOW_91_in_selector1290); 
					}
					break;
				case 7 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:242:4: op= 'this'
					{
					op=(Token)match(input,92,FOLLOW_92_in_selector1299); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "selector"



	// $ANTLR start "actionSpecs"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:245:1: actionSpecs returns [ArrayList<Abstract_ActionSpec> as] : ACTIONSPEC CURLYOPEN (a= actionSpec )+ CURLYCLOSE ;
	public final ArrayList<Abstract_ActionSpec> actionSpecs() throws RecognitionException {
		ArrayList<Abstract_ActionSpec> as = null;


		Abstract_ActionSpec a =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:246:2: ( ACTIONSPEC CURLYOPEN (a= actionSpec )+ CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:246:4: ACTIONSPEC CURLYOPEN (a= actionSpec )+ CURLYCLOSE
			{
			as = new ArrayList<Abstract_ActionSpec>();
			match(input,ACTIONSPEC,FOLLOW_ACTIONSPEC_in_actionSpecs1318); 
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_actionSpecs1320); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:247:23: (a= actionSpec )+
			int cnt41=0;
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==CONST) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:247:24: a= actionSpec
					{
					pushFollow(FOLLOW_actionSpec_in_actionSpecs1325);
					a=actionSpec();
					state._fsp--;

					as.add(a);
					}
					break;

				default :
					if ( cnt41 >= 1 ) break loop41;
					EarlyExitException eee = new EarlyExitException(41, input);
					throw eee;
				}
				cnt41++;
			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_actionSpecs1331); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return as;
	}
	// $ANTLR end "actionSpecs"



	// $ANTLR start "actionSpec"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:250:1: actionSpec returns [Abstract_ActionSpec as] : cap= declarationOrCallWithTerms ( INTERNAL | EXTERNAL )? CURLYOPEN pre= precondition post= postcondition CURLYCLOSE ;
	public final Abstract_ActionSpec actionSpec() throws RecognitionException {
		Abstract_ActionSpec as = null;


		Abstract_Predicate cap =null;
		Abstract_LogicalFormula pre =null;
		Abstract_LogicalFormula post =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:251:2: (cap= declarationOrCallWithTerms ( INTERNAL | EXTERNAL )? CURLYOPEN pre= precondition post= postcondition CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:251:4: cap= declarationOrCallWithTerms ( INTERNAL | EXTERNAL )? CURLYOPEN pre= precondition post= postcondition CURLYCLOSE
			{
			pushFollow(FOLLOW_declarationOrCallWithTerms_in_actionSpec1348);
			cap=declarationOrCallWithTerms();
			state._fsp--;

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:251:35: ( INTERNAL | EXTERNAL )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==EXTERNAL||LA42_0==INTERNAL) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:
					{
					if ( input.LA(1)==EXTERNAL||input.LA(1)==INTERNAL ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_actionSpec1361); 
			pushFollow(FOLLOW_precondition_in_actionSpec1365);
			pre=precondition();
			state._fsp--;

			pushFollow(FOLLOW_postcondition_in_actionSpec1369);
			post=postcondition();
			state._fsp--;

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_actionSpec1371); 
			as = new Abstract_ActionSpec(cap, pre, post);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return as;
	}
	// $ANTLR end "actionSpec"



	// $ANTLR start "precondition"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:256:1: precondition returns [Abstract_LogicalFormula f] : PRE CURLYOPEN ( TRUE |tl= no_bracket_literals ) CURLYCLOSE ;
	public final Abstract_LogicalFormula precondition() throws RecognitionException {
		Abstract_LogicalFormula f = null;


		ArrayList<Abstract_LogicalFormula> tl =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:257:2: ( PRE CURLYOPEN ( TRUE |tl= no_bracket_literals ) CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:257:4: PRE CURLYOPEN ( TRUE |tl= no_bracket_literals ) CURLYCLOSE
			{
			match(input,PRE,FOLLOW_PRE_in_precondition1389); 
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_precondition1391); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:257:19: ( TRUE |tl= no_bracket_literals )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==TRUE) ) {
				alt43=1;
			}
			else if ( (LA43_0==CONST||LA43_0==MINUS||(LA43_0 >= NOT && LA43_0 <= NUMBER)||LA43_0==VAR) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:257:20: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_precondition1395); 
					f = new Abstract_LogExpr();
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:258:4: tl= no_bracket_literals
					{
					pushFollow(FOLLOW_no_bracket_literals_in_precondition1405);
					tl=no_bracket_literals();
					state._fsp--;

					f = new Abstract_LogExpr(tl);
					}
					break;

			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_precondition1410); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return f;
	}
	// $ANTLR end "precondition"



	// $ANTLR start "postcondition"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:261:1: postcondition returns [Abstract_LogicalFormula f] : POST CURLYOPEN ( TRUE |tl= no_bracket_literals ) CURLYCLOSE ;
	public final Abstract_LogicalFormula postcondition() throws RecognitionException {
		Abstract_LogicalFormula f = null;


		ArrayList<Abstract_LogicalFormula> tl =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:262:2: ( POST CURLYOPEN ( TRUE |tl= no_bracket_literals ) CURLYCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:262:4: POST CURLYOPEN ( TRUE |tl= no_bracket_literals ) CURLYCLOSE
			{
			match(input,POST,FOLLOW_POST_in_postcondition1425); 
			match(input,CURLYOPEN,FOLLOW_CURLYOPEN_in_postcondition1428); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:263:2: ( TRUE |tl= no_bracket_literals )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==TRUE) ) {
				alt44=1;
			}
			else if ( (LA44_0==CONST||LA44_0==MINUS||(LA44_0 >= NOT && LA44_0 <= NUMBER)||LA44_0==VAR) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:263:3: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_postcondition1432); 
					f = new Abstract_LogExpr();
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:264:4: tl= no_bracket_literals
					{
					pushFollow(FOLLOW_no_bracket_literals_in_postcondition1442);
					tl=no_bracket_literals();
					state._fsp--;


							f = new Abstract_LogExpr(tl);
					}
					break;

			}

			match(input,CURLYCLOSE,FOLLOW_CURLYCLOSE_in_postcondition1451); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return f;
	}
	// $ANTLR end "postcondition"



	// $ANTLR start "declaration"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:270:1: declaration returns [Abstract_Predicate p] : f= id (tl= parameters )? ;
	public final Abstract_Predicate declaration() throws RecognitionException {
		Abstract_Predicate p = null;


		String f =null;
		ArrayList<Abstract_Term> tl =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:271:2: (f= id (tl= parameters )? )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:271:4: f= id (tl= parameters )?
			{
			pushFollow(FOLLOW_id_in_declaration1468);
			f=id();
			state._fsp--;

			p= new Abstract_Predicate(f);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:271:41: (tl= parameters )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==OPEN) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:271:42: tl= parameters
					{
					pushFollow(FOLLOW_parameters_in_declaration1475);
					tl=parameters();
					state._fsp--;

					p.setTerms(tl);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "declarationOrCallWithTerms"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:274:1: declarationOrCallWithTerms returns [Abstract_Predicate p] : f= function_term ;
	public final Abstract_Predicate declarationOrCallWithTerms() throws RecognitionException {
		Abstract_Predicate p = null;


		Abstract_Term f =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:275:2: (f= function_term )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:275:4: f= function_term
			{
			pushFollow(FOLLOW_function_term_in_declarationOrCallWithTerms1496);
			f=function_term();
			state._fsp--;

			p = (Abstract_Predicate) f;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "declarationOrCallWithTerms"



	// $ANTLR start "id"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:278:1: id returns [String s] : ( CONST | VAR ) ;
	public final String id() throws RecognitionException {
		String s = null;


		Token CONST1=null;
		Token VAR2=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:279:2: ( ( CONST | VAR ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:279:4: ( CONST | VAR )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:279:4: ( CONST | VAR )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==CONST) ) {
				alt46=1;
			}
			else if ( (LA46_0==VAR) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:279:5: CONST
					{
					CONST1=(Token)match(input,CONST,FOLLOW_CONST_in_id1515); 
					s = CONST1.getText();
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:280:4: VAR
					{
					VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_id1522); 
					s = VAR2.getText();
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "id"



	// $ANTLR start "parameters"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:284:1: parameters returns [ArrayList<Abstract_Term>ts] : OPEN t= term ( COMMA t1= term )* CLOSE ;
	public final ArrayList<Abstract_Term> parameters() throws RecognitionException {
		ArrayList<Abstract_Term> ts = null;


		Abstract_Term t =null;
		Abstract_Term t1 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:285:2: ( OPEN t= term ( COMMA t1= term )* CLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:285:4: OPEN t= term ( COMMA t1= term )* CLOSE
			{
			match(input,OPEN,FOLLOW_OPEN_in_parameters1545); 
			pushFollow(FOLLOW_term_in_parameters1549);
			t=term();
			state._fsp--;

			ArrayList<Abstract_Term> tl = new ArrayList<Abstract_Term>(); tl.add(t);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:286:2: ( COMMA t1= term )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==COMMA) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:286:3: COMMA t1= term
					{
					match(input,COMMA,FOLLOW_COMMA_in_parameters1555); 
					pushFollow(FOLLOW_term_in_parameters1559);
					t1=term();
					state._fsp--;

					tl.add(t1);
					}
					break;

				default :
					break loop47;
				}
			}

			match(input,CLOSE,FOLLOW_CLOSE_in_parameters1567); 
			 ts = tl;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ts;
	}
	// $ANTLR end "parameters"



	// $ANTLR start "no_bracket_parameters"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:290:1: no_bracket_parameters returns [ArrayList<Abstract_Term>ts] : t= term ( COMMA t1= term )* ;
	public final ArrayList<Abstract_Term> no_bracket_parameters() throws RecognitionException {
		ArrayList<Abstract_Term> ts = null;


		Abstract_Term t =null;
		Abstract_Term t1 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:291:2: (t= term ( COMMA t1= term )* )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:291:5: t= term ( COMMA t1= term )*
			{
			pushFollow(FOLLOW_term_in_no_bracket_parameters1589);
			t=term();
			state._fsp--;

			ArrayList<Abstract_Term> tl = new ArrayList<Abstract_Term>(); tl.add(t);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:292:2: ( COMMA t1= term )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==COMMA) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:292:3: COMMA t1= term
					{
					match(input,COMMA,FOLLOW_COMMA_in_no_bracket_parameters1595); 
					pushFollow(FOLLOW_term_in_no_bracket_parameters1599);
					t1=term();
					state._fsp--;

					tl.add(t1);
					}
					break;

				default :
					break loop48;
				}
			}

			 ts = tl;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ts;
	}
	// $ANTLR end "no_bracket_parameters"



	// $ANTLR start "no_bracket_literals"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:296:1: no_bracket_literals returns [ArrayList<Abstract_LogicalFormula>ts] : ( ( NOT OPEN t= atom CLOSE ) |t= atom ) ( COMMA ( NOT OPEN t1= atom CLOSE |t1= atom ) )* ;
	public final ArrayList<Abstract_LogicalFormula> no_bracket_literals() throws RecognitionException {
		ArrayList<Abstract_LogicalFormula> ts = null;


		Abstract_LogicalFormula t =null;
		Abstract_LogicalFormula t1 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:297:2: ( ( ( NOT OPEN t= atom CLOSE ) |t= atom ) ( COMMA ( NOT OPEN t1= atom CLOSE |t1= atom ) )* )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:297:5: ( ( NOT OPEN t= atom CLOSE ) |t= atom ) ( COMMA ( NOT OPEN t1= atom CLOSE |t1= atom ) )*
			{
			ArrayList<Abstract_LogicalFormula> tl = new ArrayList<Abstract_LogicalFormula>();
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:298:2: ( ( NOT OPEN t= atom CLOSE ) |t= atom )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==NOT) ) {
				alt49=1;
			}
			else if ( (LA49_0==CONST||LA49_0==MINUS||LA49_0==NUMBER||LA49_0==VAR) ) {
				alt49=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:298:3: ( NOT OPEN t= atom CLOSE )
					{
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:298:3: ( NOT OPEN t= atom CLOSE )
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:298:4: NOT OPEN t= atom CLOSE
					{
					match(input,NOT,FOLLOW_NOT_in_no_bracket_literals1629); 
					match(input,OPEN,FOLLOW_OPEN_in_no_bracket_literals1631); 
					pushFollow(FOLLOW_atom_in_no_bracket_literals1635);
					t=atom();
					state._fsp--;

					Abstract_LogExpr l=new Abstract_LogExpr(Abstract_LogExpr.not, t); tl.add(l);
					match(input,CLOSE,FOLLOW_CLOSE_in_no_bracket_literals1639); 
					}

					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:299:4: t= atom
					{
					pushFollow(FOLLOW_atom_in_no_bracket_literals1647);
					t=atom();
					state._fsp--;

					 tl.add(t);
					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:300:2: ( COMMA ( NOT OPEN t1= atom CLOSE |t1= atom ) )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==COMMA) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:300:3: COMMA ( NOT OPEN t1= atom CLOSE |t1= atom )
					{
					match(input,COMMA,FOLLOW_COMMA_in_no_bracket_literals1654); 
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:300:9: ( NOT OPEN t1= atom CLOSE |t1= atom )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==NOT) ) {
						alt50=1;
					}
					else if ( (LA50_0==CONST||LA50_0==MINUS||LA50_0==NUMBER||LA50_0==VAR) ) {
						alt50=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:300:10: NOT OPEN t1= atom CLOSE
							{
							match(input,NOT,FOLLOW_NOT_in_no_bracket_literals1657); 
							match(input,OPEN,FOLLOW_OPEN_in_no_bracket_literals1659); 
							pushFollow(FOLLOW_atom_in_no_bracket_literals1663);
							t1=atom();
							state._fsp--;

							Abstract_LogExpr l=new Abstract_LogExpr(Abstract_LogExpr.not, t1); tl.add(l);
							match(input,CLOSE,FOLLOW_CLOSE_in_no_bracket_literals1667); 
							}
							break;
						case 2 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:301:4: t1= atom
							{
							pushFollow(FOLLOW_atom_in_no_bracket_literals1676);
							t1=atom();
							state._fsp--;

							tl.add(t1);
							}
							break;

					}

					}
					break;

				default :
					break loop51;
				}
			}

			 ts = tl;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ts;
	}
	// $ANTLR end "no_bracket_literals"



	// $ANTLR start "goal_list"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:306:1: goal_list returns [ArrayList<Abstract_Term>ts] : t= term ( COMMA t1= term )* STOP ;
	public final ArrayList<Abstract_Term> goal_list() throws RecognitionException {
		ArrayList<Abstract_Term> ts = null;


		Abstract_Term t =null;
		Abstract_Term t1 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:307:2: (t= term ( COMMA t1= term )* STOP )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:307:4: t= term ( COMMA t1= term )* STOP
			{
			pushFollow(FOLLOW_term_in_goal_list1704);
			t=term();
			state._fsp--;

			ArrayList<Abstract_Term> tl = new ArrayList<Abstract_Term>(); tl.add(t);
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:308:2: ( COMMA t1= term )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==COMMA) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:308:3: COMMA t1= term
					{
					match(input,COMMA,FOLLOW_COMMA_in_goal_list1711); 
					pushFollow(FOLLOW_term_in_goal_list1715);
					t1=term();
					state._fsp--;

					tl.add(t1);
					}
					break;

				default :
					break loop52;
				}
			}

			match(input,STOP,FOLLOW_STOP_in_goal_list1722); 
			 ts = tl;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ts;
	}
	// $ANTLR end "goal_list"



	// $ANTLR start "term"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:358:1: term returns [Abstract_Term t] : (st= stringterm |ft= function_term |at= arithexpr |lt= listterm ) ;
	public final Abstract_Term term() throws RecognitionException {
		Abstract_Term t = null;


		Abstract_StringTerm st =null;
		Abstract_Term ft =null;
		Abstract_NumberTerm at =null;
		Abstract_ListTermImpl lt =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:359:2: ( (st= stringterm |ft= function_term |at= arithexpr |lt= listterm ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:359:4: (st= stringterm |ft= function_term |at= arithexpr |lt= listterm )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:359:4: (st= stringterm |ft= function_term |at= arithexpr |lt= listterm )
			int alt53=4;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt53=1;
				}
				break;
			case CONST:
				{
				alt53=2;
				}
				break;
			case MINUS:
			case NUMBER:
			case VAR:
				{
				alt53=3;
				}
				break;
			case SQOPEN:
				{
				alt53=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:359:5: st= stringterm
					{
					pushFollow(FOLLOW_stringterm_in_term2048);
					st=stringterm();
					state._fsp--;

					t = st;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:360:4: ft= function_term
					{
					pushFollow(FOLLOW_function_term_in_term2058);
					ft=function_term();
					state._fsp--;

					t =ft;
					}
					break;
				case 3 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:361:4: at= arithexpr
					{
					pushFollow(FOLLOW_arithexpr_in_term2068);
					at=arithexpr();
					state._fsp--;

					t =at;
					}
					break;
				case 4 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:362:4: lt= listterm
					{
					pushFollow(FOLLOW_listterm_in_term2077);
					lt=listterm();
					state._fsp--;

					t =lt;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "term"



	// $ANTLR start "function_term"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:364:1: function_term returns [Abstract_Term t] : c= CONST ( OPEN t1= term ( COMMA t2= term )* CLOSE )? ;
	public final Abstract_Term function_term() throws RecognitionException {
		Abstract_Term t = null;


		Token c=null;
		Abstract_Term t1 =null;
		Abstract_Term t2 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:365:2: (c= CONST ( OPEN t1= term ( COMMA t2= term )* CLOSE )? )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:365:4: c= CONST ( OPEN t1= term ( COMMA t2= term )* CLOSE )?
			{
			c=(Token)match(input,CONST,FOLLOW_CONST_in_function_term2095); 
			t=new Abstract_Predicate(c.getText());
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:366:2: ( OPEN t1= term ( COMMA t2= term )* CLOSE )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==OPEN) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:366:3: OPEN t1= term ( COMMA t2= term )* CLOSE
					{
					match(input,OPEN,FOLLOW_OPEN_in_function_term2102); 
					pushFollow(FOLLOW_term_in_function_term2106);
					t1=term();
					state._fsp--;

					((Abstract_Predicate) t).addTerm(t1);
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:367:2: ( COMMA t2= term )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==COMMA) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:367:3: COMMA t2= term
							{
							match(input,COMMA,FOLLOW_COMMA_in_function_term2113); 
							pushFollow(FOLLOW_term_in_function_term2117);
							t2=term();
							state._fsp--;

							((Abstract_Predicate) t).addTerm(t2);
							}
							break;

						default :
							break loop54;
						}
					}

					match(input,CLOSE,FOLLOW_CLOSE_in_function_term2123); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "function_term"



	// $ANTLR start "var"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:371:1: var returns [Abstract_VarTerm v] : VAR ;
	public final Abstract_VarTerm var() throws RecognitionException {
		Abstract_VarTerm v = null;


		Token VAR3=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:372:2: ( VAR )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:372:4: VAR
			{
			VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_var2142); 
			if (variables.containsKey(VAR3.getText())) {
					v = variables.get(VAR3.getText());
				            } else {
					v = new Abstract_VarTerm(VAR3.getText());
			                                                     variables.put(VAR3.getText(), v);
				           }
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "var"



	// $ANTLR start "stringLiteral"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:380:1: stringLiteral returns [Abstract_StringTerm s] : st= stringterm ;
	public final Abstract_StringTerm stringLiteral() throws RecognitionException {
		Abstract_StringTerm s = null;


		Abstract_StringTerm st =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:381:2: (st= stringterm )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:381:4: st= stringterm
			{
			pushFollow(FOLLOW_stringterm_in_stringLiteral2159);
			st=stringterm();
			state._fsp--;

			s = st;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "stringLiteral"



	// $ANTLR start "singleQuotedStringLiteral"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:382:1: singleQuotedStringLiteral returns [Abstract_StringTerm s] : SINGLEQUOTE w= word SINGLEQUOTE ;
	public final Abstract_StringTerm singleQuotedStringLiteral() throws RecognitionException {
		Abstract_StringTerm s = null;


		String w =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:383:2: ( SINGLEQUOTE w= word SINGLEQUOTE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:383:4: SINGLEQUOTE w= word SINGLEQUOTE
			{
			match(input,SINGLEQUOTE,FOLLOW_SINGLEQUOTE_in_singleQuotedStringLiteral2173); 
			pushFollow(FOLLOW_word_in_singleQuotedStringLiteral2177);
			w=word();
			state._fsp--;

			match(input,SINGLEQUOTE,FOLLOW_SINGLEQUOTE_in_singleQuotedStringLiteral2179); 
			s = new Abstract_StringTermImpl(w);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "singleQuotedStringLiteral"



	// $ANTLR start "stringterm"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:385:1: stringterm returns [Abstract_StringTerm s] : STRING ;
	public final Abstract_StringTerm stringterm() throws RecognitionException {
		Abstract_StringTerm s = null;


		Token STRING4=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:386:2: ( STRING )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:386:4: STRING
			{
			STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_stringterm2196); 
			String str = STRING4.getText();s=new Abstract_StringTermImpl(str.substring(1,str.length()-1));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "stringterm"



	// $ANTLR start "word"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:389:1: word returns [String s] : ( CONST | VAR ) ;
	public final String word() throws RecognitionException {
		String s = null;


		Token CONST5=null;
		Token VAR6=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:389:25: ( ( CONST | VAR ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:389:27: ( CONST | VAR )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:389:27: ( CONST | VAR )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==CONST) ) {
				alt56=1;
			}
			else if ( (LA56_0==VAR) ) {
				alt56=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:389:28: CONST
					{
					CONST5=(Token)match(input,CONST,FOLLOW_CONST_in_word2213); 
					s =CONST5.getText();
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:389:59: VAR
					{
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_word2219); 
					s =VAR6.getText();
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "word"



	// $ANTLR start "listterm"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:391:1: listterm returns [Abstract_ListTermImpl l] : SQOPEN (h= term ( COMMA t= term )* ( BAR v= VAR )? )? SQCLOSE ;
	public final Abstract_ListTermImpl listterm() throws RecognitionException {
		Abstract_ListTermImpl l = null;


		Token v=null;
		Abstract_Term h =null;
		Abstract_Term t =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:392:3: ( SQOPEN (h= term ( COMMA t= term )* ( BAR v= VAR )? )? SQCLOSE )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:392:5: SQOPEN (h= term ( COMMA t= term )* ( BAR v= VAR )? )? SQCLOSE
			{
			l = new Abstract_ListTermImpl(); Abstract_ListTerm lrunning = l;
			match(input,SQOPEN,FOLLOW_SQOPEN_in_listterm2240); 
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:393:10: (h= term ( COMMA t= term )* ( BAR v= VAR )? )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==CONST||LA59_0==MINUS||LA59_0==NUMBER||LA59_0==SQOPEN||LA59_0==STRING||LA59_0==VAR) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:393:11: h= term ( COMMA t= term )* ( BAR v= VAR )?
					{
					pushFollow(FOLLOW_term_in_listterm2245);
					h=term();
					state._fsp--;

					l.addHead(h); l.addTail(new Abstract_ListTermImpl());
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:394:3: ( COMMA t= term )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==COMMA) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:394:4: COMMA t= term
							{
							match(input,COMMA,FOLLOW_COMMA_in_listterm2252); 
							pushFollow(FOLLOW_term_in_listterm2256);
							t=term();
							state._fsp--;

							Abstract_ListTerm l2 = new Abstract_ListTermImpl(); l2.addHead(t); l2.addTail(new Abstract_ListTermImpl()); lrunning.addTail(l2); lrunning=l2;
							}
							break;

						default :
							break loop57;
						}
					}

					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:395:3: ( BAR v= VAR )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==BAR) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:395:4: BAR v= VAR
							{
							match(input,BAR,FOLLOW_BAR_in_listterm2265); 
							v=(Token)match(input,VAR,FOLLOW_VAR_in_listterm2269); 
							lrunning.addTail(new Abstract_VarTerm(v.getText()));
							}
							break;

					}

					}
					break;

			}

			match(input,SQCLOSE,FOLLOW_SQCLOSE_in_listterm2281); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return l;
	}
	// $ANTLR end "listterm"



	// $ANTLR start "equation"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:399:1: equation returns [Abstract_Equation e] : a1= arithexpr i= eqoper a2= arithexpr ;
	public final Abstract_Equation equation() throws RecognitionException {
		Abstract_Equation e = null;


		Abstract_NumberTerm a1 =null;
		int i =0;
		Abstract_NumberTerm a2 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:400:2: (a1= arithexpr i= eqoper a2= arithexpr )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:400:4: a1= arithexpr i= eqoper a2= arithexpr
			{
			pushFollow(FOLLOW_arithexpr_in_equation2299);
			a1=arithexpr();
			state._fsp--;

			pushFollow(FOLLOW_eqoper_in_equation2303);
			i=eqoper();
			state._fsp--;

			pushFollow(FOLLOW_arithexpr_in_equation2307);
			a2=arithexpr();
			state._fsp--;

			e = new Abstract_Equation(a1, i, a2);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "equation"



	// $ANTLR start "numberstring"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:403:1: numberstring returns [String s] : ( MINUS )? (n1= NUMBER ( STOP n2= NUMBER )? ) ;
	public final String numberstring() throws RecognitionException {
		String s = null;


		Token n1=null;
		Token n2=null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:404:2: ( ( MINUS )? (n1= NUMBER ( STOP n2= NUMBER )? ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:404:4: ( MINUS )? (n1= NUMBER ( STOP n2= NUMBER )? )
			{
			s = "";
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:404:15: ( MINUS )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==MINUS) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:404:16: MINUS
					{
					match(input,MINUS,FOLLOW_MINUS_in_numberstring2327); 
					s += "-";
					}
					break;

			}

			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:405:2: (n1= NUMBER ( STOP n2= NUMBER )? )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:405:3: n1= NUMBER ( STOP n2= NUMBER )?
			{
			n1=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberstring2338); 
			s += n1.getText();
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:406:2: ( STOP n2= NUMBER )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==STOP) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==NUMBER) ) {
					alt61=1;
				}
			}
			switch (alt61) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:406:3: STOP n2= NUMBER
					{
					match(input,STOP,FOLLOW_STOP_in_numberstring2344); 
					s += ".";
					n2=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberstring2350); 
					s += n2.getText();
					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "numberstring"



	// $ANTLR start "arithexpr"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:408:1: arithexpr returns [Abstract_NumberTerm ae] : a1= multexpr (i= addoper a2= multexpr )? ;
	public final Abstract_NumberTerm arithexpr() throws RecognitionException {
		Abstract_NumberTerm ae = null;


		Abstract_NumberTerm a1 =null;
		int i =0;
		Abstract_NumberTerm a2 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:409:2: (a1= multexpr (i= addoper a2= multexpr )? )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:409:4: a1= multexpr (i= addoper a2= multexpr )?
			{
			pushFollow(FOLLOW_multexpr_in_arithexpr2370);
			a1=multexpr();
			state._fsp--;

			ae = a1;
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:409:28: (i= addoper a2= multexpr )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==MINUS||LA62_0==PLUS) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:409:29: i= addoper a2= multexpr
					{
					pushFollow(FOLLOW_addoper_in_arithexpr2377);
					i=addoper();
					state._fsp--;

					pushFollow(FOLLOW_multexpr_in_arithexpr2381);
					a2=multexpr();
					state._fsp--;

					ae = new Abstract_ArithExpr(ae, i, a2);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ae;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "multexpr"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:410:1: multexpr returns [Abstract_NumberTerm ae] : a1= atom_term (i= multoper a2= atom_term )? ;
	public final Abstract_NumberTerm multexpr() throws RecognitionException {
		Abstract_NumberTerm ae = null;


		Abstract_NumberTerm a1 =null;
		int i =0;
		Abstract_NumberTerm a2 =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:411:2: (a1= atom_term (i= multoper a2= atom_term )? )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:411:4: a1= atom_term (i= multoper a2= atom_term )?
			{
			pushFollow(FOLLOW_atom_term_in_multexpr2399);
			a1=atom_term();
			state._fsp--;

			ae = a1;
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:411:28: (i= multoper a2= atom_term )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==DIV||LA63_0==MULT) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:411:29: i= multoper a2= atom_term
					{
					pushFollow(FOLLOW_multoper_in_multexpr2405);
					i=multoper();
					state._fsp--;

					pushFollow(FOLLOW_atom_term_in_multexpr2409);
					a2=atom_term();
					state._fsp--;

					ae = new Abstract_ArithExpr(ae, i, a2);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ae;
	}
	// $ANTLR end "multexpr"



	// $ANTLR start "atom_term"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:413:1: atom_term returns [Abstract_NumberTerm t] : (n= numberstring |v= var ) ;
	public final Abstract_NumberTerm atom_term() throws RecognitionException {
		Abstract_NumberTerm t = null;


		String n =null;
		Abstract_VarTerm v =null;

		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:414:2: ( (n= numberstring |v= var ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:414:4: (n= numberstring |v= var )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:414:4: (n= numberstring |v= var )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==MINUS||LA64_0==NUMBER) ) {
				alt64=1;
			}
			else if ( (LA64_0==VAR) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:414:5: n= numberstring
					{
					pushFollow(FOLLOW_numberstring_in_atom_term2431);
					n=numberstring();
					state._fsp--;

					t = new Abstract_NumberTermImpl(n);
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:414:66: v= var
					{
					pushFollow(FOLLOW_var_in_atom_term2439);
					v=var();
					state._fsp--;

					t = v;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "atom_term"



	// $ANTLR start "addoper"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:417:1: addoper returns [int i] : ( PLUS | MINUS ) ;
	public final int addoper() throws RecognitionException {
		int i = 0;


		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:418:2: ( ( PLUS | MINUS ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:418:4: ( PLUS | MINUS )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:418:4: ( PLUS | MINUS )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==PLUS) ) {
				alt65=1;
			}
			else if ( (LA65_0==MINUS) ) {
				alt65=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:418:5: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_addoper2458); 
					i = 1;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:418:22: MINUS
					{
					match(input,MINUS,FOLLOW_MINUS_in_addoper2464); 
					i = 2;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "addoper"



	// $ANTLR start "multoper"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:419:1: multoper returns [int i] : ( MULT | DIV ) ;
	public final int multoper() throws RecognitionException {
		int i = 0;


		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:420:2: ( ( MULT | DIV ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:420:4: ( MULT | DIV )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:420:4: ( MULT | DIV )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==MULT) ) {
				alt66=1;
			}
			else if ( (LA66_0==DIV) ) {
				alt66=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:420:5: MULT
					{
					match(input,MULT,FOLLOW_MULT_in_multoper2481); 
					i = 3;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:420:22: DIV
					{
					match(input,DIV,FOLLOW_DIV_in_multoper2487); 
					i = 4;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "multoper"



	// $ANTLR start "eqoper"
	// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:421:1: eqoper returns [int i] : ( LESS | ( IS | EQUALS ) ) ;
	public final int eqoper() throws RecognitionException {
		int i = 0;


		try {
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:421:24: ( ( LESS | ( IS | EQUALS ) ) )
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:421:26: ( LESS | ( IS | EQUALS ) )
			{
			// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:421:26: ( LESS | ( IS | EQUALS ) )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==LESS) ) {
				alt67=1;
			}
			else if ( (LA67_0==EQUALS||LA67_0==IS) ) {
				alt67=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:421:27: LESS
					{
					match(input,LESS,FOLLOW_LESS_in_eqoper2503); 
					i = 1;
					}
					break;
				case 2 :
					// /Users/louiseadennis/Eclipse/mcapl/src/classes/goal/parser/GOAL.g:421:44: ( IS | EQUALS )
					{
					if ( input.LA(1)==EQUALS||input.LA(1)==IS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					i = 2;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "eqoper"

	// Delegated rules



	public static final BitSet FOLLOW_MAIN_in_mas74 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLON_in_mas76 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_mas80 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_mas82 = new BitSet(new long[]{0x0000050081000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_moduleImport_in_mas89 = new BitSet(new long[]{0x0000050081010000L,0x0000000000000010L});
	public static final BitSet FOLLOW_module_in_mas95 = new BitSet(new long[]{0x0000050081010000L,0x0000000000000010L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_mas102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_moduleImport116 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_MODULEFILE_in_moduleImport118 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_moduleImport120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_moduleDef_in_module137 = new BitSet(new long[]{0x2000000000020000L});
	public static final BitSet FOLLOW_SQOPEN_in_module142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_moduleOption_in_module144 = new BitSet(new long[]{0x1000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_module148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
	public static final BitSet FOLLOW_moduleOption_in_module150 = new BitSet(new long[]{0x1000000000002000L});
	public static final BitSet FOLLOW_SQCLOSE_in_module155 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_module160 = new BitSet(new long[]{0x0020000810010410L,0x0000000000000010L});
	public static final BitSet FOLLOW_krImport_in_module162 = new BitSet(new long[]{0x0020000810010410L});
	public static final BitSet FOLLOW_knowledge_in_module165 = new BitSet(new long[]{0x0020000010010410L});
	public static final BitSet FOLLOW_beliefs_in_module170 = new BitSet(new long[]{0x0020000010010010L});
	public static final BitSet FOLLOW_goals_in_module174 = new BitSet(new long[]{0x0020000000010010L});
	public static final BitSet FOLLOW_program_in_module178 = new BitSet(new long[]{0x0000000000010010L});
	public static final BitSet FOLLOW_actionSpecs_in_module187 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_module195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODULE_in_moduleDef210 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_moduleDef212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INIT_in_moduleDef217 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_MODULE_in_moduleDef219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_moduleDef226 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_MODULE_in_moduleDef228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVENT_in_moduleDef235 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_MODULE_in_moduleDef237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_moduleOption256 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EQUALS_in_moduleOption258 = new BitSet(new long[]{0x0000000000000000L,0x00000000001A0200L});
	public static final BitSet FOLLOW_73_in_moduleOption265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_moduleOption275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_moduleOption285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_moduleOption296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_moduleOption310 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EQUALS_in_moduleOption312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A41000L});
	public static final BitSet FOLLOW_set_in_moduleOption318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_krImport343 = new BitSet(new long[]{0x8800000000000000L});
	public static final BitSet FOLLOW_stringLiteral_in_krImport346 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_singleQuotedStringLiteral_in_krImport350 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_krImport353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KNOWLEDGE_in_knowledge366 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_knowledge368 = new BitSet(new long[]{0x0000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_krspec_in_knowledge370 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_knowledge373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_krspec385 = new BitSet(new long[]{0x4040000000000000L});
	public static final BitSet FOLLOW_STOP_in_krspec389 = new BitSet(new long[]{0x0000820000008002L,0x0000000000000004L});
	public static final BitSet FOLLOW_PROLOGARROW_in_krspec396 = new BitSet(new long[]{0x0000C20000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_no_bracket_literals_in_krspec400 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_krspec402 = new BitSet(new long[]{0x0000820000008002L,0x0000000000000004L});
	public static final BitSet FOLLOW_BELIEFS_in_beliefs418 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_beliefs420 = new BitSet(new long[]{0x0000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_brspec_in_beliefs422 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_beliefs425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_brspec437 = new BitSet(new long[]{0x4040000000000000L});
	public static final BitSet FOLLOW_STOP_in_brspec441 = new BitSet(new long[]{0x0000820000008002L,0x0000000000000004L});
	public static final BitSet FOLLOW_PROLOGARROW_in_brspec448 = new BitSet(new long[]{0x0000C20000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_no_bracket_literals_in_brspec452 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_brspec454 = new BitSet(new long[]{0x0000820000008002L,0x0000000000000004L});
	public static final BitSet FOLLOW_GOALS_in_goals471 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_goals473 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_goal_list_in_goals477 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_goals481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationOrCallWithTerms_in_atom497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equation_in_atom506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROGRAM_in_program521 = new BitSet(new long[]{0x2000000000020000L});
	public static final BitSet FOLLOW_SQOPEN_in_program524 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ruleEvaluationOrder_in_program528 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SQCLOSE_in_program532 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_program538 = new BitSet(new long[]{0x0000000060010000L,0x000000000000C000L});
	public static final BitSet FOLLOW_macroDef_in_program540 = new BitSet(new long[]{0x0000000060010000L,0x000000000000C000L});
	public static final BitSet FOLLOW_programRule_in_program543 = new BitSet(new long[]{0x0000000040010000L,0x000000000000C000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_program547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQOPEN_in_ruleEvaluationOrder564 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_ORDER_in_ruleEvaluationOrder566 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_EQUALS_in_ruleEvaluationOrder568 = new BitSet(new long[]{0x0180006000000020L});
	public static final BitSet FOLLOW_LINEAR_in_ruleEvaluationOrder572 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LINEARALL_in_ruleEvaluationOrder579 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RANDOM_in_ruleEvaluationOrder585 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RANDOMALL_in_ruleEvaluationOrder591 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_ADAPTIVE_in_ruleEvaluationOrder598 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SQCLOSE_in_ruleEvaluationOrder604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASH_in_macroDef613 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_DEFINE_in_macroDef615 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_declarationOrCallWithTerms_in_macroDef619 = new BitSet(new long[]{0x000040000C008280L,0x000000001D000186L});
	public static final BitSet FOLLOW_mentalstate_in_macroDef624 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_macroDef630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_programRule644 = new BitSet(new long[]{0x000040000C008280L,0x000000001D000186L});
	public static final BitSet FOLLOW_mentalstatecond_in_programRule648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_THEN_in_programRule652 = new BitSet(new long[]{0x04000101814A8040L,0x000000001F410984L});
	public static final BitSet FOLLOW_actions_in_programRule658 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_programRule662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedRules_in_programRule666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_programRule675 = new BitSet(new long[]{0x000040000C008280L,0x000000001D000186L});
	public static final BitSet FOLLOW_mentalstatecond_in_programRule677 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DO_in_programRule679 = new BitSet(new long[]{0x04000101814A8040L,0x000000001F410984L});
	public static final BitSet FOLLOW_actions_in_programRule682 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_programRule684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedRules_in_programRule688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_programRule696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_programRule698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_programRule700 = new BitSet(new long[]{0x000040000C008280L,0x000000001D000186L});
	public static final BitSet FOLLOW_mentalstatecond_in_programRule702 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DO_in_programRule704 = new BitSet(new long[]{0x04000101814A8040L,0x000000001F410984L});
	public static final BitSet FOLLOW_actions_in_programRule707 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_programRule709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedRules_in_programRule713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_programRule722 = new BitSet(new long[]{0x000040000C008280L,0x000000001D000186L});
	public static final BitSet FOLLOW_mentalstatecond_in_programRule724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_programRule726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_programRule728 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_DO_in_programRule730 = new BitSet(new long[]{0x04000101814A8040L,0x000000001F410984L});
	public static final BitSet FOLLOW_actions_in_programRule733 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_programRule735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedRules_in_programRule739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURLYOPEN_in_nestedRules757 = new BitSet(new long[]{0x0000000040000000L,0x000000000000C000L});
	public static final BitSet FOLLOW_programRule_in_nestedRules759 = new BitSet(new long[]{0x0000000040010000L,0x000000000000C000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_nestedRules763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicCondition_in_mentalstatecond781 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_mentalstatecond787 = new BitSet(new long[]{0x000040000C008280L,0x000000001D000186L});
	public static final BitSet FOLLOW_basicCondition_in_mentalstatecond791 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_mentalatom_in_mentalstate814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_mentalstate821 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_OPEN_in_mentalstate823 = new BitSet(new long[]{0x000000000C008280L,0x000000001D000184L});
	public static final BitSet FOLLOW_mentalatom_in_mentalstate825 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLOSE_in_mentalstate827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_mentalstate832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mentalstate_in_basicCondition852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationOrCallWithTerms_in_basicCondition861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_mentalatom881 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_mentalatom883 = new BitSet(new long[]{0x000000000C000280L});
	public static final BitSet FOLLOW_mentalOperator_in_mentalatom889 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_atom_parameters_in_mentalatom893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_in_atom_parameters912 = new BitSet(new long[]{0x0001820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_atom_parameters919 = new BitSet(new long[]{0x0200000000002800L});
	public static final BitSet FOLLOW_COMMA_in_atom_parameters925 = new BitSet(new long[]{0x0000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_atom_parameters929 = new BitSet(new long[]{0x0200000000002800L});
	public static final BitSet FOLLOW_SEMI_in_atom_parameters936 = new BitSet(new long[]{0x0000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_atom_parameters942 = new BitSet(new long[]{0x0200000000002800L});
	public static final BitSet FOLLOW_atom_parameters_in_atom_parameters959 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLOSE_in_atom_parameters967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BEL_in_mentalOperator988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOAL_in_mentalOperator999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGOAL_in_mentalOperator1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GOALA_in_mentalOperator1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_action_in_actions1044 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_PLUS_in_actions1051 = new BitSet(new long[]{0x0400010181488040L,0x000000001F410984L});
	public static final BitSet FOLLOW_action_in_actions1055 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_selector_in_action1075 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_STOP_in_action1077 = new BitSet(new long[]{0x0400000100480040L,0x0000000002410000L});
	public static final BitSet FOLLOW_actionOperator_in_action1083 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_parameters_in_action1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_action1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_action1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INIT_in_action1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAIN_in_action1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EVENT_in_action1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationOrCallWithTerms_in_action1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ADOPT_in_actionOperator1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_actionOperator1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_actionOperator1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_actionOperator1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEND_in_actionOperator1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_actionOperator1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_actionOperator1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_actionOperator1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_word_in_selector1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_selector1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_selector1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_selector1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_selector1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_selector1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_selector1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTIONSPEC_in_actionSpecs1318 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_actionSpecs1320 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_actionSpec_in_actionSpecs1325 = new BitSet(new long[]{0x0000000000018000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_actionSpecs1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationOrCallWithTerms_in_actionSpec1348 = new BitSet(new long[]{0x0000000202020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_actionSpec1361 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_precondition_in_actionSpec1365 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_postcondition_in_actionSpec1369 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_actionSpec1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_in_precondition1389 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_precondition1391 = new BitSet(new long[]{0x0000C20000008000L,0x0000000000000006L});
	public static final BitSet FOLLOW_TRUE_in_precondition1395 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_no_bracket_literals_in_precondition1405 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_precondition1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_in_postcondition1425 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_CURLYOPEN_in_postcondition1428 = new BitSet(new long[]{0x0000C20000008000L,0x0000000000000006L});
	public static final BitSet FOLLOW_TRUE_in_postcondition1432 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_no_bracket_literals_in_postcondition1442 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CURLYCLOSE_in_postcondition1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_declaration1468 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_parameters_in_declaration1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_term_in_declarationOrCallWithTerms1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_id1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_id1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_in_parameters1545 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_parameters1549 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_COMMA_in_parameters1555 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_parameters1559 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_CLOSE_in_parameters1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_no_bracket_parameters1589 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_no_bracket_parameters1595 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_no_bracket_parameters1599 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_NOT_in_no_bracket_literals1629 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_OPEN_in_no_bracket_literals1631 = new BitSet(new long[]{0x0000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_no_bracket_literals1635 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLOSE_in_no_bracket_literals1639 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_atom_in_no_bracket_literals1647 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_no_bracket_literals1654 = new BitSet(new long[]{0x0000C20000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_NOT_in_no_bracket_literals1657 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_OPEN_in_no_bracket_literals1659 = new BitSet(new long[]{0x0000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_atom_in_no_bracket_literals1663 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLOSE_in_no_bracket_literals1667 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_atom_in_no_bracket_literals1676 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_term_in_goal_list1704 = new BitSet(new long[]{0x4000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_goal_list1711 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_goal_list1715 = new BitSet(new long[]{0x4000000000002000L});
	public static final BitSet FOLLOW_STOP_in_goal_list1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringterm_in_term2048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_term_in_term2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_term2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listterm_in_term2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_function_term2095 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_OPEN_in_function_term2102 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_function_term2106 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_COMMA_in_function_term2113 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_function_term2117 = new BitSet(new long[]{0x0000000000002800L});
	public static final BitSet FOLLOW_CLOSE_in_function_term2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_var2142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringterm_in_stringLiteral2159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLEQUOTE_in_singleQuotedStringLiteral2173 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_word_in_singleQuotedStringLiteral2177 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLEQUOTE_in_singleQuotedStringLiteral2179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_stringterm2196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_word2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_word2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SQOPEN_in_listterm2240 = new BitSet(new long[]{0xB000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_listterm2245 = new BitSet(new long[]{0x1000000000002100L});
	public static final BitSet FOLLOW_COMMA_in_listterm2252 = new BitSet(new long[]{0xA000820000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_listterm2256 = new BitSet(new long[]{0x1000000000002100L});
	public static final BitSet FOLLOW_BAR_in_listterm2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VAR_in_listterm2269 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SQCLOSE_in_listterm2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_equation2299 = new BitSet(new long[]{0x0000001400800000L});
	public static final BitSet FOLLOW_eqoper_in_equation2303 = new BitSet(new long[]{0x0000820000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_arithexpr_in_equation2307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_numberstring2327 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_numberstring2338 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_STOP_in_numberstring2344 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_numberstring2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multexpr_in_arithexpr2370 = new BitSet(new long[]{0x0004020000000002L});
	public static final BitSet FOLLOW_addoper_in_arithexpr2377 = new BitSet(new long[]{0x0000820000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_multexpr_in_arithexpr2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_term_in_multexpr2399 = new BitSet(new long[]{0x0000100000100002L});
	public static final BitSet FOLLOW_multoper_in_multexpr2405 = new BitSet(new long[]{0x0000820000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_atom_term_in_multexpr2409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberstring_in_atom_term2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_atom_term2439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_addoper2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_addoper2464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULT_in_multoper2481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIV_in_multoper2487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LESS_in_eqoper2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_eqoper2509 = new BitSet(new long[]{0x0000000000000002L});
}