grammar ProjLang;
// Lexer specification
fragment LETTER
        :     'a'..'z' | 'A'..'Z'
        ;
fragment DIGIT
        : '0'..'9'
        ;
NUMBER : DIGIT+;

IF	:	'if';
THEN	:	'then';
ELSE	:	'else';
//COLN	:	':';
FUN     :	'fun';
LEFTCUB	:	'{';
RIGHTCUB:	'}';
LFTPARANTHESIS	 :	'(';
RIGHTPARANTHESIS :	')';

LET	:	'let';
VAL	:	'val';
IN	:	'in';
END	:	'end';
WHILE   :	'while';
DO	:	'do';
SEMICOLON :	';';
COLON	:	':=';
NOT	:	'!';
ADDOP   :	('+'|'-'|'|');
MULOP   :	('*'| '/'|'&');
RELOP	: 	('<');
EQUAL	:	'=';
TRU	:	'true';
FALS	:	'false';
ID	:	LETTER(LETTER | DIGIT)*;
WS	:	(' ' |'\t'|'\n'|'\r')+{skip();};



//ADDOP : '+'|'-'|'|';
//MULOP : '*'|'/'|'&';
//RELOP   : '<';
//EQUAL	:	'=';
//LPAR : '(';
//RPAR : ')';
//LF : '{';
//RF : '}';
//ASSIGN : ':=';
//TRUE 	: 'true';
//FALSE 	: 'false';
//IF	: 'if';
//ELSE 	: 'else';
//SC: ';';/
//END:'end';
//NOTEQ: '!';
//WS : (' ' | '\t' | '\n' | '\r')+ { skip(); };
//ID : LETTER (LETTER | DIGIT)*;
// Parser Specification
input  returns [Expr obj]: expr {$obj=$expr.obj;}
;
expr returns [Expr obj]: 'if' a=expr 'then' b=expr 'else' c=expr{$obj=new IfExp($a.obj,$b.obj,$c.obj);}
       |'while' h=expr 'do' i=expr {$obj=new WhileExp($h.obj,$i.obj);}
       | 'let' 'fun' fun1=ID LFTPARANTHESIS fun2=ID RIGHTPARANTHESIS EQUAL f=expr 'in' g=expr END{$obj = new LetFunExp($fun1.text,$fun2.text,$f.obj,$g.obj);}
       | 'let' 'val' ID EQUAL d = expr 'in' e =expr END {$obj=new LetValExp($ID.text,$d.obj,$e.obj);}
       | NOT l=expr {$obj=new NotExp($l.obj);}
       //| string4=ID COLON  m=expr {$obj=new AssnExp($string4.text,$m.obj);}
       |ID COLON m = expr { obj = new AssnExp($m.obj);}
       | LEFTCUB j=expr(SEMICOLON k=expr{$obj=new SeqExp($obj,$k.obj);})* RIGHTCUB
       | n=relexpr{$obj=$n.obj;}
       ;

relexpr returns [Expr obj]: O=arithexpr{$obj=$O.obj;}((P=RELOP|P=EQUAL)
                           Q=arithexpr{if ($P.text.equals("=")) $obj=new BinExp(BinOp.EQ,$obj,$Q.obj);
		           else $obj=new BinExp(BinOp.LT,$obj,$Q.obj);})?
;


arithexpr returns [Expr obj]: R=term{$obj=$R.obj;}
                             (ADDOP S=term{if ($ADDOP.text.equals("+")) $obj = new BinExp(BinOp.PLUS,$obj,$S.obj);
		              else if($ADDOP.text.equals("-")) $obj=new BinExp(BinOp.MINUS,$obj,$S.obj);
			      else if($ADDOP.text.equals("|")) $obj = new BinExp(BinOp.OR,$obj,$S.obj);})*
;
term  returns [Expr obj]: T = factor{$obj=$T.obj;}
                             (MULOP U=factor{if ($MULOP.text.equals("*")) $obj=new BinExp(BinOp.TIMES,$obj,$U.obj);
		              else if ($MULOP.text.equals("/")) $obj=new BinExp(BinOp.DIV,$obj,$U.obj);
			      else if($MULOP.text.equals("&")) $obj=new BinExp(BinOp.AND,$obj,$U.obj);})*
;
factor returns [Expr obj]: NUMBER{$obj = new IntConst(Integer.parseInt($NUMBER.text));}
| TRU {$obj=new BoolConst(Boolean.parseBoolean("true"));}
| FALS {$obj=new BoolConst(Boolean.parseBoolean("false"));}
| ID{$obj=new VarExp($ID.text);}
| lp = ID LFTPARANTHESIS X=expr RIGHTPARANTHESIS {$obj=new AppExp($lp.text,$X.obj);}
|LFTPARANTHESIS Z=expr{$obj=$Z.obj;} RIGHTPARANTHESIS
;