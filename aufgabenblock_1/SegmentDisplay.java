import java.util.Scanner;

public class SegmentDisplay {
    public static void set_a (char symbol, char[][] display) {
        for (int i=1; i < display[0].length-1; i++) {
            display[0][i] = symbol;
        }
    }

    public static void set_b (char symbol, char[][] display) {
        for (int i=1; i < 3; i++) {
            int last = display[i].length-1;
            display[i][last] = symbol;
        }
    }

    public static void set_c (char symbol, char[][] display) {
        for (int i=4; i < 6; i++) {
            int last = display[i].length-1;
            display[i][last] = symbol;
        }
    }

    public static void set_d (char symbol, char[][] display) {
        int lowest = display.length -1;
        for (int i=1; i < 3; i++) {
            display[lowest][i] = symbol;
        }
    }

    public static void set_e (char symbol, char[][] display) {
        for (int i=4; i < 6; i++) {
            display[i][0] = symbol;
        }
    }

    public static void set_f (char symbol, char[][] display) {
        for (int i=1; i < 3; i++) {
            display[i][0] = symbol;
        }
    }

    public static void set_g (char symbol, char[][] display) {
        for (int i=1; i < display[3].length - 2; i++) {
            display[3][i] = symbol;
        }
    }

    public static char[][] set_display(char symbol, int number) {
        char[][] display = new char[7][5];

        // set default/blank values
        for ( int i=0; i < display.length; i++ ) {
            for ( int j=0; j < display[i].length; j++ ) {
                display[i][j] = ' ';
            }
        }
        
        switch (number) {
            case 1:
                set_b(symbol, display);
                set_c(symbol, display);
                break;
            case 2:
                set_a(symbol, display);
                set_b(symbol, display);
                set_g(symbol, display);
                set_e(symbol, display);
                set_d(symbol, display);
                break;
            case 3:
                set_a(symbol, display);
                set_b(symbol, display);
                set_c(symbol, display);
                set_d(symbol, display);
                set_g(symbol, display);
                break;
            case 4:
                set_b(symbol, display);
                set_c(symbol, display);
                set_g(symbol, display);
                set_f(symbol, display);
                break;
            case 5:
                set_a(symbol, display);
                set_c(symbol, display);
                set_d(symbol, display);
                set_f(symbol, display);
                set_g(symbol, display);
                break;
            case 6:
                set_a(symbol, display);
                set_c(symbol, display);
                set_d(symbol, display);
                set_e(symbol, display);
                set_f(symbol, display);
                set_g(symbol, display);
                break;
            case 7:
                set_a(symbol, display);
                set_b(symbol, display);
                set_c(symbol, display);
                break;
            case 8:
                set_a(symbol, display);
                set_b(symbol, display);
                set_c(symbol, display);
                set_d(symbol, display);
                set_e(symbol, display);
                set_f(symbol, display);
                set_g(symbol, display);
                break;
            case 9:
                set_a(symbol, display);
                set_b(symbol, display);
                set_c(symbol, display);
                set_d(symbol, display);
                set_f(symbol, display);
                set_g(symbol, display);
                break;
            default:
                set_a(symbol, display);
                set_b(symbol, display);
                set_c(symbol, display);
                set_d(symbol, display);
                set_e(symbol, display);
                set_f(symbol, display);
                break;
        }

        return display;
    }

    public static void print_display( char[][] display ) {
        for (int i=0; i < display.length; i++) {
            for (int j=0; j < display[i].length; j++) {
                System.out.print(display[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read symbol
        System.out.println("Symbol: ");
        char symbol = scanner.next().charAt(0);

        // read number
        System.out.println("Nummer: ");
        int number = scanner.nextInt();

        char [][] display = set_display( symbol, number);

        String prompt = "";

        while (true) {
            print_display(display);

            System.out.println("Continue? Quit with q");
            scanner.nextLine();

            prompt = scanner.nextLine();
            if (prompt.equals("q")) {
                break;
            }

            System.out.println("Nummer: ");
            number = scanner.nextInt();

            display = set_display( symbol, number);
        } 

        scanner.close();
    }
}
