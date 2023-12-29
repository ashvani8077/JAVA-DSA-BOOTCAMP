//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;

public class AllOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start entering Numbers: ");
        int nSum=0;
        int eSum=0;
        int oSum=0;
        while (true){
            int n= sc.nextInt();
            if(n>0){
                if(n%2==0){
                    eSum=eSum+n;
                }
                else{
                    oSum=oSum+n;
                }
            }
            if(n<0){
                nSum=nSum+n;
            }
            if(n==0){
                break;
            }
        }
        System.out.println("Sum of Negative Numbers: "+nSum);
        System.out.println("Sum of Positive Even Numbers: "+eSum);
        System.out.println("Sum of Positive Odd Numbers: "+oSum);
    }
}
