//Area Of Equilateral Triangle
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Side:");
        double a= sc.nextDouble();
        double area=0.43301270*(a*a);
        System.out.println(area);
    }
}
