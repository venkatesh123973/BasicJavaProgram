package MapToStreams;

import org.testng.annotations.Test;

import java.util.HashMap;

public class comparehashmapkey {

    @Test
    public void comparehashmap(){
        HashMap<String,Integer> map1=new HashMap<>();
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        map1.put("four", 4);

        HashMap<String,Integer> map2=new HashMap<>();
        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);
        map2.put("four", 4);

        map1.keySet().forEach(key-> {
            if(map2.containsKey(key)) {
                System.out.println("Key " + key + " is found.");
            }
            else {
                System.out.println("Key " + key + " is not found.");
            }
        });
    }

    // Compare keys of map1 and map2
//        map1.keySet().stream()
//            .filter(map2::containsKey)
//            .forEach(key -> System.out.println("Key found: " + key));
}
