package Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class priority {

    @Test(priority = 0)
    public void firstmethod(){
        System.out.println("Priority 1");
    }
    @Test
    public void secondmethod(){
        System.out.println("Priority 2");
    }
   @Test
    public void thirdmethod(){
        System.out.println("Priority 3");
    }
}
