import java.util.Scanner;

public class Faculty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Integer Nummer ein: ");
        int number = scanner.nextInt();

        int result = number;

        for (int i = number - 1; i > 0; i--) {
            result = result * i;
        }

        System.out.println("Ergebnis: " + result);

        scanner.close();
    }
}
