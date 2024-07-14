package JavaPrograms;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class printduplicatenumberusingstreams {

    @Test
    public void duplicate() {
        List<Integer> duplicatenumber = Arrays.asList(1, 3, 3, 5, 2, 4, 1, 6, 7, 3);
        Set<Integer> dup=duplicatenumber.stream().filter(e->Collections.frequency(duplicatenumber,e)>1).collect(Collectors.toSet());
        System.out.println(dup);
    }

    @Test
    public void setusingduplicate(){
        List<Integer> duplicatenumber = Arrays.asList(1, 3, 3, 5, 2, 4, 1, 6, 7, 3);
        Set<Integer> setduplicate= new HashSet<>();
        Set<Integer> dup=duplicatenumber.stream().filter(e->!setduplicate.add(e)).collect(Collectors.toSet());
        System.out.println(dup);

    }

}
