package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenlink {

     @Test
       public void test() throws IOException {
         WebDriver driver = new ChromeDriver();
             driver.get("https://anthem.com");
             List<WebElement> links = driver.findElements(By.tagName("a"));


// Iterating each link and checking the response status
             for (WebElement link : links) {
                 String url = link.getAttribute("href");
                 verifyLink(url);
             }
         }

         public static void verifyLink(String url) {
             try {
                 URL link = new URL(url);
                 HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
                 httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
                 httpURLConnection.connect();


                 if (httpURLConnection.getResponseCode() == 200) {
                     System.out.println(url + " - " + httpURLConnection.getResponseMessage());
                 } else {
                     System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
                 }
             } catch (Exception e) {
                 System.out.println(url + " - " + "is a broken link");
             }
         }
     }