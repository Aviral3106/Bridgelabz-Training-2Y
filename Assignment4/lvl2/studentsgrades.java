package Assignment_4.lvl2;
import java.util.Scanner;

public class studentsgrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step b: Arrays for marks, percentage, and grade
        int[][] marks = new int[n][3];  // [student][0=Physics,1=Chemistry,2=Maths]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step c: Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Subject " + (j + 1) + " marks: ");
                    marks[i][j] = sc.nextInt();

                    if (marks[i][j] < 0) {
                        System.out.println("❌ Invalid! Marks cannot be negative. Re-enter.");
                    }
                } while (marks[i][j] < 0);
            }

            // Step d: Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Step d: Assign grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Step e: Display result
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics = " + marks[i][0] + ", Chemistry = " + marks[i][1] + ", Maths = " + marks[i][2]);
            System.out.printf("Percentage = %.2f%%\n", percentage[i]);
            System.out.println("Grade = " + grade[i]);
            System.out.println("-----------------------");
        }

        sc.close();
    }
}

