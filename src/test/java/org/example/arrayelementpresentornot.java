package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class arrayelementpresentornot {

    public static void element(int num) {
        int a[] = {1, 2, 3, 4};
        boolean flag = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                flag=true;
                System.out.println("Number found" +"" +num);
                break;
            }
//            System.out.println("Number found" +num);
            else {
                flag=false;
                System.out.println("Number is not found" + "" +num);
                break;
            }
        }

    }

    public static void usingArray(){
        int a[] = {1,2,3};
        int num=3;
        boolean resu=Arrays.stream(a).anyMatch(ele->ele==num);
        boolean resu2=IntStream.of(a).anyMatch(ele->ele==num);
        System.out.println(resu);
        System.out.println(resu2);

    }

    public static void main(String args[]) {
      element(31);
      usingArray();
    }

}
