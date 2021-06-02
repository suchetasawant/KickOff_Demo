package com.KickOffPage.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.Pages.DepositPage;
import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.LoginPage;
import com.KickOff.Pages.MiniStatementPage;
import com.KickOff.Pages.NewAccountPage;
import com.KickOff.Pages.NewCustomerPage;
import com.mainBaseClass.mainBaseClass;

public class MiniStatementPageTest extends mainBaseClass{
	

	LoginPage Page;
	HomePage Page1;
	mainBaseClass Page3 = new mainBaseClass();
	NewCustomerPage Page4 = new NewCustomerPage(); 
	NewAccountPage Page5 = new NewAccountPage();
	DepositPage Page6=new DepositPage();
	MiniStatementPage Page7= new MiniStatementPage();

	public MiniStatementPageTest() {
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
	public void clickMiniStatementPageTest() {
		Page7.clickMiniStatementPage();
	}

	@Test(priority=2)
	public void EnterAccountNo() {
		Page7.EnterAccountNo();
		Page7.clicksubmitBt();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}

