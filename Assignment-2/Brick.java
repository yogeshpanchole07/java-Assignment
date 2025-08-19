import java.util.Scanner;

class Brick {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brick length in cm: ");
        int lengthB = sc.nextInt();

        System.out.print("Enter brick width in cm: ");
        int widthB = sc.nextInt();

        System.out.print("Enter brick height in cm: ");
        int heightB = sc.nextInt();

        System.out.print("Enter wall length in meters: ");
        int lengthWm = sc.nextInt();

        System.out.print("Enter wall width in meters: ");
        int widthWm = sc.nextInt();

        System.out.print("Enter wall height in meters: ");
        int heightWm = sc.nextInt();

        int lengthW = lengthWm * 100;
        int widthW = widthWm * 100;
        int heightW = heightWm * 100;

        int brickVolume = lengthB * widthB * heightB;
        int wallVolume = lengthW * widthW * heightW;

        double noOfBricks = (double) wallVolume / brickVolume;

        System.out.printf("Number of bricks used to make the wall: %.0f\n", noOfBricks);

        
    }
}
