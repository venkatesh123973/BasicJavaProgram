package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class filterstream {

    public static void main (String args[]){

        List<Integer> totalnumber= Arrays.asList(1,2,3,4,5,6);
        totalnumber.stream().filter(num->num<=3).forEach(num1-> System.out.println(num1));

        Function<String,String> uppercase= String::toUpperCase;
        System.out.println(uppercase.apply("kalai"));

    }
}
