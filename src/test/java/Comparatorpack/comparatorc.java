package Comparatorpack;

import java.util.Comparator;

public class comparatorc implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        if(o1.getName().compareTo(o2.getName())!=0){
            return o1.getName().compareTo(o2.getName());
        }
        else{
            return o1.getId()-o2.getId();
        }
    }
}
