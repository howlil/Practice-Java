import javax.swing.JOptionPane;

public class TrafficLightSwitch {

    public static void main(String[] args) {
        // Prompt the user for input
        String currentColor = JOptionPane.showInputDialog("Enter the current color (Red, Yellow, Green):");

        // Determine the next color based on the current color using a switch statement
        String nextColor;
        switch (currentColor.toLowerCase()) {
            case "red":
                nextColor = "Green";
                break;
            case "green":
                nextColor = "Yellow";
                break;
            case "yellow":
                nextColor = "Red";
                break;
            default:
                nextColor = "Invalid color entered!";
                break;
        }

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, "The next color is: " + nextColor);
    }
}
