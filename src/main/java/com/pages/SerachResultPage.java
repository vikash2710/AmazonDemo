package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.util.TestBase;

public class SerachResultPage extends TestBase {
	
	
	// Page factory
	
		@FindBy(xpath = "//*[contains(text(),'New Apple Watch SE (GPS, 40mm) - Space Grey Alumin')]")
		WebElement SearchItem;
		
		@FindBy(xpath = "//input[@id='nav-search-submit-button']")
		WebElement SubmitButton;
	
	
	public SerachResultPage() {
		PageFactory.initElements(driver, this);
}
	
	
	
//	public ItemPage searchitem() throws Throwable {
//		Thread.sleep(3000);
//		SearchItem.click();
//		
//		return new ItemPage();	
//		
//		
//	}

	public ItemPage searchitem() {
		Object wait;
		wait.until(ExpectedConditions.presenceOfElementLocated(SearchItem)).click();
		return new ItemPage();
	}

}
