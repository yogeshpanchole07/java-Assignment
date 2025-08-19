import java.util.Scanner;

class RectangleCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area of the rectangle (in cm²): ");
        int area = sc.nextInt();

        System.out.print("Enter breadth of the rectangle (in cm): ");
        int breadth = sc.nextInt();

        int length = area / breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Length of the rectangle: " + length + " cm");
        System.out.println("Perimeter of the rectangle: " + perimeter + " cm");

       
    }
}
