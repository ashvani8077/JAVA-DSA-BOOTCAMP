//Reverse A String In Java
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str= sc.nextLine();
        StringBuffer sd=new StringBuffer(str);
        sd=sd.reverse();
        String rev=String.valueOf(sd);
        System.out.println(rev);
    }
}
