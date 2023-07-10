/*
1. Shape Calculation:
You are tasked with creating a program that calculates the areas of different shapes such as circles, rectangles, and triangles. Each shape has a different formula to calculate its area. Implement a solution using polymorphism where a base class called "Shape" defines a method called "calculateArea()" that is overridden by its derived classes (Circle, Rectangle, and Triangle) to calculate the area specific to each shape. The program should allow the user to input the dimensions of the shape and display the calculated area based on the shape selected.

2. Employee Salary Calculation:
You are developing an employee management system for a company. The company has different types of employees, including full-time employees, part-time employees, and contractual employees. Each type of employee has a different salary calculation method. Implement a solution using polymorphism where a base class called "Employee" defines a method called "calculateSalary()" that is overridden by its derived classes (FullTimeEmployee, PartTimeEmployee, and ContractualEmployee) to calculate the salary specific to each type of employee. The program should allow the user to enter the details of an employee, including the type of employee, and display their calculated salary based on the type selected.

*/

class Shapes {
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shapes{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shapes {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base   = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Shapes circle = new Circle(5.0);
        Shapes rectangle = new Rectangle(5.0, 10.0);
        Shapes triangle = new Triangle(5.0, 10.0);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
