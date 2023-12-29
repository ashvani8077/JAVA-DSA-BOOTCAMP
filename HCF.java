//HCF Of Two Numbers Program
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Num1: ");
        int n1= sc.nextInt();
        System.out.print("Num2: ");
        int n2= sc.nextInt();
        int hcf=0;
        for (int i=1;i<=n1||i<=n2;i++){
            if(n1%i==0&&n2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
}
