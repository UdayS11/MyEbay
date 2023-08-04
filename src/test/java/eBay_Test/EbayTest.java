package eBay_Test;

import org.testng.annotations.Test;

import eBay_POM.BaseEbay;
import eBay_POM.HomePage_EBay;
import eBay_POM.SignInPage_EBay;

import org.testng.annotations.BeforeMethod;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class EbayTest extends BaseEbay
{
  HomePage_EBay home;
  SignInPage_EBay signIn;
  
  @BeforeClass
  public void launchingBrowser() 
  {  
  	 launchBrowser();
  	home=new HomePage_EBay(driver);
	signIn=new SignInPage_EBay(driver);
  }
  @BeforeMethod
  public void signIntoEbay() 
  {
  home.movingToElement(driver);
  
  home.clickSignIn(driver);
 
  signIn.enteruserId(driver);
 
  signIn.clickContbutton(driver);

  signIn.enterPassword(driver);
  
  signIn.clickSignInButton(driver);
  }
    @Test
    public void verifyText001() throws InterruptedException 
  {
     // home.gettingText(driver);
      Reporter.log("Running Tc", true);
      String expected="Irresistible luxury from head to toe" ;
      Assert.assertEquals(home.gettingText(driver), expected,"Not Matching TC Failed");
      Reporter.log("Actual & Expected Matched", true);
  }
   
    @AfterMethod
    public void signOutEbay()
    {
    	home.moveToProfile(driver);
    	home.clickOnSignOut(driver);
    }
    
    @AfterClass
    public void closingBrowser()
    {
    	closeBrowser();
    }
}
