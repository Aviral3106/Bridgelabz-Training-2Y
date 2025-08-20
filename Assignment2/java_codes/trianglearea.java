package java_codes;

	import java.util.Scanner;

	public class trianglearea{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input base and height in inches
	        System.out.print("Enter the base of the triangle (in inches): ");
	        double base = input.nextDouble();

	        System.out.print("Enter the height of the triangle (in inches): ");
	        double height = input.nextDouble();

	        // Area in square inches
	        double areaInInches = 0.5 * base * height;

	        // Convert square inches to square cm (1 inch = 2.54 cm, so 1 in² = 2.54² cm²)
	        double areaInCm = areaInInches * Math.pow(2.54, 2);

	        // Output
	        System.out.println("The area of the triangle is " + areaInInches + " square inches" +
	                           " and " + areaInCm + " square centimeters.");

	        input.close();
	    }
	}


