//Write a function that returns the sum of first n natural numbers.
import java.util.Scanner;

public class FunctionNaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Number: ");;
        int n= sc.nextInt();
        int re=sum(n);
        System.out.println(re);
    }
    static int sum(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
}
