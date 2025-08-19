import java.util.Scanner;

class BrickPath {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path length in meters: ");
        double lengthP = sc.nextDouble() * 100;

        System.out.print("Enter path breadth in meters: ");
        double breadthP = sc.nextDouble() * 100;

        System.out.print("Enter brick length in cm: ");
        double lengthB = sc.nextDouble();

        System.out.print("Enter brick breadth in cm: ");
        double breadthB = sc.nextDouble();

        double pathArea = lengthP * breadthP;
        double brickArea = lengthB * breadthB;
        double noOfBricks = pathArea / brickArea;

        System.out.println("Number of bricks required: " + noOfBricks);

        
    }
}
