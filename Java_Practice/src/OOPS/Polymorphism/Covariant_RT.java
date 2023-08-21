class Vehicle {
    float engineDisplacement; //cc

    // void cc() {
    //     System.out.println("Engine Displacement: " + engineDisplacement + " cc");
    // }

    Vehicle cc() {
        System.out.println("Engine Displacement: " + engineDisplacement + " cc");
        return this;
    }
}

class Bike extends Vehicle {
    float engineDisplacement = 150;

    // float cc() {
    //     // System.out.println("Engine Displacement: " + engineDisplacement + " cc");
    //     return engineDisplacement;
    // }

    //covariant return type
    Bike cc() {
        // System.out.println("Engine Displacement: " + engineDisplacement + " cc");
        return this;
    }
}


public class Covariant_RT {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.engineDisplacement = 100;
        System.out.println(v.cc().engineDisplacement);

        Bike b = new Bike();
        b.engineDisplacement = 150;
        System.out.println(b.cc().engineDisplacement);        
    }
}

/*
Why Covariant Return Type?
> To maintain the hierarchy of return type of overridden method.
> To avoid type casting.
> To avoid method overloading.

In simple terms, Covariant Return Type allows us to return subclass type in overridden method.
*/