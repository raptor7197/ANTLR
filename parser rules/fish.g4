grammar fish;

chat : line+ EOF ;

line : name command message NEWLINE ;

message 
    : (emoticon 
     | link 
     | color 
     | mention 
     | WORD 
     | WHITESPACE
     )+ 
    ;

name : WORD WHITESPACE ;

command : (SAYS | SHOUTS) ':' WHITESPACE ;

emoticon 
    : ':' '-'? ')' 
    | ':' '?' ')' 
    ;

link : '[' TEXT ']' '(' TEXT ')' ;

color : '/' WORD '/' message '/' ;

mention : '@' WORD ;

SAYS    : S A Y S ;
SHOUTS  : S H O U T S ;

WORD    : (UPPER | LOWER | '_')+ ;
WHITESPACE : [ \t]+ ;
NEWLINE : ('\r'? '\n' | '\r') ;

TEXT : ~[\])\r\n]+ ;

fragment LOWER : [a-z] ;
fragment UPPER : [A-Z] ;
fragment DIGIT : [0-9] ;

fragment A : [Aa] ;
fragment S : [Ss] ;
fragment Y : [Yy] ;
fragment H : [Hh] ;
fragment O : [Oo] ;
fragment U : [Uu] ;
fragment T : [Tt] ;
