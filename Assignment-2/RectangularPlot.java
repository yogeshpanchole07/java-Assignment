import java.util.Scanner;

class RectangularPlot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the plot (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter width of the plot (in meters): ");
        int width = sc.nextInt();

        int area = length * width;
        float cost = (area / 100.0f) * 6;

        System.out.println("Cost of the plot: ₹" + cost);

       
    }
}
