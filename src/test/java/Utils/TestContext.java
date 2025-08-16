package Utils;

import PageObjects.PageObjectManager;
import PageObjects.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestContext {

    public String pName;
    public String opName;
    public WebDriverWait wait;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestContext() {

        testBase=new TestBase();
        pageObjectManager=new PageObjectManager(testBase.getDriver());
        wait=testBase.getWait();
        genericUtils=new GenericUtils(testBase.getDriver(),wait);
        System.out.println("text context initialized");
    }
}
