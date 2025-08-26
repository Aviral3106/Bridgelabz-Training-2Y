package Assignment_3.lvl2;
import java.util.Scanner;

public class employeebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        // Calculate bonus
        if (years > 5) {
            double bonus = 0.05 * salary; // 5% bonus
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded (service must be more than 5 years).");
        }

        sc.close();
    }
}

