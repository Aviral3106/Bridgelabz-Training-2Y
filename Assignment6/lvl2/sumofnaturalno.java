package Assignment_6.lvl3;
import java.util.Scanner;

public class sumofnaturalno {

    // Recursive method to compute sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (n > 0).");
        } else {
            // Recursive sum
            int recSum = recursiveSum(n);

            // Formula sum
            int formSum = formulaSum(n);

            // Display results
            System.out.println("Sum using Recursion: " + recSum);
            System.out.println("Sum using Formula: " + formSum);

            // Comparison
            if (recSum == formSum) {
                System.out.println("✅ Both methods give the same result!");
            } else {
                System.out.println("❌ The results are different.");
            }
        }

        sc.close();
    }
}

