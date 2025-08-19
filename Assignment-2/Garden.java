import java.util.Scanner;

class Garden {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Shelly's garden: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of Shelly's garden: ");
        int breadth = sc.nextInt();

        System.out.print("Enter side of Rachel's square garden: ");
        int side = sc.nextInt();

        int shellyArea = length * breadth;
        int rachelArea = side * side;
        int difference = Math.abs(shellyArea - rachelArea);

        System.out.println("Area of Shelly's garden: " + shellyArea);
        System.out.println("Area of Rachel's garden: " + rachelArea);
        System.out.println("Difference in area: " + difference);

        if (shellyArea > rachelArea) {
            System.out.println("Shelly's garden is bigger.");
        } else if (rachelArea > shellyArea) {
            System.out.println("Rachel's garden is bigger.");
        } else {
            System.out.println("Both gardens are of equal area.");
        }

       
    }
}
