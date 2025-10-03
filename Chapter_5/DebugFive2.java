import java.util.Scanner;

public class DebugFive2
{
    public static void main(String args[])
    {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number >> "); // Added '>>' for clarity
        num = input.nextInt(); // FIX 1: Missing parentheses
        
        System.out.print("Enter another number >> "); // Added '>>' for clarity
        num2 = input.nextInt(); // FIX 1: Missing parentheses
        
        // FIX 2: Corrected the logic to check both divisibility conditions
        if ((num % num2 == 0) || (num2 % num == 0)) 
        {
            System.out.println("One of these numbers is");
            System.out.println("evenly divisible into the other.");
        }
        else
        {
            System.out.println("Neither of these numbers is");
            System.out.println("evenly divisible into the other.");
        }
    }
}