import java.util.Scanner;

public class GradingSystem {

    static char calculateGrade(double avg) {
        if (avg >= 90)
            return 'A';
        else if (avg >= 75)
            return 'B';
        else if (avg >= 60)
            return 'C';
        else if (avg >= 40)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        double[][] marks = new double[students][subjects];
        double[] average = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            double total = 0;
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextDouble();
                total += marks[i][j];
            }
            average[i] = total / subjects;
            grade[i] = calculateGrade(average[i]);
        }

        System.out.println("\n--- FINAL GRADING REPORT ---");
        System.out.println("Student\tAverage\tGrade");

        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%.2f\t%c%n", (i + 1), average[i], grade[i]);
        }

        sc.close();
    }
}
