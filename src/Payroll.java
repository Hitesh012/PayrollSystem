import java.util.Scanner;
public class Payroll {

        // static scanner/constructor
        static Scanner in = new Scanner(System.in);
        static final EmployeeDetails employee = new EmployeeDetails();

        // gather data for setters
        public static void employeeInput() {

            System.out.println("Enter the employee's name: ");
            employee.setEmployeeName(in.nextLine());

            System.out.println("Enter the rate per hour: ");
            employee.setRatePerHour(in.nextDouble());

            System.out.println("Enter the hours worked: ");
            employee.setHours(in.nextDouble());

            printPayroll();
        }

        // calling getters to create wage then print it
        public static void printPayroll() {

            double wage = employee.getHours() * employee.getRatePerHour();

            System.out.println("-------------------------------\nEmployee's name: " + employee.getEmployeeName() + "\nEmployee's wage: " + wage);
        }
        // Not sure if I should do the part below
    /* public static void payrollMenu() {

        System.out.println("""
                Enter the number corresponding to what you want to do.
                1. Add Employee
                2. Calculate Payroll
                3. Display Employee Details""");

        int menu = input.nextInt();

        if (menu == 1) {
            addEmployee();
        } else if (menu == 2) {

        } else if (menu == 3) {

        } else {
            System.out.println("Please make a valid selection.");
            payrollMenu();
        }
    } */

        // getter and setters
        public static class EmployeeDetails {

            public String employeeName;
            public double hours, ratePerHour;

            public void setEmployeeName(String employeeName) {
                this.employeeName = employeeName;
            }

            public String getEmployeeName() {
                return employeeName;
            }

            public void setRatePerHour(double ratePerHour) {
                this.ratePerHour = ratePerHour;
            }

            public double getRatePerHour() {
                return ratePerHour;
            }

            public void setHours(double hours) {
                this.hours = hours;
            }

            public double getHours() {
                return hours;
            }
        }

        public static void  test(){

        }
    }

