package Assignment_3.lvl1;
import java.util.Scanner;

public class eligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}
