package MapToStreams;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Optional;

public class Sumofvaluesusingstream {

    @Test
    public void sum(){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        int val=map.values().stream().reduce(0,(sum, ele)->sum+ele);
        System.out.println(val);
    }
}
