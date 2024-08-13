package Project_Sel;

import org.apache.poi.ss.formula.functions.Value;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;

public class textBox {

    WebDriver D;
    String url = "https://www.leafground.com/select.xhtml";

    @BeforeTest
    public void setUp() {
        D = new ChromeDriver();
        D.get(url);
        D.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        //D.close();
    }

    @Test
    public void test1() throws InterruptedException {
        D.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a/i[1]")).click();
        D.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a/span")).click();

        //Type your name
        D.findElement(By.xpath("//form[@id='j_idt88']/div/div/input")).sendKeys("Logeshwaran");
        Thread.sleep(2000);

        //Append Country to this City.
        D.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys(" India");

        //Verify if text box is disabled
        boolean text = D.findElement(By.xpath("//form[@id= 'j_idt88']/div[3]")).isEnabled();
        System.out.println(text);

        //Clear the typed text.
        WebElement textBox = D.findElement(By.id("j_idt88:j_idt95"));
        textBox.clear();

        //Retrieve the typed text.
        WebElement text1 = D.findElement(By.id("j_idt88:j_idt97"));
        String textBox1 = text1.getAttribute("value");
        System.out.println(textBox1);

        //Type email and Tab. Confirm control moved to next element.
        WebElement emailBox = D.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
        emailBox.sendKeys("lokeshdharan1996@gmail.com");
        emailBox.sendKeys(Keys.TAB);

        //About yourself
        D.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"))
                .sendKeys("Hi, I'm Logeshwaran G, a " +
                        "passionate and detail-oriented Test Engineer with over 2.6 years of experience " +
                        "in the software testing industry. " +
                        "I have a strong background in both manual and automation");

        //Just press enter and confirm the error message
       WebElement enter =  D.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
       enter.sendKeys(Keys.ENTER);
       WebElement errorMsg = D.findElement(By.xpath("//div[@id='j_idt106:thisform:j_idt110']/div/span[2]"));
        // Check if the error message is displayed
        if (errorMsg.isDisplayed()){
            System.out.println(errorMsg.getText());
        }else {
            System.out.println("Error Message not displayed");
        }

        //Click and Confirm Label Position Changes

        //get initial position
        WebElement label = D.findElement(By.xpath("//label[@id='j_idt106:j_idt113']"));
        Point initialPosition = label.getLocation();
        D.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
        Thread.sleep(3000);
        //New position
        Point newPosition = label.getLocation();
        Assert.assertNotEquals(newPosition,initialPosition );
        System.out.println("Initial Position Value is  " + initialPosition);
        System.out.println("New Position Value is  " + newPosition);
    }
}