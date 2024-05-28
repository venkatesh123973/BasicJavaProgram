package org.example;

import java.util.Arrays;
import java.util.List;

public class SplitTCS {

    public static void main(String[] args) {

        String input = "Test_12, Te_3, Tesy_4";

        // Split the string based on comma
        String[] parts = input.split(", ");

        // Create an array to store the numbers
        int[] numbers = new int[parts.length];

        // Extract numbers after underscore, convert to integers, and store them in the array
        for (int i = 0; i < parts.length; i++) {
            String[] subParts = parts[i].split("_");
//            System.out.println(subParts[1]);
            numbers[i] = Integer.parseInt(subParts[1].trim());
        }

        // Sort the numbers
        Arrays.sort(numbers);

        for(Integer num:numbers){
            System.out.println(num);
        }

        // Construct the sorted string
//        StringBuilder sortedString = new StringBuilder();
//        for (int i = 0; i < numbers.length; i++) {
//            sortedString.append(numbers[i]);
//            if (i < numbers.length - 1) {
//                sortedString.append(", ");
//            }
        }

//        System.out.println("Sorted numbers: " + sortedString.toString());

    }

