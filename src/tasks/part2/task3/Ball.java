package tasks.part2.task3;
import javafx.scene.paint.Color;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        if (Double.compare(ball.xDelta, xDelta) != 0) return false;
        if (Double.compare(super.getCenterX(), ball.getCenterX()) != 0) return false;
        if (Double.compare(super.getCenterY(), ball.getCenterY()) != 0) return false;
        if (Double.compare(super.getRadius(), ball.getRadius()) != 0) return false;
        return Double.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xDelta,yDelta,super.getCenterX(),super.getCenterY(),super.getRadius());
    }
}
