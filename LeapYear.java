//Input a year and find whether it is a leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("LEAP YEAR");
        }
        else {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
