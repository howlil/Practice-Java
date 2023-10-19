import javax.swing.JOptionPane;

public class ColorRange {

    public static void main(String[] args) {
        // Prompt the user for input
        String input = JOptionPane.showInputDialog("Enter a color code (wavelength in nm):");
        double wavelength = Double.parseDouble(input);

        // Determine the color based on the wavelength
        String color;
        if (wavelength >= 380 && wavelength < 450) {
            color = "Violet";
        } else if (wavelength >= 450 && wavelength < 495) {
            color = "Blue";
        } else if (wavelength >= 495 && wavelength < 570) {
            color = "Green";
        } else if (wavelength >= 570 && wavelength < 590) {
            color = "Yellow";
        } else if (wavelength >= 590 && wavelength < 620) {
            color = "Orange";
        } else if (wavelength >= 620 && wavelength < 750) {
            color = "Red";
        } else {
            color = "The entered wavelength is not a part of the visible spectrum";
        }

        // Display the result using JOptionPane
        JOptionPane.showMessageDialog(null, color);
    }
}
