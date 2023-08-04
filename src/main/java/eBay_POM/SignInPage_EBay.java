package eBay_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage_EBay 
{

	@FindBy(css = "input#userid") protected WebElement userId;
	@FindBy(css = "button#signin-continue-btn") protected WebElement cont;
	@FindBy(css = "input#pass") protected WebElement pass;
	@FindBy(css = "button#sgnBt") protected WebElement signInButton;
	public SignInPage_EBay(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserId(WebDriver driver)
	{
		userId.sendKeys("udaysangle89@gmail.com");
		Reporter.log("Entering user id", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
	
	public void clickContbutton(WebDriver driver)
	{
		cont.click();
		Reporter.log("Click on Cont button", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
	
	public void enterPassword(WebDriver driver)
	{
		pass.sendKeys("Ashu@143");
		Reporter.log("Entering user Password", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
	public void clickSignInButton(WebDriver driver)
	{
		signInButton.click();
		Reporter.log("click on signIn Button", true);
		Utility_Ebay.implicitWait(driver, 1000);
	}
}
