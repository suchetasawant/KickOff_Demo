package com.KickOffPage.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.KickOff.Pages.DepositPage;
import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.LoginPage;
import com.KickOff.Pages.NewAccountPage;
import com.KickOff.Pages.NewCustomerPage;
import com.gargoylesoftware.htmlunit.Page;
import com.mainBaseClass.mainBaseClass;

public class HomePageTest extends mainBaseClass {
	

	LoginPage Page;
	HomePage Page1;
	mainBaseClass Page3 = new mainBaseClass();
	NewCustomerPage Page4 = new NewCustomerPage(); 
	NewAccountPage Page5 = new NewAccountPage();
	DepositPage Page6=new DepositPage();

	public HomePageTest() {
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

	@Test(priority=2)
	public void HomePageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
	}


	@Test(priority=3)
	public void clickNewCustomerPageTest() {
		Page4.clickNewCustomerPage();
	}

	@Test(priority=4)
	public void clickNewAccountPageTest() {
		Page1.clickNewAccount();
	}

	@Test(priority=5)
	public void clickNewDepositTest() {
		Page1.clickNewDepositPage();
	}

	@Test(priority=5)
	public void clickNewWithdrawalTest() {
		Page1.clickNewWithdrawalPage();
	}

	@Test(priority=6)
	public void clickBalancyEnquiryPageTest() {
		Page1.clickBalancyEnquiryPage();
	}

	public void clickMiniStatementPageTest() {
		Page1.clickMiniStatementPage();
		Page1.clickCustomisedStatementPage();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
