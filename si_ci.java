public class si_ci {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time, int n) {
        return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
    }
}
