import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                System.out.print("Enter marks for subject " + i + ": ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        System.out.println("\nThank you for using the Grade Calculator!");
        scanner.close();
    }
}
