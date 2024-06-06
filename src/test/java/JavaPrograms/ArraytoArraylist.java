package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {

    public static void main(String[] args) {

        Integer num[] = {1,2,3,4,5};

        List<Integer> numlist = Arrays.asList(num);
        System.out.println(numlist);

        //suppose if we want to add more number in the array then we need to some modification in the scripts

        List<Integer> addnewnumlist= new ArrayList<>(Arrays.asList(num));
        addnewnumlist.add(6);
        addnewnumlist.add(7);
        System.out.println(addnewnumlist);
    }
}
