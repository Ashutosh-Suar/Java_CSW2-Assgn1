package Assgn2_two;

import java.util.HashSet;

public class Q9 {

    public static void main(String[] args) {
        int[] numbers = { 4, 5, 6, 7, 8, 4, 5, 9, 10, 6 };
        HashSet<Integer> seenNumbers = new HashSet<>();
        HashSet<Integer> repeatingNumbers = new HashSet<>();

        // Identify repeating numbers
        for (int num : numbers) {
            if (!seenNumbers.add(num)) {
                repeatingNumbers.add(num);
            }
        }

        // Print repeating numbers
        if (repeatingNumbers.isEmpty()) {
            System.out.println("No repeating numbers found.");
        } else {
            System.out.println("Repeating numbers: " + repeatingNumbers);
        }

    }
}
