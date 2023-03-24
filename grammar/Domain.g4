grammar Domain;

app         : (object)* ;

object      : ( domain | view ) ;

domain      : DOMAIN WORD attribute+ ;

view        : VIEW WORD ;

attribute   : WORD ':' (STRING|INTEGER) ;

fragment D          : ('D'|'d') ;
fragment O          : ('O'|'o') ;
fragment M          : ('M'|'m') ;
fragment A          : ('A'|'a') ;
fragment I          : ('I'|'i') ;
fragment N          : ('N'|'n') ;
fragment S          : ('S'|'s') ;
fragment T          : ('T'|'t') ;
fragment R          : ('R'|'r') ;
fragment G          : ('G'|'g') ;
fragment E          : ('E'|'e') ;
fragment V          : ('V'|'v') ;
fragment W          : ('W'|'w') ;

DOMAIN              : D O M A I N ;
VIEW                : V I E W ;

STRING              : S T R I N G ;
INTEGER             : I N T E G E R ;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

SEPERATOR           : ':' ;

WORD                : (LOWERCASE | UPPERCASE | '_')+ ;

NEWLINE             : ('\r'? '\n' | '\r')+ -> skip;
WS                  : [ \t]+ -> skip;
