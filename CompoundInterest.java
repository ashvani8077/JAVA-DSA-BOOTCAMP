//Compound Interest Java Program
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Initial Principal Balance: ");
        int p= sc.nextInt();
        System.out.print("Interest Rate: ");
        int r= sc.nextInt();
        System.out.print("Number of times Interest applied per time period: ");
        int n= sc.nextInt();
        System.out.print("Number of time periods elapsed: ");
        int t= sc.nextInt();
        double amt=(double) Math.pow((p*(1+(double)(r/n))),(n*t));
        double ci=amt-p;
        System.out.println("Total Amount: "+ amt);
        System.out.println("Compound Interest: "+ci);
    }
}
