package JavaPrograms;

import java.util.Arrays;
import java.util.List;

public class filterstudentgreaterthan40 {

    public static void main(String[] args) {
        studentgreaterthan40 student= new studentgreaterthan40("Ram",40);
        studentgreaterthan40 student1= new studentgreaterthan40("Ashoka",60);
        studentgreaterthan40 student2= new studentgreaterthan40("Hishore",70);

        List<studentgreaterthan40> listofstudent= Arrays.asList(student,student1,student2);
        listofstudent.stream().filter(age->age.getAge()>40).map(name->name.getName()).forEach(System.out::println);
    }
}
