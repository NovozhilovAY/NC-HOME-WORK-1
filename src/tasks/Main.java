package tasks;

import tasks.task1.Circle;
import tasks.task2.Rectangle;
import tasks.task3.Employee;

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

        Employee employee = new Employee(1, "John","Rambo",244);
        System.out.println(employee);
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(30));
        System.out.println(employee);
        System.out.println(employee.getAnnualSalary());
    }
}
