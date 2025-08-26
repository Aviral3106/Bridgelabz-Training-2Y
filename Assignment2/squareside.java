package java_codes;

	import java.util.Scanner;

	public class squareside {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input perimeter
	        System.out.print("Enter the perimeter of the square: ");
	        double perimeter = input.nextDouble();

	        // Side = Perimeter / 4
	        double side = perimeter / 4;

	        // Output
	        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

	        input.close();
	    }
	}


