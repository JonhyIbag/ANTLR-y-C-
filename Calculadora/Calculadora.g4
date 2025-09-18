grammar Calculadora;
prog: (expr NEWLINE)* expr? EOF;

expr: ID '=' expr                       #AssignExpr
    | expr '^' expr                     #PowerExpr
    | 'sin' '(' expr ')'                #SinExpr
    | 'cos' '(' expr ')'                #CosExpr
    | 'log' '(' expr ')'                #LogExpr
    | expr '*' expr                     #MulExpr
    | expr '/' expr                     #DivExpr
    | expr '+' expr                     #AddExpr
    | expr '-' expr                     #SubExpr
    | '(' expr ')'                      #ParenExpr
    | NUM                               #NumberExpr
    | ID                                #VariableExpr
    ;

NUM: [0-9]+('.'[0-9]+)?;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NEWLINE: ('\r'? '\n')+;
WS: [ \t]+ -> skip;

