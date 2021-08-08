package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue="StepDefination",
		plugin = {"html:target/cucmber-html-report","json:target/cucmber.json"},
		tags="@scroll"
	)	
public class CucumberRunner {

}
