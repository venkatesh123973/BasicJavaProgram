package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class firstnotrepetive {
    public static void main(String args[]) {
        String name3 = "javaj";
        Integer count = 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < name3.length(); i++) {
            if (!map.containsKey(name3.charAt(i))){
                map.put(name3.charAt(i),count);
            }

            else{
                map.put(name3.charAt(i),map.get(name3.charAt(i))+1);
            }

            for(Map.Entry<Character,Integer> X :map.entrySet()){
                if(X.getValue()==1){
                    System.out.println(X.getKey());
                    break;
                }
            }
        }
    }

}
