//Total Surface Area Of Cube
import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length of any side:");
        double s= sc.nextDouble();
        double tsa=6*(s*s);
        System.out.println(tsa);
    }
}
