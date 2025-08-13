package java_files;
import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculating perimeter
        double perimeter = 2 * (length + width);

        // Displaying result
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }
}

