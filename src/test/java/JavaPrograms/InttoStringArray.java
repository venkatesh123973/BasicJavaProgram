package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

public class InttoStringArray {

    @Test
    public void inttostring(){

        int[] arr = {1,2,3,4,5};

        String[] str=Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        for(String inttostr:str){
            System.out.println(inttostr);
        }


    }
}
