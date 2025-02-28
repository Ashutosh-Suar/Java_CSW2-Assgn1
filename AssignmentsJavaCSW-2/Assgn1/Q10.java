package Assgn1;

import java.util.*;

// Interface for Enrollment System (Ensures Loose Coupling)
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollments();
}

// Student class (High Cohesion: Handles only student-related details)
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}

// Course class (High Cohesion: Manages only course-related information)
class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course[Code=" + courseCode + ", Name=" + courseName + "]";
    }
}

// Enrollment class implementing EnrollmentSystem (Loose Coupling via Interface)
class Enrollment implements EnrollmentSystem {
    private Map<Student, List<Course>> enrollments;

    public Enrollment() {
        enrollments = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        enrollments.computeIfAbsent(student, k -> new ArrayList<>()).add(course);
        System.out.println(student.getName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollments.containsKey(student) && enrollments.get(student).remove(course)) {
            System.out.println(student.getName() + " dropped " + course.getCourseName());
        } else {
            System.out.println(student.getName() + " is not enrolled in " + course.getCourseName());
        }
    }

    @Override
    public void displayEnrollments() {
        System.out.println("\nEnrollment Details:");
        for (Map.Entry<Student, List<Course>> entry : enrollments.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class Q10 {

    public static void main(String[] args) {

        EnrollmentSystem system = new Enrollment();

        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        Course course1 = new Course("CS101", "Computer Science Basics");
        Course course2 = new Course("MATH201", "Advanced Mathematics");

        system.enrollStudent(student1, course1);
        system.enrollStudent(student1, course2);
        system.enrollStudent(student2, course1);

        system.displayEnrollments();

        system.dropStudent(student1, course2);
        system.displayEnrollments();

    }
}
