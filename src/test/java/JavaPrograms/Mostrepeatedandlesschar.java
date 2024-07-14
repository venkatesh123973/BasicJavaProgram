package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Mostrepeatedandlesschar {

    public static void findMostAndLeastFrequent(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("The string is empty or null.");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        char minChar = ' ';
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }

        System.out.println("Most frequent character: " + maxChar + " with count: " + maxCount);
        System.out.println("Least frequent character: " + minChar + " with count: " + minCount);
    }

    public static void main(String[] args) {
        String s = "examplestring";
        findMostAndLeastFrequent(s);
    }
}
