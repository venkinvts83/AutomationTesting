package Utils;

import PageObjects.LandingPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;

public class GenericUtils {

    WebDriver driver;
    WebDriverWait wait;

    public GenericUtils(WebDriver driver,WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;
    }
    public void switchToChild()
    {
        wait.until(d -> d.getWindowHandles().size() > 1);

        Iterator<String> i1 = driver.getWindowHandles().iterator();
        String parent = i1.next();
        System.out.println(parent);
        String child = i1.next();
        driver.switchTo().window(child);

    }
}
