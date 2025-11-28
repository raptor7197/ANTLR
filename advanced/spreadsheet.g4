grammar spreadsheet;

expression          : '(' expression ')'                        
                    | expression (ASTERISK|SLASH) expression                  
                    | expression (PLUS|MINUS) expression        
                    | <assoc=right>  expression '^' expression                   
                    | NAME '(' expression ')'                   
                    | NUMBER                                    
                    | ID                                       
                    ;

fragment LETTER     : [a-zA-Z] ;
fragment DIGIT      : [0-9] ;

ASTERISK            : '*' ;
SLASH               : '/' ;
PLUS                : '+' ;
MINUS               : '-' ;

ID                  : LETTER DIGIT ;

NAME                : LETTER+ ;

NUMBER              : DIGIT+ ('.' DIGIT+)? ;

WHITESPACE          : ' ' -> skip;
