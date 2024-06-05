package MapCollection;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Interviewquestions {

    @Test
    public void hmap(){
        int a =20;
        int b =a;
        System.out.println(a);
        System.out.println(b);
        a=30;
        System.out.println(a);
        System.out.println(b);

        Map<String,Integer> map1= new HashMap<>();
        map1.put("value",20);
        Map<String,Integer> map2= new HashMap<>();
        map1=map2;
        System.out.println(map1);
        System.out.println(map2);
        map1.put("value",42);

        System.out.println(map1);
        System.out.println(map2);

    }
}
