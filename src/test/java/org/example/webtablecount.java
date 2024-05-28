package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablecount {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        int rowCount =driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        int columnCOunt= driver.findElements(By.xpath("//table[@id='customers']//th")).size();

        for(int i =1;i<rowCount;i++){

            for(int j=1;j<=columnCOunt;j++){

               String counttname= driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
                System.out.println(counttname);
               if(counttname.equals("Alfreds Futterkiste")){
                   System.out.println(i+ ":" +j);
                   break;
               }
            }
        }
    }
}
