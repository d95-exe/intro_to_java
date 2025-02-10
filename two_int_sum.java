import java.util.Scanner;

public class two_int_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //scanner obj made for input

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        scanner.close();
    }
}
