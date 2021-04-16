package com.palo.techtest.Runner;
import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;



@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        jsonUsageReport = "target/cucumber-usage.json",
        usageReport = true,
        toPDF = true,
        screenShotSize="600px",
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target/")

@CucumberOptions
		(
		plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",   "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
		glue = "com/palo/techtest/StepDefinition", 
		features = "src/test/java/com/palo/techtest/Feature/Smoke",  
		tags = {"@TC1"}, 
		monochrome = true,
		dryRun = false
		)
public class CucumberRunnerTest  {                                                                                                                                    

}

