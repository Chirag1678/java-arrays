import java.util.Scanner;

/**
 * EmployeeBonusAndSalary Class
 * This program calculates the bonus of 10 employees based on their years of 
 * service and computes the total bonus payout, total old salary, and new salary 
 * for the company Zara.
 */
class EmployeeBonusAndSalary {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define arrays to store salaries, years of service, bonuses, and new salaries
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store total salary and total bonus payout
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Taking input for 10 employees
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.printf("Enter salary of Employee %d: ", i + 1);
                salary[i] = input.nextDouble();
                System.out.printf("Enter years of service of Employee %d: ", i + 1);
                yearsOfService[i] = input.nextDouble();

                // Validate input (salary and years of service should be positive)
                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    break; // Valid input, exit the loop
                } else {
                    System.err.println("Invalid salary or years of service. Please enter again.");
                }
            }
        }

        // Calculating bonus, new salary, and total values
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            newSalary[i] = salary[i] + bonus[i];

            // Updating total salary and total bonus
            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Salary Details:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Salary", "Years", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f\n", salary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }

        // Display total bonus payout and salary details
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner object
        input.close();
    }
}
