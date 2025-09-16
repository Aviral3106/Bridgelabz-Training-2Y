package Assignment_8.Lvl1;
class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000.0; // default daily rate
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy Constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("----------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor
        CarRental r1 = new CarRental();
        r1.displayDetails();

        // Using parameterized constructor
        CarRental r2 = new CarRental("Alice", "Toyota Fortuner", 5, 2500.0);
        r2.displayDetails();

        // Using copy constructor
        CarRental r3 = new CarRental(r2);
        r3.displayDetails();
    }
}

