import java.util.Scanner;

class Tiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the region (in cm): ");
        int regionLength = sc.nextInt();

        System.out.print("Enter breadth of the region (in cm): ");
        int regionBreadth = sc.nextInt();

        System.out.print("Enter length of one tile (in cm): ");
        int tileLength = sc.nextInt();

        System.out.print("Enter breadth of one tile (in cm): ");
        int tileBreadth = sc.nextInt();

        int regionArea = regionLength * regionBreadth;
        int tileArea = tileLength * tileBreadth;

        int tiles = regionArea / tileArea;

        System.out.println("Area of region: " + regionArea + " cm²");
        System.out.println("Area of one tile: " + tileArea + " cm²");
        System.out.println("Number of tiles required: " + tiles);

       
    }
}
