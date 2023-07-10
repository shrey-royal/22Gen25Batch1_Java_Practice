class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Bird extends Animal {
    @Override   // Annotation
    public void sound() {
        System.out.println("Bird is making a sound");
    }
}

class Cat extends Animal {
    @Override   // Annotation
    public void sound() {
        System.out.println("Cat is making a sound");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myBird = new Bird(); // Upcasting
        Animal myCat = new Cat();   // Upcasting

        Bird d = (Bird) myBird; // Downcasting


        d.sound();
        myAnimal.sound();
        myBird.sound();
        myCat.sound();
    }
}

/*
Override annotation is used when we override a method in a subclass.
It is not mandatory to use it, but it is recommended to use it because it informs the compiler that the method is being overridden.

if we don't use the annotation, and the method name is changed, then the compiler will treat it as a new method and will throw an error.

> Downcasting can also be used when you have a reference of superclass type that was previously upcasted, and you want to downcast it back to the subclass type.

*/