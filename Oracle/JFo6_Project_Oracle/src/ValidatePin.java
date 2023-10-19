import javax.swing.JOptionPane;

public class ValidatePin {

    public static void main(String[] args) {
        // Declare a valid PIN
        final int VALID_PIN = 1234;

        // Prompt the user to enter the PIN
        int enteredPin = Integer.parseInt(JOptionPane.showInputDialog("Enter your PIN:"));

        // Use a while loop to repeat until a valid PIN is entered
        while (enteredPin != VALID_PIN) {
            JOptionPane.showMessageDialog(null, "Invalid PIN! Please try again.");
            enteredPin = Integer.parseInt(JOptionPane.showInputDialog("Enter your PIN:"));
        }

        // Confirm that the correct PIN has been entered
        JOptionPane.showMessageDialog(null, "Correct PIN entered! You now have access to your account.");
    }
}
