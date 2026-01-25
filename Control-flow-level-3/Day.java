import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int result = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        int dayNumber = (result + 6) % 7;

        System.out.println("0=Sunday, 1=Monday, ..., 6=Saturday");
        System.out.println("Day number is: " + dayNumber);

        sc.close();
    }
}
