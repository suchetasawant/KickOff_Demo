package com.KickOffPage.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.Pages.BalancyEnquiryPage;
import com.KickOff.Pages.DepositPage;
import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.LoginPage;
import com.KickOff.Pages.NewAccountPage;
import com.KickOff.Pages.NewCustomerPage;
import com.mainBaseClass.mainBaseClass;

public class BalancyEnquiryPageTest extends mainBaseClass{

	LoginPage Page;
	HomePage Page1;
	mainBaseClass Page3 = new mainBaseClass();
	NewCustomerPage Page4 = new NewCustomerPage(); 
	NewAccountPage Page5 = new NewAccountPage();
	DepositPage Page6=new DepositPage();
	BalancyEnquiryPage Page7= new BalancyEnquiryPage();


	public BalancyEnquiryPageTest () {
		super();
	}

	@BeforeClass
	public void setup() {
		Page=new LoginPage();
		Page1=new HomePage();
		Page3=new mainBaseClass();
		Page.openBrowser("chrome");
		Page.lunchUrl(Page3.prop.getProperty("openurl"));


		LoginPage login=PageFactory.initElements(Page3.driver, LoginPage.class);
		login.enterUserId("mngr325429");
		login.enterPassword("hamuved");
		login.clickLoginBtn();
	}

	@Test(priority=1)
	public void clickBalancyEnquiryPageTest() {
		Page7.clickBalancyEnquiryPage();
	}

	@Test(priority=2)
	public void EnterAccountNoTest() {
		Page7.EnterAccountNoPage();

	}
	@Test(priority=3)
	public void clickSubmitButTest() {
		Page7.clicksubmitBt();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
