package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
}