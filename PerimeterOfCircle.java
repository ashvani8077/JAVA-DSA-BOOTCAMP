//Perimeter Of Circle
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius:");
        double radius= sc.nextDouble();
        double perimeter=2*3.141*radius;
        System.out.println(perimeter);
    }
}
