package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
// Control+Shift+o


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json" },
		features = "/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/CucumberProjAug21/Feature"
				//features = "/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/CucumberProjAug21/Feature/myexperiments.feature"
		,glue={"StepDefination"},
monochrome=true
//,dryRun=true
		)
public class Runner {

}
