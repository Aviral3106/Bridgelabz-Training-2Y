// Question 2: Package Hierarchy (Nested Packages)
// MainApp class in default package imports and uses Course class

import com.university.department.cse.Course;

public class MainAppQ2 {
    public static void main(String[] args) {
        System.out.println("=== Question 2: Package Hierarchy ===");
        
        // Creating Course object from nested package
        Course javaCourse = new Course(
            "Data Structures and Algorithms", 
            "CSE201", 
            4, 
            "Dr. Priya Singh"
        );
        
        Course aiCourse = new Course(
            "Artificial Intelligence", 
            "CSE401", 
            3, 
            "Dr. Rakesh Kumar"
        );
        
        // Display course details
        javaCourse.printCourseDetails();
        System.out.println();
        aiCourse.printCourseDetails();
        
        System.out.println("\n=== Folder Structure Explanation ===");
        System.out.println("The folder structure should look like:");
        System.out.println("Q2/");
        System.out.println("  ├── com/");
        System.out.println("  │   └── university/");
        System.out.println("  │       └── department/");
        System.out.println("  │           └── cse/");
        System.out.println("  │               └── Course.java");
        System.out.println("  └── MainAppQ2.java");
        System.out.println();
        System.out.println("To compile: javac -d . com/university/department/cse/Course.java MainAppQ2.java");
        System.out.println("To run: java MainAppQ2");
    }
}
