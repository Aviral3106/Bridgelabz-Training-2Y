package java_codes;

	import java.util.Scanner;

	public class handshakes {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Input number of students
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = input.nextInt();

	        // Formula: nC2 = (n * (n - 1)) / 2
	        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

	        // Output
	        System.out.println("The maximum number of possible handshakes among " 
	                           + numberOfStudents + " students is " + handshakes);

	        input.close();
	    }
	}


