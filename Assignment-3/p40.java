import java.util.Scanner;
class p40{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the cost price");
        double costPrice=sc.nextDouble();

        System.out.println("Enter the selling price");
        double sellingPrice=sc.nextDouble();

        if(sellingPrice>costPrice){
            double profit=sellingPrice-costPrice;
            System.out.println("Profit : "+profit);
        }
        else if(costPrice>sellingPrice){
            double loss=costPrice-sellingPrice;
            System.out.println("Loss : "+loss);
        }
        else{
            System.out.println("Neither be profit nor be loss...");
        }
    }
}