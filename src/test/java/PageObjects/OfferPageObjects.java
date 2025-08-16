package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageObjects {

    public WebDriver driver;
    public OfferPageObjects(WebDriver driver) {
        this.driver=driver;
    }

    By searchBox=By.xpath("//input[@type='search']");
    By prodctName=By.cssSelector("tr td:nth-child(1)");

    public void searchProduct(String product)
    {
        driver.findElement(searchBox).sendKeys(product);

    }
    public String getProduct()
    {
        return driver.findElement(prodctName).getText();
    }
}
