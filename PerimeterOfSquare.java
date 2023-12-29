//Perimeter Of Square
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length of a side:");
        double l= sc.nextDouble();
        double peri=4*l;
        System.out.println(peri);
    }
}
