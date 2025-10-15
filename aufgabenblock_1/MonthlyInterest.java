import java.util.Scanner;

public class MonthlyInterest {

    public static double calc_interest_yearly(double rate, double amount) {
        return amount * (rate / 100);
    }

    public static double calc_interest_monthly(double rate, double amount) {
        return (amount * (rate / 100)) / 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // eingabe zinssatz
        System.out.println("Zinssatz: ");
        double interest_rate = scanner.nextDouble();

        // eingabe betrag
        System.out.println("Betrag: ");
        double amount = scanner.nextDouble();

        // berechnung zinsen pro jahr
        double interest_year = calc_interest_yearly(interest_rate, amount);

        // berechne, wie viele monate bis zinsen groesser als zinsen pro jahr
        double interest_sum_monthly = 0;
        int months = 0;

        double new_amount = amount;

        while (interest_sum_monthly <= interest_year) {
            double interest = calc_interest_monthly(interest_rate, new_amount);
            interest_sum_monthly += interest;
            new_amount = new_amount + interest;
            months++;
        }

        System.out.println("Es dauert " + months + " Monate");
        System.out.println("Zinsen Jahr: " + interest_year);
        System.out.println("Zinsen MOnatlich: " + interest_sum_monthly);

        scanner.close();
    }
}
