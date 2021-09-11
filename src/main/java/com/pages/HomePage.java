package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class HomePage extends TestBase {
	
	
	
	// Page factory
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement SubmitButton;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
}

	public String ValidateHomePageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	
	public SerachResultPage itemlist() throws Throwable {
		Thread.sleep(3000);
		SearchBar.sendKeys("Apple Watch");
		SubmitButton.click();
		
		return new SerachResultPage();	
		
		
	}
	
	
	

}
