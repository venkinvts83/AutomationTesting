package Options;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions (features = "src/test/resources/",glue = {"com.venkat.stepDefinitions"},monochrome =true, plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-reports.html"

})
public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
