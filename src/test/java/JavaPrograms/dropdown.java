//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//
//
//public class dropdown {
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://demoqa.com/radio-button");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        int num =0;
////        WebDriverWait wait = new WebDriverWait(driver,30);
////        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio' and @id='yesRadio']//following::label[1]")));
//////        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio' and @id='impressiveRadio']//following::label[1]")));
////        element.click();
//////       element1.click();
//////
//        Wait<WebDriver> wait1 =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchFieldException.class);
//           wait1.until(new Function<WebDriver, Object>() {
//               @Override
//               public Object apply(WebDriver webDriver) {
//                   return null;
//               }
//           })
////        WebElement sel=driver.findElement(By.xpath("//input[@type='radio' and @id='yesRadio']"));
////        boolean ele12 =sel.isSelected();
//////        boolean ele1 =element1.isSelected();
////        if(ele12 ==true){
////            num++;
////        }
////
////        System.out.println(num);
////
////
////
////
////
////
//////        System.out.println(num1);
////    }
////}
//
//
