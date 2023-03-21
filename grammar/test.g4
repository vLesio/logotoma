grammar test;

program
    : (line? EOL+)+ line? EOF
    ;

line
    : command comment?
    | comment
    ;

command
    : move
    | function
    | f_call
    | brush_color
    | assign
    | loope
    | ife
    | whilee
    | elsee
    | paint
    | linee
    | save
    | circle
    ;

move
    : ('mv' | 'move') ('+' | '-')?aritmetic_expression ('+' | '-')?aritmetic_expression
    ;

assign
    : type_name deref '=' value
    | deref '=' value
    ;

paint
    : 'paint'
    ;

save
    : 'save' string
    ;

brush_shape
    : ('brush-shape' | 'bs-sh') SHAPE 
    ;

brush_color
    : ('brush-color' | 'bs-cl') color
    ;

brush_size
    : ('brush-size' | 'bs-sz') number
    ;

linee
    : 'line' aritmetic_expression aritmetic_expression aritmetic_expression aritmetic_expression
    ;

circle
    : 'circle' aritmetic_expression aritmetic_expression aritmetic_expression
    ;

color
    : '(' number ',' number ',' number ')'
    | '(' number ',' number ',' number ',' number ')'
    ;

number
    : SIGN_OPERATORS* NUMBER
    ;

type_name
    : 'shape'
    | 'bool'
    | 'color'
    | 'number'
    | 'string'
    ;

name
    : STRING
    ;

value
    : aritmetic_expression
    | logic_expression
    | string
    | deref
    | color
    ;

ife
    : 'if' '(' logic_expression ')' block
    ;

loope
    : 'loop' value 'times' block
    ;

whilee
    : 'loop while'  logic_expression  block
    ;

elsee
    : 'else' block
    ;

aritmetic_expression
    : number
    | aritmetic_expression ARITMETIC_OPERATORS aritmetic_expression
    | aritmetic_expression SIGN_OPERATORS aritmetic_expression
    | deref
    ;

logic_expression
    : bool
    | logic_expression LOGIC_OPERATORS logic_expression
    | NEGATION_OPERATOR logic_expression
    | deref
    | number ARITMETIC_OPERATORS number
    | logic_expression COMPARISON_OPERATORS logic_expression
    ;

bool
    : BOOL
    ;

deref
    : STRING
    ;

string
    : STRING
    ;

block
    : '{' (line EOL*)+ '}'
    ;

function
    : type_name 'pattern' name '(' type_name deref (',' type_name deref)* ')' block
    ;

f_call
    : name '(' aritmetic_expression (',' aritmetic_expression)* ')'
    ;

comment
    : '#' STRING*
    ;

SIGN_OPERATORS
    : '+'
    | '-'
    ;

NUMBER
    : [0-9]+
    ;

ARITMETIC_OPERATORS
    : '/'
    | '*'
    | '%'
    | '+'
    | '-'
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

BOOL
    : 'True'
    | 'False'
    ;

SHAPE
    : 'Caligrafic'
    | 'Dot'
    ;

STRING
    : [a-zA-Z_]+
    ;

EOL
   : '\r'? '\n'
   ;

WS
    : [ \t\r\n]+ -> skip
    ;