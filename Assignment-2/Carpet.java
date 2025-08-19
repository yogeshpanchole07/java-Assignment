import java.util.Scanner;

class Carpet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the carpet: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of the carpet: ");
        int breadth = sc.nextInt();

        int area = length * breadth;

        System.out.println("Area of the carpet: " + area);

       
    }
}
