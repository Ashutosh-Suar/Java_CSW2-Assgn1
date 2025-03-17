package Assgn2_one;

class Student {
    private String name;
    private String rollNumber; // Accepts both integers and strings
    private int age;

    // Constructor
    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }
}

public class Q1 {

    public static void main(String[] args) {

        // Creating Student objects
        Student student1 = new Student("Alice", "101", 20);
        Student student2 = new Student("Bob", "ENG2023", 21); // Alphanumeric roll number
        Student student3 = new Student("Charlie", "303", 19);

        // Displaying Student details
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

    }
}
