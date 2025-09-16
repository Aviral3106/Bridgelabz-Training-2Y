package Assignment_8.Lvl3;

//Base class Student
class Student {
 public int rollNumber;
 protected String name;
 private double CGPA;

 public Student(int rollNumber, String name, double CGPA) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.CGPA = CGPA;
 }

 public double getCGPA() {
     return CGPA;
 }

 public void setCGPA(double CGPA) {
     if (CGPA >= 0.0 && CGPA <= 10.0) {
         this.CGPA = CGPA;
     } else {
         System.out.println("Invalid CGPA value!");
     }
 }

 public void displayDetails() {
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name);
     System.out.println("CGPA: " + CGPA);
     System.out.println("----------------------");
 }
}

//Subclass PostgraduateStudent
class PostgraduateStudent extends Student {
 private String specialization;

 public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
     super(rollNumber, name, CGPA);
     this.specialization = specialization;
 }

 public void displayPGDetails() {
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name); // protected → accessible in subclass
     System.out.println("Specialization: " + specialization);
     System.out.println("CGPA (via getter): " + getCGPA());
     System.out.println("----------------------");
 }
}

//Main class — name must match file name: UniversityManagement.java
public class UniversityManagement {
 public static void main(String[] args) {
     Student s1 = new Student(101, "Alice", 8.5);
     s1.displayDetails();

     s1.setCGPA(9.0);
     System.out.println("Updated CGPA of Alice: " + s1.getCGPA());

     PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.2, "Computer Science");
     pg1.displayPGDetails();

     pg1.setCGPA(9.5);
     System.out.println("Updated CGPA of Bob: " + pg1.getCGPA());
 }
}

