import java.util.Scanner;

class P36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = ((2 * (22.0 / 7) * r * r) + (2 * (22.0 / 7) * r * h));

        System.out.println("Area: " + area);

        
    }
}
