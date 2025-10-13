import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your mark: ");

        int points = scanner.nextInt();

        System.out.println(points);

        if (points >= 90) {
            System.out.println("Your mark is a 1.");
        } else if ((points >= 80) && (points < 90)) {
            System.out.println("Your mark is a 2.");
        } else if ((points >= 65) && (points < 80)) {
            System.out.println("Your mark is a 3.");
        } else if ((points >= 50) && (points < 65)) {
            System.out.println("Your mark is a 4.");
        } else if ((points >= 30) && (points < 50)) {
            System.out.println("Your mark is a 5.");
        } else {
            System.out.println("Your mark is a 6.");
        }

        scanner.close();
    }
}
