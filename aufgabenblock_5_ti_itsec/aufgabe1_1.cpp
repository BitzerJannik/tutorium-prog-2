#include <iostream>
#include <string>

int main () {
    std::string name;
    int cadastral_number;
    double ects;

    std::cout << "Enter a name:";
    std::cin >> name;

    std::cout << "Enter a Cadastral Number: ";
    std::cin >> cadastral_number;

    std::cout << "Enter ECTS: ";
    std::cin >> ects;

    std::cout << "\n--------------------\n";
    std::cout << "Name           : " << name << "\n";
    std::cout << "Matrikel-Nummer: " << cadastral_number << "\n";
    std::cout << "ECTS           : " << ects << "\n";
}