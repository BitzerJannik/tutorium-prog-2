import java.util.Scanner;

public class CalcInterest {

    public static double calcInterest(double rate, double amount) {
        return amount * (rate / 100);
    }

    public static void formatted_print(
        double rate,
        double amount,
        double interest
    ) {
        String word = "Gesamtbetrag: ";

        // calculate amount rounded
        double result = Math.round((amount + interest) * 100) / 100;

        System.out.printf("%-15s %10.2f %%\n", "Zinssatz:", rate);
        System.out.printf("%-15s %10.2f EUR\n", "Betrag:", amount);
        System.out.printf("%-15s %10.2f EUR\n", "Zinsen:", interest);
        System.out.printf("------------------------------\n");
        System.out.printf("%-15s %10.2f EUR\n", word, result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // eingabe zinssatz
        System.out.println("Zinssatz: ");
        double interest_rate = scanner.nextDouble();

        // eingabe betrag
        System.out.println("Betrag: ");
        double amount = scanner.nextDouble();

        // berechnung zinsen
        double interest = calcInterest(interest_rate, amount);

        // ausgabe
        formatted_print(interest_rate, amount, interest);

        scanner.close();
    }
}
