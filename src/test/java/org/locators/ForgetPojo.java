package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPojo extends BaseClass{
	public ForgetPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Forgotten password?")
	private WebElement clickLink;
	
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement enterNumber;

	@FindBy(xpath="//button[text()='Search']")
	private WebElement clickSearchBtn;
	
	@FindBy(xpath="//a[text()='Close']")
	private WebElement clickClose;
	
	
	public WebElement getClickLink() {
		return clickLink;
	}

	public WebElement getEnterNumber() {
		return enterNumber;
	}

	public WebElement getClickSearchBtn() {
		return clickSearchBtn;
	}

	public WebElement getClickClose() {
		return clickClose;
	}

}
