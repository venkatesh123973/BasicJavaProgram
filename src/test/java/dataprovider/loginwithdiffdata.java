package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginwithdiffdata {


    @Test(dataProvider = "getexceldata",dataProviderClass = dataproviderusingexcel.class)
    public void loginorangehrm(String userName, String Password){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    };
    @Test(dataProvider = "logindetails",dataProviderClass = basedataprovider.class)
    public void printloginorangehrmnameandpassword(String userName, String Password){

        System.out.println("Username" +userName+ "Password" +Password);
    }

}
