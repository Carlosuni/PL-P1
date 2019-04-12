package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}
Number     = [0-9]+

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*
/* Ej1-a */
PercenComment = "%".*{Newline}
/* Ej1-b */
RealNum = {Number} "." {Number}
SciencNum = ({Number} | {RealNum}) ("e"| "e-" | "e+") {Number}


ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {Whitespace} {                              }
  ";"          { return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          { return symbolFactory.newSymbol("PLUS", PLUS); }
  "-"          { return symbolFactory.newSymbol("MINUS", MINUS); }
  "*"          { return symbolFactory.newSymbol("TIMES", TIMES); }
  "n"          { return symbolFactory.newSymbol("UMINUS", UMINUS); }
  "("          { return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          { return symbolFactory.newSymbol("RPAREN", RPAREN); }
  {Number}     { return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.parseInt(yytext())); }
  /* Ej1-a */
  {PercenComment}     { return symbolFactory.newSymbol("PERCCOMM", PERCCOMM); }
  /* Ej1-b */
  {RealNum}     { return symbolFactory.newSymbol("REALNUM", REALNUM, Double.parseDouble(yytext())); }
  {SciencNum}     { return symbolFactory.newSymbol("SCIENCNUM", SCIENCNUM, Double.parseDouble(yytext())); }
  /* Ej2-a */
  "log"		{ return symbolFactory.newSymbol("LOG", LOG); }
  "exp"		{ return symbolFactory.newSymbol("EXP", EXP); }
  ","          { return symbolFactory.newSymbol("COMMA", COMMA); }
  "sin"		{ return symbolFactory.newSymbol("SIN", SIN); }
  "cos"		{ return symbolFactory.newSymbol("COS", COS); }
  /* Ej3-a */
  "/"          { return symbolFactory.newSymbol("DIVIDE", DIVIDE); } 
  "INF"          { return symbolFactory.newSymbol("INF", INF); } 
}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
