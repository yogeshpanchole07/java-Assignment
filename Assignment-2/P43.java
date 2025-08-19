import java.util.Scanner;

class P43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertical height of the cone (in cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter slant height of the cone (in cm): ");
        double slantHeight = sc.nextDouble();

        System.out.print("Enter rate of polishing per cm²: ");
        double rate = sc.nextDouble();

        double radius = Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(height, 2));
        double baseArea = Math.PI * Math.pow(radius, 2);
        double cost = baseArea * rate;

        System.out.printf("Cost of polishing the base: %.2f\n", cost);

       
    }
}
