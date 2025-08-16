package PageObjects;

import Utils.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObjects {
public WebDriver driver;

    public LandingPageObjects(WebDriver driver) {
        this.driver=driver;
    }

    By serachBox = By.xpath("//input[@type='search']");
    //By searchButton = By.cssSelector(".search-button");
    By productName = By.xpath("//h4[@class='product-name']");
    By offerPage=By.xpath("//a[@href='#/offers']");

    public void searchProduct(String product) {
        driver.findElement(serachBox).sendKeys(product);
    }

    public String getSearchText()
    {
        String pName = driver.findElement(productName).getText().split("-")[0].trim();
        return pName;
    }
    public By getProductNameLocator()
    {
        return productName;
    }
    public By getSearchBoxLocator()
    {
        return serachBox;
    }
    public void getOffersPage()
    {
        driver.findElement(offerPage).click();
    }
}
