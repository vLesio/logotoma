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
    | function
    | assign
    | loope
    | ife
    | whilee
    | elsee
    | paint
    | linee
    | save
    | '}'
    ;

comment
    : '#' string*
    ;

move
    : ('move' | 'mv') ('+' | '-')?number ('+' | '-')?number
    ;

paint
    : 'paint'
    ;

linee
    : 'line' aritmetic_expression' 'aritmetic_expression' 'aritmetic_expression' 'aritmetic_expression
    ;

save
    : 'save' string
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

aritmetic_expression
    : number
    | aritmetic_expression SIGN_OPERATORS aritmetic_expression
    | aritmetic_expression ARITMETIC_OPERATORS aritmetic_expression
    | deref
    ;

logic_expression
    : bool
    | logic_expression LOGIC_OPERATORS logic_expression
    | NEGATION_OPERATOR logic_expression
    | deref
    | number ARITMETIC_OPERATORS number
    ;

assign
    : type_name deref '=' value
    | deref '=' value
    ;

type_name
    : 'shape'
    | 'bool'
    | 'color'
    | 'number'
    | 'string'
    ;

name
    : NAME
    ;

value
    : aritmetic_expression
    | logic_expression
    | string
    | deref
    ;

deref
    : NAME
    ;

block
    : '{' line+ '}'
    ;

function
    : type_name 'pattern' name '(' type_name deref (',' type_name deref)* ')' block
    ;

ife
    : 'if (' logic_expression ')' block
    ;

loope
    : 'loop (' number ') times' block
    ;

whilee
    : 'loop while (' logic_expression ')' block
    ;

elsee
    : 'else' block
    ;

NAME
    : [a-zA-Z][a-zA-Z0-9]*
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
    : [a-zA-Z_\-0-9.]+
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