package Assignment_encapsulation;

interface Department {
 void assignDepartment(String deptName);
 String getDepartmentDetails();
}

abstract class Employee implements Department {

 private int employeeId;
 private String name;
 private double baseSalary;
 private String department;


 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }


 public abstract double calculateSalary();

 
 public void displayDetails() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
     System.out.println("Base Salary: ₹" + baseSalary);
     System.out.println("Department: " + department);
 }

 
 @Override
 public void assignDepartment(String deptName) {
     this.department = deptName;
 }

 @Override
 public String getDepartmentDetails() {
     return department;
 }
}


class FullTimeEmployee extends Employee {
 private double bonus;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
     super(employeeId, name, baseSalary);
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + bonus;
 }
}


class PartTimeEmployee extends Employee {
 private int hoursWorked;
 private double ratePerHour;

 public PartTimeEmployee(int employeeId, String name, double ratePerHour, int hoursWorked) {
     super(employeeId, name, 0); // base salary not used directly
     this.ratePerHour = ratePerHour;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return ratePerHour * hoursWorked;
 }
}


public class EmployeeManagementSystem {
 public static void main(String[] args) {
     
     Employee e1 = new FullTimeEmployee(101, "Rajesh Kumar", 30000, 5000);
     Employee e2 = new PartTimeEmployee(102, "Amit Sharma", 500, 40);
     Employee e3 = new FullTimeEmployee(103, "Priya Singh", 40000, 8000);

     
     e1.assignDepartment("Finance");
     e2.assignDepartment("Support");
     e3.assignDepartment("HR");
     Employee[] employees = { e1, e2, e3 };

     System.out.println("=== Employee Management System ===\n");
     for (Employee emp : employees) {
         emp.displayDetails();
         System.out.println("Total Salary: ₹" + emp.calculateSalary());
         System.out.println("-----------------------------------");
     }
 }
}

