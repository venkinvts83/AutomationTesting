package com.venkat.stepDefinitions;

import PageObjects.LandingPageObjects;
import PageObjects.PageObjectManager;
import Utils.TestContext;
import io.cucumber.java.en.And;
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

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class LandingPageStepDefinitions {

    public WebDriver driver;
    public String pName;
    public String opName;
    public WebDriverWait wait;
    TestContext testContext;

    public LandingPageStepDefinitions(TestContext testContext) {
        this.testContext=testContext;
    }


    @Given("User is on landing page")
    public void user_is_on_landing_page() {
//        testContext.driver=new ChromeDriver();
//        testContext.driver.get("https://venkatesh.com/seleniumPractise/#/");
//        testContext.wait = new WebDriverWait(testContext.driver,  Duration.ofSeconds(10));
    }

    @When("^user searched with short name (.+) and extracted actual name of product$")
    public void user_searched_with_short_name_and_extracted_actual_name_of_product(String product) throws InterruptedException {

        LandingPageObjects landingPageObjects=testContext.pageObjectManager.getLandingPageObjects();

        testContext.wait.until(ExpectedConditions.elementToBeClickable(landingPageObjects.getSearchBoxLocator()));
        landingPageObjects.searchProduct(product);
        testContext.wait.until(ExpectedConditions.textToBePresentInElementLocated(landingPageObjects.getProductNameLocator(),product));
       // Thread.sleep(1000);
        testContext.pName=landingPageObjects.getSearchText();
       // testContext.driver.findElement(By.cssSelector(".search-button"));
       // Thread.sleep(3000);
        System.out.println(testContext.pName);
    }


}
