import java.util.Scanner;

public class HoursPerSemester {

    private static final int weeks = 16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a course: ");
        String course = scanner.next();

        System.out.println("Enter amount of SWS: ");
        double sws = scanner.nextDouble();

        double hours = Math.round(weeks * sws * 100) / 100;
        System.out.println(
            "Der Gesamtaufand fuer " + course + " betraegt: " + hours
        );

        scanner.close();
    }
}
