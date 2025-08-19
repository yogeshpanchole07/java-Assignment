import java.util.Scanner;

class RightTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area of the right triangle (in cm²): ");
        int area = sc.nextInt();

        System.out.print("Enter length of one leg (in cm): ");
        int leg1 = sc.nextInt();

        double leg2 = area / (0.5 * leg1);

        System.out.println("Length of the other leg is: " + leg2 + " cm");

       
    }
}
