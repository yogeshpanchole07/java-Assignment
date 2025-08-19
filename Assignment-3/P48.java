import java.util.Scanner;
class P48{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int i=0;
        int sum = 0;
        while(i<=num){
           
         a = b;
         
         b = sum;
         sum = a+b;
          i++;
         
          System.out.println("print i : "+sum);
            
        }
    }
}