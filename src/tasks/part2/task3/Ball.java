package tasks.part2.task3;
import javafx.scene.paint.Color;

public class Ball extends javafx.scene.shape.Circle{
    private double xDelta;
    private double yDelta;

    public Ball(double x, double y, double radius, int speed, int direction) {
        super(x, y, radius);
        xDelta = speed * Math.cos(Math.toRadians(direction));
        yDelta = -speed * Math.sin(Math.toRadians(direction));
        setFill(Color.RED);
    }

    public double getXDelta() {
        return xDelta;
    }

    public void setXDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void setYDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        setCenterX(getCenterX() + xDelta);
        setCenterY(getCenterY() + yDelta);
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + getCenterX() +
                "," + getCenterY() +
                "), speed=(" + xDelta +
                "," + yDelta +
                ")]";
    }
}
