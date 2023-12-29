//Perimeter Of Rectangle
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length:");
        double a=sc.nextDouble();
        System.out.println("Width:");
        double b= sc.nextDouble();
        double peri=2*(a+b);
        System.out.println(peri);
    }
}
