package java_files;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take radius as input
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display result
        System.out.println("The area of the circle is: " + area);

        sc.close();
    }
}



