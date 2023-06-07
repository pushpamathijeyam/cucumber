package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBys({ @FindBy(id = "email"), 
	@FindBy(xpath = "//input[@type='text']") })
	private WebElement emailID;
	
	@FindAll({ @FindBy(id = "pass"),
	@FindBy(xpath = "//input[@type='password']") })
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement butnlogin;

	public WebElement getEmailID() {
		return emailID;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButnlogin() {
		return butnlogin;
	}

}
