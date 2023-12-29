//Calculate Commission Percentage
import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total money: ");
        int m= sc.nextInt();
        System.out.print("Your commission in %: ");
        int c= sc.nextInt();
        double re=m*((double)c/100);
        System.out.println(re);
    }
}
