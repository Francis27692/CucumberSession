package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin extends BaseClass {
	
	public FBLogin() {
		PageFactory.initElements(driver, this);

	}
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtmail;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public WebElement getTxtmail() {
		return txtmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
