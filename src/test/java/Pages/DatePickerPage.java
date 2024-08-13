package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage {

    private WebDriver date;

    public DatePickerPage(WebDriver date){
        this.date = date;
        PageFactory.initElements(date,this);
    }

    @FindBy(xpath = "//input[@id='datepicker']")
    public  WebElement tableEle;


    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    public WebElement monthEle;

    @FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[4]/td[7]/a")
    public WebElement dateEle;

    @FindBy(xpath = "//input[@id='datepicker']")
    public WebElement inputEle;
}
