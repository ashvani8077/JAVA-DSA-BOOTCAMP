//Volume Of Cone
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius:");
        double r= sc.nextDouble();
        System.out.println("Height:");
        double h= sc.nextDouble();
        double vol=(3.141*(r*r))*(h/3);
        System.out.println(vol);
    }
}
