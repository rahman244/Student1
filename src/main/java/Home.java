import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Home {

        System.setProperty("webdriver.chrome.driver", "/Users/papia/Desktop/Student/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.executeautomation.com/demosite/Login.html  "); // For dropdown



}
