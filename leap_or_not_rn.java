import java.util.Scanner;

public class leap_or_not_rn {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a year to check if it's a leap year: ");
            int year = sc.nextInt();

            // Call the isLeapYear method from LeapYear class
            if (leap_or_not.isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            sc.close();
        }
    }
