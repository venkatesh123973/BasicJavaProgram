package OTPScenarios;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPusinggrowapp {

    String apiKey = "D4wrg93MgnOM4u7HAcqX2wHe9hov2DvI";
    String serverId = "jyde6vjw";
    String serverDomain = "jyde6vjw.mailosaur.net";

    public String getemail(){

        return "user" +System.currentTimeMillis()+ serverDomain;
    }

    @Test
    public void growapp() throws MailosaurException, IOException {
        String email = getemail();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://groww.in/login");
        driver.findElement(By.id("login_email1")).sendKeys(email);
        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo("test-possible@" + serverDomain);

        Message message = mailosaur.messages().get(params, criteria);
        String subject=message.subject();
        System.out.println(subject);

        //gettheOTP
        Pattern pattern =Pattern.compile("Your email verification OTP is .*([0-9]{6}).*");
        Matcher matcher =pattern.matcher(subject);
        matcher.find();
        String otp=matcher.group(1);
        System.out.println(otp);



    }

}
