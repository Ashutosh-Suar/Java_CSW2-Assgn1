package Assgn1;

// College class
class College {
    private String collegeName;
    private String collegeLoc; // College Location

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

// Student class
class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
        System.out.println("---------------------------");
    }
}

public class Q6 { // Main App Class

    public static void main(String[] args) {

        // Creating College objects
        College college1 = new College("ABC University", "New York");
        College college2 = new College("XYZ College", "Los Angeles");

        // Creating Student objects and enrolling them in a college
        Student student1 = new Student(101, "John Doe", college1);
        Student student2 = new Student(102, "Jane Smith", college2);

        // Displaying student information
        student1.displayStudentInfo();
        student2.displayStudentInfo();

    }
}
