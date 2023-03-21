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
    : ('mv' | 'move') ('#')?value ('#')?value
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
    : ('brush-size' | 'bs-sz') value
    ;

linee
    : 'line' value value value value
    ;

circle
    : 'circle' value value value
    ;

color
    : '(' value ',' value ',' value ')'
    | '(' value ',' value ',' value ',' value ')'
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
    : expression
    | string
    | color
    ;

ife
    : 'if' '(' value ')' block
    ;

loope
    : 'loop' value 'times' block
    ;

whilee
    : 'loop while' value  block
    ;

elsee
    : 'else' block
    ;

signExpression
   : (('+' | '-'))* (number | deref | function | '(' expression ')')
   ;

multiplyingExpression
   : signExpression (('*' | '/') signExpression)*
   ;

nestedExpression
   : 
   ;

expression
   : multiplyingExpression (('+' | '-') multiplyingExpression)*
   | logic_expression
   ;

logic_expression
    : bool
    | logic_expression LOGIC_OPERATORS logic_expression
    | NEGATION_OPERATOR logic_expression
    | deref
    | logic_expression COMPARISON_OPERATORS logic_expression
    ;

number
    : SIGN_OPERATORS* NUMBER
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
    : name '(' value (',' value)* ')'
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