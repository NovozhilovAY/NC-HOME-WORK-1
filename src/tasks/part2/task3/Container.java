package tasks.part2.task3;
import javafx.scene.paint.Color;

public class Container extends javafx.scene.shape.Rectangle {

    public Container(int x1, int y1, int width, int height) {
        super(x1, y1, width, height);
        setFill(Color.WHITE);
        setStroke(Color.BLACK);
    }

    public double getX2(){
        return getX() + getWidth();
    }

    public double getY2(){
        return getY() + getHeight();
    }


    public BallCondition getBallCondition(Ball ball) {
        double ballX = ball.getCenterX();
        double ballY = ball.getCenterY();
        double radius = ball.getRadius();
        boolean ballTouchesVerticalLines = ballX + radius >= getX2() || ballX - radius <= getX();
        boolean ballTouchesHorizontalLines = ballY + radius >= getY2() || ballY - radius <= getY();
        if(ballTouchesHorizontalLines && ballTouchesVerticalLines) {
            return BallCondition.TOUCHES_BOTH_LINES;
        }else if(ballTouchesVerticalLines) {
            return BallCondition.TOUCHES_VERTICAL_LINES;
        }else if (ballTouchesHorizontalLines){
            return BallCondition.TOUCHES_HORIZONTAL_LINES;
        }
        return BallCondition.IN_CONTAINER;
    }

    @Override
    public String toString() {
        return "Container[(" + getX() + "," + getY() + "),(" + getX2() + "," + getY2() + ")]";
    }
}
