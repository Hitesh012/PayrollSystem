import java.util.ArrayList;

public class Employee {
    private int employeeId;
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, double hourlyRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Add Additional getters and setters as needed
}