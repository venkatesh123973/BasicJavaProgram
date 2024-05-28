package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {

    public static void foreachfun(){
        List<String> foreachfunction = Arrays.asList("venkat","Esh","Kannan");
        foreachfunction.forEach(str->System.out.println(str));
    }

    public static void usingAnonymous(){
        Consumer<String> consumerexample= new Consumer<String>(){

            @Override
            public void accept(String input) {
                System.out.println(input);
            }
        };consumerexample.accept("Vanakkam");
    }

    public static void usinglambda(){
        Consumer<String> example2=input-> System.out.println(input);
        example2.accept("vanakkam lambda");
    }

    public static void main(String[] args) {
        usingAnonymous();
        usinglambda();
        foreachfun();
    }
}
