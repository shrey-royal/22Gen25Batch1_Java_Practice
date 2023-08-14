/*
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape { 
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
} 

public class UP_Downcasting {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Upcasting
        circle.draw();

        Shape rect = new Rectangle(); // Upcasting
        rect.draw();
    }
}
*/

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing team");
    }
}

class Developer extends Employee {
    void develop() {
        System.out.println("Developer is developing");
    }
}


class OrganizationAPP {
    public static void main(String[] args) {
        Employee employee = new Manager(); // Upcasting

        if(employee instanceof Manager) {
            Manager manager = (Manager) employee;   // Downcasting
            manager.manageTeam();
        }
    }
}