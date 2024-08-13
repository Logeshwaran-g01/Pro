package Project_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class guvi_Login {
    WebDriver Dr;
    String url = "https://www.guvi.in/";

    @BeforeTest
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        Dr = new ChromeDriver(options);
        Dr.get(url);
        Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Dr.manage().window().maximize();
    }
    @AfterTest
    public void tearDown(){
        //Dr.close();
    }
    @Test
    public void test1() throws InterruptedException {

        //Login
        //Css Selector locator
        Dr.findElement(By.cssSelector("a[class='nav-link  text-primary text-center px-4']")).click();
        // ID Locator
        Dr.findElement(By.id("email")).sendKeys("lokeshdharan1996@gmail.com");
        //xpath Locator
        Dr.findElement(By.xpath("//input[@type='password']")).sendKeys("Lokki@0412");
        Thread.sleep(2000);
        //ClassName Locator
        Dr.findElement(By.className("mr-2")).click();
        Thread.sleep(2000);
        // ID Locator
        Dr.findElement(By.id("login-btn")).click();
        Thread.sleep(2000);
        //tagName Locator
        String str = Dr.findElement(By.xpath("//h1[@class='font-weight-bold mr-auto']")).getText();
        if(str.equals("Online Courses")){
            System.out.println("Login Successfully");
        }else{
            System.out.println("Login Failed");
        }
        //Assert.assertEquals(str, "Ready to Level Up?");
        //System.out.println(str);



}
}
