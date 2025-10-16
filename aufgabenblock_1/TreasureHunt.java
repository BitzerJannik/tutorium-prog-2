import java.util.Scanner;
import java.util.Random;

public class TreasureHunt {
    public static int ROWS = 5;
    public static int COLS = 5;
    public static char BLANK = ' ';
    public static char TS = '$';
    public static char MS = 'x';

    public static char[][] create_grid() {
        char[][] grid = new char[ROWS][COLS];
        
        // set blanks
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++) {
                grid[i][j] = BLANK;
            }
        }
        return grid;
    }

    public static void render_grid(char[][] grid) {
        System.out.print(' ');

        for (int i=0; i < grid.length; i++) {
            System.out.print(i+1);
        }
        System.out.print("\n");

        for (int i=0; i < grid.length; i++) {
            System.out.print(i+1);
            for (int j=0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int[] create_treasure () {
        // set max values for rows and cols
        int end_rows = ROWS-1;
        int end_cols = COLS-1;
        
        // create random row position
        Random rand = new Random();
        int rows = rand.nextInt( (end_rows - 0) + 1);
        
        // create random col position
        int cols = rand.nextInt( (end_cols - 0) + 1);

        return new int[] {rows,cols};
    }

    public static void set_symbol (char symbol, char[][] grid, int [] pos) {
        grid[pos[0]][pos[1]] = symbol;
    }

    public static boolean compare_coo(int[] input, int[] target) {
        return input[0] == target[0] && input[1] == target[1];
    }

    public static void main(String[] args) {
        // create game grid
        char [][] game_grid = create_grid();

        Scanner scanner = new Scanner(System.in);
        
        // treasure position
        int [] treasure = create_treasure();
        

        System.out.println("Finde den Schatz");
        String prompt = "";

        int counter = 1;
        
        // game loop
        while (true) {
            // display grid
            render_grid(game_grid);
             
            System.out.println("Koordinaten (mit Leerzeichen getrennt | ROW COL): ");
            
            // get the coordinates from the user
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            scanner.nextLine(); // flush/ reset input stream and remove \n

            // normalize input
            a--;
            b--;

            if ( a < 0 || b < 0 ) {
                System.out.println("Falsche Werte/Koordinaten");
                scanner.nextLine();
                continue;
            }

            int[] user = {a, b};
            
            // check, if user got the position of the treasure
            if ( compare_coo(user, treasure) ) {
                // set treasure symbol in grid
                set_symbol(TS, game_grid, treasure);
                render_grid(game_grid);

                System.out.println("Super, du hast den Schatz gefunden!");
                System.out.println("Du hast " + counter + " Versuche gebraucht");
                break;
            }
            // ohterwise, the miss symbol is set
            set_symbol(MS, game_grid, user);
            counter++;
            
            // to exit the game before finishing
            System.out.println("Weiter? (Beenden mit q)");
            prompt = scanner.nextLine();
            
            if (prompt.equals("q")) {
                System.out.println("Spiel wurde beendet!");
                break;
            }
        } // while/game-loop end
        
        scanner.close();
    }
}
