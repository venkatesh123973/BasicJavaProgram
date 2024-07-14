package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class printnumberstartingwithprefix {

    @Test
    public void startwithprefix(){

        List<Integer> prefix= Arrays.asList(2,223,331,278,444);
        prefix.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer::valueOf).forEach(System.out::println);
    }
}
