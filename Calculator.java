//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No.1:");
        double d1=sc.nextDouble();
        System.out.println("No.2:");
        double d2=sc.nextDouble();
        System.out.println("Choose an operation:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("*");
        String op=sc.next();
        switch (op){
            case "x":
                System.out.println(d1*d2);
                break;
            case "+":
                System.out.println(d1+d2);
                break;
            case"-":
                if(d1>d2){
                    System.out.println(d1-d2);
                }
                else{
                    System.out.println(d2-d1);
                }
                break;
            case"/":
                if(d1>d2){
                    System.out.println(d1/d2);
                }
                else {
                    System.out.println(d2/d1);
                }
                break;
            default:
                System.out.println("Please Choose Valid Operator");
        }
    }
}
