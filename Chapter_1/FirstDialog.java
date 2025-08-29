import javax.swing.JOptionPane;

public class FirstDialog {
    public static void main(String[] args) {
        int answer;
        
        do {
            JOptionPane.showMessageDialog(null, "First Java dialog", "Message", JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showConfirmDialog(null, "Do you want to see the message again?", "Repeat?", JOptionPane.YES_NO_OPTION);
            
        } while (answer == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }
}

