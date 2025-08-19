import java.util.Scanner;

class Park {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the park (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of the park (in meters): ");
        int breadth = sc.nextInt();

        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();

        int perimeter = 2 * (length + breadth);
        int distance = perimeter * rounds;
        double distanceInKm = distance / 1000.0;

        System.out.println("Distance he covers in a day: " + distanceInKm + " km");

        
    }
}
