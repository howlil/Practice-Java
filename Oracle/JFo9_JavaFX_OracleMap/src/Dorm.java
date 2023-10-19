import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Dorm extends Circle {
    private String name;
    private int population;
    private Label label;

    public Dorm(Pane root, String name, int population, double x, double y) {
        super(x, y, 10 + population * 0.1);
        this.name = name;
        this.population = population;

        label = new Label(name + " (" + population + ")");
        label.setLayoutX(x - 20);
        label.setLayoutY(y - 20);
        root.getChildren().addAll(this, label);
    }

    public int getPopulation() {
        return population;
    }
}
