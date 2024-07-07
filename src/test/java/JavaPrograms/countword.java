package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class countword {

    public static void main(String args[]) {

        String str = "I am a Engineer in a in Mepco";

        Integer count = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

//        for (Map.Entry<String, Integer> X : map.entrySet()) {
//            if (X.getValue()==1) {
//                System.out.println(X.getKey());
//            }


            for (String X1 : map.keySet()) {

                System.out.println(X1 + ":" + map.get(X1));
            }


        }

    }
