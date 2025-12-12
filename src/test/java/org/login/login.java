package org.login;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass{
	
	public login() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="username")
	private WebElement user;
	
	@CacheLookup
	@FindBy(id="password")
	private WebElement pass;
	
	@CacheLookup
	@FindBy(id="login")
	private WebElement loginbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
