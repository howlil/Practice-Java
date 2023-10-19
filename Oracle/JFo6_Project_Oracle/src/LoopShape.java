import javax.swing.JOptionPane;

public class LoopShape {

    public static String createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            return "Invalid dimensions!";
        }

        StringBuilder rectangle = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle.append("#");
            }
            rectangle.append("\n");
        }
        return rectangle.toString();
    }

    public static String createTriangle(int size) {
        if (size < 1) {
            return "Invalid size!";
        }

        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                triangle.append("#");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog("Which shape do you want to create? (Rectangle/Triangle)");
        if ("Rectangle".equalsIgnoreCase(choice)) {
            int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the rectangle:"));
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the rectangle:"));
            String rectangle = createRectangle(width, height);
            JOptionPane.showMessageDialog(null, rectangle);
        } else if ("Triangle".equalsIgnoreCase(choice)) {
            int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of a leg of the triangle:"));
            String triangle = createTriangle(size);
            JOptionPane.showMessageDialog(null, triangle);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice!");
        }
    }
}
