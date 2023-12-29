//Volume Of Pyramid
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Base:");
        double b= sc.nextDouble();
        System.out.println("Height:");
        double h= sc.nextDouble();
        double vol=0.3333*(b*h);
        System.out.println(vol);
    }
}
