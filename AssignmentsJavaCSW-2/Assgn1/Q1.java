package Assgn1;

class Car {
    private String make;
    private String model;

    // Parameterized Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }
}

public class Q1 {

    public static void main(String[] args) {

        // Instantiate myCar1 with values
        Car myCar1 = new Car("Toyota", "Fortuner");

        // Instantiate myCar2 with null values
        Car myCar2 = new Car(null, null);

        // Print initial details
        System.out.println("Initial Car Details:");
        myCar1.displayDetails();
        myCar2.displayDetails();

        // Update myCar2 using setters
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Print updated details
        System.out.println("\nUpdated Car Details:");
        myCar1.displayDetails();
        myCar2.displayDetails();

    }
}
