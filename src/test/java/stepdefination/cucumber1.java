package stepdefination;

import Browser.browser;
import Pages.AddtoCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber1 {

	
	public static void openbrowser() {
	    browser.openBrowser();
	   
	}
	public static void Enterurl(String a)
	{
	    browser.OpenURL(a);
	}
	@Given("Selecting an item to buy")
	public void Selecting_an_item_to_buy() {
	    try{
	        AddtoCart.Selecting_an_item_to_buy();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}
	@When("click on add to cart")
	public static void  Click_add_to_cart1()
	    {
	   
	      try {
	        AddtoCart.click_on_add_to_cart();
	      }
	      catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	@Then("Item should be added to cart")
	public void ShoppingCart() {
	    try {
	        AddtoCart.Item_should_be_added_to_cart();
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}
	 
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
