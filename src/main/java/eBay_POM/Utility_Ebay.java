package eBay_POM;




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility_Ebay 
{
	public static void implicitWait(WebDriver driver,int ms)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(ms));
		Reporter.log("waiting for "+ms+" ms", true);
	}
	
	//comment added in utility
}
