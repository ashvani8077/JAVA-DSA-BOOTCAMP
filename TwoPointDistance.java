//Calculate Distance Between Two Points
import java.util.Scanner;

public class TwoPointDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter point of START: ");
        int x1=sc.nextInt();
        int y1= sc.nextInt();
        System.out.println("Enter points of END: ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x=(int)Math.pow((x2-x1),2);
        int y=(int)Math.pow((y2-y1),2);
        int total=(int)Math.pow((x+y),0.5);
        System.out.println(total);
    }
}
