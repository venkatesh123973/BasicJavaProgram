package MapToStreams;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapstreamsjava8 {

    @Test
    public void maptostrem(){

        HashMap<String,Integer> map=new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        Map<String, Integer> filteredMap=map.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(filteredMap);

        //getKey only value greater than 2
        map.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(System.out::println);

        //getthekey based on the value

        map.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).forEach(System.out::println);



    }
}
