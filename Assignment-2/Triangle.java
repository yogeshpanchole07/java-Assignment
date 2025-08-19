import java.util.Scanner;

class Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1 of the triangle (in cm): ");
        int side1 = sc.nextInt();

        System.out.print("Enter side2 of the triangle (in cm): ");
        int side2 = sc.nextInt();

        System.out.print("Enter perimeter of the triangle (in cm): ");
        int perimeter = sc.nextInt();

        int side3 = perimeter - side1 - side2;
        double area = 0.5 * side1 * side2;

        System.out.println("Side3 of the triangle: " + side3 + " cm");
        System.out.println("Approximate area of triangle: " + area + " cm²");

        
    }
}
