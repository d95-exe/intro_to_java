import java.util.Scanner;

public class inch_to_meters_rn {
    public static void main(String[] args) {
        System.out.println("Enter the length in inches:");
        Scanner sc = new Scanner(System.in);
        int inches = sc.nextInt();
        float result = inch_to_meters.calc(inches);
        System.out.println(result);
    }
}
