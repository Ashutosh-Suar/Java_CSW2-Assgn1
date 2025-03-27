package Assgn2_two;

import java.util.HashMap;

public class Q8 {
    public class AnagramChecker {
        public static boolean areAnagrams(String str1, String str2) {
            // If lengths are different, they cannot be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            HashMap<Character, Integer> charCountMap = new HashMap<>();

            // Populate the HashMap with character counts from str1
            for (char c : str1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Compare with str2
            for (char c : str2.toCharArray()) {
                if (!charCountMap.containsKey(c)) {
                    return false;
                }
                charCountMap.put(c, charCountMap.get(c) - 1);
                if (charCountMap.get(c) == 0) {
                    charCountMap.remove(c);
                }
            }

            return charCountMap.isEmpty();
        }

        public static void main(String[] args) {

            String str1 = "listen";
            String str2 = "silent";

            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }

        }
    }
}
