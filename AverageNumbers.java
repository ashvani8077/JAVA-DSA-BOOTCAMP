//Calculate Average Marks
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Subject: ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int s= sc.nextInt();
            sum=sum+s;
        }
       // System.out.println(sum);
        double avg=(double) sum/n;
        System.out.println(avg);
    }
}
