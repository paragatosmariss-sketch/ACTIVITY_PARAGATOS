import java.util.Scanner;

public class Activity9_Paragatos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine();

        String[] subjectNames = new String[subjects];

        System.out.println("\nEnter subject names:");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];
        double[] averages = new double[students];

        for (int i = 0; i < students; i++) {

            System.out.print("\nEnter student name: ");
            studentNames[i] = input.nextLine();

            double total = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade for " + subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();

                total += grades[i][j];
            }

            averages[i] = total / subjects;
            input.nextLine();
        }

        System.out.println("\n========== GRADES REPORT ==========");

        System.out.printf("%-20s", "Student Name");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-15s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < students; i++) {

            System.out.printf("%-20s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-15.2f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }

        input.close();
    }
}
