import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hypotenuse: ");
        int hypotenuse = sc.nextInt();

        System.out.print("Enter height (perpendicular side): ");
        int height = sc.nextInt();

        if (hypotenuse <= height) {
            System.out.println("Error: Hypotenuse must be greater than height.");
        } else {
            int baseSquare = (hypotenuse * hypotenuse) - (height * height);
            double base = Math.sqrt(baseSquare);
            double area = 0.5 * base * height;

            System.out.printf("Length of other side (base): %.2f cm\n", base);
            System.out.printf("Area of triangle: %.2f cm²\n", area);
        }

        
    }
}
