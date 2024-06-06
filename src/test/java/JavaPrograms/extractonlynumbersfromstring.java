package JavaPrograms;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractonlynumbersfromstring {

    @Test
    public void numbers(){

        String s = "Javalearning123";
        Pattern pattern = Pattern.compile("\\d+"); // Regex pattern to match one or more digits
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            String output = matcher.group(); // Extracting the matched digits
            System.out.println("Output: " + output);
        } else {
            System.out.println("No numeric part found in the string.");
        }
    }
    }

