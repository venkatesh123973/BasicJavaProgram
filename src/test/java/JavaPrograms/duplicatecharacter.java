package JavaPrograms;

import java.util.HashMap;

public class duplicatecharacter {

    public static void main(String[] args) {

        String name = "laptoppo";

        Integer count = 1;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] arr=name.toCharArray();
        for(int i=0; i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],count);
        }

        else{
            map.put(arr[i],map.get(arr[i])+1);
        }
    }
        System.out.println(map);
        for(Character X: map.keySet()){
            if(map.get(X)==1){
                System.out.println(X +" " +map.get(X));
            }
        }
    }


}
