package tasks;

import tasks.task1.Circle;
import tasks.task2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(15,"yellow");
        Circle circle3 = new Circle();
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle1.getArea());
        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
}
