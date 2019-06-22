import org.junit.Test;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class WritingPricesTest extends BaseTest {
    @Test
    public void writingPrices() throws IOException, InterruptedException {
        sleep(2000);
        mainPage.getAllPrices();
        mainPage.getPricesToFile();
    }
}
