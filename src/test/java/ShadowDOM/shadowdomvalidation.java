package ShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shadowdomvalidation {

    @Test
    public void shaddom(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/shadowdom");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = (WebElement) js.executeScript("return document.querySelector(\"#shadow-host\").shadowRoot.querySelector(\"#my-btn\")");
        String textContent = (String) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].textContent;", element);
        System.out.println("Text content is " +textContent);
        driver.quit();
    }
}
