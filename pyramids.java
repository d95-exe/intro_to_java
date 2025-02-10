import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        int h = sc.nextInt();
        System.out.println("Left pyramid: ");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Right pyramid: ");
        for (int i = 0; i < h; i++) {
            for (int j = h - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Symmetric pyramid: ");
        for (int i = 0; i < h; i++) {
            for (int j = h - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}