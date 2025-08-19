import java.util.Scanner;

class Quardilateral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the diagonal: ");
        int diagonal = sc.nextInt();

        System.out.print("Enter the height of the first triangle: ");
        int height1 = sc.nextInt();

        System.out.print("Enter the height of the second triangle: ");
        int height2 = sc.nextInt();

        double areaOfTriangle1 = 0.5 * diagonal * height1;
        double areaOfTriangle2 = 0.5 * diagonal * height2;
        double fieldArea = areaOfTriangle1 + areaOfTriangle2;

        System.out.println("Area of the field: " + fieldArea);

        
    }
}
