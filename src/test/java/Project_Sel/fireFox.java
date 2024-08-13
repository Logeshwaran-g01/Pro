package Project_Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fireFox {
    WebDriver div;
    String url = "http://google.com";

    @BeforeTest
    public void setUp(){
        div = new FirefoxDriver();
        div = new ChromeDriver();
        div.get(url);
        div.manage().window().maximize();
    }
    @AfterTest
    public void tearDown(){
        div.close();
    }
    @Test
    public void test1() throws InterruptedException {
     String text = div.getCurrentUrl();
        System.out.print("The Current url is: "+ text);
     div.navigate().refresh();
     Thread.sleep(5000);

    }
}
