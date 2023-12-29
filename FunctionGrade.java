//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
import java.util.Scanner;

public class FunctionGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks (out of 100): ");;
        int n= sc.nextInt();
        String re=grade(n);
        System.out.println(re);
    }
    static String grade(int n){
        String re="";
        if(n>=91&&n<=100){
            re="AA";
        }
        if(n>=81&&n<=90){
            re="AB";
        }
        if(n>=71&&n<=80){
            re="BB";
        }
        if(n>=61&&n<=70){
            re="BC";
        }
        if(n>=51&&n<=60){
            re="Cd";
        }
        if(n>=41&&n<=50){
            re="DD";
        }
        if(n<=40){
            re="Fail";
        }
        return re;
    }
}
