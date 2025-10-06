public class Employee {
    private int employeeNumber;
    private double payRate;

    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        } else {
            this.employeeNumber = employeeNumber;
        }
        this.payRate = payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double computeOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            return 0.0;
        }
    }
}
