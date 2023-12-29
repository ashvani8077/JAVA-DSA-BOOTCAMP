//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class FunctionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int n1 = sc.nextInt();
        System.out.print("Num2: ");
        int n2 = sc.nextInt();
        int re=sum(n1,n2);
        System.out.println(re);
    }
    static int sum(int a, int b){
        return a+b;
    }
}
