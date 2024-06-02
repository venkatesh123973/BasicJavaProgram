package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class List123 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("bat","womenn","kings");
        names.add("virat");
        System.out.println("After adding one name" +names);
        System.out.println("After getting one name" + names.get(0));
        names.set(1,"dhoni");
        System.out.println("After setting one name" +names);
        names.add(2,"rohit");
        System.out.println("After adding one name" +names);


    }
}
