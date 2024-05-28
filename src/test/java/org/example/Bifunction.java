package org.example;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Bifunction {

    public static void main(String[] args) {

        List<String> superherosfirstname = Arrays.asList("Bat","Super","Spider","Bat");
        List<String> superherossubname = Arrays.asList("Man","Women","Man");
        List<String> combineherosname = new ArrayList<String>();
//
//        for(int i=0; i<superherosfirstname.size();i++){
//
//            combineherosname.add(superherosfirstname.get(i) + "" +superherossubname.get(i));
//        }

        Set<String> dupnames=superherosfirstname.stream().collect(Collectors.toSet());
        System.out.println(dupnames);

        Map<String,Integer> names=superherosfirstname.stream().collect(Collectors.toMap(name->name,String::length));
        System.out.println(names);

        System.out.println(combineherosname);

//        Object[] ob=superherosfirstname.toArray();
//        System.out.println(ob.length);
//        for(int i=0;i< ob.length;i++){
//            System.out.println(ob[i]);
//        }

//        BiFunction<List<String>,List<String>, List<String>> combinename = (superheros1,superheros2)->{
//            for(int i=0;i<superherosfirstname.size();i++){
//                 combineherosname.add(superherosfirstname.get(i)+superherossubname.get(i));
//            }
//            return combineherosname;
//        };
//        System.out.println(combinename.apply(superherosfirstname,superherossubname));
//    }
}}
