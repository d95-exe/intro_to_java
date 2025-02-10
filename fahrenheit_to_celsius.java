import java.util.Scanner;

public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick an operation number:\n1: F to C\n2: C to F\nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter temp in Fahrenheit: ");
                float f1 = sc.nextFloat();
                float c1 = (f1 - 32)*5/9;
                System.out.println("In Celsius, that's: " + c1);
                break;
            case 2:
                System.out.println("Enter temp in Celsius: ");
                float c2 = sc.nextFloat();
                float f2 = (c2 * 9/5) + 32;
                System.out.println("In Fahrenheit, that's: " + f2);
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
