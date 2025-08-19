import java.util.Scanner;

class P9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter.");
        } else {
            System.out.println("Not an alphabet letter.");
        }

        s
    }
}
