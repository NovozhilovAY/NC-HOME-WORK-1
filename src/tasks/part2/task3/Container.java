package tasks.part2.task3;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        float ballX = ball.getX();
        float ballY = ball.getY();
        int radius = ball.getRadius();
        if(ballX + radius <= x2 && ballX - radius >= x1 &&
           ballY + radius <= y2 && ballY - radius >= y1 ) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                "," + y1 +
                "), (" + x2 +
                "," + y2 +
                ")]";
    }
}
