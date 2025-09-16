package Assignment_8.Lvl1;
class Person {
    // Attributes
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor (clones another Person object)
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Using parameterized constructor
        Person p1 = new Person("Alice", 25);
        p1.displayDetails();

        // Using copy constructor
        Person p2 = new Person(p1);
        p2.displayDetails();
    }
}

