import java.util.Scanner;

class P45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the first term (a1): ");
        int a1 = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        int sum = (n * (2 * a1 + (n - 1) * d)) / 2;

        System.out.println("Sum of " + n + " terms: " + sum);

        
    }
}
