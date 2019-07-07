package Test;

import helpers.MailSender;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class WritingPricesTest extends BaseTest {
    @Test
    public void writingPrices() throws IOException, InterruptedException {
        sleep(2000);
        mainPage.getAllPrices();
        mainPage.getPricesToFile();
        ArrayList<String> files1 = new ArrayList<>();
        files1.add( "/home/sanitarskiy/IdeaProjects/QALight_PricesToFile_PageObject/prices.txt");
        files1.add( "/home/sanitarskiy/IdeaProjects/QALight_PricesToFile_PageObject/pom.xml");
        MailSender.mailFromfile("emails.txt", "123QWEqwe", "this message is for test attach files", files1);
 
    }
}
