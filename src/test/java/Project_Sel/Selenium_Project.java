package Project_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium_Project {
    // creating new instance of the chrome driver
    WebDriver driver;
    String url = "https://www.google.com";

    @BeforeTest
    public void setUp() {
         driver = new ChromeDriver();
         driver.get(url);
         driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown() {
        driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        Thread.sleep(2000);
        String results = driver.getPageSource();
        boolean result = results.contains("Selenium Browser Driver");
        Assert.assertEquals(result, true);
    }

}