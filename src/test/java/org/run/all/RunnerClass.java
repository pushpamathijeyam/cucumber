package org.run.all;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Featurefiles", glue = "org.stepdef", monochrome = true, strict = true, dryRun = false, plugin = {
		"pretty", "html:reporting\\html report", "json:reporting\\json report\\fb.json",
		"junit:reporting\\junit report\\facebook.xml","rerun:FailedScenarios\\Failed.txt"})
public class RunnerClass {
	@AfterClass
	public static void afterAllScenarios() {
		JvmReportGeneration.generateBddReport("reporting\\json report\\fb.json");

	}
}
