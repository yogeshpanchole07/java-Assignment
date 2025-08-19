import java.util.Scanner;

class Ribbon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the board (in meters): ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of the board (in meters): ");
        int breadth = sc.nextInt();

        int boardPerimeter = 2 * (length + breadth);

        System.out.println("Length of ribbon needed: " + boardPerimeter + " meters");

       
    }
}
