import java.util.Scanner;

public class Gauss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Integer-Zahl ein:");

        int number = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        System.out.println(
            "Die Summe aller Zahlen von " + number + " ist " + result
        );

        scanner.close();
    }
}
