grammar LogoToma;

program
    : (line? EOL+)+ line? EOF
    ;

line
    : command comment?
    | comment
    ;

command
    : value
    | cast
    | input
    | print
    | function
    | f_call
    | assign
    | loope
    | ife
    | whilee
    | save
    ;

value
    : expression
    | logic_expression
    ;

cast
    : 'cast' value '->' type_name
    ;

input
    : TODO

print
    : 'print' value
    ;

assign
    : type_name identifier '=' value
    | identifier '=' value
    ;

bool
    : BOOL
    ;

deref
    : identifier
    ;

save
    : 'save' string
    ;

type_name
    : 'bool'
    | 'int'
    | 'float'
    | 'string'
    | 'void'
    ;

loope
    : 'loop' value 'times' block
    ;

whilee
    : 'loop while' value  block
    ;

ife
    : 'if' '(' logic_expression ')' block elsee?
    ;

elsee
    : 'else' block
    ;

signExpression
    : SIGN_OPERATORS? (integer | floate | deref | string | bool | f_call | cast | '(' expression ')')
    ;

multiplyingExpression
    : signExpression (MULTIPLYING_OPERATORS signExpression)*
    ;

logicBit
    : NEGATION_OPERATOR? bool
    | NEGATION_OPERATOR? expression
    | NEGATION_OPERATOR? '(' logic_expression ')'
    ;

BOOL
    : ('True' | 'False')
    ;

expression
    : multiplyingExpression (SIGN_OPERATORS multiplyingExpression)*
    ;

comparisonExpression
    : logicBit (COMPARISON_OPERATORS logicBit)?
    ;

logic_expression
    : comparisonExpression (LOGIC_OPERATORS comparisonExpression)*
    ;

block
    : EOL* '{' statement+ '}' EOL*
    ;

statement
    : line EOL*
    | 'return' value EOL*
    ;

function
    : (type_name) 'pattern' identifier '(' ((type_name identifier)? | ((type_name identifier) (',' type_name identifier)*)) ')' block
    ;

f_call
    : identifier '(' value (',' value)* ')'
    | identifier '(' ')'
    ;

comment
    : COMMENT
    ;

identifier
    : IDENTIFIER
    ;

integer
    :  NUMBER
    ;

floate
    : NUMBER '.' NUMBER
    ;

string
    : STRING
    ;

IDENTIFIER
    : [a-zA-Z][a-zA-Z0-9_\-]*
    | [_][a-zA-Z0-9_\-]+
    ;

SIGN_OPERATORS
    : '-'
    | '+'
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
    | '!='
    | '<'
    | '>'
    | '<='
    | '>='
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