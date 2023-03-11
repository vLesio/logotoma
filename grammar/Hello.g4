grammar Hello;

program
    : (line? EOL)+ line? EOF
    ;

line
    : command comment?
    | comment
    ;

command
    : move
    ;

comment
    : 'dupa'
    ;

move
    : ('move' | 'mv') ('+' | '-')?number ('+' | '-')?number
    ;

color
    : '(' number ',' number ',' number ')'
    | '(' number ',' number ',' number ',' number ')'
    ;

number
    : NUMBER
    ;

string
    : '"' STRING '"'
    ;

BOOL
    : ('True' | 'False')
    ;

STRING
    : [a-zA-Z_-0-9]*
    ;

NUMBER
    : '-'?[0-9]+
    ;

EOL
   : '\r'? '\n'
   ;

WS
    : [ \t\r\n]+ -> skip
    ;