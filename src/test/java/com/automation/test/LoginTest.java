package com.automation.test;



import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;


public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void verifyUSerCanLoginWithValidCredentials() {
		
		
		
		logp.openWebsite();
		logp.dologin(ConfigReader.getConfigValue("username"), ConfigReader.getConfigValue("password"));
		
		assertTrue(hmp.isHomePageDisplayed(),"Home page is not loaded");
		
	}

	@Test
	public void verifyUSerCanLogout() {
		//=new LoginPage(driver);
		
		logp.openWebsite();
		logp.dologin(ConfigReader.getConfigValue("username"), ConfigReader.getConfigValue("password"));
		
		//hmp=new HomePage(driver);
		assertTrue(hmp.isHomePageDisplayed(),"Home page is not loaded");
		
		
		hmp.clickOnBurgerMenu();
		hmp.clickOnLogout();
		
		assertTrue(logp.isLoginPageDisplayed(),"Login page is not loaded properly");
		 
		

		// assertTrue(//call method.isDisplayed());
		
	}
}
