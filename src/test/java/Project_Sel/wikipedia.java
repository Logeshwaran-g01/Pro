package Project_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class wikipedia {
    WebDriver driver;
    String url = "https://demoqa.com/automation-practice-form";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown(){
       // driver.close();
    }
    @Test
    public void test1() throws InterruptedException, IOException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("uploadPicture"))).click().perform();
        Runtime.getRuntime().exec("C:\\Users\\pjai0\\OneDrive\\Desktop\\Demoau3.exe");
        Thread.sleep(5000);
    }
}
//https://www.leafground.com/select.xhtml
