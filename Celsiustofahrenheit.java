package java_files;
import java.util.Scanner;

public class Celsiustofahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take temperature in Celsius as input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}

