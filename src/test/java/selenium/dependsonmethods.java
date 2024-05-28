package selenium;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class dependsonmethods {
    @Test(dependsOnMethods = {"secondmethod"})
    public void depend(){
        System.out.println("depend method will executed");
    }

    @Test(priority = 0)
    public void secondmethod(){
        System.out.println("second method will executed");
    }
}
