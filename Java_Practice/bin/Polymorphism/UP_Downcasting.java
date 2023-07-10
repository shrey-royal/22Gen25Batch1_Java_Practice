//Upcasting is casting a subclass to a superclass.
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class UP_Downcasting {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Animal animal = dog; // Upcasting
        animal.eat();

        // animal.bark(); // Error
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
        //Downcasting
        if(animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.bark();
        }
    }    
}
