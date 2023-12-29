//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String temp=str;
        StringBuffer s=new StringBuffer(str);
        String re=String.valueOf(s.reverse());
        if(re.equals(temp)){
            System.out.println("Yes Palindrome");
            System.out.println(re);
        }
        else {
            System.out.println("No");
        }
    }
}
