//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (enter 'x' to finish):");

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                String input = scanner.next();
                if (input.equals("x")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'x' to finish.");
                }
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);
    }
}
