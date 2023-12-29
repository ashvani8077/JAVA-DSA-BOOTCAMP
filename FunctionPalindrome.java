//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class FunctionPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Number: ");;
        int n= sc.nextInt();
        String re=isPalindrome(n);
        System.out.println(re);
    }
    static String isPalindrome(int n){
        String re="";
        String s=String.valueOf(n);
        StringBuffer sd=new StringBuffer(s);
        sd=sd.reverse();
        String temp=String.valueOf(sd);
        if(s.equals(temp)){
            re="Palindrome";
        }
        else{
            re="No Palindrome";
        }
        return re;
    }
}
