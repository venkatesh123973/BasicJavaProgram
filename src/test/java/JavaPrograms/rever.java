package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class rever {

    public static void main (String args[]){
        String name = "literal";
        String reversed = "";
        StringBuffer reversedname = new StringBuffer();
        reversedname.reverse();

        char[] ch = name.toCharArray();

//        for(int i =ch.length-1;i>=0;i--){
//            reversed=reversed+ch[i];
//
//        }
//        System.out.println(reversed);

        List<Character> usingcollectionreverse = new ArrayList<Character>();

        for(Character char1: ch)
        {
            usingcollectionreverse.add(char1);
        }

        Collections.reverse(usingcollectionreverse);
        ListIterator It = usingcollectionreverse.listIterator();
        while(It.hasNext()){
            System.out.println(It.next());
        }


    }
}
