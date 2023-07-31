class Sound {
    private String soundType;

    public Sound(String soundType) {
        this.soundType = soundType;
    }

    public void play() {
        System.out.println(soundType);
    }
}

class Animal {
    public Sound makeSound() {
        return null;    //this methods will be overriden in the derived classes
    }
}

class Dog extends Animal {
    @Override
    public Sound makeSound() {
        return new Sound("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public Sound makeSound() {
        return new Sound("Meow!");
    }
}

public class AnimalSoundsApplication {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Sound dogSound = dog.makeSound();
        Sound catSound = cat.makeSound();

        dogSound.play();
        catSound.play();
    }   
}

/* 
 * Object redeclaration:
 * 
 * Class_name object_name = new Class_name();
 * 
 * object_name = new Class_name();  //this line of code is indicaating that the previous object will be destroyed and a new object will be created
 * 
 * object_name = new Class_name(params);
 */