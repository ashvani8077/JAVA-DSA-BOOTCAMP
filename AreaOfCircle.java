//Area Of Circle Java Program
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area=3.141*(radius*radius);
        System.out.println(area);
    }
}
