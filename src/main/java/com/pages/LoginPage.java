package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.util.TestBase;

public class LoginPage extends TestBase {
	
	
//	PageFactory
	
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement AccountList;
	
	@FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
	WebElement SignIn;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement Continue;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement SignInSubmit;
	
//	Initializing the page object
	
	public LoginPage() {
			PageFactory.initElements(driver, this);
	}
	
//	Action
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public HomePage login(String id, String pwd) throws Throwable {
		Actions action=new Actions(driver);
		action.moveToElement(AccountList).perform();
		SignIn.click();
		Email.sendKeys(id);
		Continue.click();
		Password.sendKeys(pwd);
		SignInSubmit.click();
//		Continue.click();
		Thread.sleep(3000);
//		Popup.click();
		
		
		
		return new HomePage();
	}

}
	
