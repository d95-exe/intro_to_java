import java.util.Scanner;

public class various_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int i = sc.nextInt();
        System.out.println("Entered int: " + i);

        System.out.println("Enter a string: ");
        String hello = sc.next();
        System.out.println("Entered string: " + hello);

        System.out.println("Enter an float: ");
        float f = sc.nextFloat();
        System.out.println("Entered float: " + f);

        System.out.println("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println("Entered boolean: " + b);

        sc.nextLine();
        System.out.println("Enter a line of text: ");
        String line = sc.nextLine();
        System.out.println("Entered line: " + line);

        System.out.println("Enter a character: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Entered character: " + ch);

        sc.close();
    }
}
