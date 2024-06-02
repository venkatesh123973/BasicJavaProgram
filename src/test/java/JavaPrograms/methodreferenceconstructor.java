package JavaPrograms;

import java.util.*;
import java.util.function.Function;

public class methodreferenceconstructor {

    public static void main (String args[]){

        List<String> superheros= Arrays.asList("batman","superman","spiderman","batman");

        Function<List<String>, Set<String>> removingduplicateheros = TreeSet::new;
        System.out.println(removingduplicateheros.apply(superheros));
    }
}
