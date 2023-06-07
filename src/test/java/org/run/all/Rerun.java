package org.run.all;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun:failedscenarios\\\\failed.txt")
public class Rerun {
	

}
