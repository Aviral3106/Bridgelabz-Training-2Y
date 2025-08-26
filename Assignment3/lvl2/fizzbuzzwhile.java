package Assignment_3.lvl2;
import java.util.Scanner;

public class fizzbuzzwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int i = 1; // initialization
            while (i <= number) { // condition
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; // increment
            }
        }

        sc.close();
    }
}
 
    
  
