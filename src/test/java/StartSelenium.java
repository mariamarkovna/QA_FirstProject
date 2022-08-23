import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void findElementsByTagTest() {
        //find element by tag
        WebElement element = wd.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1= wd.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        //find list of elements

        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        //find element by classname

        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container.getText());

        //find element by id
        wd.findElement(By.id("root"));




    }

    @AfterMethod (enabled = true)
    public void tearDown() {
        wd.quit();
    }



}
