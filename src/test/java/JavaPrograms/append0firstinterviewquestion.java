package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class append0firstinterviewquestion {

    public static void main(String[] args) {
     int num[] = {1,2,0,4,0,5};
     int start =0;

     for(int i=0;i<num.length;i++) {
         if (num[i] != 0) {
             num[start] = num[i];
             start++;
         }
     }
         for(int i = start;i<num.length;i++){

             num[i]=0;


         }
         for(Integer output:num){
             System.out.println(output);
         }

    }

}
