//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r= sc.nextDouble();
        double t= sc.nextDouble();
        double re=(p*r*t)/100;
        System.out.println(re);
    }
}
