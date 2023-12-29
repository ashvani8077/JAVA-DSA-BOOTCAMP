//Write a program to print the factorial of a number by defining a method named 'Factorial'.
import java.util.Scanner;

public class FunctionFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Number: ");;
        int n= sc.nextInt();
        int re=factorial(n);
        System.out.println(re);
    }
    static int factorial(int n){
        int fact=1;
        while (n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
}
