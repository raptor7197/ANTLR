lexer grammar MarkupLexer;

OPEN : '[' -> pushMode(BBCODE);
TEXT : ~('[')+ ;

mode BBCODE ;

// Modes are like different "states" the lexer can be in
// in this mode only the following rules apply until we reach the pop mode
    //Like different "personalities" for your lexer
  //  Default mode = "text processing mode"
//    BBCODE mode = "tag parsing mode"
//Each mode has its own set of rules


CLOSE : ']' -> popMode ;
SLASH : '/' ;
EQUALS : '=' ;

// ? makes it greedy to stop at first " no the last 

STRING : '"' .*? '"' ;  
ID : [a-zA-Z]+ ;
WS : [\t\r\n] -> skip ;

// dont create tokens for white spaces ignore them 

