//package org.example;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.TreeSet;
//
//public class chrome {
//
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://automationpractice.com/index.php");
//        driver.manage().window().maximize();
//        WebElement footer= driver.findElement(By.xpath("//*[@id=\"footer\"]"));
//        List<WebElement> footlinks = footer.findElements(By.tagName("a"));
//        TreeSet<String> tree=new TreeSet<String>();
//
//        System.out.println("Total Links is :" +footlinks.size());
//        for (WebElement ele : footlinks) {
//            String man=ele.getText();
//           String man1= ele.getAttribute("href");
//            System.out.println("Total Links is "+man+man1);
//        }
//        for (WebElement sort : footlinks) {
//            tree.add(sort.getText());
//
//            for (String name : tree) {
//                System.out.println(name);
//            }
//        }
//
//        WebElement footer1= driver.findElement(By.xpath("//*[@id=\"social_block\"]"));
//        List<WebElement> footlinks1 = footer1.findElements(By.tagName("a"));
//        System.out.println("Total Links is :" +footlinks1.size());
//    }
//
//}
