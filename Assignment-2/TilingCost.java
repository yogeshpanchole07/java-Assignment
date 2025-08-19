import java.util.Scanner;

class TilingCost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the floor (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter the width of the floor (in meters): ");
        int width = sc.nextInt();

        System.out.print("Enter cost per square meter: ");
        double rate = sc.nextDouble();

        int area = length * width;
        double cost = area * rate;

        System.out.println("Total tiling cost: ₹" + cost);

       
    }
}
