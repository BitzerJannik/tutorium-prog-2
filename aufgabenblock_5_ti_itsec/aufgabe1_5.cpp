#include <iostream>
#include <map>
#include <string>

int main () {
    std::map<int, std::string> article;
    int articleNr;
    std::string articleName;

    std::cout << "Artikel eingeben (leere Artikel-Nr. zum Beenden):\n";

    while(true) {
        std::cout << "Artikel-Nr:";
        std::cin >> articleNr;

        if (articleNr == 0) {
            break;
        }

        std::cout << "Artikel-Name: ";
        std::cin >> articleName;

        article[articleNr] = articleName;

        std::cout << "-----------------------\n";
    }

    std::cout << "Eingabe beendet\n";

    std::cout << "Suche gestartet (mit 0 beenden)\n";
    while (true) {
        std::cout << ">>>";
        std::cin >> articleNr;

        if (articleNr == 0) {
            break;
        }

        auto a = article.find(articleNr);
        if (a != article.end()) {
            std::cout << "==> " << a->second << "\n";
        } else {
            std::cout << "==> Artikel nicht gefunden\n";
        }
    }
    return 0;
}