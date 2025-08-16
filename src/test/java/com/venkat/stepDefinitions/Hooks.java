package com.venkat.stepDefinitions;

import Utils.TestContext;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {

    TestContext testContext;
    public Hooks(TestContext testContext) {
        this.testContext=testContext;
    }

   // WebDriver driver;
    @After
    public void afterScenaro(){

        testContext.testBase.getDriver().quit();
    }
}
