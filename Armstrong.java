//To find Armstrong Number between two given number.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int st=sc.nextInt();
       int en=sc.nextInt();
       for(int i=st;i<=en;i++){
           int sum=0;
           String a=String.valueOf(i);
           int len=a.length();
           for(int j=0;j<len;j++){
               char s=a.charAt(j);
               int n=Integer.valueOf(s-'0');
               sum=sum+(int)Math.pow(n,len);
               if(sum==i){
                   System.out.println(sum);
               }
           }
       }
    }
}
