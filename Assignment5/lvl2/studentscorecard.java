package Assignment_5.lvl2;
import java.util.Random;

public class studentscorecard {

    // a. Method to generate random PCM scores for students
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 3 subjects per student
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics 40-100
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry 40-100
            scores[i][2] = 40 + rand.nextInt(61); // Math 40-100
        }
        return scores;
    }

    // b. Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double percent = Math.round(((total / 300.0) * 100) * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // c. Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double percent = results[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // d. Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-10s %-6s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-10.2f %-10.2f %-6s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    // Main function
    public static void main(String[] args) {
        int students = 5; // Change this for more students

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}