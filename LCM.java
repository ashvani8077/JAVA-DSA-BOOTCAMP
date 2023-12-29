//LCM Of Two Numbers
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num1: ");
        int n1= sc.nextInt();
        System.out.print("Num2: ");
        int n2= sc.nextInt();
        int max=n1*n2;
        int lcm=0;
        for(int i=1;i<=max;i++){
            if(i%n1==0&&i%n2==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
