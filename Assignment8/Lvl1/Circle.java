package Assignment_8.Lvl1;
class Circle {
    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0);  // Constructor chaining → calls parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("----------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        Circle c1 = new Circle();
        c1.displayDetails();

        // Using parameterized constructor
        Circle c2 = new Circle(5.5);
        c2.displayDetails();
    }
}


