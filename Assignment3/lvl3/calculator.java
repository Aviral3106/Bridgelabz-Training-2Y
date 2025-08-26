package Assignment_3.lvl3;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two double variables
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Create operator variable
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Use switch...case to perform operation
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
                break;
        }

        sc.close();
    }
}

