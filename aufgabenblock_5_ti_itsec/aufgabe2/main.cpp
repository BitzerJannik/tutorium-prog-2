#include "student.h"
#include "pruefungsamt.h"
#include <iostream>
#include <limits>

Student datenErfassen() {
    std::string name, birthday, course, ex_regulation;
    int matrikelNum, semester;

    std::cout << "Name: ";
    std::getline(std::cin, name);

    std::cout << "Geburtsdatum: ";
    std:getline(std::cin, birthday);

    std::cout << "Matrikel-Nummer: ";
    std::cin >> matrikelNum;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    std::cout << "Studienfach: ";
    std::getline(std::cin, course);

    std::cout << "Pruefungsordnung: ";
    std::getline(std::cin, ex_regulation);

    std::cout << "Semester: ";
    std::cin >> semester;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

    return Student(name, birthday, matrikelNum, course, ex_regulation, semester);
}

void run() {
    Pruefungsamt amt;
    int choice;

    do {
        std::cout << "\n1: Anmelden\n";
        std::cout << "2: Abmelden\n";
        std::cout << "3. Anmeldungen anzeigen\n";
        std::cout << "4. Dateien einlesen\n";
        std::cout << "0: Beenden\n";

        std::cin >> choice;
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

        switch (choice) {
            case 1: {
                Student student = datenErfassen();
                if ( amt.anmelden(student)) {
                    std::cout << "Anmelden erfolgreich!\n";
                } else {
                    std::cout << "Fehler bei der Anmeldung.\n";
                }
                break;
            }
            case 2: {
                int matrikelNum;
                std::cout << "Matrikel-Nummer: ";
                std::cin >> matrikelNum;
                if (amt.abmelden(matrikelNum)) {
                    std::cout << "Abmelden erfolgreich!\n";
                } else {
                    std::cout << "Fehler bei der Abmeldung";
                }
                break;
            }
            case 3: {
                amt.ausgeben();
                break;
            }
            case 4: {
                std::string dateiname;
                std::cout << "Dateiname: ";
                std::getline(std::cin, dateiname);
                std::vector<Student> students = amt.dateiEinlesen(dateiname);
                for (const auto& student: students) {
                    amt.anmelden(student);
                }
                std::cout << "Datei wurde erfolgreich eingelsen.\n";
                break;
            }
            case 0: {
                std::cout << "Programm wurde beendet\n";
                break;
            }
            default: {
                std::cout << "Ungueltige Eingabe.\n";
            }
        }

    } while (choice != 0);
}

int main () {
    run();
    return 0;
}