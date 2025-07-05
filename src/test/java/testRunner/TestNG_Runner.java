package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/featureFiles/firstPrograme2.feature", //firstPrograme2.feature
		dryRun=true,
		glue="stepDefinations",
		monochrome=true,
//		tags="@SmokeTest or @RegressionTest"
		plugin={"pretty","html:Reports/Cucumber1.html","json:Reports/Cucumber1.json"}
		)

public class TestNG_Runner extends AbstractTestNGCucumberTests{

}

/* features - Showing the path for feature file which will execute it.
 * druRun- Basically it checks: Steps in the feature file is implemented into the stepDefination or not
 * glue - Telling that where the stepDefinations are mentioned 
 * monochrome - Able to read the reporting in the o/p
 * tags - mentioned the tags which you want to execute
 * plugin={"pretty (For Colorful report)","html:specify the folder path where you want this report stored"}
 */