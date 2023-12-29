//Java Program Vowel Or Consonant
import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Character: ");
        char t=sc.next().charAt(0);
        System.out.println(t);
        if((t=='a')||(t=='e')||(t=='i')||(t=='o')||(t=='u')||(t=='A')|(t=='E')||(t=='I')||(t=='O')||(t=='U')){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Constant");
        }
    }
}
