# Aufgaben zum Aufgabenblock I

---
## 1. Eingabe und Ausgabe - Kontrollstrukturen und Berechnungen
---
### Aufgabe 1.1 - Gerade oder ungerade

Erstelle ein Programm, welches eine Zahl ueber das Terminal einliest und ausgibt, ob die Zahl gerade oder ungerade ist.

### Aufgabe 1.2 - Noten

Erstelle ein Programm, welches eine Punktzahl (0 - 100) einlist und daraus eine Note errechnet:

- 90 - 100 => 1
- 80 - 89  => 2
- 65 - 79  => 3
- 50 - 64  => 4
- 30 - 49  => 5
- 0  - 29  => 6

### Aufgabe 1.3 - Berechne 2^n

Schreibe ein Programm, welches einen Wert fuer n einliest und daraus 2 Hoch n berechnet.

### Aufgabe 1.4 - Stunden pro Semester berechnen

Schreibe ein Programm, dass einen Kurs-Namen und eine Komma-Zahl einliest. Die Zahl steht fuer die Anzahl der SWS (Semesterwochenstunden). Berechne nun den gesamten Stundenaufwand fuer das Semester. Die Anzahl der Wochen pro Semester (z.Bsp. 16 Wochen) soll innerhalb des Programms als Konstante definiert werden. Die Ausgabe auf dem Terminal sollte so aussehen:

`Der Gesamtaufwand fuer Programmierung 2 betraegt: 50 Std.`

### Aufgabe 1.5 - Zinsen berechnen - Teil I

Du hast Geld auf einem Sparkonto liegen. Du moechtest nun berechnen, wie viel Zinsen du innerhalb eines Jahres bekommst. Schreibe ein Programm, dass einen Betrag einliest und die Zinsen berechnet. Die Ausgabe sollte so aussehen:

```Java
Zinssatz:        1,00 %
Betrag:       1000,00 EUR
Zinsen:         10,00 EUR
-------------------------
Gesamtbetrag: 1010,00 EUR
```

Achte bitte darauf, dass die ausgegebenen Zahlen rechtsbuendig sind und untereinander stehen.

---
## 2. Schleifen
---
### Aufgabe 2.1 - Multiplikation

Schreibe ein Programm, welches zwei Zahlen (hintereinander) einliest und miteinander multipliziert. Verwende nicht den Operator, sondern implementiere deine Loesung mittels Addition.

### Aufgabe 2.2 - Kleiner Gauss

Schreibe ein Programm, dass eine Zahl einliest und die Summe aller Zahlen inklusive dieser Zahl bildet. Verwende hierfuer nicht die Formel, sondern berechne die Summe mittels einer Schleife.

### Aufgabe 2.3 - Fakultaet

Schreibe ein Programm, welches eine Zahl einliest und die Fakultaet berechnet.

### Aufgabe 2.4 - Treppe

Schreibe ein Programm, welches eine Treppe aus Symbolen erstellt. Dafuer soll am Anfang ein beliebiges Zeichen und die Anzahl der Stufen eingegeben werden:

```Java

Symbol: *
Anzahl: 4

*
**
***
****
```

Versuche nun die Treppe rechtsbuendig anzuzeigen.

```Java
   *
  **
 ***
****
```

### Aufgabe 2.5 - Zinsen berechnen -Teil II

Eine andere Bank wirbt nun damit, dass die Zinszahlungen monatlich statt jaehrlich ausgezahlt werden. Berechne, ab welchem Monat die Summe der monatlichen Zinszahlungen den Betrag der jaehrlichen Zinszahlung uebersteigt.

---
## 3. Eindimensionale Arrays
---
### Aufgabe 3.1 - Reverse - String

Schreibe ein Programm, welches einen String einliest und diesen Zeichen fuer Zeichen einem Array speichert. Anschliessend soll der eingegebene String verkehrt herum ausgegeben werden:

```Java
Eingabe: 'Hallo'
Ausgabe: 'ollaH'
```

