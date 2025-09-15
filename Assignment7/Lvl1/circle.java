

class circle {
    double radius;

    // method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 7; // Example radius
        c.displayDetails();
    }
}

