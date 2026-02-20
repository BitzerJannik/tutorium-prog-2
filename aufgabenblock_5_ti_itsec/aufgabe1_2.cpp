#include <iostream>

int main () {
    const double PI = 3.14;

    double radius1, radius2;
    double area1, area2;

    std::cout << "Radius 1: ";
    std::cin >> radius1;

    area1 = PI * radius1 * radius1;

    std::cout << "Radius 2: ";
    std::cin >> radius2;

    area2 = PI * radius2 * radius2;

    std::cout << "Flaeche Kreis 1: " << area1 << "\n";
    std::cout << "Flaeche Kreis 2: " << area2 << "\n";

    if ( area1 > area2 ) {
        std::cout << "==> Kreis 1 ist groesser\n";
    } else if ( area2 > area1) {
        std::cout << "==> Kreis 2 ist groesser\n";
    } else {
        std::cout << "Beide Kreise sind gleich gross\n";
    }
}