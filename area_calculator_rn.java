import java.util.Scanner;

public class area_calculator_rn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menu for user to choose which area to calculate
        System.out.println("Select the shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();
        area_calculator.calculateArea(choice);

        sc.close();
    }
}