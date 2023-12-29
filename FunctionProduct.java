//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;

public class FunctionProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int n1 = sc.nextInt();
        System.out.print("Num2: ");
        int n2 = sc.nextInt();
        int re=pro(n1,n2);
        System.out.println(re);
    }
    static int pro(int a, int b){
        return a*b;
    }
}
