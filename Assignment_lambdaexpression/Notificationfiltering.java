package Assignment_lambdaexpression;
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class Notificationfiltering {
    public static void main(String[] args) {
        // Create list of alerts
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", "Patient in ICU requires immediate attention."),
            new Alert("Appointment", "Dr. Sharma appointment at 5 PM."),
            new Alert("Medicine", "Time to take blood pressure medicine."),
            new Alert("Tips", "Drink 2 liters of water daily.")
        );

        Scanner sc = new Scanner(System.in);
        System.out.println("Show only: 1) Emergency  2) Appointment  3) Medicine  4) Tips");
        int choice = sc.nextInt();

        Predicate<Alert> filter;

        switch (choice) {
            case 1 -> filter = a -> a.type.equalsIgnoreCase("Emergency");
            case 2 -> filter = a -> a.type.equalsIgnoreCase("Appointment");
            case 3 -> filter = a -> a.type.equalsIgnoreCase("Medicine");
            case 4 -> filter = a -> a.type.equalsIgnoreCase("Tips");
            default -> {
                System.out.println("Invalid choice, showing all alerts.");
                filter = a -> true;
            }
        }

        System.out.println("\nFiltered Alerts:");
        alerts.stream()
              .filter(filter)   
              .forEach(System.out::println);
    }
}


