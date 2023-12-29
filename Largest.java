//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        if(n1>n2){
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
}
