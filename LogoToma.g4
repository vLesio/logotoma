grammar LogoToma;

program
    : (line? EOL+)+ line? EOF
    ;

line
    : command comment?
    | comment
    | expression
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
    : 'engine' ('on' | 'off' | indentifier | f_call)
    ;

wheel
    : 'wheel' ('right' | 'left' | 'off' | indentifier | f_call)
    ;

spray
    : 'spray' ('on' | 'off' | indentifier | f_call)
    ;

spray_color
    : 'spray color' (color | indentifier | f_call)
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
    : indentifier
    ;

assign
    : type_name indentifier '=' value
    | indentifier '=' value
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

value
    : '"' string '"' 
    | logic_expression
    | expression
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
   : SIGN_OPERATORS* (integer | floate | indentifier | f_call | '(' expression ')')
   ;

multiplyingExpression
   : signExpression (MULTIPLYING_OPERATORS signExpression)*
   ;

expression
   : multiplyingExpression (SIGN_OPERATORS multiplyingExpression)*
   ;

atomicLogicExpression
    : (indentifier | bool | integer | floate | f_call | expression | '(' logic_expression ')')
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

string
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
    : (type_name) 'pattern' indentifier '(' type_name indentifier (',' type_name indentifier)* ')' block
    ;

f_call
    : indentifier '(' value (',' value)* ')'
    ;

comment
    : COMMENT
    ;

indentifier
    : IDENTIFIER
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
    : [a-zA-Z_.0-9]+
    ;

EOL
   : '\r'? '\n'
   ;

COMMENT
   : '#' ~ [\r\n]*
   ;

WS
    : [ \t\r\n]+ -> skip
    ;