package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class actionclasspractice {

    @Test
    public void action(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement admin= driver.findElement(By.name("username"));
        Actions actions = new Actions(driver);
        actions.moveToElement(admin).sendKeys("admin").perform();



    }

    @Test
    public void google(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.switchTo().activeElement().sendKeys("Testing" + Keys.ENTER);
        WebElement next=driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(next).click(next).build().perform();
        actions.pause(Duration.ofSeconds(20));


    }
}
