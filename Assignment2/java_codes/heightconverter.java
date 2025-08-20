package java_codes;
	import java.util.Scanner;

	public class heightconverter {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input height in cm
	        System.out.print("Enter your height in cm: ");
	        double heightCm = input.nextDouble();

	        // Convert cm to total inches
	        double totalInches = heightCm / 2.54;

	        // Find feet and remaining inches
	        int feet = (int) (totalInches / 12);
	        double inches = totalInches % 12;

	        // Output
	        System.out.println("Your Height in cm is " + heightCm + 
	                           " while in feet is " + feet + 
	                           " and inches is " + String.format("%.2f", inches));

	        input.close();
	    }
	}

