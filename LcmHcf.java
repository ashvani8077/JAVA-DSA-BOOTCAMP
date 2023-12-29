//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=a*b;
        int lcm=0;
        int hcf=0;
        int max=0;
        for(int i=1;i<=m;i++){
            if((i%a==0)&&(i%b==0)){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
        if(a>b){
             max=a;
        }
        else{
            max=b;
        }
        for(int i=2;i<max;i++){
            if((a%i==0)&&(b%i==0)){
                hcf=i;
                break;
            }
            else{
                hcf=1;
            }
        }
        System.out.println(hcf);
    }
}
