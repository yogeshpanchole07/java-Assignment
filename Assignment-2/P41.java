import java.util.Scanner;

class P41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();

        System.out.print("Enter diameter of the cylinder: ");
        double diameter = sc.nextDouble();

        double r = diameter / 2;
        double volume = (22.0 / 7) * r * r * h;

        System.out.println("Volume: " + volume);

        
    }
}
