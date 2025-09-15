
class student {
    String name;
    int rollNumber;
    int marks;

    // method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    // method to display details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Ananya";
        s1.rollNumber = 101;
        s1.marks = 82;

        s1.displayDetails();
    }
}
