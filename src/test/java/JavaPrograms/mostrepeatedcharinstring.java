package JavaPrograms;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class mostrepeatedcharinstring {

    @Test
    public void mostcharacterinstring(){

        Integer count =1;
        int maxcount =0;
        char mostrepeated= ' ';
        String name = "aabbbcd";
        char[] ch = name.toCharArray();
        Map<Character,Integer> map= new HashMap<Character,Integer>();

        for(int i=0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],count);
            }

            else{
                map.put(ch[i],map.get(ch[i])+1);
            }

        }

        for (Map.Entry<Character,Integer> words:map.entrySet()) {
            if(words.getValue()>maxcount){
                mostrepeated = words.getKey();
                maxcount = words.getValue();
            }

        }
        System.out.println("Most repeated char " + mostrepeated + " most repeated word count" +maxcount);
    }
}
