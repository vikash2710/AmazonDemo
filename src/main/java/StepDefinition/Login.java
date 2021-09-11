package StepDefinition;


import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import io.cucumber.java.en.Given;


public class Login extends TestBase {
	
	
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user login into the website$")
	public void user_login_into_the_web() throws Throwable 
	{
		TestBase.initialization();
		loginpage = new LoginPage();
		String title = loginpage.ValidateLoginPageTitle();
		System.out.print("Login Page Title is " + title + "\n");
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		String Hometitle = homepage.ValidateHomePageTitle();
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", Hometitle);
		System.out.print("\n" + "Home Page Title is " + Hometitle + "\n" + "Login Succesfully" + "\n");
	}
}
