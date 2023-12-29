//Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class FunctionPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Number: ");;
        int n= sc.nextInt();
        String re=check(n);
        System.out.println(re);
    }
    static String check(int n){
        String re="";
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count<=1){
            re="Prime";
        }
        else{
            re="Non-Prime";
        }
        return re;
    }
}
