import java.util.Scanner;

class TileFloor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the square tile (in cm): ");
        int side = sc.nextInt();

        System.out.print("Enter length of the floor (in cm): ");
        int lengthf = sc.nextInt();

        System.out.print("Enter width of the floor (in cm): ");
        int widthf = sc.nextInt();

        int tileArea = side * side;
        int floorArea = lengthf * widthf;
        double noOfTiles = (double) floorArea / tileArea;

        System.out.println("Number of tiles needed: " + noOfTiles);

       
    }
}
