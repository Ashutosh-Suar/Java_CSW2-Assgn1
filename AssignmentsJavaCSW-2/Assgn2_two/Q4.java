package Assgn2_two;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", mark=" + mark + "}";
    }
}

public class Q4 {
    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding sample students
        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 78.0));
        students.add(new Student("Charlie", 21, 90.0));

        // (a) Display the list of students
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // (b) Check existence of a student
        System.out.println("Enter student details to search (name, age, mark):");
        String name = scanner.next();
        int age = scanner.nextInt();
        double mark = scanner.nextDouble();
        Student searchStudent = new Student(name, age, mark);

        if (students.contains(searchStudent)) {
            System.out.println("Student exists in the list (content comparison).");
        } else {
            System.out.println("Student not found.");
        }

        // (c) Remove a student
        System.out.println("Enter student details to remove (name, age, mark):");
        name = scanner.next();
        age = scanner.nextInt();
        mark = scanner.nextDouble();
        Student removeStudent = new Student(name, age, mark);

        if (students.remove(removeStudent)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }

        // (d) Count the number of students
        System.out.println("Total number of students: " + students.size());

        scanner.close();

    }
}
