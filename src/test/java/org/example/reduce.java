package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class reduce {

    public static void main (String[] args){

        List<Integer> number= Arrays.asList(1,2,3,4);
        int resu=number.stream().reduce(0,(sum,ele)->sum+ele);
        System.out.println(resu);

        Optional<Integer> num3=number.stream().reduce((num1, num2)->Math.min(num1,num2));
        System.out.println(num3.get());

        List<String> name1= Arrays.asList("tiger","cow","ox");
        boolean res2=name1.stream().anyMatch(str->str.equals("tiger"));
        System.out.println(res2);

        name1.stream().skip(1).forEach(str->System.out.println(str));

        List<Integer> name4=name1.stream().map(Str->Str.length()).collect(Collectors.toList());
        name4.forEach(pr-> System.out.println(pr));
    }
}
