import java.util.Scanner;

public class minute_years_rn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        int yrs = minute_years.years(minutes);
        int dys = minute_years.days(minutes);
        System.out.println("\nThat's " + yrs + " years and " + dys + " days.");
    }
}
