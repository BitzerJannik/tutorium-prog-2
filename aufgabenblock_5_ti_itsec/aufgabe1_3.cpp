#include <iostream>
#include <string>

void print_menu (std::string name, std::string menu_items[], int size) {
    std::cout << name << "\n";

    for (int i = 0; i < size; i++) {
        std::cout << i+1 << ". " << menu_items[i] << "\n";
    }
    std::cout << "Zahl eingeben (0 zum Beenden): " << "\n";
    std::cout << ">>>> ";
}

void process_choice (int choice, std::string menu_items[]) {
    if ( choice >= 1 && choice <= 4 ) {
        std::cout << "==> " << menu_items[choice-1] << " ausgewaehlt\n";
    } else if (choice != 0) {
        std::cout << "==> ungeueltige Eingabe!\n";
    }
}

int main () {
    const int MENU_SIZE = 4;
    std::string menu_items[MENU_SIZE] = {
        "Werte eintragen",
        "Werte anzeigen",
        "Werte bearbeiten",
        "Werte loeschen"
    };

    int choice;

    do {
        print_menu("Hauptmenu", menu_items, MENU_SIZE);
        std::cin >> choice;
        process_choice(choice, menu_items);
    } while (choice != 0);

    std::cout << "Programm wurde beendet!\n";
    return 0;
}