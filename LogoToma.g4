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
    : 'spray color' (color | deref | f_call)
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
    : deref
    ;

assign
    : type_name deref '=' value
    | deref '=' value
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
    ;

name
    : STRING
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

value
    : '"' string '"'
    | expression
    | logic_expression
    | color
    ;

signExpression
   : SIGN_OPERATORS? (integer | floate | deref | f_call | '(' expression ')')
   ;

multiplyingExpression
   : signExpression (MULTIPLYING_OPERATORS signExpression)*
   ;

expression
   : multiplyingExpression (SIGN_OPERATORS multiplyingExpression)*
   ;

atomicLogicExpression
    : (deref | bool | integer | floate | f_call | expression | '(' logic_expression ')')
    ;

comparisonExpression
    : atomicLogicExpression (COMPARISON_OPERATORS atomicLogicExpression)?
    ;

logic_expression
    : NEGATION_OPERATOR? comparisonExpression (LOGIC_OPERATORS NEGATION_OPERATOR? comparisonExpression)*
    ;

string
    : STRING
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

deref
    : STRING
    ;

block
    : '{' statement+ '}'
    ;

statement
    : line EOL*
    | 'return' value EOL*
    ;

function
    : type_name? 'pattern' name '(' type_name deref (',' type_name deref)* ')' block
    ;

f_call
    : name '(' value (',' value)* ')'
    ;

comment
    : COMMENT
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
    : [a-zA-Z_.0-9]+
    ;

EOL
   : '\r'? '\n'+
   ;

COMMENT
   : '#' ~ [\r\n]*
   ;

WS
    : [ \t\r\n]+ -> skip
    ;