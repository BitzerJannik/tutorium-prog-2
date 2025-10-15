import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Zahlen solle eingelesen werden? ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        int counter = 0;
        do {
            System.out.print(">>> ");
            numbers[counter] = scanner.nextInt();
            System.out.print("\n");
            counter++;
        } while (counter < length);

        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        result = result / numbers.length;
        System.out.println("Durchschnitt: " + result);

        scanner.close();
    }
}
