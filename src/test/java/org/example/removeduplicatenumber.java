package org.example;

import java.util.*;
import java.util.function.Function;

public class removeduplicatenumber {
    public static void main(String args[]) {
        List<Integer> num = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);
         int total =num.size();

        int min2=num.stream().min(Comparator.naturalOrder()).orElse(null);
        System.out.println(min2);

        Function<List<Integer>,Set<Integer>> duplicate1= HashSet::new;
        System.out.println(duplicate1.apply(num));



        TreeSet<Integer> set1 = new TreeSet<Integer>();
        set1.addAll(num);

      Iterator duplicate=  set1.iterator();
      while(duplicate.hasNext()){
          System.out.println(duplicate.next());
      }

    }

}
