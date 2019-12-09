import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Rahman {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/papia/Desktop/Student/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        //builder = new Actions(driver);
        //wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("http://demo.guru99.com/test/radio.html"); // For radio btn
        driver.get("http://demo.guru99.com/test/newtours/register.php"); // For dropdown

        driver.findElement (By. xpath("//input[@name=\"firstName\"]")).sendKeys("peya");
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("peu");
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("45678");
        driver.findElement(By.xpath("//input[@name=\"phone\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("pe@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"userName\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("address");
        driver.findElement(By.xpath("//input[@name=\"address1\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("New york");
        driver.findElement(By.xpath("//input[@name=\"city\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Jamaica");
        driver.findElement(By.xpath("//input[@name=\"state\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("8322");
        driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).click();

        driver.findElement(By.xpath("//select[@name=\"country\"]"));

        Select sel =new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
sel.selectByVisibleText("BANGLADESH");

        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("User name");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("confirmPassword");
        driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).click();

        driver.findElement(By.xpath("//input[@name=\"submit\"]")).sendKeys("submit");
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

        driver.findElement(By.xpath("")).clear();
        driver.close();
    }
}





