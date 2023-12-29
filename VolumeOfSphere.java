//Volume Of Sphere
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius:");
        double r= sc.nextDouble();
        double vol=1.3333*(3.141*(r*r*r));
        System.out.println(vol);
    }
}
