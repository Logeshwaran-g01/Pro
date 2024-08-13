package Project_Sel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoBlaze {
    WebDriver driver;
    String url = "https://www.demoblaze.com/";
    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
    @AfterTest
    public void tearDown(){
        driver.close();

    }
    @Test
    public void test1() throws InterruptedException {
        //get title of the webpage
        String actualTitle = driver.getTitle();
        //Expected title of the page
        String expectedTitle = "STORE";
        Thread.sleep(3000);

        //verify and print title of the page

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Page landed on correct website");
        }else {
            System.out.println("Page is not landed on correct website");
        }



    }
}
