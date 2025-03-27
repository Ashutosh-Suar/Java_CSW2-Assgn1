package Assgn2_two;

import java.util.HashMap;

public class Q10 {
    public static int findSmallestMissing(int[] arr) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        // Populate the HashMap with the numbers from the array
        for (int num : arr) {
            numberMap.put(num, 1);
        }

        // Check for the missing number in the range 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (!numberMap.containsKey(i)) {
                return i; // Return the first missing number found
            }
        }

        return -1; // Return -1 if no number is missing
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 7, 1, 2, 8, 4, 5, 10, 6 };
        int missingNumber = findSmallestMissing(numbers);

        if (missingNumber != -1) {
            System.out.println("The smallest missing number is: " + missingNumber);
        } else {
            System.out.println("No number is missing in the range 1 to 10.");
        }
    }
}
