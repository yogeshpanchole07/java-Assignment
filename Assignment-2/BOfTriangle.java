import java.util.Scanner;

class BOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total value : ");
        double total = sc.nextDouble();

        System.out.print("Enter percentage for area : ");
        double percentage = sc.nextDouble();

        System.out.print("Enter altitude (height) of triangle: ");
        double altitude = sc.nextDouble();

        double area = (percentage / 100) * total;
        double base = (2 * area) / altitude;

        System.out.printf("Area of triangle: %.2f cm²\n", area);
        System.out.printf("Base of triangle: %.2f cm\n", base);

        
    }
}
