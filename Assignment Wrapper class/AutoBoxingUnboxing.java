public class 3 {
    
}
import java.util.ArrayList;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        // Creating ArrayList of Integer (Wrapper class)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding integer values using auto-boxing
        numbers.add(10);  // int automatically converted to Integer
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(5);

        // Calculating sum using auto-unboxing
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;  // Integer automatically converted to int
        }

        // Display result
        System.out.println("Sum of numbers = " + sum);
    }
}
