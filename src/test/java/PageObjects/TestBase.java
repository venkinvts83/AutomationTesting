package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase{


    private static final ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    //public WebDriver driver;
    public WebDriverWait wait;

    public static WebDriver getDriver() {
        String browserName = System.getProperty("browser", "chrome");
        if (browserName.equalsIgnoreCase("chrome")) {
            if (driver.get()==null) {
                driver.set(new ChromeDriver());
                driver.get().get("https://rahulshettyacademy.com/seleniumPractise/#/");
                System.out.println("get Driver called");

            }

        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (driver.get() == null) {
                driver.set(new FirefoxDriver());
                driver.get().get("https://rahulshettyacademy.com/seleniumPractise/#/");
                System.out.println("get Driver called");

            }


        }
        return driver.get();
    }

    public WebDriverWait getWait() {
        wait = new WebDriverWait(driver.get(), Duration.ofSeconds(10));
        System.out.println("get wait called");
        return wait;
    }
}
