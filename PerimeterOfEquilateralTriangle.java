//Perimeter Of Equilateral Triangle
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Side length:");
        double le=sc.nextDouble();
        double peri=3*le;
        System.out.println(peri);
    }
}
