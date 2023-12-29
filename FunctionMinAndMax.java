//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class FunctionMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int n1 = sc.nextInt();
        System.out.print("Num2: ");
        int n2 = sc.nextInt();
        int min=min(n1,n2);
        int max=max(n1,n2);
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
    static int max(int a,int b){
        int max=0;
        if(a>b){
            max=a;
        }
        else {
            max=b;
        }
        return max;
    }

    static int min(int a, int b){
        int min=0;
        if(a<b){
            min=a;
        }
        else {
            min=b;
        }
        return min;
    }
}
