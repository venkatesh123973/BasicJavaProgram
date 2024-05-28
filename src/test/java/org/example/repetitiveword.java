package org.example;

public class repetitiveword {

    public static void main (String args[]) {
        String name = "My computer is computer";
        String reversed = "";
        String[] name1 = name.split(" ");

        for(int i=0;i<name1.length;i++){

            for(int j=i+1; j<name1.length;j++){
                if (name1[i]==name1[j]){
                    System.out.println(reversed=reversed+name1[i]);
                }
            }
        }

    }
}


