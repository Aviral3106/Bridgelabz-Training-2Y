package Assignment_3.lvl1;
import java.util.Scanner;

	public class sum{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter a natural number n: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Please enter a positive natural number!");
	        } else {
	            // Compute sum using while loop
	            int sumWhile = 0;
	            int i = 1;
	            while (i <= n) {
	                sumWhile += i;
	                i++;
	            }

	            // Compute sum using formula
	            int sumFormula = n * (n + 1) / 2;

	            // Display results
	            System.out.println("Sum using while loop: " + sumWhile);
	            System.out.println("Sum using formula  : " + sumFormula);

	            // Compare
	            if (sumWhile == sumFormula) {
	                System.out.println("✅ Both results are correct and match!");
	            } else {
	                System.out.println("❌ Results do not match!");
	            }
	        }

	        sc.close();
	    }
	}



