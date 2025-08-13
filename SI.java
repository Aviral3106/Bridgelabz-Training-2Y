package java_files;
import java.util.Scanner;

public class SI {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking inputs
	        System.out.print("Enter Principal amount (P): ");
	        double principal = sc.nextDouble();

	        System.out.print("Enter Rate of interest (R) in %: ");
	        double rate = sc.nextDouble();

	        System.out.print("Enter Time (T) in years: ");
	        double time = sc.nextDouble();

	        // Calculating Simple Interest
	        double simpleInterest = (principal * rate * time) / 100;

	        // Displaying result
	        System.out.println("Simple Interest = " + simpleInterest);

	    }

	}


