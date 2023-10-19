import javax.swing.JOptionPane;

public class DisplayMultiples {

    public static void main(String[] args) {
        // Prompt the user for input
        String input = JOptionPane.showInputDialog("Choose a number:");
        int number = Integer.parseInt(input);

        // Use a StringBuilder to accumulate the result
        StringBuilder result = new StringBuilder();

        // Use a for loop to calculate and display all the multiples of the number from 1 to 12
        for (int i = 1; i <= 12; i++) {
            result.append(number).append("x").append(i).append(" = ").append(number * i).append("\n");
        }

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, result.toString());
    }
}
