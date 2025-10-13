import java.util.Scanner;

public class TwoToThePower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(">>> " + (int) Math.pow(2, number));

        scanner.close();
    }
}
