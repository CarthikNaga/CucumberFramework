package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/java/features"
        ,glue = "stepDefinitions"
        ,plugin = {"pretty", "html:target/cuucmber.html",
        "json:target/cuucmber.json"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        , "rerun:target/failed_scenario.txt"}
        ,monochrome = true
        //,dryRun = true
        ,tags = "@PlaceOrder or @OfferPage"


)




public class TestNGTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public  Object[][] scenarios(){
        return super.scenarios();
    }


}
