package Assgn2_one;

import java.util.Scanner;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    private String name;
    private String rollNumber;
    private int totalMark;

    // Constructor
    public Student(String name, String rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    // Override toString() to return student details
    @Override
    public String toString() {
        return "Name: " + name + "\nRoll Number: " + rollNumber + "\nTotal Marks: " + totalMark;
    }

    // Implement compareTo() to compare students based on total marks
    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.totalMark, otherStudent.totalMark);
    }

    // Static method for linear search to find a student by roll number
    public static Student linearSearch(Student[] students, String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                return student;
            }
        }
        return null; // Return null if student not found
    }
}

public class Q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating an array of Student objects
        Student[] students = new Student[3];
        students[0] = new Student("Alice", "S101", 85);
        students[1] = new Student("Bob", "S102", 90);
        students[2] = new Student("Charlie", "S103", 78);

        // Printing student details
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student + "\n");
        }

        // Searching for a student by roll number
        System.out.print("Enter roll number to search: ");
        String searchRollNumber = scanner.nextLine();
        Student foundStudent = Student.linearSearch(students, searchRollNumber);

        if (foundStudent != null) {
            System.out.println("\nStudent Found:\n" + foundStudent);
        } else {
            System.out.println("\nStudent with roll number " + searchRollNumber + " not found.");
        }

        scanner.close();

    }
}
