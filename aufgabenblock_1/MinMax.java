import java.util.Scanner;

public class MinMax {

    private static final int LENGTH = 5;

    public static void main(String[] args) {
        int[] numbers = new int[LENGTH];

        Scanner scanner = new Scanner(System.in);

        // read and store numbers in array
        int counter = 0;
        do {
            System.out.println("Zahl eingeben: ");
            numbers[counter] = scanner.nextInt();
            counter++;
        } while (counter < numbers.length);

        // find Minimum
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.print("Werte: [ ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]);
            if (!(j == (numbers.length - 1))) {
                System.out.print(", ");
            } else {
                System.out.print(" ]\n");
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}
