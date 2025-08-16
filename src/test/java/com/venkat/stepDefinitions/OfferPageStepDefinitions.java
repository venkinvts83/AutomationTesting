package com.venkat.stepDefinitions;

import PageObjects.LandingPageObjects;
import PageObjects.OfferPageObjects;
import Utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;

public class OfferPageStepDefinitions {

    WebDriver driver;

    public OfferPageStepDefinitions(TestContext testContext) {
        this.testContext=testContext;
    }

    String pName;
    String opName;
    WebDriverWait wait;
    TestContext testContext;

    @Then("^user searched for the same short name (.+) in offers page to check if product exists$")
    public void user_searched_for_the_same_short_name_in_offers_page_to_check_if_product_exists(String product) throws InterruptedException {

        swithToOffersPage();
        By sel = By.xpath("//input[@type='search']");
        WebElement searchBox = testContext.wait.until(ExpectedConditions.visibilityOfElementLocated(sel));
        System.out.println(product);
        OfferPageObjects offerPageObjects=testContext.pageObjectManager.getOfferPageObjects();
        testContext.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("tr td:nth-child(1)")));
        offerPageObjects.searchProduct(product);
        testContext.opName = offerPageObjects.getProduct();


    }

    @Then("validate product name matches with offers page product name")
    public void validate_product_name_matches_with_offers_page_product_name() {
        System.out.println(testContext.pName);
        System.out.println(testContext.opName);
        Assert.assertEquals(testContext.pName, testContext.opName);
    }

    public void swithToOffersPage()
    {
        LandingPageObjects landingPageObjects=testContext.pageObjectManager.getLandingPageObjects();
        landingPageObjects.getOffersPage();

        testContext.genericUtils.switchToChild();
    }

}
