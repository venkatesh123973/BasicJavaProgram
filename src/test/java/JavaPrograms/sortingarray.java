package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sortingarray {

    @Test
    public void array(){

        String name = "venky";
        System.out.println(name.charAt(1));

        List<Integer> numbers = Arrays.asList(8,9,10,12,11);
        Optional<Integer> lar=numbers.stream().reduce(Integer::max);
        System.out.println(lar.get());
//        Collections.sort(numbers);
//        for (Integer sortednumbers:numbers) {
//            System.out.println(sortednumbers);
//        }
//
//        List<Integer> length =numbers.stream().limit(4).collect(Collectors.toList());
//        System.out.println(length.size());
    }


}
