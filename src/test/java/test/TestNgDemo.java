package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

@Test
public class TestNgDemo {
    WebDriver driver;
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://google.com");
    }

    public void tearDown(){
        driver.close();
    }
}
