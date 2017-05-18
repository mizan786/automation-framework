package base;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Set;

/**
 * Created by Mizan on 5/6/2017.
 */
public class CommonAPI {
   public WebDriver driver = null;
   @Before
   public void setUp(){
       System.setProperty("Webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\\");
       driver = new FirefoxDriver();
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();

   }




}
