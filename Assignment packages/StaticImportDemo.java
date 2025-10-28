// Question 3: Static Import Demonstration
// Demonstrating static import with java.lang.Math

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("=== Question 3: Static Import Demonstration ===");
        
        // Demonstrating 5+ static methods from Math class
        double number1 = 16.0;
        double number2 = 4.0;
        double negativeNum = -25.5;
        
        System.out.println("Input numbers: " + number1 + ", " + number2 + ", " + negativeNum);
        System.out.println();
        
        // 1. sqrt() - Square root
        System.out.println("1. Square root operations:");
        System.out.println("   sqrt(" + number1 + ") = " + sqrt(number1));
        
        // 2. pow() - Power
        System.out.println("2. Power operations:");
        System.out.println("   pow(" + number2 + ", 3) = " + pow(number2, 3));
        
        // 3. max() - Maximum
        System.out.println("3. Maximum operations:");
        System.out.println("   max(" + number1 + ", " + number2 + ") = " + max(number1, number2));
        
        // 4. min() - Minimum  
        System.out.println("4. Minimum operations:");
        System.out.println("   min(" + number1 + ", " + number2 + ") = " + min(number1, number2));
        
        // 5. abs() - Absolute value
        System.out.println("5. Absolute value operations:");
        System.out.println("   abs(" + negativeNum + ") = " + abs(negativeNum));
        
        // Bonus methods
        // 6. ceil() - Ceiling
        System.out.println("6. Ceiling operations:");
        System.out.println("   ceil(" + negativeNum + ") = " + ceil(negativeNum));
        
        // 7. floor() - Floor
        System.out.println("7. Floor operations:");
        System.out.println("   floor(" + negativeNum + ") = " + floor(negativeNum));
        
        // 8. round() - Round
        System.out.println("8. Round operations:");
        System.out.println("   round(" + negativeNum + ") = " + round(negativeNum));
        
        // 9. PI and E constants
        System.out.println("9. Mathematical constants:");
        System.out.println("   PI = " + PI);
        System.out.println("   E = " + E);
        
        // 10. Trigonometric functions
        System.out.println("10. Trigonometric operations:");
        System.out.println("   sin(PI/2) = " + sin(PI/2));
        System.out.println("   cos(0) = " + cos(0));
        
        System.out.println("\n=== Static Import Explanation ===");
        explainStaticImport();
    }
    
    public static void explainStaticImport() {
        System.out.println("Benefits of Static Import:");
        System.out.println("1. Cleaner code - No need to prefix with class name");
        System.out.println("2. Improved readability for mathematical operations");
        System.out.println("3. Reduces code verbosity");
        
        System.out.println("\nWithout static import:");
        System.out.println("   Math.sqrt(16) + Math.pow(2, 3)");
        
        System.out.println("With static import:");
        System.out.println("   sqrt(16) + pow(2, 3)");
        
        System.out.println("\nWhen to AVOID static import:");
        System.out.println("1. When it causes naming conflicts");
        System.out.println("2. When it makes code less readable");
        System.out.println("3. For rarely used methods");
        System.out.println("4. In large projects with many developers");
        System.out.println("5. When importing entire classes (use specific methods instead)");
    }
}
