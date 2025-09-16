package Assignment_8.Lvl2;
class Course {
    // Instance variables
    private String courseName;
    private int duration;   // in months
    private double fee;

    // Class variable (common for all courses)
    private static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("----------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
        System.out.println("======================");
    }

    // Main method for testing
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 5000.0);
        Course c2 = new Course("Web Development", 6, 10000.0);

        // Display initial course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name (affects all courses)
        Course.updateInstituteName("Tech Academy");

        // Display again after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

