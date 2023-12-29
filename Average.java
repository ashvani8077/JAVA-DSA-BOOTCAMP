//Calculate Average Of N Numbers
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of Values: ");
        int sum=0;
        int c= sc.nextInt();
        System.out.println("Enter Values: ");
        for(int i=1;i<=c;i++){
            int n=sc.nextInt();
            sum=sum+n;

        }
        double avg=sum/c;
        System.out.println(avg);
    }
}
