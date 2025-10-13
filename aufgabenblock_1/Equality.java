import java.util.Scanner;

public class Equality {

    public static boolean equal(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein: ");
        int number = scanner.nextInt();

        if (equal(number)) {
            System.out.println(number + " ist gerade.");
        } else {
            System.out.println(number + " ist ungerade.");
        }

        scanner.close();
    }
}
