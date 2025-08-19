import java.util.Scanner;

class P37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total surface area of cylinder: ");
        double sarea = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

        double pi = 22.0 / 7;
        double a = 2 * pi;
        double b = 2 * pi * height;
        double c = -sarea;

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real solution for radius.");
        } else {
            double r = (-b + Math.sqrt(discriminant)) / (2 * a);
            double d = 2 * r;
            double tsa = 2 * pi * r * (r + height);

            System.out.println("Radius: " + r);
            System.out.println("Diameter: " + d);
            System.out.println("Total Surface Area (Recalculated): " + tsa);
        }

       
    }
}
