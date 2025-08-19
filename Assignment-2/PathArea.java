import java.util.Scanner;

class PathArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bricks: ");
        int noOfBricks = sc.nextInt();

        System.out.print("Enter length of one brick (in cm): ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of one brick (in cm): ");
        int breadth = sc.nextInt();

        int brickArea = length * breadth;
        int totalArea = noOfBricks * brickArea;

        System.out.println("Area of the path: " + totalArea + " cm²");

        
    }
}
