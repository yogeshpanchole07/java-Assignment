import java.util.Scanner;
class p24{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the number..");
    int num=sc.nextInt();
    if(num>0){
        System.out.println("It's a positive number...");
    }
    else{
        if(num<0){
            System.out.println("It's a negative number...");
        }
        else{
            System.out.println("It's neutral number...");
        }
    }
}}