//Curved Surface Area Of Cylinder
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius:");
        double r= sc.nextDouble();
        System.out.println("Height:");
        double h= sc.nextDouble();
        double csa=2*3.141*(r*h);
        System.out.println(csa);
    }
}
