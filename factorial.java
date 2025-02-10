public class factorial {
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return n * factorialRecursive(n - 1); // Recursive step
    }
}
