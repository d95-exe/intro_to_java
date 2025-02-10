import java.util.Scanner;

public class basic_arithmetic {
    public static void main(String[] args) {
        System.out.println("Basic Calculator\nChoose an operand:");
        System.out.println("Enter 1 for +\nEnter 2 for -\nEnter 3 for /\nEnter 4 for *");
        Scanner sc = new Scanner(System.in);
        int o;

        // Input validation for operand choice
        while (true) {
            if (sc.hasNextInt()) {
                o = sc.nextInt();
                if (o >= 1 && o <= 4) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4:");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number:");
                sc.next();
            }
        }

        // Switch case for operations
        switch (o) {
            case 1: // Addition
                System.out.println("Addition\nEnter first num: ");
                int a1 = sc.nextInt();
                System.out.println("Enter second num: ");
                int b1 = sc.nextInt();
                System.out.println("Result: " + (a1 + b1));
                break;

            case 2: // Subtraction
                System.out.println("Subtraction\nEnter first num: ");
                int a2 = sc.nextInt();
                System.out.println("Enter second num: ");
                int b2 = sc.nextInt();
                System.out.println("Result: " + (a2 - b2));
                break;

            case 3: // Division
                System.out.println("Division\nEnter first num: ");
                double a3 = sc.nextDouble();
                System.out.println("Enter second num: ");
                double b3 = sc.nextDouble();
                if (b3 != 0) {
                    System.out.println("Result: " + (a3 / b3));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case 4: // Multiplication
                System.out.println("Multiplication\nEnter first num: ");
                int a4 = sc.nextInt();
                System.out.println("Enter second num: ");
                int b4 = sc.nextInt();
                System.out.println("Result: " + (a4 * b4));
                break;

            default:
                System.out.println("Something went wrong. Please try again.");
                break;
        }

        sc.close();
    }
}

