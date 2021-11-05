package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;

  @FindBy(xpath="//input[@id='Email']")
  @CacheLookup
  WebElement txtclremail;
  
  @FindBy(xpath="//input[@id='Password']")
  @CacheLookup
  WebElement txtclrpass;

	public void setusername(String uname) {
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void clickLogout() {
		lnkLogout.click();
	}
	
	public void TextClearE()
	{
		txtclremail.clear();
	}
	
	public void TextClearP()
	{
		txtclrpass.clear();
	}
	
	
}
