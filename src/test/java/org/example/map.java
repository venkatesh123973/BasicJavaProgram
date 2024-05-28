package org.example;

import java.util.HashMap;

public class map {

    public final void name1(){
        System.out.println("print name");
    }

    public final void name1(String name){
        System.out.println("print name 1");
    }

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();
        map.put("name","ven");
        map.put("name","ven1");
        System.out.println(map);

        map m= new map();
        m.name1();


    }
}
