package Project_Sel;

import Pages.DatePickerPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    WebDriver date;
    String url ="https://jqueryui.com/datepicker/";
    DatePickerPage datePickerPage;

    @BeforeTest
    public void setUp() {
        date = new ChromeDriver();
        date.get(url);
        date.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        date.manage().window().maximize();
        datePickerPage = new DatePickerPage(date);
    }

    @AfterTest
    public void tearDown(){
        //date.close();
    }
}
