//Area Of Rhombus
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Diagonal 1:");
        double d1= sc.nextDouble();
        System.out.println("Diagonal 2:");
        double d2=sc.nextDouble();
        double area=(d1*d2)/2;
        System.out.println("Area of Diagonal: ");
        System.out.println(area);
    }
}
