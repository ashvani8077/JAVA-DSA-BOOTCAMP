//Perfect Number In Java
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
              //  System.out.println(i);
                sum=sum+i;
            }
        }
      //  System.out.println(sum);
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect Number");
        }
    }
}
