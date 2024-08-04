package com.automation.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;

public class BaseTest {
	
WebDriver driver;
LoginPage logp;
HomePage hmp;
	@BeforeMethod
	public void setUp() {
		ConfigReader.initConfig();
		DriverManager.createDriver();
		logp=new LoginPage();
		hmp=new HomePage();
	}
	
	@AfterMethod
	public void cleanUp() {
		DriverManager.getDriver().quit();
	}

}
