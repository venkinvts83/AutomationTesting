package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {


    LandingPageObjects landingPageObjects;
    OfferPageObjects offerPageObjects;
    public WebDriver driver;
    public PageObjectManager(WebDriver driver) {
        this.driver=driver;
    }


    public LandingPageObjects getLandingPageObjects() {
        LandingPageObjects landingPageObjects=new LandingPageObjects(driver);
        return landingPageObjects;
    }

    public OfferPageObjects getOfferPageObjects() {
        OfferPageObjects offerPageObjects= new OfferPageObjects(driver);
        return offerPageObjects;
    }
}
