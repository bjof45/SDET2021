package home;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class MainTest {
    public WebDriver driver = null;
    @BeforeMethod

    public void first() {
        System.setProperty("webdriver.chrome.driver", "/Users/berrykix/development/school/SeleniumIntroJan2021/driver/chromedriver");
        driver = new ChromeDriver();

        System.out.println("Before test....");
        driver.get("https://www.amazon.com/");
    }

    @AfterMethod

    public void last() {
        System.out.println("After test");
        driver.quit();
    }

}
