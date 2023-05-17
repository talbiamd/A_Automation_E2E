package atech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		plugin = {"pretty","json:target/cucumber.json"},
		features = {".//Features/"},
		glue = {"atech.ny.stepdefinations","atech.ny.hooks"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	


}
