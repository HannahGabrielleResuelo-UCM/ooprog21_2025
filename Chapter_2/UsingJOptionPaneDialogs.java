import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            // Ask the user for their name
            String name = JOptionPane.showInputDialog("What is your name?");

            // If user clicks Cancel, exit program
            if (name == null) {
                break;
            }

            // Show greeting
            JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

            // Show confirmation dialog
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to proceed?",
                    "Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                // Loop again: ask name once more
                continue;
            } else if (choice == JOptionPane.NO_OPTION) {
                // Show thank you and exit
                JOptionPane.showMessageDialog(null, "Thank you!");
                break;
            } else {
                // Cancel clicked → exit program
                break;
            }
        }
    }
}
