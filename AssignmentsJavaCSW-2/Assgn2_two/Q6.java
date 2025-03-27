package Assgn2_two;

import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        
        // (a) Display the elements of the TreeSet
        System.out.println("Elements of the TreeSet: " + treeSet);
        
        // (b) Check whether a number is present in the TreeSet
        System.out.println("Enter a number to search in the TreeSet:");
        int searchNum = scanner.nextInt();
        if (treeSet.contains(searchNum)) {
            System.out.println(searchNum + " is present in the TreeSet.");
        } else {
            System.out.println(searchNum + " is not found in the TreeSet.");
        }
        
        // (c) Remove a specified element from the TreeSet
        System.out.println("Enter a number to remove from the TreeSet:");
        int removeNum = scanner.nextInt();
        if (treeSet.remove(removeNum)) {
            System.out.println(removeNum + " removed successfully.");
        } else {
            System.out.println(removeNum + " is not found in the TreeSet.");
        }
        
        // Display updated TreeSet
        System.out.println("Updated TreeSet: " + treeSet);
        
        scanner.close();
    }
}
