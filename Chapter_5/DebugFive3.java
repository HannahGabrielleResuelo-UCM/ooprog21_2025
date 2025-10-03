// DebugFive3.java
// Determines whether item number on order is valid

// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department

import java.util.Scanner;

public class DebugFive3
{
    public static void main (String args[])
    {
        int item;
        String output;
        
        final int LOW = 111;
        final int HIGH = 999; // Represents the maximum valid number (999)
        final int CUTOFF = 500; // Represents the start of the Housewares Department
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter item number >> ");
        item = input.nextInt();
        
        // FIX 1 & 2: Reordered conditions, fixed the logic, and corrected the variable name.
        if (item < LOW)
        {
            output = "Item number too low (Invalid)";
        }
        else if (item > HIGH) // Corrected variable name HIGHH to HIGH, and checked for > 999
        {
            output = "Item number too high (Invalid)";
        }
        else if (item < CUTOFF) // Item is valid (>= 111 and <= 999) and < 500
        {
            output = "Valid - Item in Automotive Department";
        }
        else // Item is valid (>= 111 and <= 999) and >= 500
        {
            output = "Valid - Item in Housewares Department";
        }
        
        System.out.println(output);
    }
}