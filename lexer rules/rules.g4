grammar rules;

fragment A : ('A'| 'a');
fragment  S : ('S'| 's');
fragment  H : ('H'| 'h');
fragment  O : ('O'| 'o');
fragment  U : ('U'| 'u');
fragment  Y : ('Y'| 'y');
fragment  T : ('T'| 't');

fragment LOWER: [a-z];
fragment UPPER: [A-Z];
fragment DIGIT : [0-9] ;

SAYS :  S A Y S;
SHOUTS : S H O U T S;

WORD: (UPPER|LOWER |'_')+;

NUMBER: DIGIT+ ([.,] DIGIT+)? ;

WHITESPACE: ('_' | '\t');

NEWLINE : ('\r'?'\n'| '\r');

TEXT    : ~[\])\r\n]+ ;