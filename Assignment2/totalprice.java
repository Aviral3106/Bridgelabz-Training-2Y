package java_codes;

	import java.util.Scanner;

	public class totalprice{
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input unit price and quantity
	        System.out.print("Enter the unit price of the item (INR): ");
	        double unitPrice = input.nextDouble();

	        System.out.print("Enter the quantity: ");
	        int quantity = input.nextInt();

	        // Calculate total price
	        double totalPrice = unitPrice * quantity;

	        // Output
	        System.out.println("The total purchase price is INR " + totalPrice + 
	                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);

	        input.close();
	    }
	}

