#include <stdio.h>

int main() {
    char account[50] = "Girokonto";
    char bank[50] = "Sparkasse";
    int bank_code = 512700;
    double balance = 4314.34;
    double interest = 1.99;
    char currency[50] = "EUR";

    // Aufgabe 1.1.1
    printf("Bank: %s\n", bank);
    printf("Konto: %s\n", account);
    printf("Kontostand: %.2f %s\n", balance, currency);
    printf("Zinssatz: %.2f %%\n", interest);

    // Aufgabe 1.1.2
    double profit = ((balance * interest) / 12) / 100;
    printf("Monatliche Zinsen: %.2f %s\n", profit, currency);

    return 0;
}