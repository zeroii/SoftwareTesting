import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class SimpleTestTest {
    WebDriver driver;

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","F:/Program Files/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test(){

       driver.get("https://baidu.com/");
        System.out.println("Home page title:"+driver.getTitle());
        WebElement element = driver.findElement(By.cssSelector("#kw"));
        element.sendKeys("Software Testing");
        element.submit();

        driver.manage().window().maximize();
        driver.navigate().back();

        WebElement e = driver.findElement(By.id("kw"));
        e.sendKeys("/$#%");
        e.clear();

        WebElement input = driver.findElement(By.id("kw"));
        input.sendKeys("selenium");
        driver.findElement(By.id("su")).click();

    }

    @After
    public void setDown() throws Exception{
        Thread.sleep(10000);
        driver.close();
    }
}