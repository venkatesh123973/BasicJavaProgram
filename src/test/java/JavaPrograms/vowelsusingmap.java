package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class vowelsusingmap {

    public static void main(String[] args) {
        String input = "Hello World!";
        countVowels(input);
    }

    public static void countVowels(String input) {
        // Convert the input string to lower case
        input = input.toLowerCase();

        // Initialize a map to store the count of each vowel
        Map<Character, Integer> vowelCounts = new HashMap<>();
        vowelCounts.put('a', 0);
        vowelCounts.put('e', 0);
        vowelCounts.put('i', 0);
        vowelCounts.put('o', 0);
        vowelCounts.put('u', 0);

        // Iterate through each character of the string
        for (char ch : input.toCharArray()) {
            if (vowelCounts.containsKey(ch)) {
                vowelCounts.put(ch, vowelCounts.get(ch) + 1);
            }
        }

        // Print the results
        System.out.println("Vowel counts:");
        for (Map.Entry<Character, Integer> entry : vowelCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
