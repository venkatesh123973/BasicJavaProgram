package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(selenium.alter.class)
public class Parallelexecution {

    @Parameters({"Browser"})
    @Test
    public void Chromegooglepage(String browserName){
        if(browserName.equals("chrome")){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        Reporter.log("Browser is opened");
        driver.manage().window().maximize();
        Reporter.log("Opened successfully");
        driver.navigate().refresh();
    }
        else if (browserName.equals("edge")){
            WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        }

//    @Test
//    public void edgegooglepage(){
//        WebDriver driver = new EdgeDriver();
//        driver.navigate().to("https://www.google.com");
//        driver.manage().window().maximize();
//        driver.navigate().refresh();
//    }
}}
