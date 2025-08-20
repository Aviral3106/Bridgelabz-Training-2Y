package java_codes;

	import java.util.Scanner;

	public class feediscountinput {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Taking inputs
	        System.out.print("Enter the course fee (INR): ");
	        double fee = input.nextDouble();

	        System.out.print("Enter the discount percentage: ");
	        double discountPercent = input.nextDouble();

	        // Calculations
	        double discount = (fee * discountPercent) / 100.0;
	        double finalFee = fee - discount;

	        // Output
	        System.out.println("The discount amount is INR " + discount + 
	                           " and final discounted fee is INR " + finalFee);

	        input.close();
	    }
	}

