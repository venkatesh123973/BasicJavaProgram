package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class comparatot implements Comparable<comparatot>{

    String name;
    int id;

    @Override
    public String toString() {
        return "comparatot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public comparatot(String name, int id){
        this.name=name;
        this.id=id;

    }




    @Override
    public int compareTo(comparatot o) {
        if(id==o.id){
            return 0;
        }
        else if(id>this.id){
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<comparatot> lis= new ArrayList<comparatot>();
        lis.add(new comparatot("diva",10));
        lis.add(new comparatot("prasath",11));

        Collections.sort(lis);

        for(comparatot x:lis){
            System.out.println(x);
        }
    }
}

