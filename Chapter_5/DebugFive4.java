// DebugFive4.java
// Outputs highest of four numbers

import java.util.Scanner;

public class DebugFive4
{
    public static void main (String args[])
    {
        int one, two, three, four;
        int highest; // FIX 1: Initialized below
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer >> "); // Added 'first' for clarity
        one = input.nextInt(); // FIX 2: Assigning input to the correct variable
        
        System.out.print("Enter second integer >> "); // Added 'second' for clarity
        two = input.nextInt(); // FIX 2: Assigning input to the correct variable
        
        System.out.print("Enter third integer >> "); // Added 'third' for clarity
        three = input.nextInt(); // FIX 2: Assigning input to the correct variable
        
        System.out.print("Enter fourth integer >> "); // Added 'fourth' for clarity
        four = input.nextInt(); // FIX 2: Assigning input to the correct variable
        
        // FIX 1: Initialize highest with the first number before comparison
        highest = one; 

        // FIX 3: Simplified logic - check if current highest is smaller than the next number.
        if (two > highest)
        {
            highest = two;
        }
        
        if (three > highest)
        {
            highest = three;
        }
        
        if (four > highest)
        {
            highest = four;
        }
        
        System.out.println("The highest number is " + highest);
    }
}