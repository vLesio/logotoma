# Język LogoToma

## Autorzy

- Patryk Lesiak (patryklesiak@student.agh.edu.pl)
- Maciej Pieniążek (empieniazek@student.agh.edu.pl)
- Tomasz Makowski (makowskit@student.agh.edu.pl) 

## Założenia ogólne


## Elementy języka

### Typy danych
 - `int` - liczby całkowite
 - `float` - liczby zmiennoprzecinkowe
 - `bool` - wartości logiczne
 - `color` - kolor w formacie RGB
 - `string` - ciągi znaków
 - `void` - typ pusty, który może zwracać funkcja

### Instrukcje warunkowe i pętle
 - `if` - instrukcja warunkowa `if (warunek) {instrukcje}`
 - `else` - alternatywny ciąg instrukcji warunkowej, wystepuje tylko po `if`. ` if (warunek) {instrukcje} else {instrukcje}`
 - `loop` - pętla wykonująca się określoną liczbę razy `loop 10 times {instrukcje}`
 - `loop while` - pętla wykonująca się dopóki warunek jest spełniony `loop while (warunek) {instrukcje}`

### Funkcje
Funkcję deklarujemy podobnie jak w większości znanych języków programowania. Deklaracja funkcji wygląda następująco:
`<zwracany typ> pattern <nazwa> ([<typ> <nazwa>], ...) {<instrukcje>}`

Przykładowa funkcja zwracająca sumę dwóch liczb:
```
int pattern sum(int a, int b) {
    return a + b
}
```

Wywołanie funkcji:
`sum(c, d)`

### Polecenia wbudowane
|Polecenie|Opis|
|:-:|:-:|
|engine <'on' \| 'off' \| bool>|Włącza/wyłącza silnik|
|wheel <'right' \| 'left' \| 'off'>|Ustawia kierunek obrotu|
|spray <'on' \| 'off' \| bool>|Włącza/wyłącza rysowanie|
|spray color \<color\>|Ustawia kolor rysowania|
|spray size \<int \| float\>|Ustawia wielkość rysowanych kropek|
|sleep \<int\>|Określa ilość klatek, które wykonają się bez interpretacji kodu|
|cast \<value\> -> \<type\>|Rzutuje wartość na podany typ, jeśli operacja jest możliwa|
|print \<value\>|Wypisuje podaną wartość do konsoli|
|save \<string\>|Zapisuje wygenerowany obraz do pliku o podanej nazwie w formacje .png|
|hide <'on' \| 'off' \| bool>|Ukrywa lub pokazuje Makolotu|

## Spis tokenów i gramatyka

|Token|Regex|
|:-:|:-:|
|BOOL|'True' \| 'False'|
|IDENTIFIER|[a-zA-Z][a-zA-Z0-9_\-]* \| [\_][a-zA-Z0-9_\-]+ |
|SIGN_OPERATORS|'-' \| '+'|
|NUMBER|[0-9]+|
|MULTIPLYING_OPERATORS|'\\' \| '*' \| '%'|
|SUM_OPERATORS|'+' \| '-'|
|NEGATION_OPERATOR|'!'|
|LOGIC_OPERATORS|'\|' \| '&'|
|COMPARISON_OPERATORS|'==' \| '!=' \| '<' \| '>' \| '<=' \| '>='|
|STRING| '  "  '   ( ~(' " ' \| ' \\ ') )*    '  "  '  |
|EOL| [\r\n]+ |
|COMMENT| '#' ~ [\r\n]* |
|WS| [ \t\r\n]+ |


## Gramatyka języka

```g4
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
    | print
    | function
    | f_call
    | assign
    | loope
    | ife
    | whilee
    | save
    | value
    | hide
    ;

value
    : expression
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

hide
    : 'hide' ('on' | 'off' | logic_expression)
    ;

cast
    : 'cast' value '->' type_name
    ;

print
    : 'print' value
    ;

object
    : identifier
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
```

## Informacje o stosowanych narzędziach
 - `ANTLR4` - parser generator
 - `Python3` - interpreter
 - `PyGame` - biblioteka graficzna

## Uruchomienie

Aby uruchomić interpreter, potrzebne jest środowisko, w którym znajdują się nastepujące zależności:

**Python 3.10** lub nowszy.

**ANTLR4 runtime for python**: `pip install antlr4-python3-runtime`.

**Pygame**: `conda install -c cogsci pygame`, lub `pip install pygame` jeśli poprzednie nie zadziała.

Aby zbudować interpreter, należy w głównym folderze wykonać

```
antlr4 -Dlanguage=Python3 LogoToma.g4 -visitor -o dist
```
lub w systemach Windows:

```
.\antlr4.bat -Dlanguage=Python3 .\LogoToma.g4 -visitor -o dist
```

Uruchamiamy go poleceniem
```
python main.py <ścieżka_do_programu>
```

## Przykład programu

```logotoma

```