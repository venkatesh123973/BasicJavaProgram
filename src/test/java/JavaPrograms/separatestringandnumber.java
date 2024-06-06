package JavaPrograms;

import org.testng.annotations.Test;

public class separatestringandnumber {

    @Test
    public void stringandnumber(){
        String input = "javalearning2020";
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                letters.append(c);
            }
        }

        System.out.println("Output: [" + letters.toString() + "][" + digits.toString() + "]");
    }
    }
