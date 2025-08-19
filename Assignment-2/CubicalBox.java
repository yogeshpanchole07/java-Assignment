import java.util.Scanner;

class CubicalBox {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cubical box (in cm): ");
        int side = sc.nextInt();

        System.out.print("Enter length of carton (in cm): ");
        int length = sc.nextInt();

        System.out.print("Enter width of carton (in cm): ");
        int width = sc.nextInt();

        System.out.print("Enter height of carton (in cm): ");
        int height = sc.nextInt();

        int cubeVolume = side * side * side;
        int cartonVolume = length * width * height;
        double cubicalBox = (double) cartonVolume / cubeVolume;

        System.out.println("No of cubical boxes: " + cubicalBox);

       
    }
}
