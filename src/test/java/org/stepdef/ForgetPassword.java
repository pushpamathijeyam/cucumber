package org.stepdef;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Map;

import org.baseclass.BaseClass;
import org.locators.ForgetPojo;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ForgetPassword extends BaseClass {
	ForgetPojo f;

	@Given("user have to be in fb login page")
	public void user_have_to_be_in_fb_login_page() {
		//openChromeBrowser();
		lanuchUrl("https://www.facebook.com/");
		maxWindow();
	//	applyImplicitWait();
	}

	@Given("user  have to click forgotten password")
	public void user_have_to_click_forgotten_password() {
		f = new ForgetPojo();
		WebElement clickLink = f.getClickLink();
		toClickButton(clickLink);
	}

	@When("user have to enter invalid mobile number")
	public void user_have_to_enter_invalid_mobile_number(DataTable d) throws IOException {
		f = new ForgetPojo();
//		List<String> allData = d.asList();
//		String s1 = allData.get(4);
		Map<String, String> m = d.asMap(String.class,String.class);
		WebElement number = f.getEnterNumber();
		String s1 = m.get("email");
		fillTextBox(number,s1);
	}

	@When("user have to click search button")
	public void user_have_to_click_search_button() throws AWTException {
		f = new ForgetPojo();
		WebElement searchBtn = f.getClickSearchBtn();
		toClickButton(searchBtn);
			}

	@Then("user have to be in identity account page")
	public void user_have_to_be_in_identity_account_page() {
	//	f = new ForgetPojo();
		
		String title = fetchTitle();
		if (title.contains("identify")) {
			System.out.println("find your account page");
			
		} else {
			System.out.println("not in find your account page");

		}
	}

}
