import java.util.Scanner;

public class logical_bitwise_ternary {
    public static void main(String[] args) {
        //logical operators
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int j = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int k = sc.nextInt();

        if (j>0 && k>0){    //AND &&
            System.out.println("Both are +ive");
        }else{
            System.out.println("Atleast one is -ive");
        }

        if (j>0 || k>0){     //OR ||
            System.out.println("Atleast one is +ive");
        }else{
            System.out.println("None is -ive");
        }

        boolean isNumberNegative = j<0;
        System.out.println("Is 1st number negative?...: " + !isNumberNegative);

        //bitwise operators
        int x = 1, y = 0;
        System.out.println("x & Y: " + (x & y));    //Bitwise AND
        System.out.println("x | Y: " + (x | y));    //bitwise OR
        System.out.println("x ^ Y: " + (x ^ y));    //bitwise XOR
        System.out.println("~X : " + (~x));         //compliment
        System.out.println("X << 1 : " + (x << 1)); //left shift
        System.out.println("X >> 1 : " + (x >> 1)); //right shift

        int z = -5;
        System.out.println("X >>> 1 : " + (z >>> 1)); // //unsigned right shift

        //ternary operators
        int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Max:"+max);

        String result = (a % 2 ==0) ? "Even" : "Odd";
        System.out.println("A is :"+result);

        sc.close();
    }
}