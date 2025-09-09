package Assignment_6.lvl3;
public class distance {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope (m) and y-intercept (b)
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double[] result = new double[2]; // [0] = slope (m), [1] = intercept (b)

        if (x1 == x2) {
            // Vertical line case: slope is infinity, no y-intercept
            result[0] = Double.POSITIVE_INFINITY;
            result[1] = Double.NaN; // Undefined intercept
        } else {
            double m = (double) (y2 - y1) / (x2 - x1);
            double b = y1 - m * x1;
            result[0] = m;
            result[1] = b;
        }
        return result;
    }

    public static void main(String[] args) {
        // Sample points
        int x1 = 2, y1 = 3;
        int x2 = 6, y2 = 11;

        // Calculate distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") = " + distance);

        // Calculate equation of line
        double[] line = lineEquation(x1, y1, x2, y2);
        if (Double.isInfinite(line[0])) {
            System.out.println("Equation of line: x = " + x1 + " (Vertical Line)");
        } else {
            System.out.println("Equation of line: y = " + line[0] + "*x + " + line[1]);
        }
    }
}

