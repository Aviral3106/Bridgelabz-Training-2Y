import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Question 4: Modular Programming (Java 9+) ===");
        
        Student student1 = new Student("Raj Kumar", 2021001, "Computer Science");
        Student student2 = new Student("Priya Singh", 2021002, "Information Technology");
        
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        
        System.out.println("\n=== Module Compilation Instructions ===");
        System.out.println("1. Compile collegeinfo module:");
        System.out.println("   javac -d mods/collegeinfo collegeinfo/src/module-info.java collegeinfo/src/college/student/Student.java");
        
        System.out.println("2. Compile app module:");
        System.out.println("   javac -d mods/app --module-path mods app/src/module-info.java app/src/MainApp.java");
        
        System.out.println("3. Run the application:");
        System.out.println("   java --module-path mods -m app/MainApp");
        
        System.out.println("\n=== Packages vs Modules ===");
        System.out.println("Packages:");
        System.out.println("- Organize classes and interfaces within a single application");
        System.out.println("- Provide namespace and access control");
        System.out.println("- Compile-time organization");
        
        System.out.println("\nModules (Java 9+):");
        System.out.println("- Higher-level organization than packages"); 
        System.out.println("- Explicit dependencies and exports");
        System.out.println("- Strong encapsulation at module level");
        System.out.println("- Runtime modularity and security");
        System.out.println("- Better performance and smaller deployment size");
    }
}
