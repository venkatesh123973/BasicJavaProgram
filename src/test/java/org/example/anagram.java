package org.example;

import java.util.Arrays;

public class anagram {

    public static void main (String args[]){
        String name1= "Mary";
        String name2= "arMy";

        char[] ch1=name1.toLowerCase().toCharArray();
        char[] ch2=name2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram string");

        }

        else{
            System.out.println("Anagram is not string");
        }


    }
}
