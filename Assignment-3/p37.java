import java.util.Scanner;
class p37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num%5==0){
            System.out.println(num +" is divisible by 5");
        }
        else if(num%11==0){
            System.out.println(num +" is divisible by 11");

        }
        else{
            System.out.println(num +" is not divisible by 5 and 11");
        }
    }
}