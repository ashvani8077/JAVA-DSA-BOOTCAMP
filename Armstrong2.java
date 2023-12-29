//Armstrong Number In Java
import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the Number: ");
        int n= sc.nextInt();
        int p=0;
        int t1=n;
        int t2=n;
        int sum=0;
        while (n>0){
            p++;
            n=n/10;
        }
        while (t2>0){
            int last=t2%10;
            t2=t2/10;
            sum=sum+((int)Math.pow(last,p));
        }
        if(sum==t1){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
