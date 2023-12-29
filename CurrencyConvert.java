//Input currency in rupees and output in USD
import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Currency in INR:");
        int n=sc.nextInt();
        double re=n*83.34f;
        System.out.printf("%.2f",re);
    }
}
