import java.util.Scanner;

public class area_calculator {

    // Method to calculate area based on user choice
    public static void calculateArea(int choice) {
        Scanner sc = new Scanner(System.in);

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the Circle: " + circleArea);
                break;

            case 2: // Square
                System.out.print("Enter the side of the square: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of the Square: " + squareArea);
                break;

            case 3: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of the Rectangle: " + rectangleArea);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
    }
}
