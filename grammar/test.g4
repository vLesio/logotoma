grammar test;

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
    : 'engine' ('on' | 'off')
    ;

wheel
    : 'wheel' ('right' | 'left' | 'off')
    ;

spray
    : 'spray' ('on' | 'off')
    ;

spray_color
    : 'spray color' color
    ;

spray_size
    : 'spray size' value
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

value
    : logic_expression
    | expression
    | '"' string '"'
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
   : (('+' | '-'))* (integer | floate | deref | f_call | '(' expression ')')
   ;

multiplyingExpression
   : signExpression (MULTIPLYING_OPERATORS signExpression)*
   ;

expression
   : multiplyingExpression (SUM_OPERATORS multiplyingExpression)*
   ;

atomicLogicExpression
    : (expression | deref | bool | integer | floate | f_call | '(' logic_expression ')')
    ;

comparisonExpression
    : atomicLogicExpression (COMPARISON_OPERATORS atomicLogicExpression)?
    ;

logic_expression
    : NEGATION_OPERATOR? comparisonExpression (LOGIC_OPERATORS NEGATION_OPERATOR? comparisonExpression)*
    ;

integer
    : SIGN_OPERATORS* NUMBER
    ;

floate
    : SIGN_OPERATORS* NUMBER '.' NUMBER
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
    : '{' statement+ '}'
    ;

statement
    : line EOL*
    | 'return' expression EOL*
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
   : '\r'? '\n'
   ;

WS
    : [ \t\r\n]+ -> skip
    ;