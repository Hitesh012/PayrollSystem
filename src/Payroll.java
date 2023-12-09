import java.util.ArrayList;

// Payroll.java
public class Payroll {
    private ArrayList<Employee> employees;

    public Payroll() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalPayroll() {
        double totalPayroll = 0;
        for (Employee employee : employees) {
            totalPayroll += employee.calculateGrossPay();
        }
        return totalPayroll;
    }

    public void displayEmployeeDetails() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Gross Pay: $" + employee.calculateGrossPay());
            System.out.println("--------------------------");
        }
    }
}