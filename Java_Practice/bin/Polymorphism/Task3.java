/*
Write a program that creates a hierarchy of employees. The hierarchy should have a base class Employee and three subclasses, SalariedEmployee, HourlyEmployee, and CommissionEmployee. The Employee class should have a method to calculate the pay of the employee. The SalariedEmployee, HourlyEmployee, and CommissionEmployee subclasses should override the pay() method to calculate the pay of a salaried employee, hourly employee, and commission employee, respectively. The program should then create an array of Employee objects and iterate through the array, calling the pay() method on each object.
*/

class Employee {
    public void pay(double salary, float commission) {
        System.out.println("Commission Employee Pay Method from Base Class");
    }

    public void pay(double salary, int hours) {
        System.out.println("Hourly Employee Pay Method from Base Class");
    }

    public void pay(double salary) {
        System.out.println("Salaried Employee Pay Method from Base Class");
    }
}

class SalariedEmployee extends Employee {
    @Override
    public void pay(double salary) {
        System.out.println("Salaried Employee Pay Method");
        System.out.println("Salary: " + salary);
    }
}

class HourlyEmployee extends Employee {
    @Override
    public void pay(double salary, int hours) {
        System.out.println("Hourly Employee Pay Method");
        double salaryPerHour = salary / 320;
        System.out.println("Salary: " + (salaryPerHour*hours));
    }
}

class CommissionEmployee extends Employee {
    @Override
    public void pay(double salary, float commission) {
        System.out.println("Commission Employee Pay Method");
        double salary_commission = salary * commission / 100;
        System.out.println("Salary: " + salary_commission);
    }
}

public class Task3 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee();
        employees[1] = new HourlyEmployee();
        employees[2] = new CommissionEmployee();

        employees[0].pay(10000);
        employees[1].pay(10000, 200);
        employees[2].pay(10000, 55.0f);
    }
}
