package Assgn1;

// Vehicle interface
interface Vehicle {
    void accelerate();

    void brake();
}

// Car class implementing Vehicle interface
class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    // Overloaded accelerate methods
    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h in " + duration + " seconds.");
    }
}

// Bicycle class implementing Vehicle interface
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Overloaded accelerate methods
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h in " + duration + " seconds.");
    }
}

public class Q9 {

    public static void main(String[] args) {

        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        // Testing overridden methods
        myCar.accelerate();
        myCar.brake();
        ((Car) myCar).accelerate(60);
        ((Car) myCar).accelerate(80, 5);

        myBicycle.accelerate();
        myBicycle.brake();
        ((Bicycle) myBicycle).accelerate(20);
        ((Bicycle) myBicycle).accelerate(30, 3);

    }
}
