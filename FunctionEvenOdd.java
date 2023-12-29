//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class FunctionEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Number: ");;
        int n= sc.nextInt();
        String re=evenodd(n);
        System.out.println(re);
    }
    static String evenodd(int a){
        String r="";
        if(a%2==0){
            r="Even";
        }
        else {
            r="Odd";
        }
        return r;
    }
}
