package Comparatorpack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class student {

    private String name;
    private int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        student stu = new student("rohan",3);
        student stu1 = new student("kisan",1);
        student st2= new student("rahul",4);
        List<student> studentList = Arrays.asList(stu,stu1,st2);

        studentList.stream().filter(n->n.getId()>1).map(n1->n1.getName()).forEach(System.out::println);
//        Collections.sort(studentList,new comparatorc());
//
//        for(student s:studentList){
//            System.out.println(s);
//        }

    }
}
