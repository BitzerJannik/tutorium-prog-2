# Aufgaben zum Aufgabenblock 4 - C++-Teil für TI und ITSEC

## 1.0 Basics

### 1.1 Datentypen

Schreibe ein Programm, mit welchem du eine Ganzzahl, eine Fließkomma-Zahl und einen
Text einliest und formatiert ausgiebst:

```Markdown
Gib einen Namen ein: 
Gib eine Matrikel-Nummer ein:
Gib die ETCs ein:

--------------------------

Name           : Max Mustermann
Matrikel-Nummer: 123456
ETCs           : 33.5
```

### 1.2 Entscheidungen

Schreibe ein Programm, welches eine Konstante beinhaltet, in der du die Nummer
Pi speicherst. Anschliessend sollst du ein Programm schreiben, welches:

**Anforderungen:**
- eine Zahl einliest (Radius)
- und dann die Flaeche des Kreises berechnet
- anschliessend soll ein zweiter Radius eingegeben werden
- am ende soll ausgegeben werden, ob Kreis 1 oder Kreis 2 groesser war

```Markdown
Radius 1: 5
Radius 2: 2

Flaeche Kreis 1: 78.54
Flaeche Kreis 2: 12.57

==> Kreis 1 ist groesser
```

## 1.3 Loops, Arrays und Funktionen

Ziel ist es, ein kleines Menu zu schreiben, welches die Menu-Punkte so lange 
ausgibt, bis der Nutzer eine bestimmte Eingabe gemacht hat. Kapsel die Einzel-
Teile in separate Funktionen (zum Beispiem print_main_menu, usw.). Arbeite 
zum Speichern der Menu-Punkte mit Arrays und uebergebe diese per Referenz.

```Markdown
Hauptmenu
1. Werte eintragen
2. Werte anzeigen
3. Werte bearbeiten
4. Werte loeschen
Zahl eingeben (0 zum Beenden):
>>>> 1
==> es wurde Werte eintragen ausgewaehlt

-----------------------------

Hauptmenu
1. Werte eintragen
2. Werte anzeigen
3. Werte bearbeiten
4. Werte loeschen
Zahl eingeben (0 zum Beenden):
>>>> 
Programm beendet
```

## 1.4 Vektoren

Schreibe ein Programm, welches Eingaben in einem std::vector<int> speichert.
Die Eingabe soll bei 0 enden. Anschliessend sollen die Zahlen verarbeitet werden:

**Anforderungen:**
- größte Zahl ausgeben
- kleinste Zahl ausgeben
- Durchschnitt ausrechnen

## 1.5 Maps

Schreibe ein Programm, welches Artikel und ihre Artikel-Nummern speichert.
Via Loop sollen wieder Eingaben getaetigt werden, bis mit einer leeren Eingabe
die Eingabe-Funktion beendet wird. Anschliessend sollen Artikel-Nummern eingegeben
werden koennen. Ist die Artikel-Nummer vorhanden, soll der entsprechende Artikel
ausgegebn werden, ist er nicht vorhanden, soll ein entsprechender Hinweis gegeben 
werden:

```Markdown
Artikel-Nr: 123456
Artikel-Name: Kaffee

--------------------

Artikel-Nr: 654321
Artikel-Name: Schokolade

--------------------

Artikel-Nr:

** Eingabe beendet ** 

== Suche gestartet ==
---- mit 0 beenden ----
>>> 123456
==> Kaffee
.
.
.
```

## 2.0 Objektorientierung

### 2.1 Einfache Klassen

### 



