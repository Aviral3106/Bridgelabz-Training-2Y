

class employee {
    // non-static variables
    String name;
    int id;
    double salary;

    // method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // creating object
        employee emp = new employee();
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000;

        // calling display method
        emp.displayEmployee();
    }
}
