import java.util.Scanner;

class HOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter area of the triangle: ");
        double area = sc.nextDouble();

        double height = (2 * area) / base;

        System.out.println("Height of triangle: " + height);

        
    }
}
