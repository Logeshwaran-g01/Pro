package Project_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropDown {

    WebDriver driver;
    String url ="https://www.leafground.com/select.xhtml";

    @BeforeTest
    public void setUp(){
       driver = new ChromeDriver();
       driver.get(url);
       driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        //driver.close();

    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a/i[1]")).click();
        driver.findElement(By.xpath("//li[@id='menuform:m_dropdown']//a/span")).click();
        //Locate the dropdown element
        WebElement dd =  driver.findElement(By.xpath("//form[@id='j_idt87']/div/div/div/div/div/select"));
        Select dropDown = new Select(dd);
        dropDown.selectByIndex(1);
        Thread.sleep(2000);

        //Choose your preferred country
        driver.findElement(By.xpath("//*[@id=\"j_idt87:country_label\"]")).click();
        driver.findElement(By.xpath("//ul[@id='j_idt87:country_items']/li[4]")).click();


    }
}
