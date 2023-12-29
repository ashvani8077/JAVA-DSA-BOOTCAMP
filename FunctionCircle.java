//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;

public class FunctionCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Radius of Circle: ");
        int r= sc.nextInt();
        double area=area(r);
        double cir=circumeference(r);
        System.out.println("Area: "+area);
        System.out.println("Circumference: "+cir);
    }
    static double area(int r){
        double re=3.141*(r*r);
        return re;
    }
    static double circumeference(int r){
        double re=2*3.141*r;
        return re;
    }
}
