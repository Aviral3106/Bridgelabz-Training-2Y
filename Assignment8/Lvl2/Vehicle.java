package Assignment_8.Lvl2;
class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 5000.0; // default fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("----------------------");
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
        System.out.println("======================");
    }

    // Main method for testing
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");

        // Display initial vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee (affects all vehicles)
        Vehicle.updateRegistrationFee(7500.0);

        // Display again after update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

