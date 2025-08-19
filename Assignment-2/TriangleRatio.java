import java.util.Scanner;

class TriangleRatio {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base ratio: ");
        int baseRatio = sc.nextInt();

        System.out.print("Enter height ratio: ");
        int heightRatio = sc.nextInt();

        System.out.print("Enter area of the triangle: ");
        int area = sc.nextInt();

        double aSquare = (2.0 * area) / (baseRatio * heightRatio);
        double a = Math.sqrt(aSquare);
        double base = baseRatio * a;
        double height = heightRatio * a;

        System.out.println("a²: " + aSquare);
        System.out.println("a: " + a);
        System.out.println("Base of triangle: " + base + " units");
        System.out.println("Height of triangle: " + height + " units");

       
    }
}
