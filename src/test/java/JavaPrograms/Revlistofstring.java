package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Revlistofstring {

    public static void main(String[] args) {

       List<String> list= Arrays.asList("venkat","Kannan","Name");
       String revword="";
       for(int i=0;i<list.size();i++){
           String rev=list.get(i);
           String revstring="";
           for(int j=rev.length()-1;j>=0;j--){
               revstring=revstring+rev.charAt(j);
           }

           revword=revword+revstring;
       }
      System.out.println(revword);

    }
}
