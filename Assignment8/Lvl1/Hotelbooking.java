package Assignment_8.Lvl1;
class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("----------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBooking();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        booking2.displayBooking();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBooking();
    }
}


