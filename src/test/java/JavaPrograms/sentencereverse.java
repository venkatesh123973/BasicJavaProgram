package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class sentencereverse {

    public static void main (String args[]){
        String name = "My computer is computer";
        String reversed ="";
        String[] name1=name.split(" ");
      for(int i =name1.length-1;i>=0;i--){
          reversed= reversed+name1[i];
      }
        System.out.println(reversed);

    }
}
