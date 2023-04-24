### Uruchomienie

Aby uruchomić interpreter, potrzebne jest środowisko, w którym znajdują się nastepujące zależności:

ANTLR4 runtime for python: `pip install antlr4-python3-runtime`

Pygame: `conda install -c cogsci pygame`, lub `pip install pygame` jeśli poprzednie nie zadziała.

Aby zbudować interpreter, należy w głównym folderze wykonać

```
.\antlr4.bat -Dlanguage=Python3 .\LogoToma.g4 -visitor -o dist
```

Uruchamiamy go poleceniem
```
python main.py [ścieżka_do_programu]
```
Jeśli nie podamy ścieżki, możemy wpisać program zbudowany z jednej linii.
Jest to dobra opcja do debugowania np. wyrażen arytmetycznych.
