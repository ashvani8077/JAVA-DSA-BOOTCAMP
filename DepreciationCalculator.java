//Calculate Depreciation of Value
import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Initial Value: ");
        int i= sc.nextInt();
        System.out.print("Salvage Value: ");
        int s= sc.nextInt();
        System.out.print("Year: ");
        int y= sc.nextInt();
        double re=(double) (i-s)/y;
        System.out.println(re);
    }
}
