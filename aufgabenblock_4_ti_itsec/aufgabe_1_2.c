#include <stdio.h>

int main () {
    char name[100] = "";
    int amount = 0;
    double price = 0.0;
    double total = 0.0;

    printf("Preisrechner\n");

    printf("Produktname: ");
    scanf("%s", name);

    printf("Anzahl: ");
    scanf("%i", &amount);
    
    printf("Einzelpreis: ");
    scanf("%lf", &price);

    total = price * amount;
    printf("Gesampreis: %.2f\n", total);
    
    return 0;
}