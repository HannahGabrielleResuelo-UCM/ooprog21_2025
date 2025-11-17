// Makes String comparisons
import java.util.*;
class DebugSeven1
{
public static void main(String[] args)
{
Scanner kb = new Scanner(System.in);
String name1, name2, name3;
String choice;

do {
System.out.println("Enter three names.");
System.out.println("They can be the same or different.");
System.out.print("First name >> ");
name1 = kb.nextLine(); // nextLine should include parentheses
System.out.print("Second name >> ");
name2 = kb.nextLine(); // nextLine should include parentheses
System.out.print("Third name >> ");
name3 = kb.nextLine(); // nextLine should include parentheses
compareNames(name1, name2);
compareNames(name1, name3);
compareNames(name2, name3);

System.out.print("Do you want to enter another set? (y/n) >> ");
choice = kb.nextLine();

} while (choice.equalsIgnoreCase("y")); 
    
}
public static void compareNames(String n1, String n2) // Updated method name to compareNames and specified the data type for n2
{
System.out.print(n1 + " and " + n2);
if(n1.equals(n2)) { // Inserted the required closing parenthesis in equals() and added an opening brace
System.out.println(" are the same");
} // Appended the necessary closing brace
else { // Included the missing opening brace
System.out.println(" are different");
} // Inserted the matching closing brace
}
}
