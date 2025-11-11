package Assignment_lambdaexpression;

import java.util.*;
import java.util.stream.*;

public class Nameuppercasing {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList(
            "Aviral Varshney",
            "Rohit gupta",
            "ayush Singh",
            "Karan Patel"
        );

        System.out.println("Employee Names in Uppercase:\n");

        // Using method reference String::toUpperCase
        employeeNames.stream()
                     .map(String::toUpperCase)   // convert each name to uppercase
                     .forEach(System.out::println); // print each name
    }
}


