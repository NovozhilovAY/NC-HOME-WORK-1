package tasks;

import tasks.part1.task1.Circle;
import tasks.part1.task2.Rectangle;
import tasks.part1.task3.Employee;
import tasks.part1.task4.Author;
import tasks.part1.task4.Book;
import tasks.part1.task5.MyPoint;
import tasks.part1.task6.DoubleComparator;
import tasks.part1.task6.MyTriangle;
import tasks.part2.task1.MyComplex;
import tasks.part2.task2.MyPolynomial;
import tasks.part2.task3.Ball;
import tasks.part2.task3.Container;

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

        Author authors[] = {new Author("name1","email1",'m'),new Author("name2","email2",'f')};
        Book book = new Book("book1",authors,100,10);
        System.out.println(book);
        System.out.println(book.getAuthorNames());

        MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(5,0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

        MyTriangle myTriangle = new MyTriangle(new MyPoint(0,0),new MyPoint(2,0), new MyPoint(1,1));
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());

        double a = 0.9;
        double b = 0.31 * 3.0;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println();
        System.out.println(DoubleComparator.equal(a,b));
        System.out.println(DoubleComparator.moreOrEqual(a, b));
        System.out.println(DoubleComparator.lessOrEqual(a, b));

        MyComplex mc1 = new MyComplex(1,-3);
        MyComplex mc2 = new MyComplex();
        MyComplex mc3 = new MyComplex(-4,-1);
        System.out.println(mc1);
        System.out.println(mc2);
        System.out.println(mc1.addNew(mc3));
        System.out.println(mc1.subtractNew(mc3));
        System.out.println(mc1.multiply(mc3));
        System.out.println(mc1.divide(mc3));
        System.out.println(mc1.magnitude());
        System.out.println(mc1.argument());
        System.out.println(mc1.conjugate());
        System.out.println(mc1.equals(mc2));

        MyPolynomial mp = new MyPolynomial(0,2,3,0);
        System.out.println(mp);
        MyPolynomial mp1 = new MyPolynomial(0, 0, 0, 4, 5, 6);
        MyPolynomial mp2 = new MyPolynomial(1, 2, 3);
        System.out.println(mp1.multiply(mp2));
        System.out.println(mp1.add(mp2));
        System.out.println(mp2.evaluate(2));
        MyPolynomial mp3 = new MyPolynomial(-2, -2, -3);
        MyPolynomial mp4 = new MyPolynomial(1, 1, 1, 5);
        System.out.println(mp3.add(mp4));

        Ball ball = new Ball(0, 0, 3, 10, 30);
        System.out.println(ball);
        Container container = new Container(0,0,12,12);
        System.out.println(container);
    }
}
