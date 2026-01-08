# Aufgaben zum Aufgabenblock III

Die gesamte Klassenstruktur ist im folgenden Bild dargestellt.
In den Teilaufgaben soll diese umgesetzt werden. Teste selbststaendig
den Code und mache sinnvolle Testlaeufe. Ueberlege dir eventuell noch
Erweiterungen.

![Klassendiagramm](assets/uml-vehicles.png)

## 1.0 Abstrakte Klasse

In diesem Schritt soll die Basis-Klasse Vehicle programmiert werden.
Zudem soll die Grundstruktur des Programms definiert werden. Lege dazu
eine VehicleApp und eine Vehicle Datei an. in der App soll die Main-Funktion definiert werden und der Code soll nicht direkt in
der App Datei geschrieben sein.

## 2.0 Subklassen definieren

Hier sollen nun die Unterklassen Train, Bus und Tram implementiert werden.

**Anforderungen:**
- Standard-Konstruktor
- vollqualifizierter Konstruktor
- Kopier-Konstruktor
- fuer alle Attribute soll es getter- und setter-Methoden geben
- implementiere zudem eine sinnvolle Variante der Methoden, die speziell fuer die Klasse sind
- achte auf die richtige Vererbung und die Verwendung von super

### 3.0 Interfaces

Hier sollen nun die einzelnen Interfaces implementiert werden.

**Anforderungen Generell:**
- ueberlege dir eine sinnvolle Implementierung der Methoden

**Interfaces Train:**
- Maintainable
- Ticketable
- ElectricPowered
- RailBound

**Interfaces Bus:**
- Maintainable
- Ticketable

**Interfaces Tram:**
- Maintainable
- Ticketable
- ElectricPowered
- RailBound

**Erweiterungen: **
- Implementiere noch ein weiteres, sinnvolles Interface
    - Ueberlege dir hierfuer mindestens eine sinnvolle Methode und 
      implementiere diese auf mindestens eine Klasse