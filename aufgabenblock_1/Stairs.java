import java.util.Scanner;

public class Stairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Symbol: ");
        String symbol = scanner.next();

        System.out.println("Wie wiele Stufen: ");
        int length = scanner.nextInt();

        // create a bit space
        System.out.print("\n\n");

        for (int i = 1; i <= length; i++) {
            int counter = i;

            while (counter > 0) {
                System.out.print(symbol);
                counter -= 1;
            }
            System.out.print("\n");
        }

        // create space and print out the reversed version
        System.out.print("\n\n");
        System.out.println("Reverse: ");

        for (int i = 1; i <= length; i++) {
            int space = length - i;
            int counter = i;
            while (space > 0) {
                System.out.print(" ");
                space -= 1;
            }

            while (counter > 0) {
                System.out.print(symbol);
                counter -= 1;
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}
