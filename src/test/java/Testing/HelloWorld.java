package Testing;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) {

        String str = "javaa" ;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Integer count =1;

//        char[] ch = str.toCharArray();

        for(int i=0;i<str.length(); i++){

            if(!map.containsKey(str.charAt(i))){

                map.put(str.charAt(i),count);
            }

            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }

            for(Map.Entry<Character,Integer> X :map.entrySet()){
                if(X.getValue()!=1){
                    System.out.println(X.getKey());
                    break;
                }
            }
        }

    }
}
