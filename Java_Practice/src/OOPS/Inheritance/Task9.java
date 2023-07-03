package OOPS.Inheritance;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    //display method
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void calculateFuelEfficiency() {
        System.out.println("Calculating fuel efficiency for truck");
    }

    public void calculateDistanceTravelled() {
        System.out.println("Calculating distance travelled for truck");
    }

    public void calculateMaxSpeed() {
        System.out.println("Calculating max speed for truck");
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType); // super() is used to call the constructor of the parent class
    }

    public void calculateFuelEfficiency() {
        System.out.println("Calculating fuel efficiency for car");
    }

    public void calculateDistanceTravelled() {
        System.out.println("Calculating distance travelled for car");
    }

    public void calculateMaxSpeed() {
        System.out.println("Calculating max speed for car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    public void calculateFuelEfficiency() {
        System.out.println("Calculating fuel efficiency for motorcycle");
    }

    public void calculateDistanceTravelled() {
        System.out.println("Calculating distance travelled for motorcycle");
    }

    public void calculateMaxSpeed() {
        System.out.println("Calculating max speed for motorcycle");
    }
}

public class Task9 {

    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2021, "Gas");
        Car car = new Car("Honda", "Civic", 2021, "Gas");
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Street 750", 2021, "Gas");

        truck.display();
        System.out.println();
        truck.calculateFuelEfficiency();
        truck.calculateDistanceTravelled();
        truck.calculateMaxSpeed();

        car.display();
        System.out.println();
        car.calculateFuelEfficiency();
        car.calculateDistanceTravelled();
        car.calculateMaxSpeed();

        motorcycle.display();
        System.out.println();
        motorcycle.calculateFuelEfficiency();
        motorcycle.calculateDistanceTravelled();
        motorcycle.calculateMaxSpeed();
    }
}

/*
 * 
 * 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
 */