import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Link;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class OTP_Validation {

    @Test
     public void testExample() throws MailosaurException, IOException {
        // Available in the API tab of a server
        String apiKey = "D4wrg93MgnOM4u7HAcqX2wHe9hov2DvI";
        String serverId = "jyde6vjw";
        String serverDomain = "jyde6vjw.mailosaur.net";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo("spite-hungry@" + serverDomain);

        Message message = mailosaur.messages().get(params, criteria);
        System.out.println(message.subject());
        System.out.println(message.to().get(0).email());
        System.out.println(message.from().get(0).email());
        System.out.println(message.cc());
        //check body content
        System.out.println(message.text().body());
        // check links
       System.out.println(message.html().links().size()); // 2

       Link firstLink = message.html().links().get(0);
       System.out.println(firstLink.text()); // "Google Search"
       System.out.println(firstLink.href()); // "https://www.google.com/"


        Assert.assertNotNull(message);
        Assert.assertEquals("Testing for Email Alert", message.subject());
    }
}
