package Assgn2_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    // Parameterized Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Q2 { // class ArrayListUser

    public static void main(String[] args) {

        // Creating an ArrayList of User objects
        ArrayList<User> users = new ArrayList<>();

        // Adding User objects
        users.add(new User("Alice", 25));
        users.add(new User("Bob", 22));
        users.add(new User("Charlie", 30));

        // Printing user details before sorting
        System.out.println("Users before sorting:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }

        // Sorting users based on age
        Collections.sort(users, Comparator.comparingInt(User::getAge));

        // Printing user details after sorting
        System.out.println("\nUsers after sorting by age:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}
