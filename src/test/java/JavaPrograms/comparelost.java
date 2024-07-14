package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class comparelost {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("B");
        list2.add("D");

        // Find elements in list1 that are not in list2
        List<String> differences1 = new ArrayList<>(list1);
        differences1.removeAll(list2);
        System.out.println("Elements in list1 not in list2: " + differences1);

        // Find elements in list2 that are not in list1
        List<String> differences2 = new ArrayList<>(list2);
        differences2.removeAll(list1);
        System.out.println("Elements in list2 not in list1: " + differences2);

        // Find common elements
        List<String> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        System.out.println("Common elements: " + commonElements);
    }
    }
