package org.example;

import java.util.Arrays;

public class comparable implements Comparable<comparable> {

    String firstname;
    String lastname;

    public comparable(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "comparable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public int compareTo(comparable o) {
        if (this.firstname.compareTo(o.firstname) != 0) {
            return this.firstname.compareTo(o.firstname);
        }
     else {
         return this.lastname.compareTo(o.lastname);
        }

    }

    public static void main(String[] args) {
        comparable cm[] = new comparable[4];
        cm[0]= new comparable("king","khan");
        cm[1]= new comparable("kohli","virat");
        cm[2]=new comparable("kh","kl");
        cm[3]=new comparable("klo","loh");
        Arrays.sort(cm);

        for(comparable x:cm){
            System.out.println(x);
        }


    }
}
