package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class predicate {

    private String name;
    private int age;

    public predicate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        predicate virat= new predicate("Kohli",28);
        predicate Ms= new predicate("Dhoni",30);
        predicate roh= new predicate("rohit",32);

        List<predicate> namelist= Arrays.asList(virat,Ms,roh);
        namelist.forEach(nam->System.out.println(nam));
       List<String> name= namelist.stream().filter(num->num.getAge()>30).map(pm->pm.getName()).collect(Collectors.toList());
        System.out.println(name);



    }
}
