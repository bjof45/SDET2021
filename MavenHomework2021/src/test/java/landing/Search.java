package landing;

import home.MainTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Search extends MainTest {

    @Test
    public void search() {
        System.out.println("Doing search");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kid mask", Keys.ENTER);

    }

}
