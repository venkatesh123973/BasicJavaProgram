package Comparatorpack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortusinglastcharacter {


    public static void main(String[] args) {
        List<String> sorting = Arrays.asList("venkat","Ashwina","suzukiz");
        Collections.sort(sorting, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char lastchar = o1.charAt(o1.length()-1);
                char lastchar2 = o2.charAt(o2.length()-1);
                return Character.compare(lastchar,lastchar2);
            }
        });

        System.out.println("Sorted using Collections.sort(): " + sorting);
    }
}
