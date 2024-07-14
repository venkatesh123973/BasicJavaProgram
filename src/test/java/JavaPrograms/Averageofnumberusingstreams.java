package JavaPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Averageofnumberusingstreams {

    @Test
    public void average(){

        List<Integer> averge= Arrays.asList(1,2,3,45,7);
        double dou=averge.stream().map(e->e*e).filter(e->e<10).mapToInt(e->e).average().getAsDouble();
        System.out.println(dou);
    }
}
