// Question 1: Creating and Using User-Defined Packages
// Main class (not in any package) imports both packages

import college.faculty.Faculty;
import college.student.Student;

public class MainQ1 {
    public static void main(String[] args) {
        System.out.println("=== Question 1: User-Defined Packages ===");
        
        // Creating and using Student object
        Student student = new Student("Garv Gupta", 101);
        System.out.println("Student Details:");
        student.displayStudentDetails();re
        
        System.out.println();
        
        // Creating and using Faculty object
        Faculty faculty = new Faculty("Dr. Sharma", "Computer Science");
        System.out.println("Faculty Details:");
        faculty.displayFacultyDetails();
        
        System.out.println("\nUsing toString methods:");
        System.out.println(student);
        System.out.println(faculty);
    }
}
