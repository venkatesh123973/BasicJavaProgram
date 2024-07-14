package MapToStreams;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicateKeyusingstreams {

    @Test
    public void dupusingstreams(){
        List<Map.Entry<String,Integer>> map= Arrays.asList(
        Map.entry("one", 1),
        Map.entry("two", 2),
        Map.entry("three", 3),
        Map.entry("four", 4),
        Map.entry("four", 5)
    );

        Map<String, Long> keyCounts= map.stream().collect(Collectors.groupingBy(Map.Entry::getKey,Collectors.counting()));
        System.out.println(keyCounts);
        keyCounts.entrySet().stream().filter(e->e.getValue()>1).forEach(e -> System.out.println("Duplicate key: " + e.getKey()));
    }
}
