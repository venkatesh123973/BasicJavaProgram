package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;

public class waitinselenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.name("q"))));
//        wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//        driver.switchTo().activeElement().sendKeys("venkat");
//      -- Fluent wait
        Wait<WebDriver> wait1 = new<WebDriver> FluentWait(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);
        WebElement foo=wait1.until(new Function <WebDriver, WebElement>() {

            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.name("btnK"));
            }

        });

        foo.submit();

        StringBuilder builder = new StringBuilder("name");
        builder.append("name2");



}}
