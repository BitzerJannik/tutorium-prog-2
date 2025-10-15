import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.next();

        char[] characters = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            characters[i] = word.charAt(i);
        }

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i]);
        }
        System.out.print("\n");

        scanner.close();
    }
}
