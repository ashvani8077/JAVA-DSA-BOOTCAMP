//Take integer inputs till the user enters 0 and print the sum of all numbers.
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Input numbers: ");
        while (true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
