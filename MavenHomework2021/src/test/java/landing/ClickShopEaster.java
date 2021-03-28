package landing;

import home.MainTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class ClickShopEaster extends MainTest {

    @Test
    public void Easter() {
        System.out.println("Doing clickshopeaster");
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement element : elements) {
            if(element.getText().equals("Shop Easter")) {
                System.out.println("Found Shop Easter");
                element.click();
                break;
            }
        }
        System.out.println("Currently on: "+driver.getCurrentUrl());
         if(!driver.getCurrentUrl().contains("Easter"))
             System.out.println("If we dont land on a link with Easter in url, we failed");
    }

}
