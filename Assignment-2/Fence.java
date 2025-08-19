import java.util.Scanner;

class Fence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total cost of fencing (in Rs): ");
        int costs = sc.nextInt();

        System.out.print("Enter length of the park (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter fencing rate per meter (in Rs): ");
        int rate = sc.nextInt();

        int perimeter = costs / rate;
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth of park: " + breadth + " m");
        System.out.println("Perimeter of park: " + perimeter + " m");
        System.out.println("Area of the field: " + area + " m²");

       
    }
}
