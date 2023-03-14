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

brush_shape
    : ('brush-shape' | 'bs-sh') shape
    ;

brush_color
    : ('brush-color' | 'bs-cl') color
    ;

brush_size
    : ('brush-size' | 'bs-sz') number
    ;

color
    : '(' number ',' number ',' number ')'
    | '(' number ',' number ',' number ',' number ')'
    ;

number
    : SIGN_OPERATORS* NUMBER
    ;

string
    : '"' STRING '"'
    ;

bool
    : BOOL
    ;

shape
    : SHAPE
    ;

compare_expression
    : number ARITMETIC_OPERATORS number
    ;

logic_expression
    : bool
    | compare_expression
    | logic_expression LOGIC_OPERATORS logic_expression
    | NEGATION_OPERATOR logic_expression
    ;

type
    : shape
    | bool
    | color
    | shape
    | number
    | string
    ;

SIGN_OPERATORS
    : '+'
    | '-'
    ;

ARITMETIC_OPERATORS
    : '/'
    | '*'
    | '%'
    ;

NEGATION_OPERATOR
    : '!'
    ;

LOGIC_OPERATORS
    : '|'
    | '&'
    ;

COMPARISON_OPERATORS
    : '=='
    | '<'
    | '>'
    | '<='
    | '>='
    ;

SHAPE
    : ('Caligrafic' | 'Dot')
    ;

BOOL
    : ('True' | 'False')
    ;

STRING
    : [a-zA-Z_-0-9]*
    ;

NUMBER
    : [0-9]+
    ;

EOL
   : '\r'? '\n'
   ;

WS
    : [ \t\r\n]+ -> skip
    ;