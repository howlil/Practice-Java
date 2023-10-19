import javafx.scene.shape.Circle;

public class CenterPoint extends Circle {
    private int totalPopulation = 0;
    private double totalX = 0, totalY = 0;

    public CenterPoint() {
        super(5);
    }

    public void recalculateCenter(Dorm dorm) {
        totalX += dorm.getCenterX() * dorm.getPopulation();
        totalY += dorm.getCenterY() * dorm.getPopulation();
        totalPopulation += dorm.getPopulation();

        setCenterX(totalX / totalPopulation);
        setCenterY(totalY / totalPopulation);
    }
    public String getCenterInfo() {
        return "Total Population: " + totalPopulation +
               "\nCenter X: " + getCenterX() +
               "\nCenter Y: " + getCenterY();
    }
    
}
