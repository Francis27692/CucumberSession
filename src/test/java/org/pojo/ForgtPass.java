package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgtPass extends BaseClass {
	
	public ForgtPass() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotPass;
	
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement enterEmail;
	
	@FindBy(xpath="//button[@name='did_submit']")
	private WebElement btnSearch;

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	

}
