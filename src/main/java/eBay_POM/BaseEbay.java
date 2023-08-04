package eBay_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;



public class BaseEbay 
{
 protected static WebDriver driver;
 
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Important\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Utility_Ebay.implicitWait(driver, 1000);
		Reporter.log("Launching Browser", true);
	}
	public void closeBrowser()
	{
		Utility_Ebay.implicitWait(driver, 1500);
		Reporter.log("Closing Browser", true);
		driver.close();
		
	}
}
