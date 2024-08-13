package Project_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SnapDeal {
    WebDriver d;
    String url = "http://www.snapdeal.com";

    @BeforeTest
    public void setUp(){
        d = new ChromeDriver();
        d .get(url);
        d.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        //d.close();
    }

    @Test
    public void test1() throws InterruptedException {
       WebElement we = d.findElement(By.className("accountUserName"));
        Actions actions = new Actions(d);
        actions.moveToElement(we).click().perform();
        d.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")).click();
        Thread.sleep(5000);

        //After clicking login button it's asking OTP so that we couldn't able to move forward.
    }
}
