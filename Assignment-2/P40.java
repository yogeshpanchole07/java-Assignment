import java.util.Scanner;

class P40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double r = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();

        double volume = (22.0 / 7) * r * r * h;

        System.out.println("Volume: " + volume);

       
    }
}
