import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static int random_int(int end) {
        Random rand = new Random();
        return rand.nextInt((end - 0) + 1);
    }

    public static void main(String[] args) {
        int[] alphabet = { 68, 69, 70, 71, 72 };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie lange soll das Passwort sein: ");
        int pw_length = scanner.nextInt();

        char[] password = new char[pw_length];
        int counter = 0;

        while (counter < pw_length) {
            int random_int = random_int(alphabet.length - 1);
            password[counter] = (char) alphabet[random_int];
            counter++;
        }

        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
        System.out.print("\n");

        scanner.close();
    }
}
