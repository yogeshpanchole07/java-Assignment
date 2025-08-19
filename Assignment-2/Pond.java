import java.util.Scanner;

class Pond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the pond (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter width of the pond (in meters): ");
        int width = sc.nextInt();

        System.out.print("Enter depth/height of the pond (in meters): ");
        int height = sc.nextInt();

        int volume = length * width * height;

        System.out.println("Capacity of the pond: " + volume + " cubic meters");

       
    }
}
