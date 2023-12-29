//Calculate Electricity Bill
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Bill Counter");
        System.out.print("Numbers of Unit in one month:");
        int u= sc.nextInt();
        System.out.print("Price of one Unit: ");
        int p= sc.nextInt();
        System.out.println("Your total bill: "+(u*p));

    }
}
