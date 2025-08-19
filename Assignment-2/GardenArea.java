import java.util.Scanner;

class GardenArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the garden (in meters): ");
        int sideG = sc.nextInt();

        System.out.print("Enter side of the pool (in meters): ");
        int sideP = sc.nextInt();

        int gardenArea = sideG * sideG;
        int poolArea = sideP * sideP;
        int area = gardenArea - poolArea;

        System.out.println("Area of the garden excluding the pool: " + area + " m²");

       
    }
}
