import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input from the user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // primitive int

        // Converting primitive to Wrapper (Autoboxing)
        Integer obj = Integer.valueOf(num);

        // Displaying both forms
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + obj);

        sc.close();
    }
}
