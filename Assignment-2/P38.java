import java.util.Scanner;

class P38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume of the cylinder: ");
        double volume = sc.nextDouble();

        System.out.print("Enter radius of the cylinder: ");
        double r = sc.nextDouble();

        double pi = 22.0 / 7;
        double h = volume / (pi * r * r);
        double area = (2 * pi * r * h) + (2 * pi * r * r);

        System.out.println("Height: " + h);
        System.out.println("Total surface area: " + area);

        
    }
}
