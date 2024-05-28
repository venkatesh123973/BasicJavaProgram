package org.example;

public class BiPredicate {

    public static void main(String[] args) {

        java.util.function.BiPredicate<String,String> prec1=(firstname,lastname)->{
            return lastname.length()>0;
        };
        System.out.println(prec1.test("Rahul",""));

        java.util.function.BiPredicate<String,String> prec2=(firstname,lastname)->{
            return lastname.equalsIgnoreCase(firstname);
        }; System.out.println(prec1.test("Rahul",""));
    }



}


