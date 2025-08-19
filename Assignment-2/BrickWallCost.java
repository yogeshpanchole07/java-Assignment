import java.util.Scanner;

class BrickWallCost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brick length in cm: ");
        int lengthB = sc.nextInt();

        System.out.print("Enter brick width in cm: ");
        int widthB = sc.nextInt();

        System.out.print("Enter brick height in cm: ");
        double heightB = sc.nextDouble();

        System.out.print("Enter wall length in meters: ");
        int lengthWm = sc.nextInt();

        System.out.print("Enter wall width in meters: ");
        int widthWm = sc.nextInt();

        System.out.print("Enter wall height in meters: ");
        double heightWm = sc.nextDouble();

        int lengthW = lengthWm * 100;
        int widthW = widthWm * 100;
        double heightW = heightWm * 100;

        double brickVolume = lengthB * widthB * heightB;
        double wallVolume = lengthW * widthW * heightW;
        double noOfBricks = wallVolume / brickVolume;
        double totalCost = (noOfBricks * 900) / 1000.0;

        System.out.println("No of bricks required: " + noOfBricks);
        System.out.println("Total cost: " + totalCost);

        
    }
}
