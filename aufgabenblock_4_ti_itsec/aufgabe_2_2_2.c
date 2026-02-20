#include <stdio.h>
#include <math.h>

// optional func calc_pow with return value
double calc_pow (double base, int exponent) {
    double result = 1.0;
    for (int i = 0; i < exponent; i++) {
        result *= base;
    }
    return result;
}

// func with return
double calc_annuity ( double amount, double interest, int years ) {
    double p = interest / 100;
    int n = years;
    double numerator = p * calc_pow( 1+p, n);
    double denominator = calc_pow(1+p, n) - 1;
    return amount * ( numerator / denominator );
}


int main() {

    double amounts[5] = { 
        5000.0, 
        6000.0, 
        7000.0, 
        8000.0, 
        9000.0
    };
    double i_rates[5] = { 5.0, 6.0, 7.0, 8.0, 9.0 };
    int years[5] = { 1, 3, 5, 7, 10 };

    // your code
    int length = sizeof(amounts) / sizeof(amounts[0]);

    for (int i = 0; i < length; i++) {
        double K = amounts[i];
        double p = i_rates[i];
        int n = years[i];
        double annuity = calc_annuity(K, p, n);
        printf("Kreditbetrag: %.2f\n", K);
        printf("Zinssatz: %.2f\n", p);
        printf("Laufzeit: %d Jahre\n", n);
        printf("Jaehrliche Annuitaet: %.2f\n", annuity);
        printf("Monatliche Annuitaet: %.2f\n", annuity / 12);
        printf("----------------------------------------\n");
    }
    return 0;
}