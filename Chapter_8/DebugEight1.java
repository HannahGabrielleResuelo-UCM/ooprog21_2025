// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid

import java.util.*;

public class DebugEight1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char userCode;
        String entry;
        boolean found = false;   // should start as false
        char[] okayCodes = {'A', 'C', 'T', 'H'};

        System.out.println("Enter shipping code for this delivery.");
        System.out.print("Valid codes are: ");

        // loop should print all codes, not just the first 2
        for (int x = 0; x < okayCodes.length; ++x) {
            System.out.print(okayCodes[x]);
            if (x != (okayCodes.length - 1))
                System.out.print(", ");
        }

        System.out.print(" >> ");
        entry = input.nextLine();

        // get the first character, not entry.charAt(1)
        userCode = entry.charAt(0);

        // Check if the entered code is valid
        for (int i = 0; i < okayCodes.length; ++i) {

            // use == for comparison, not =
            if (userCode == okayCodes[i]) {
                found = true;
                break;   // Once found, no need to continue
            }
        }

        // logic was reversed
        if (found)
            System.out.println("Good code");
        else
            System.out.println("Sorry, code not found");
    }
}
