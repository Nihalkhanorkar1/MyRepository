package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v101.browser.Browser;

import Browser.browser;

public class AddtoCart extends browser { 

	
	
	
	public static void openbrowser() {
        browser.openBrowser();
       
    }
    public static void Enterurl(String a)
    {
        browser.OpenURL(a);
    }
    public static void Selecting_an_item_to_buy() {
        try
        {
            driver.findElement(By.xpath("//img[@title=\"iPhone\"]")).click();   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void  click_on_add_to_cart()
   
    {
        try
        {
            driver.findElement(By.id("button-cart")).click();   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void Item_should_be_added_to_cart()
    {
        try
        {
            driver.findElement(By.className("d-none d-md-inline")).click();   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
	
	
	
	
	

