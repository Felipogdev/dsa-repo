package neetcode.arrayandhashing.validanagram;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // Use HashMap to have a key and a value
        HashMap<Character, Integer> set1 = new HashMap<>();
        HashMap<Character, Integer> set2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //To add to the hashmap, we can use the put method
            // getOrDefault will return the value of the key if it exists, otherwise it will return 0
            set1.put(s.charAt(i), set1.getOrDefault(s.charAt(i), 0) + 1);
            set2.put(t.charAt(i), set2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return set1.equals(set2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        ValidAnagram va = new ValidAnagram();

        boolean result = va.isAnagram(s, t);
        System.out.println("Is Anagram: " + result);
    }

}
