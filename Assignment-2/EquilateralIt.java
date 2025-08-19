import java.util.Scanner;

class EquilateralT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the equilateral triangle: ");
        int side = sc.nextInt();

        double area = (1.73 / 4) * side * side;

        System.out.println("Area of triangle: " + area);

       
    }
}
