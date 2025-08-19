import java.util.Scanner;

class Tile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of one tile (in cm): ");
        int lengtht = sc.nextInt();

        System.out.print("Enter width of one tile (in cm): ");
        int widtht = sc.nextInt();

        System.out.print("Enter length of the floor (in cm): ");
        int lengthf = sc.nextInt();

        System.out.print("Enter width of the floor (in cm): ");
        int widthf = sc.nextInt();

        int tileArea = lengtht * widtht;
        int floorArea = lengthf * widthf;
        double noOfTiles = (double) floorArea / tileArea;

        System.out.println("Number of tiles needed: " + noOfTiles);

        
    }
}
