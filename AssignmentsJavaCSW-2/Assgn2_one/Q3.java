package Assgn2_one;

// Car.java
class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    // Constructor
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Override toString() to return car details
    @Override
    public String toString() {
        return "Model: " + model + "\nColor: " + color + "\nSpeed: " + speed + " km/h";
    }

    // Implement compareTo() to compare cars based on speed
    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.speed, otherCar.speed);
    }
}

public class Q3 {

    public static void main(String[] args) {

        // Instantiate two Car objects
        Car car1 = new Car("Tesla Model S", "Red", 250);
        Car car2 = new Car("BMW M3", "Blue", 280);

        // Print car details
        System.out.println("Car 1 Details:\n" + car1);
        System.out.println("\nCar 2 Details:\n" + car2);

        // Compare cars based on speed and print the faster car
        Car fasterCar = (car1.compareTo(car2) > 0) ? car1 : car2;
        System.out.println("\nThe faster car is:\n" + fasterCar);

    }
}
