import java.util.Scanner;

public class factorial_rn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to find factorial: ");
        int n = sc.nextInt();
        int iterativeResult = factorial.factorialIterative(n);
        int recursiveResult = factorial.factorialRecursive(n);
        System.out.println("Iterative: " + iterativeResult);
        System.out.println("Recursive: " + recursiveResult);
    }
}
