package Assgn2_one;

import java.util.Objects;

// Animal class
class Animal {
    private String name;
    private String color;
    private String type; // "Pet" or "Wild"

    // Constructor
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Override hashCode() to generate a unique identifier
    @Override
    public int hashCode() {
        return Objects.hash(name, color, type);
    }

    // Override toString() to return animal details
    @Override
    public String toString() {
        return "Name: " + name + "\nColor: " + color + "\nType: " + type;
    }
}

public class Q6 {

    public static void main(String[] args) {

        // Creating multiple Animal objects
        Animal animal1 = new Animal("Lion", "Golden", "Wild");
        Animal animal2 = new Animal("Dog", "Brown", "Pet");
        Animal animal3 = new Animal("Elephant", "Grey", "Wild");
        Animal animal4 = new Animal("Cat", "White", "Pet");

        // Printing animal details and their hash codes
        System.out.println(animal1 + "\nHash Code: " + animal1.hashCode() + "\n");
        System.out.println(animal2 + "\nHash Code: " + animal2.hashCode() + "\n");
        System.out.println(animal3 + "\nHash Code: " + animal3.hashCode() + "\n");
        System.out.println(animal4 + "\nHash Code: " + animal4.hashCode() + "\n");

    }
}
