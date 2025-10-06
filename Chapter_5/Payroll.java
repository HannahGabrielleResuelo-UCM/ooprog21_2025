import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = sc.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = sc.nextDouble();

        Employee emp = new Employee(1, payRate);

        double regularPay = emp.computeRegularPay(hoursWorked);
        double overtimePay = emp.computeOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        sc.close();
    }
}
