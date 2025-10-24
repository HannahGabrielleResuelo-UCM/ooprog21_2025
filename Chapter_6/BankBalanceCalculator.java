import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance;
        double interestRate = 0.03; 
        int year = 1;
        int choice;

        System.out.print("Enter your initial balance: ");
        balance = sc.nextDouble();

        do {
           
            balance += balance * interestRate;

            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", 
                              year, interestRate, balance);
            year++;

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n   or any other number for no >> ");
            choice = sc.nextInt();
            System.out.println();

        } while (choice == 1);

    }
}
