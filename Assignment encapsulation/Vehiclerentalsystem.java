package Assignment_encapsulation;
//Interface: Insurable
interface Insurable {
 double calculateInsurance();
 String getInsuranceDetails();
}

//Abstract class: Vehicle
abstract class Vehicle implements Insurable {
 // Encapsulation: private fields
 private String vehicleNumber;
 private String type;
 private double rentalRate;
 private String insurancePolicyNumber;

 // Constructor
 public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
     this.insurancePolicyNumber = insurancePolicyNumber;
 }

 // Getters and Setters
 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public String getType() {
     return type;
 }

 public double getRentalRate() {
     return rentalRate;
 }

 public void setRentalRate(double rentalRate) {
     this.rentalRate = rentalRate;
 }

 // Sensitive info — no public getter for insurancePolicyNumber
 protected String getInsurancePolicyNumber() {
     return insurancePolicyNumber;
 }

 // Abstract method for rental cost
 public abstract double calculateRentalCost(int days);

 // Display vehicle details
 public void displayVehicleDetails() {
     System.out.println("Vehicle Number: " + vehicleNumber);
     System.out.println("Type: " + type);
     System.out.println("Rental Rate per Day: ₹" + rentalRate);
 }
}

//Subclass: Car
class Car extends Vehicle {
 public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
     super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
 }

 @Override
 public double calculateRentalCost(int days) {
     // 10% discount for rentals longer than 7 days
     double cost = getRentalRate() * days;
     if (days > 7) {
         cost *= 0.9;
     }
     return cost;
 }

 @Override
 public double calculateInsurance() {
     // 5% of rental rate * days for simplicity
     return getRentalRate() * 0.05;
 }

 @Override
 public String getInsuranceDetails() {
     return "Car insurance policy: Confidential (Policy No. Hidden)";
 }
}

//Subclass: Bike
class Bike extends Vehicle {
 public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
     super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
 }

 @Override
 public double calculateRentalCost(int days) {
     // Fixed rate * days, no discounts
     return getRentalRate() * days;
 }

 @Override
 public double calculateInsurance() {
     // 2% of rental rate for bikes
     return getRentalRate() * 0.02;
 }

 @Override
 public String getInsuranceDetails() {
     return "Bike insurance policy: Confidential (Policy No. Hidden)";
 }
}

//Subclass: Truck
class Truck extends Vehicle {
 public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
     super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
 }

 @Override
 public double calculateRentalCost(int days) {
     // 15% surcharge for heavy vehicle maintenance
     return (getRentalRate() * days) * 1.15;
 }

 @Override
 public double calculateInsurance() {
     // 10% of rental rate for trucks
     return getRentalRate() * 0.10;
 }

 @Override
 public String getInsuranceDetails() {
     return "Truck insurance policy: Confidential (Policy No. Hidden)";
 }
}

//Main class
public class Vehiclerentalsystem {
 // Method demonstrating polymorphism
 public static void showRentalSummary(Vehicle v, int days) {
     System.out.println("\n--- Vehicle Details ---");
     v.displayVehicleDetails();

     double rentalCost = v.calculateRentalCost(days);
     double insuranceCost = v.calculateInsurance();

     System.out.println(v.getInsuranceDetails());
     System.out.println("Rental Duration: " + days + " days");
     System.out.println("Rental Cost: ₹" + rentalCost);
     System.out.println("Insurance Cost: ₹" + insuranceCost);
     System.out.println("Total Amount Payable: ₹" + (rentalCost + insuranceCost));
 }

 public static void main(String[] args) {
     // Creating objects (polymorphism)
     Vehicle v1 = new Car("CAR-1234", 1500, "CAR-INS-9087");
     Vehicle v2 = new Bike("BIKE-5678", 500, "BIKE-INS-4567");
     Vehicle v3 = new Truck("TRUCK-9012", 3000, "TRUCK-INS-7654");

     Vehicle[] vehicles = { v1, v2, v3 };

     System.out.println("=== Vehicle Rental System ===");
     for (Vehicle v : vehicles) {
         showRentalSummary(v, 10); // 10 days rental for demo
         System.out.println("-----------------------------------");
     }
 }
}


