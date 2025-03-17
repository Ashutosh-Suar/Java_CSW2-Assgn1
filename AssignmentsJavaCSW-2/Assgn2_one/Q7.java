package Assgn2_one;

import java.util.Arrays;
import java.util.Comparator;

// Student class
class Student {
    private String name;
    private String rollNo;
    private int age;

    // Constructor
    public Student(String name, String rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    // Override toString() to display student details
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Age: " + age;
    }
}

// Comparator to sort students by roll number
class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNo().compareTo(s2.getRollNo()); // Lexicographical order
    }
}

// Comparator to sort students by age
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class Q7 {

    public static void main(String[] args) {

        // Creating an array of Student objects
        Student[] students = {
                new Student("Alice", "S103", 20),
                new Student("Bob", "S101", 22),
                new Student("Charlie", "S104", 19),
                new Student("David", "S102", 21)
        };

        // Sorting by Roll Number
        Arrays.sort(students, new RollNoComparator());
        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by Age
        Arrays.sort(students, new AgeComparator());
        System.out.println("\nSorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
