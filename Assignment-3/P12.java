import java.util.Scanner;

class P12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();
        int reverse = 0;

        reverse = reverse * 10 + number % 10;
        number = number / 10;
        reverse = reverse * 10 + number % 10;
        number = number / 10;
        reverse = reverse * 10 + number % 10;
        number = number / 10;
        reverse = reverse * 10 + number % 10;

        System.out.println("Reversed number: " + reverse);
        
    }
}
