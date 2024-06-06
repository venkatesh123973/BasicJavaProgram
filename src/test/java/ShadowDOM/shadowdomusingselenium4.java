package ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shadowdomusingselenium4 {

    @Test
    public void domusingselenium4(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/shadowdom");
        driver.manage().window().maximize();
        WebElement element = (WebElement) driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot()
                .findElement(By.cssSelector("#my-btn"));
        System.out.println(element.getText());
        driver.quit();

    }
}
