package stepdefination;

import org.openqa.selenium.devtools.v101.browser.Browser;
import org.testng.Assert;

import Browser.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;
//import junit.framework.Assert;

public class cucumber {
	
	
	
	//@Given("open the browser.")
	@Given("open the browser")
    public void open_the_browser() {
        try {
          browser.openBrowser();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      
    }

 

    @When("Enter the {string}")
    public void enter_the(String string) 
    {
      try {
        browser.OpenURL( string  );
        
      }
      catch(Exception e)
        {
            e.printStackTrace();
        }
    }

 

   // @Then("Page is displayed.")
    @Then("Pages is displayed")
    public void page_is_displayed() throws Throwable {
        try {
            String actualTitle=browser.GetTitle();
            Assert.assertEquals("Your Store", actualTitle);
        }
        catch(AssertionError e) {
            e.printStackTrace();
        }
       browser.BrowserClose();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*@Given("open the Browser")
	public void open_the_browser() 
	{
		try
		{
		
		Browser.OpenBrowser();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}

	@When("Enter the {string}")
	public void enter_the(String string)
	{
		try {
			
		
		browser.OpenURL(string);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("Pages is displayed.")
	public void pages_is_displayed()
	{
	   try
	   {
		   String actualTitle = Browser.GetTitle();
		   Assert.assertEquals("https://www.google.com/",actualTitle); 
		   
	   } 
		catch (AssertionError e)
	   {
			e.printStackTrace();
	   }
	}
} */
