import java.util.Scanner;

class Isosceles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the equal sides of the triangle: ");
        double side = sc.nextDouble();

        double area = 0.5 * side * side;

        System.out.println("Area of the triangle: " + area);

       
    }
}
