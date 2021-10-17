package tasks;

import tasks.task1.Circle;
import tasks.task2.Rectangle;
import tasks.task3.Employee;
import tasks.task4.Author;
import tasks.task4.Book;

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
    }
}
