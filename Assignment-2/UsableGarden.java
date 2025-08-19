import java.util.Scanner;

class UsableGarden {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the garden (in meters): ");
        int lengthG = sc.nextInt();

        System.out.print("Enter breadth of the garden (in meters): ");
        int breadthG = sc.nextInt();

        System.out.print("Enter width of Path 1 (in meters): ");
        int path1Width = sc.nextInt();

        System.out.print("Enter width of Path 2 (in meters): ");
        int path2Width = sc.nextInt();

        int gardenArea = lengthG * breadthG;
        int path1Area = path1Width * breadthG;
        int path2Area = path2Width * lengthG;
        int overlapArea = path1Width * path2Width;

        int totalPathArea = path1Area + path2Area - overlapArea;
        int usableArea = gardenArea - totalPathArea;

        System.out.println("Usable area of the garden: " + usableArea + " m²");

       
    }
}
