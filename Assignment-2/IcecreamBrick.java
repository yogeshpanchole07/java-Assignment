import java.util.Scanner;

class IcecreamBrick {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the ice cream brick (in cm): ");
        int length = sc.nextInt();

        System.out.print("Enter width of the ice cream brick (in cm): ");
        int width = sc.nextInt();

        System.out.print("Enter height of the ice cream brick (in cm): ");
        int height = sc.nextInt();

        int brickVolume = length * width * height;

        System.out.println("Volume of Brick of ice cream: " + brickVolume + " cm³");

        
    }
}
