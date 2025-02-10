import java.util.Scanner;

public class si_ci_rn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = si_ci.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();
        double compoundInterest = si_ci.calculateCompoundInterest(principal, rate, time, n);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
