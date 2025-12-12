package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Registration extends login{
	@CacheLookup
	@FindBy(xpath="//a[text()=\"New User Register Here\"]")
	private WebElement createAct;
	
	@CacheLookup
	@FindBy(id="username")
	private WebElement username;
	
	@CacheLookup
	@FindBy(id="password")
	private WebElement password;
	
	@CacheLookup
	@FindBy(id="re_password")
	private WebElement repass;
	
	@CacheLookup
	@FindBy(id="full_name")
	private WebElement fullname;
	
	@CacheLookup
	@FindBy(id="email_add")
	private WebElement email;
	
	@CacheLookup
	@FindBy(id="tnc_box")
	private WebElement check;
	
	
	@CacheLookup
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCreateAct() {
		return createAct;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCheck() {
		return check;
	}
	
	
	
	
	

}
