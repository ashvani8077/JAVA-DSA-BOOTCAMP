//Calculate Batting Average
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total Run Score: ");
        int r= sc.nextInt();
        System.out.println("Total time out: ");
        int o= sc.nextInt();
        if(o>0){
            double avg=(double) r/o;
            System.out.println(avg);
        }
        else {
            System.out.println("Cannot calculate batting average with zero outs.");
        }
    }
}
