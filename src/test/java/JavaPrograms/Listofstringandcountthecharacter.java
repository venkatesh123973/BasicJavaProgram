package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listofstringandcountthecharacter {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("Venkatesh","Kannan","abc","xyz","abc");
        Integer count = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j=0;j<names.size();j++){
            char ch[]= names.get(j).toCharArray();
            for(int i=0;i<ch.length;i++){
                if(!map.containsKey(ch[i])){
                    map.put(ch[i],count);
                }

                else{
                    map.put(ch[i],map.get(ch[i])+1);
                }
            }

        }

        for(Map.Entry<Character,Integer> words:map.entrySet()){
            System.out.println(words);
        }
    }

}
