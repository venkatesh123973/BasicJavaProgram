package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class locationofelement {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement googlesearchbutton=driver.findElement(By.xpath("(//*[@aria-label='Google Search'])[2]"));
        WebElement search=driver.findElement(RelativeLocator.with(By.id("APjFqb")).above(googlesearchbutton));
        //find height and width of the element

        Dimension dimension=search.getSize();
        int height=dimension.getHeight();
        System.out.println(height);
        int width=dimension.getWidth();
        System.out.println(width);

        //find x and y coordinaates of the element

        Point point=search.getLocation();
        System.out.println(point.getX());
        System.out.println(point.getY());

        //getreact method

      Rectangle rectangle=  search.getRect();
        System.out.println(rectangle.getX());
        driver.close();


    }
}
