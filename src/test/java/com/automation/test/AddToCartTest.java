package com.automation.test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.automation.utils.ConfigReader;

public class AddToCartTest extends BaseTest
{

	@Test
	public void verifyAddtoCart() throws InterruptedException {
		logp.openWebsite();
		logp.dologin(ConfigReader.getConfigValue("username"), ConfigReader.getConfigValue("password"));
		
		assertTrue(hmp.isHomePageDisplayed(),"Home page is not loaded");
		
		hmp.clickOnAddToCart();
		Thread.sleep(2000);
		assertEquals("1",hmp.isCountIsDisplayed());
	
	}
	
	
}
