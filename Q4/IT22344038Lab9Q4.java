import java.util.Scanner;

public class IT22344038Lab9Q4 {

    // 30% assignment + 70% exam
    public static double calcFinalMark(int assignmentMark, int examMark) {
        return 0.3 * assignmentMark + 0.7 * examMark;
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s%-15.2f%c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents = 5;

        String[] names = new String[numStudents];
        double[] finalMarks = new double[numStudents];
        char[] grades = new char[numStudents];

        // Collect data for all students
        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            int assignment = input.nextInt();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            int exam = input.nextInt();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Print the results table
        System.out.println();
        System.out.printf("%-15s%-15s%s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < numStudents; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}