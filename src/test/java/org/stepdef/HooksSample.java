package org.stepdef;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksSample extends BaseClass {
	@Before
	public void beforetc() {
		openChromeBrowser();
		applyImplicitWait();
	}
	@After
	public void afterTc(Scenario s ) throws IOException {
		String name = s.getName();
		String scenarioname = name.replace(" ", "-");
		takeScreenShot(scenarioname);
		
		if (s.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot)driver;
		byte[] failedImage = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(failedImage, "img/png");
		}
	closeBrowser();
	
	}
}
