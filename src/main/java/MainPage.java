import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div [@class= \"course-price\"] /p [@class = \"course-value\"]")
    List<WebElement> pricesOfCourses;

    @FindBy(xpath = "//div [@class=\"course-holder-block\"]/a")
    WebElement moreCoursesButton;


    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void getAllPrices() {
        moreCoursesButton.click();
    }

    public void getPricesToFile() throws IOException {
        FileWriter writer = new FileWriter("prices.txt");
        int countOfElements = pricesOfCourses.size();
        int i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (i = 0; i < countOfElements; i++) {
            WebElement eachPrice = pricesOfCourses.get(i);
            String price = eachPrice.getText().replace(" грн","").replace(" ", "");
            int finalIntPrice = Integer.parseInt(price);
            al.add(finalIntPrice);
            }
        Collections.sort(al);
        for (int u = 0; u < countOfElements; u++) {
            int finalStrPrice = al.get(u);
            writer.write(finalStrPrice + System.getProperty("line.separator"));
        }
        writer.close();}
}