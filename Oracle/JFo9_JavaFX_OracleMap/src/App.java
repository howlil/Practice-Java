import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.*;

public class App extends Application {
    private Pane root;
    private CenterPoint allDormsCenter;

    @Override
    public void start(Stage primaryStage) {
        root = new Pane();
        allDormsCenter = new CenterPoint();
        root.getChildren().add(allDormsCenter);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Campus Map");
        primaryStage.show();

        addDorm();
    }

    private void addDorm() {
        SwingUtilities.invokeLater(() -> {
            String[] options = {"Continue", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Would you like to continue?", "Choice",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    
            if (choice == 0) { // Continue was selected
                String name = JOptionPane.showInputDialog("Enter dorm name:");
                int population = Integer.parseInt(JOptionPane.showInputDialog("Enter dorm population:"));
                double x = Double.parseDouble(JOptionPane.showInputDialog("Enter dorm x-coordinate:"));
                double y = Double.parseDouble(JOptionPane.showInputDialog("Enter dorm y-coordinate:"));
    
                Platform.runLater(() -> {
                    Dorm dorm = new Dorm(root, name, population, x, y);
                    allDormsCenter.recalculateCenter(dorm);
                    addDorm(); // Re-invoking the method for next input
                });
            }
        });
    }
    
    

    public static void main(String[] args) {
        launch(args);
    }
}
