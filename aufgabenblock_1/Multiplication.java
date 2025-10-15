import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first, second;
        System.out.println("Gebe zwei Integer ein: ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        int result = 0;

        for (int i = 0; i < second; i++) {
            result += first;
        }

        System.out.println("Ergebnis: " + result);

        scanner.close();
    }
}
