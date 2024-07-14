package MapToStreams;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class doublevalueusingstreams {

    @Test
    public void usingdouble(){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        Map<String, Integer> transformedMap = map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() * 2
                ));

        System.out.println(transformedMap);


    }
}
