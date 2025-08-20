package java_codes;

	import java.util.Scanner;

	public class QuotientRemainder {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter the first number: ");
	        int number1 = input.nextInt();

	        System.out.print("Enter the second number: ");
	        int number2 = input.nextInt();

	        // Quotient and Remainder
	        int quotient = number1 / number2;
	        int remainder = number1 % number2;

	        // Output
	        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
	                           " of two numbers " + number1 + " and " + number2);

	        input.close();
	    }
	}

