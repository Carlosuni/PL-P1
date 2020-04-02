
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package cup.p1;

import java_cup.runtime.*;
import cup.p1.Lexer;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\003\000\002\003\003" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\004\000\002\004\005\000\002\004\003\000\002" +
    "\004\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\020\006\004\011\014\013\005\014\015\015" +
    "\013\016\006\017\010\001\002\000\014\006\004\011\014" +
    "\013\005\015\013\016\006\001\002\000\014\004\ufff6\005" +
    "\ufff6\006\ufff6\010\ufff6\012\ufff6\001\002\000\014\004\ufff4" +
    "\005\ufff4\006\ufff4\010\ufff4\012\ufff4\001\002\000\022\002" +
    "\uffff\006\uffff\011\uffff\013\uffff\014\uffff\015\uffff\016\uffff" +
    "\017\uffff\001\002\000\022\002\ufffc\006\ufffc\011\ufffc\013" +
    "\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\001\002\000\012" +
    "\004\030\005\020\006\021\010\022\001\002\000\022\002" +
    "\026\006\004\011\014\013\005\014\015\015\013\016\006" +
    "\017\010\001\002\000\014\004\ufff5\005\ufff5\006\ufff5\010" +
    "\ufff5\012\ufff5\001\002\000\014\006\004\011\014\013\005" +
    "\015\013\016\006\001\002\000\022\002\ufffd\006\ufffd\011" +
    "\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd\017\ufffd\001\002" +
    "\000\012\005\020\006\021\010\022\012\017\001\002\000" +
    "\014\004\ufff7\005\ufff7\006\ufff7\010\ufff7\012\ufff7\001\002" +
    "\000\014\006\004\011\014\013\005\015\013\016\006\001" +
    "\002\000\014\006\004\011\014\013\005\015\013\016\006" +
    "\001\002\000\014\006\004\011\014\013\005\015\013\016" +
    "\006\001\002\000\014\004\ufff9\005\ufff9\006\ufff9\010\ufff9" +
    "\012\ufff9\001\002\000\014\004\ufffa\005\ufffa\006\ufffa\010" +
    "\022\012\ufffa\001\002\000\014\004\ufffb\005\ufffb\006\ufffb" +
    "\010\022\012\ufffb\001\002\000\004\002\000\001\002\000" +
    "\022\002\001\006\001\011\001\013\001\014\001\015\001" +
    "\016\001\017\001\001\002\000\022\002\ufffe\006\ufffe\011" +
    "\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\017\ufffe\001\002" +
    "\000\014\004\ufff8\005\ufff8\006\ufff8\010\ufff8\012\ufff8\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\010\002\011\003\006\004\010\001\001\000" +
    "\004\004\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\003\026\004\010\001\001\000\002\001\001\000\004" +
    "\004\015\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\024\001\001\000\004\004\023" +
    "\001\001\000\004\004\022\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//@@CUPDBG1

  ComplexSymbolFactory f = new ComplexSymbolFactory();
  symbolFactory = f;
  File file = new File("input.txt");
  FileInputStream fis = null;
  try {
    fis = new FileInputStream(file);
  } catch (IOException e) {
    e.printStackTrace();
  } 
  lexer = new Lexer(f,fis);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
//@@CUPDBG2
 return lexer.next_token(); 
    }

//@@CUPDBG0

  protected Lexer lexer;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // statement_list ::= statement_list statement 
            {
              Object RESULT =null;
		//@@CUPDBG3
  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement_list",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= statement_list EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statement_list ::= statement 
            {
              Object RESULT =null;
		//@@CUPDBG4
  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement_list",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statement ::= expr SEMI 
            {
              Object RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG5
 System.out.println(e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= COMMENT 
            {
              Object RESULT =null;
		//@@CUPDBG6
  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= NOMBREAPELLIDOS 
            {
              Object RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String e = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG7
 System.out.println("Nombre y apellidos: " + e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr PLUS expr 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG8
 RESULT = e1+e2;        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr MINUS expr 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG9
 RESULT = e1-e2;        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr TIMES expr 
            {
              Double RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG10
 RESULT = e1*e2;        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= MINUS expr 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG11
 RESULT = -e;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= LPAREN expr RPAREN 
            {
              Double RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG12
 RESULT = e;           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= NUMBER 
            {
              Double RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG13
 RESULT = Double.valueOf(n);       
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= DOUBLENUMBER 
            {
              Double RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG14
 RESULT = n;       
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= HEXNUMBER 
            {
              Double RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG15
 RESULT = Double.valueOf(n);       
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
