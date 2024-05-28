package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class arraycount {

    public static int[] array(int a,int b){
        return IntStream.rangeClosed(a,b).toArray();
    }

    public static void main (String args[]){
        System.out.println(Arrays.toString(array(4,7)));
    }
}
