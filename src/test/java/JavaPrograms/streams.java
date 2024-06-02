package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {

        List names = Arrays.asList("Reflection","Collection","Stream");
        names.stream().sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        numbers.stream().map(n->n*n).forEach(System.out::println);
    }
}
