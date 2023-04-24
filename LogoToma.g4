grammar LogoToma;

program
    : (line? EOL+)+ line? EOF
    ;

line
    : command comment?
    | comment
    ;

command
    : engine
    | wheel
    | spray
    | spray_color
    | spray_size
    | sleep
    | cast
    | function
    | f_call
    | assign
    | loope
    | ife
    | whilee
    | elsee
    | save
    ;

value
    : string
    | expression
    | logic_expression
    | color
    ;

engine
    : 'engine' ('on' | 'off' | logic_expression)
    ;

wheel
    : 'wheel' ('right' | 'left' | 'off' | logic_expression)
    ;

spray
    : 'spray' ('on' | 'off' | logic_expression)
    ;

spray_color
    : 'spray color' (color | identifier | f_call)
    ;

spray_size
    : 'spray size' expression
    ;

sleep
    : 'sleep' expression
    ;

cast
    : 'cast' object '->' type_name
    ;

object
    : identifier
    ;

assign
    : type_name identifier '=' value
    | identifier '=' value
    ;

save
    : 'save' string
    ;

color
    : '(' value ',' value ',' value ')'
    ;

type_name
    : 'bool'
    | 'color'
    | 'int'
    | 'float'
    | 'string'
    | 'void'
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
   : SIGN_OPERATORS? (integer | floate | identifier | f_call | '(' expression ')')
   ;

multiplyingExpression
   : signExpression (MULTIPLYING_OPERATORS signExpression)*
   ;

expression
   : multiplyingExpression (SIGN_OPERATORS multiplyingExpression)*
   ;

atomicLogicExpression
    : NEGATION_OPERATOR? (identifier | bool | f_call | expression | '(' logic_expression ')')
    ;

comparisonExpression
    : atomicLogicExpression (COMPARISON_OPERATORS atomicLogicExpression)?
    ;

logic_expression
    : comparisonExpression (LOGIC_OPERATORS comparisonExpression)*
    ;

block
    : '{' statement+ '}'
    ;

statement
    : line EOL*
    | 'return' value EOL*
    ;

function
    : (type_name) 'pattern' identifier '(' type_name identifier (',' type_name identifier)* ')' block
    ;

f_call
    : identifier '(' value (',' value)* ')'
    ;

comment
    : COMMENT
    ;

identifier
    : IDENTIFIER
    ;

integer
    : NUMBER
    ;

floate
    : NUMBER '.' NUMBER
    ;

bool
    : BOOL
    ;

string
    : STRING
    ;

IDENTIFIER
    : [a-zA-Z][a-zA-Z0-9_\-]*
    | [_\-][a-zA-Z0-9_\-]+
    ;

SIGN_OPERATORS
    : '+'
    | '-'
    ;

NUMBER
    : [0-9]+
    ;

MULTIPLYING_OPERATORS
    : '/'
    | '*'
    | '%'
    ;

SUM_OPERATORS
    : '+'
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

STRING
    : '"' ( ~('"' | '\\') )* '"' 
    ;

EOL
   : [\r\n]+
   ;

COMMENT
   : '#' ~ [\r\n]*
   ;

WS
    : [ \t\r\n]+ -> skip
    ;