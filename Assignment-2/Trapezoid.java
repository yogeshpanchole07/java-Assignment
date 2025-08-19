import java.util.Scanner;

class Trapezoid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base1 of the trapezoid (in cm): ");
        int base1 = sc.nextInt();

        System.out.print("Enter base2 of the trapezoid (in cm): ");
        int base2 = sc.nextInt();

        System.out.print("Enter height of the trapezoid (in cm): ");
        int height = sc.nextInt();

        System.out.print("Enter width of the path (in cm): ");
        int width = sc.nextInt();

        double area = 0.5 * height * (base1 + base2);
        double path = height * width;
        double woodenArea = area - path;

        System.out.println("Wooden area: " + woodenArea + " cm²");

        
    }
}
