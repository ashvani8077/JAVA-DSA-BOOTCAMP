//Sum Of A Digits Of Number
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        int sum=0;
        while (n>0){
            int last=n%10;
            sum=sum+last;
            n=n/10;
        }
        System.out.println(sum);
    }
}
