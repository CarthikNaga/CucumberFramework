package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "@target/failed_scenario.txt"
        ,glue = "stepDefinitions"
        ,plugin = {"pretty", "html:target/cuucmber.html",
        "json:target/cuucmber.json"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true




)




public class FailedTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public  Object[][] scenarios(){
        return super.scenarios();
    }


}
