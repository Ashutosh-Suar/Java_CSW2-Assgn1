package Assgn1;

class Point {
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to display point details
    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

public class Q3 {

    public static void main(String[] args) {

        // Create original Point object
        Point p1 = new Point(5, 10);
        System.out.println("Original Point:");
        p1.display();

        // Create copy of p1 using copy constructor
        Point p2 = new Point(p1);
        System.out.println("\nCopied Point:");
        p2.display();

        // Modify original point
        p1.setX(20);
        p1.setY(30);
        System.out.println("\nAfter modifying original Point:");
        p1.display();

        // Ensure copied point remains unchanged
        System.out.println("\nCopied Point remains unchanged:");
        p2.display();
    }
}
