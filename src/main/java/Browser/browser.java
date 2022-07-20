package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.DemoLog;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports extents = new ExtentReports();
	public static ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/extentreport1.html");
	public static WebDriver openBrowser() 
	
	{
		DemoLog.Sample(2);
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenBrowserTest");
		 logger.log(Status.INFO,"Opening The Browser");
			try 
		{
			DemoLog.Sample(1);
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		        driver.manage().window().maximize();
		   
		        wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(50));
		        logger.log(Status.PASS,"Browser is opened successuflly");
			
		}
		catch (Exception e)
		
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			}return driver;
		
		}
	public static void OpenURL(String web_url)
	{
		try 
		{
		
			
			
			
		driver.get(web_url);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name( "search")));
	//Thread.sleep(2000);
		}
		catch (Exception e)
		{
	e.printStackTrace();
	}
	}
	public static String GetTitle()
	{
		String abcd = driver.getTitle();
		return abcd;
			
	}
	public static void BrowserClose() throws Throwable
	{
		Thread.sleep(2000);
	driver.close();
}}