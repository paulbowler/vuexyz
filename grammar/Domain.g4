grammar Domain;

database            : (db_table)+ ;

db_table            : TABLE WORD db_attribute* ;

db_attribute        : WORD ':' (STRING|INTEGER) ;

TABLE               : [tT][aA][bB][lL][eE] ;
VIEW                : [vV][iI][eE][wW] ;

STRING              : [sS][tT][rR][iI][nN][gG] ;
INTEGER             : [iI][nN][tT][eE][gG][eE][rR] ;

WORD                : (LOWERCASE | UPPERCASE | '_')+ ;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

SEPARATOR           : ':' ;

NEWLINE             : ('\r'? '\n' | '\r')+ -> skip;
WS                  : [ \t]+ -> skip;