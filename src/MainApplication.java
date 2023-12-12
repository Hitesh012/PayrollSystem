import java.util.Scanner;
import java.util.InputMismatchException;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll();
        java.util.Date date = new java.util.Date();

        char addMore;
        do {
            try {
                System.out.println("Enter employee information:");
                System.out.print("Employee ID: ");
                int employeeId = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Hourly Rate: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Hours Worked: ");
                double hoursWorked = scanner.nextDouble();

                Employee newEmployee = new Employee(employeeId, name, hourlyRate, hoursWorked);
                payroll.addEmployee(newEmployee);

                System.out.print("Do you want to add another employee? (y/n): ");
                addMore = scanner.next().charAt(0);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter valid information.");
                scanner.nextLine();  // Consume the invalid input
                addMore = 'y';  // Set to 'y' to re-enter employee information
            }
        } while (addMore == 'y' || addMore == 'Y');

        System.out.println("Payroll for Today's Date: " + date);
        System.out.println("--------------------------");
        payroll.displayEmployeeDetails();
        System.out.println("--------------------------");
        System.out.println("Total Payroll: $" + payroll.calculateTotalPayroll());

        scanner.close();
    }
}
