

// Student.java
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

    // Override toString() to display student details
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + "\nName: " + name + "\nTotal Marks: " + totalMark;
    }

    // Implement compareTo() to compare students based on rollNumber
    // (lexicographically)
    @Override
    public int compareTo(Student otherStudent) {
        return this.rollNumber.compareTo(otherStudent.rollNumber);
    }
}

public class Q5 {

    // Bubble Sort method to sort students by rollNumber
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j+1]
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Creating an array of Student objects
        Student[] students = new Student[5];
        students[0] = new Student("Alice", "S105", 85);
        students[1] = new Student("Bob", "S101", 90);
        students[2] = new Student("Charlie", "S103", 78);
        students[3] = new Student("David", "S104", 88);
        students[4] = new Student("Eve", "S102", 95);

        // Display students before sorting
        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student + "\n");
        }

        // Sorting students using Bubble Sort
        bubbleSort(students);
        System.out.println("--------------------------------------------------");

        // Display students after sorting
        System.out.println("\nAfter Sorting:");
        for (Student student : students) {
            System.out.println(student + "\n");
        }

    }
}
