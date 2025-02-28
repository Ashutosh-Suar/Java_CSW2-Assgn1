package Assgn1;

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Q2 {

    public static void main(String[] args) {

        // Create a Rectangle object
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Display initial details
        System.out.println("Initial Rectangle Details:");
        System.out.println("Length: " + myRectangle.getLength() + ", Width: " + myRectangle.getWidth());
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());

        // Modify attributes using setters
        myRectangle.setLength(7.0);
        myRectangle.setWidth(4.0);

        // Display updated details
        System.out.println("\nUpdated Rectangle Details:");
        System.out.println("Length: " + myRectangle.getLength() + ", Width: " + myRectangle.getWidth());
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());

    }
}
