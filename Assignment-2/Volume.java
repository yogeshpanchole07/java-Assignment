import java.util.Scanner;

class Volume {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter edge length of the cube (in cm): ");
        int edge = sc.nextInt();

        System.out.print("Enter length of the cuboid (in cm): ");
        int length = sc.nextInt();

        System.out.print("Enter width of the cuboid (in cm): ");
        int width = sc.nextInt();

        System.out.print("Enter height of the cuboid (in cm): ");
        int height = sc.nextInt();

        int cubeVolume = edge * edge * edge;
        int cuboidVolume = length * width * height;

        System.out.println("Cube volume: " + cubeVolume + " cm³");
        System.out.println("Cuboid volume: " + cuboidVolume + " cm³");

        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume.");
        } else if (cuboidVolume > cubeVolume) {
            System.out.println("Cuboid has more volume.");
        } else {
            System.out.println("Both have the same volume.");
        }

        
    }
}
