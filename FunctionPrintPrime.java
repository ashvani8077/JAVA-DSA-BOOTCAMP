//Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class FunctionPrintPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Start Number: ");
        int s= sc.nextInt();
        System.out.print("End Number: ");
        int e= sc.nextInt();
        prime(s,e);
    }
    static void prime(int a,int b){
        for(int i=a;i<=b;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count<=2){
                if(i==1){
                    continue;
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
