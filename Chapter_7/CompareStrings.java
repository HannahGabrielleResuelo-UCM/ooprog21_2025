import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Predefined string
        String name = "Carmen";

        // User input
        System.out.print("Enter your name > ");
        String userName = input.nextLine();

        // Strict comparison using equals()
        if(userName.equals(name)) {
            System.out.println(userName + " equals " + name);
        } else {
            System.out.println(userName + " does not equal " + name);
        }
    }
}

