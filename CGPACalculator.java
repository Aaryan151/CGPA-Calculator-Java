import java.util.Scanner;

public class CGPACalculator {

    // Method to calculate SGPA
    static double calculateSGPA(int[] credits, double[] grades, int n) {
        double totalCredits = 0;
        double weightedSum = 0;

        for (int i = 0; i < n; i++) {
            weightedSum += credits[i] * grades[i];
            totalCredits += credits[i];
        }
        return weightedSum / totalCredits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] credits = new int[n];
        double[] grades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter credit for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter grade point for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        double sgpa = calculateSGPA(credits, grades, n);

        System.out.println("\n--- RESULT ---");
        System.out.println("SGPA: " + String.format("%.2f", sgpa));
        System.out.println("CGPA: " + String.format("%.2f", sgpa));

        sc.close();
    }
}
