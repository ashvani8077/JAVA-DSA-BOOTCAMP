//Power In Java
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int num= sc.nextInt();
        System.out.print("Power: ");
        int p= sc.nextInt();
        int re=(int) Math.pow(num,p);
        System.out.println(re);
    }
}
