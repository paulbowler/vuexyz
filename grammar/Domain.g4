grammar Domain;

r : 'domain' NAME ;
NAME : ALPHA ;
ALPHA : [a-z]+ ;
WS : [ \t\r\n]+ -> skip;
