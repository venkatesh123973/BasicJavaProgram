package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class highlight {

//    @Test (enabled = false)
//    public void highlight() throws IOException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.manage().window().maximize();
//        WebElement search = driver.findElement(By.name("btnK"));
//        JavascriptExecutor executor =(JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",search);
//        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
//        File Destfile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File Srcfile = new File ("target/test.png");
//        FileUtils.copyFile(Destfile,Srcfile);
//
//
//    }
    @Test(priority = 0,enabled = true)
    public void test(){
        System.out.println("priority 0");
    }

    @Test(priority = 1,enabled = true)
    public void test1(){
        System.out.println("priority 1");
    }

    @Test(priority = -1,enabled = true)
    public void test2(){
        System.out.println("priority -1");
    }

    @Test(priority = -2,invocationCount = 2)
    public void test3(){
        System.out.println("priority -2");
    }

    @Test(timeOut = 1000)
    public void test4(){
        System.out.println("default priority");
    }
}
