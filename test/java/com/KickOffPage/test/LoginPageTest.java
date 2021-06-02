package com.KickOffPage.test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.LoginPage;
import com.mainBaseClass.mainBaseClass;

public class LoginPageTest extends mainBaseClass{
	
	LoginPage Page;
	HomePage Page1;
	mainBaseClass Page3 = new mainBaseClass();
	
	public LoginPageTest() {
		super();
	}
    	
   //@Test(priority=1,dataProvider ="BrowserData", dataProviderClass = LoginPageTest.class)
    //public void LoginPage() {
	     @Test
		public void setup() {
		Page=new LoginPage();
		Page.openBrowser("chrome");
		Page.lunchUrl(Page3.prop.getProperty("openurl"));
	
	
	LoginPage login=PageFactory.initElements(Page3.driver, LoginPage.class);
	login.enterUserId("mngr325429");
	login.enterPassword("hamuved");
	login.clickLoginBtn();
	}

    
//    @DataProvider(name = "BrowserData")
//    public void browserdata(){
//    	String[][] data= {{"Windows","Xp","Chrome","latest"},{"Windows","7","Chrome","latest"},{"Windows","8","Chrome","latest"},
//    			         {"Windows","XP","Firefox","latest"},{"Windows","7","Firefox","latest"},{"Windows","8","Firefox","latest"},
//    			         {"Windows","XP","IE","11.0"},{"Windows","7","IE","11.0"},{"Windows","8","IE","11.0"}};
//    	
//    }
		  
		   @AfterMethod
		   public void tearDown() {
			   driver.quit();
      }
}
