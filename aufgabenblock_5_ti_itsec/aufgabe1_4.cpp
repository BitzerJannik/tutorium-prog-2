#include <iostream>
#include <vector>

int main () {
    std::vector<double> numbers;
    double input;

    std::cout << "Zahlen eingeben (0 zum Beenden):\n";

    while (true) {
        std::cin >> input;
        if (input == 0) {
            break;
        }
        numbers.push_back(input);
    }

    double max, min;


    max = numbers[0];
    for ( int i = 1; i < numbers.size(); i++ ) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }

    min = numbers[0];

    for (int j = 1; j < numbers.size(); j++) {
        if (numbers[j] < min) {
            min = numbers[j];
        }
    }

    double sum, average = 0;

    for (int k=0; k < numbers.size(); k++) {
        sum += numbers[k];
    }

    average = sum / numbers.size();

    std::cout << "Kleinste Zahl: " << min << "\n";
    std::cout << "Groesste Zahl: " << max << "\n";
    std::cout << "Summe        : " << sum << "\n";
    std::cout << "Durchschnitt : " << average << "\n";

    return 0;
}