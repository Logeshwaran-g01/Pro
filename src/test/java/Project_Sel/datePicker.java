package Project_Sel;

import Pages.DatePickerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class datePicker extends BaseTest {
    String url ="https://jqueryui.com/datepicker/";

    @Test
    public void test1(){

        //Using Frame
        date.switchTo().frame(0);
        //Using Explicit wait to data picker table
        datePickerPage.tableEle.click();
        WebDriverWait wait = new WebDriverWait(date,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']")));
        //Selecting Month
        datePickerPage.monthEle.click();
        //Selecting date and print the attributes
        datePickerPage.dateEle.click();
        String str = datePickerPage.inputEle.getAttribute("value");
        System.out.println(str);


    }
}
