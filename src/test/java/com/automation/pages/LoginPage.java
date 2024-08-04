package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(id="user-name")
	WebElement userName;
	

	@FindBy(id="password")
	WebElement password;
	

	@FindBy(id="login-button")
	WebElement signinBtn;
	
	
	
	public void dologin(String username,String pass) {
	 
		 userName.sendKeys(username);
		 password.sendKeys(pass);
		 signinBtn.click();
		 
		
	}
	
	public boolean isLoginPageDisplayed() {
		 
		return userName.isDisplayed();
		 

	}
	
	public void openWebsite() {
	
		driver.get("https://www.saucedemo.com");
		 
	}

}
