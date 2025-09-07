import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog("What is your name?");

            if (name == null) {
                break;
            }

            JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to proceed?",
                    "Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                continue;
            } else if (choice == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you!");
                break;
            } else {
                break;
            }
        }
    }
}
