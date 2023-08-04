package eBay_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage_EBay 
{

	@FindBy(xpath = "//span[contains(text(),'Irresistible luxury')]") private WebElement text;
	@FindBy(xpath = "(//a[text()='Sign in'])[1]") private WebElement signIN;
	@FindBy(css = "button#gh-ug") private WebElement profile;
	@FindBy(xpath = "//a[text()='Sign out']") private WebElement signOut;
	
	public HomePage_EBay(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String gettingText(WebDriver driver)
	{
		String actualText = text.getText();
		
		Reporter.log(actualText, true);
		Utility_Ebay.implicitWait(driver, 1000);
		return actualText;
	}
	
	public void movingToElement(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(signIN).perform();
		Reporter.log("Move to Element SignIn Button", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
	
	public void clickSignIn(WebDriver driver)
	{
		signIN.click();
		Reporter.log("Clicking on SignIn", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
	
	public void moveToProfile(WebDriver driver)
	{
		Actions act =new Actions(driver);
		act.moveToElement(profile).perform();
		
		Reporter.log("move to profile", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
	public void clickOnSignOut(WebDriver driver)
	{
		signOut.click();
		Reporter.log("Click on SignOut", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
}
