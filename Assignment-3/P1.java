import java.util.Scanner;

class  P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
        
    }
}
