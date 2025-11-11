public class WrapperToPrimitive {
    public static void main(String[] args) {
        // Given Double object
        Double obj = Double.valueOf(45.67);

        // Converting Wrapper to primitive (Unboxing)
        double d = obj.doubleValue();   // converts to primitive double
        int i = (int) d;                // type casting double to int

        // Displaying all values
        System.out.println("Wrapper object value (Double): " + obj);
        System.out.println("Primitive double value: " + d);
        System.out.println("Primitive int value (after casting): " + i);
    }
}
