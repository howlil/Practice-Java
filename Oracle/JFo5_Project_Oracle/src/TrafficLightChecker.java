import javax.swing.JOptionPane;

public class TrafficLightChecker {

    public static void main(String[] args) {
        // Prompt the user for input using JOptionPane
        String input = JOptionPane.showInputDialog("Enter a color code:");
        int colorCode = Integer.parseInt(input);

        // Determine the next color based on the input
        String nextColor;
        switch (colorCode) {
            case 1:  // Red
                nextColor = "green";
                break;
            case 2:  // Green
                nextColor = "yellow";
                break;
            case 3:  // Yellow
                nextColor = "red";
                break;
            default:
                nextColor = "Invalid color";
                break;
        }

        // Display the result using JOptionPane
        if (nextColor.equals("Invalid color")) {
            JOptionPane.showMessageDialog(null, nextColor);
        } else {
            JOptionPane.showMessageDialog(null, "Next Traffic Light is " + nextColor);
        }
    }
}
