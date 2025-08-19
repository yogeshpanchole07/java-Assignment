import java.util.Scanner;

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        int cost = quantity * 100;
        if (cost > 1000) {
            cost = cost - (cost / 10);
        }
        System.out.println("Total cost: " + cost);
        
    }
}
