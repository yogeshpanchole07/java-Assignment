import java.util.Scanner;

class P39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of the cylinder: ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();

        double r = diameter / 2;
        double pi = 22.0 / 7;
        double area = (2 * pi * r * h) + (2 * pi * r * r);

        System.out.println("Total surface area: " + area);

       
    }
}
