package StepDefinition;

import com.pages.HomePage;
import com.pages.ItemPage;
import com.pages.SerachResultPage;
import com.util.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchandadditems extends TestBase {
	
	SerachResultPage serachresultpage;
	HomePage homepage;
	ItemPage itempage;
	
	@When("^search for Apple Watch$")
	
	public void search_for_Apple_Watch() throws Throwable
	{
		
		homepage = new HomePage();
		serachresultpage = homepage.itemlist();	
	}
	
	@Then("^user select New Apple Watch SE (GPS, 40mm) - Space Grey Aluminium Case with Black Sport Band$")
	
	public void user_select_item() throws Throwable
	{
		
		serachresultpage = new SerachResultPage();
		itempage = serachresultpage.searchitem();	
	}

}
