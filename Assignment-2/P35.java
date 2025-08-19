import java.util.Scanner;

class P35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = (2 * (22.0 / 7) * r) * (r + height);

        System.out.println("Area: " + area);

       
    }
}
