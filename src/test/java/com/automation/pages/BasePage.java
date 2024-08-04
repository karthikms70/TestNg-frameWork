package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.DriverManager;

public class BasePage {
	

	WebDriver driver;
	
	public BasePage() {
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
