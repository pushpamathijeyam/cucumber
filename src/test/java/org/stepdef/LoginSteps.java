package org.stepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.locators.LoginPojo;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginSteps extends BaseClass {
	LoginPojo l;

	@Given("User have to be in fb login page")
	public void user_have_to_be_in_fb_login_page() {
		// openChromeBrowser();
		lanuchUrl("https://www.facebook.com/");
		maxWindow();
		// applyImplicitWait();
	}

	
	@When("Enter  invalid email and valid password")
	public void enter_invalid_email_and_valid_password(DataTable d) {
		l = new LoginPojo();
//		List<List<String>> alllist = d.asLists();
//		String email = alllist.get(1).get(2);
//		String passwd = alllist.get(2).get(1);
		List<Map<String, String>> allinput = d.asMaps();
		Map<String, String> mp = allinput.get(2);
		String s1 = mp.get("email");
		String s2 = mp.get("password");
		WebElement txtEmail = l.getEmailID();
		fillTextBox(txtEmail,s1);
		WebElement txtPwd = l.getPassword();
		fillTextBox(txtPwd,s2);

	}

	
	@When("Enter valid email and invalid password")
	public void enter_valid_email_and_invalid_password() throws IOException {
		l = new LoginPojo();
		WebElement txtEmail = l.getEmailID();
		fillTextBox(txtEmail, readDataFromExcel("adactin", 1, 2));
		WebElement txtPwd = l.getPassword();
		fillTextBox(txtPwd, readDataFromExcel("adactin", 1, 3));

	}

	@When("Enter  invalid email and invalid password")
	public void enter_invalid_email_and_invalid_password() throws IOException {
		l = new LoginPojo();
		WebElement txtEmail = l.getEmailID();
		fillTextBox(txtEmail, readDataFromExcel("adactin", 2, 4));
		WebElement txtPwd = l.getPassword();
		fillTextBox(txtPwd, readDataFromExcel("adactin", 1, 5));

	}

	@When("click login button")
	public void click_login_button() throws InterruptedException {
		WebElement btLogin = l.getButnlogin();
		toClickButton(btLogin);
		holdExecution(2000);
	}

	@Then("invalid credentils page")
	public void invalid_credentils_page() {
		String url = fetchUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("user is in invalid credentia page");

		} else {

			System.out.println("user is inalid credential page");

		}

	}

	@When("Enter  {string} and{string}")
	public void enter_and(String s1, String s2) {
		l = new LoginPojo();
		WebElement txtEmail = l.getEmailID();
		fillTextBox(txtEmail, s1);
		WebElement txtPwd = l.getPassword();
		fillTextBox(txtPwd, s2);
	}

	}

