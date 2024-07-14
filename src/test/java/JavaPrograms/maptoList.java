package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maptoList {

    public static void main(String[] args) {
        // Create a Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Convert map entries to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Print the list of entries
        System.out.println(entryList);
    }
}
