import java.util.Scanner;

class Square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square (in cm): ");
        int perimeter = sc.nextInt();

        int side = perimeter / 4;
        int area = side * side;

        System.out.println("Side of the square: " + side + " cm");
        System.out.println("Area of the square: " + area + " cm²");

        
    }
}
