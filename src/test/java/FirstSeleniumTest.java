import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstSeleniumTest {

    WebDriver driver;
    // pered testami (before)-metod setUp()
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        driver.get("https://www.google.com/");
    }


    //sam test       (test)
    @Test
    public void openGoogleDrive(){
        System.out.println("Site opened!");
    }


    //posle testa    (after)-tearDown()-zakryt' brauser
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
        //driver.close():
    }

}
