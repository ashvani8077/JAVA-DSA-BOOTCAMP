//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class RunTimeMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        System.out.println("Enter Numbers: ");
        while (true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            if(n>max){
                max=n;
            }
        }
        System.out.println(max);
    }
}
