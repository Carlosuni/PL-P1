package cup.p1;
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
Whitespace = [ \t\f]
Number     = [0-9]+
WhitespaceNewline = [ \t\f] | {Newline}

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {ModernComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

ModernComment = "<!--"(.|{Newline})*"-->"		// Option 2 (Last year)

RealNumber = {Number}"."{Number}
ScienceNumber = ({Number} | {RealNumber}) ("e"|"E")("-"|"+"|"") {Number}
DoubleNumber = {RealNumber}|{ScienceNumber}
HexAlfaNumber = ([0-9A-F])+
HexNumber = "0x"{HexAlfaNumber}

NombrePalabra = [A-ZÑÁÉÍÓÚ][a-zñáéíóú]*
NombreApellidos = ({NombrePalabra}{Whitespace}*)+



ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {WhitespaceNewline} {                              }
  ";"          { return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          { return symbolFactory.newSymbol("PLUS", PLUS); }
  "-"          { return symbolFactory.newSymbol("MINUS", MINUS); }
  "*"          { return symbolFactory.newSymbol("TIMES", TIMES); }
  "n"          { return symbolFactory.newSymbol("UMINUS", UMINUS); }
  "("          { return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          { return symbolFactory.newSymbol("RPAREN", RPAREN); }
  {Number}     { return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.parseInt(yytext())); }
  {Comment}			{ return symbolFactory.newSymbol("COMMENT", COMMENT); }
  {DoubleNumber}	{ return symbolFactory.newSymbol("DOUBLENUMBER", DOUBLENUMBER, Double.parseDouble(yytext())); }
  {HexNumber}     { return symbolFactory.newSymbol("HEXNUMBER", HEXNUMBER, Integer.parseInt(yytext().substring(2,yytext().length()), 16)); }
  {NombreApellidos}	{ return symbolFactory.newSymbol("NOMBREAPELLIDOS", NOMBREAPELLIDOS, yytext()); }
    
}



// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
