import java.util.Scanner;
class p47{
    public static void main(String args[]){
        Scapnner sc=new Scanner(System.in);
        System.out.println("Enter the numbe..");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int n1=i*i;
            System.out.println(n1);
            i++;
        }
    }
}