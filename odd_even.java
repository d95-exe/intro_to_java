import java.util.Scanner;

public class odd_even {
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
        if (number == 0){
            System.out.println("Number is 0");
        } else if (number%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