### Aufgabe 3.2 - Min/Max

Ein Programm soll 5 Zahlen einlesen und anschliessend den kleinsten und groessten Wert sowie das gesamte Array ausgeben. Die Ausgabe sollte in etwa so aussehen:

```Java
Werte: [ 2, 5, 3, 6, 8 ]
Max  : 8
Min  : 2
```

### Aufgabe 3.3 - Durchschnitt

Uebergebe eine Zahl, welche definiert, wie viele Eingaben gemacht werden sollen. Erstelle ein Array, dass diese Zahlen speichern kann und berechne nach dem beenden der Eingaben den Durchschnitt der eingegebenen Zahlen.

### Aufgabe 3.4 - Passwort-Generator

Erstelle ein Array, welches erlaubte Zeichen fuer ein Passwort enthaelt. Der Nutzer gibt die Laenge des Passwortes an. Anschliessend soll das Programm ein Passwort aus zufaelligen Zeichen erstellen und ausgeben.

Gehe systematisch vor. Erstelle erst das Array, die Ein- und Ausgabe- Funktionalitaet und die Erstellung eines "einfachen" Passwortes mit einem Wert aus dem Array. Erst am Schluss kuemmerst du dich um das zufaellige Auswaehlen von Zeichen.

### Aufgabe 3.4 - Permutationen

Erstelle ein Programm, welches einen String/Zeichenkette einliest und alle moeglichen Anordnungen ausgibt. Berechne die Anzahl der Moeglichkeiten iterativ.

```Java
Permutationen fuer 123:

1: 123
2: 132
3: 213
4: 231
5: 312
6: 321

Gesamtzahl: 6
```

---
## 4. Zweidimensionale Arrays
---

### Aufgabe 4.1 - Segment-Anzeige

Erstelle ein 3x5 grosses Array. Lies ein Zeichen ein als Ausgabe-Symbol. Anschliessend soll eine Zahl eingelesen werden und diese mit Hilfe des Symbols angezeigt werden. Hierfuer soll das Array erst entsprechend belegt werden und dann Zeile fuer Zeile ausgegeben werden:

```Java
Symbol: *

>>> 7

***
  *
  *
  *
  *

```

Fuer den Anfang kannst du die Zeichen hardcodiert in Arrays hinterlegen.

Erweiterungen:
- Schreibe die Zahl zweimal oder mehrmals in die gleiche Zeile
- definiere logische Regeln zur Belegung anstatt hardcodierte Arrays zu hinerlegen

### Aufgabe 4.2 - Schatzsuche

In einem 5x5 grossen Spielfeld soll an einer zufaelligen Position ein Zeichen, der Schatz, platziert werden. Der Spieler soll dann/User soll diese erraten, in dem er die Koordinaten eingibt. Bei jeder Eingabe soll ueberprueft werden, ob der Schatz gefunden wurde oder ob die Eingabe zu weit links, rechts, zu hoch oder zu niedrig gewesen ist.
Zeichne bei jedem Durchlauf das Spielfeld. Sollte der Schatz nicht gefunden worden sein, trage ein 'x' in das Spielfeld ein. Sollte der Schatz gefunden worden sein, gib nochmals das Spielfeld an, diesmal aber mit einem '$' an der Position des Schatzes statt einem 'x'.

```Java

  1  2  3  4  5
1
2
3 x
4   x
5

Versuche: 5
```


Bevor du mit zufaelligen Zahlen arbeitest, erarbeite dir die Kernfunktionen mit einem festen Wert und baue erst am Schluss die Zufaelligkeit ein.

Erweiterungen:
- zeichne mit ASCII-Symbolen ein Gitternetz

```Java
------------------------
    | 1 | 2 | 3 | 4 | 5 |
------------------------
| 1 |   |   |
------------------------
| 2 | x |   |
------------------------
| 3 | $ |
------------------------
| 4 | x |
------------------------
| 5 |   |
------------------------
```
