//Calculate Discount Of Product
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("30% discount on order of 1000");
        System.out.println("Enter Number of Product:");
        int p= sc.nextInt();
        System.out.println("Price of one prduct:");
        int pr= sc.nextInt();
        double total=p*pr;
        if(total>1000){
            total=total*0.7;
        }
        System.out.println(total);
    }
}
