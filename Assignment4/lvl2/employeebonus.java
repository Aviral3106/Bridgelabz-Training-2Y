package Assignment_4.lvl2;
import java.util.Scanner;

public class employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeCount = 10;

        double[] salary = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonus = new double[employeeCount];
        double[] newSalary = new double[employeeCount];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input employee details with validation
        System.out.println("Enter salary and years of service for " + employeeCount + " employees:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            // Salary input with validation
            System.out.print("Enter salary: ");
            double s = sc.nextDouble();
            if (s <= 0) {
                System.out.println("Invalid salary! Please enter again.");
                i--; // retry for same employee
                continue;
            }

            // Years of service input with validation
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();
            if (y < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--; // retry for same employee
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
        }

        // Bonus calculation
        for (int i = 0; i < employeeCount; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee " + (i + 1) + 
                               " | Old Salary: " + salary[i] + 
                               " | Bonus: " + bonus[i] + 
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n--- Company Totals (Zara) ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}

