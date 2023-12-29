//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;

public class FunctionEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Age: ");;
        int n= sc.nextInt();
        String re=eligibile(n);
        System.out.println(re);
    }
    static String eligibile(int a){
        String r="";
        if(a>=18){
            r="Eligible";
        }
        else {
            r="Not Eligible";
        }
        return r;
    }
}
