//Volume Of Prism
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Product of Base:");
        double a= sc.nextDouble();
        System.out.println("Height:");
        double h= sc.nextDouble();
        double vol=a*h;
        System.out.println(vol);
    }
}
