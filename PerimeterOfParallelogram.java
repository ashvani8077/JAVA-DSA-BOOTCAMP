//Perimeter Of Parallelogram
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of adjacent sides a:");
        double a=sc.nextDouble();
        System.out.println("Enter length of adjacent sides b:");
        double b=sc.nextDouble();
        double peri=2*(a+b);
        System.out.println(peri);
    }
}
