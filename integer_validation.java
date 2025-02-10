import java.util.Scanner;

public class integer_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while(true){
            System.out.println("Enter a number: ");
            if(sc.hasNextInt()){
                number = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                sc.next();
            }
        }
        System.out.println("Valid number: " + number);
        sc.close();
    }
}
