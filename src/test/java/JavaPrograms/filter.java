package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class filter {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4);
        num.stream().filter(num1->num1>2).forEach(System.out::println);
    }
}
