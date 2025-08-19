import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of the rectangle (in cm): ");
        int perimeter = sc.nextInt();

        System.out.print("Enter length of the rectangle (in cm): ");
        int length = sc.nextInt();

        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth of the rectangle: " + breadth + " cm");
        System.out.println("Area of the rectangle: " + area + " cm²");

      
    }
}
