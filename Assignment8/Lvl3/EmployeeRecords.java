package Assignment_8.Lvl3;

// Base class Employee
class Employee {
    public int employeeID;        // accessible everywhere
    protected String department;  // accessible in same package & subclasses
    private double salary;        // accessible only inside Employee

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter to modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

// Subclass Manager
class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);      // public → accessible
        System.out.println("Department: " + department);      // protected → accessible
        System.out.println("Salary (via getter): " + getSalary()); // private → must use getter
        System.out.println("Team: " + teamName);
        System.out.println("----------------------");
    }
}

// Main class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Employee
        Employee e1 = new Employee(101, "HR", 45000.0);
        e1.displayDetails();

        // Modify salary
        e1.setSalary(50000);
        System.out.println("Updated Salary of Employee: " + e1.getSalary());

        // Manager
        Manager m1 = new Manager(201, "IT", 75000.0, "Development Team");
        m1.displayManagerDetails();

        // Modify salary of Manager
        m1.setSalary(80000);
        System.out.println("Updated Salary of Manager: " + m1.getSalary());
    }
}

