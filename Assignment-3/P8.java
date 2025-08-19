import java.util.Scanner;

class P8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of classes held: ");
        int held = sc.nextInt();
        System.out.print("Enter number of classes attended: ");
        int attended = sc.nextInt();
        double percentage = (attended * 100.0) / held;
        System.out.println("Attendance percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medical = sc.next().charAt(0);
            if (medical == 'Y' || medical == 'y') {
                System.out.println("Allowed to sit in exam due to medical cause.");
            } else {
                System.out.println("Not allowed to sit in exam.");
            }
        }
       
    }
}
