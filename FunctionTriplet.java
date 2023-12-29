//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.Scanner;

public class FunctionTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num1: ");
        int n1= sc.nextInt();
        System.out.print("Num2: ");
        int n2= sc.nextInt();
        System.out.print("Num3: ");
        int n3= sc.nextInt();
        String re=isTriplet(n1,n2,n3);
        System.out.println(re);
    }
    static String isTriplet(int a,int b,int c){
        String re="";
        if(((a*a)+(b*b))==(c*c)){
            re="Triplet";
        }
        else {
            re="Non-Triplet";
        }
        return re;
    }
}
