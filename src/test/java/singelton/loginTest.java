package singelton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTest {
    private WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    public void setup(String browser){
       driver= WebDriverManager.getInstance(browser).getDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void google(){
        driver.get("https://www.google.com");
        System.out.println(Thread.currentThread().getName()+ ":"+driver.getTitle() );
    }

    @AfterClass
    public void tearDown(){
        WebDriverManager.quitWebdriver();
    }
}
