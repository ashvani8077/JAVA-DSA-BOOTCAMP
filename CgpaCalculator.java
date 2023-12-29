//Calculate CGPA Java Program
import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = sc.nextInt();

        double totalGradePoints = 0;
        double totalCreditHours = 0;

        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.println("Enter details for Course " + i + ":");
            System.out.print("Enter grade (A, B, C, D, F): ");
            char grade = sc.next().charAt(0);

            System.out.print("Enter credit hours for the course: ");
            int creditHours = sc.nextInt();

            double gradePoint = getGradePoint(grade);
            double courseGradePoints = gradePoint * creditHours;

            totalGradePoints += courseGradePoints;
            totalCreditHours += creditHours;
        }

        if (totalCreditHours > 0) {
            double cgpa = totalGradePoints / totalCreditHours;
            System.out.println("CGPA: " + cgpa);
        } else {
            System.out.println("Cannot calculate CGPA with zero credit hours.");
        }

        sc.close();
    }

    // Function to get grade point based on the grade
    private static double getGradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                System.out.println("Invalid grade. Assuming grade as F.");
                return 0.0;
        }
    }
}
