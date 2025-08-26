package Assignment_3.lvl3;
import java.util.Scanner;

public class gradecalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Variables to hold grade and remarks
        String grade, remarks;

        // Apply grading rules
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output
        System.out.println("\n----- Result -----");
        System.out.println("Physics Marks  : " + physics);
        System.out.println("Chemistry Marks: " + chemistry);
        System.out.println("Maths Marks    : " + maths);
        System.out.printf("Average Marks  : %.2f\n", percentage);
        System.out.println("Grade          : " + grade);
        System.out.println("Remarks        : " + remarks);

        sc.close();
    }
}


