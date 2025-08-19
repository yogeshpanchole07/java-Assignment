import java.util.Scanner;

class P44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        int term = a + (n - 1) * d;

        System.out.println("The " + n + "th term is: " + term);

        
    }
}
