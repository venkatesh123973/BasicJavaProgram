package selenium;

import org.testng.annotations.Test;

public class invocationTimeOut {

    @Test(invocationCount = 5,invocationTimeOut = 3000)
    public void intest() throws InterruptedException {
        System.out.println("Passed");
        Thread.sleep(1000);
    }

    @Test(description = "hello")
    public void description(){

    }
}
