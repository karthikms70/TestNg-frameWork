package com.automation.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(id="react-burger-menu-btn")
	WebElement breadCrumIcon;

	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	

	@FindBy(css =".product_sort_container")
	WebElement drpdwn;
	

	@FindBy(css =".shopping_cart_link")
	WebElement crticn ;
	
	
	@FindBy(id ="add-to-cart-sauce-labs-backpack")
	WebElement adtcrtbtn ;
	
	@FindBy(xpath = "//div[@id=\"shopping_cart_container\"]/a/span")
	WebElement count ;
	
	
	public void clickOnBurgerMenu() {
	
		 breadCrumIcon.click();
		 
	}
	
	public void clickOnLogout() {

		 logout.click();
	}
	
	public boolean isHomePageDisplayed() {
		 
		 return drpdwn.isDisplayed() && crticn.isDisplayed();
		 //assertTrue(crticn.isDisplayed(),"Cart icon is not displayed");
	}
	
	public void clickOnAddToCart() {
		
		adtcrtbtn.click();
	}
	
	public String isCountIsDisplayed() {
	  return count.getText();
	}
	
}
