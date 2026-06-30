import java.util.Scanner;

public class IT26101191Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (0.3 * assignment) + (0.7 * exam);
    }

    public static String findGrades(double finalMark) {
        return (finalMark >= 75) ? "A" :
               (finalMark >= 60) ? "B" :
               (finalMark >= 50) ? "C" : "F";
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println("Name: " + name + ", Final Mark: " + finalMark + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("\nEnter Name of Student " + i + ": ");
            String name = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double exam = input.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}
