package com.KickOffPage.test;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.LoginPage;
import com.KickOff.Pages.NewCustomerPage;
import com.mainBaseClass.mainBaseClass;

public class NewCustomerPageTest extends mainBaseClass{
	
	LoginPage Page;
	HomePage Page1;
	mainBaseClass Page3;
	NewCustomerPage Page4;

	public NewCustomerPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		Page=new LoginPage();
		Page1=new HomePage();
		Page3=new mainBaseClass();
		Page4 = new NewCustomerPage();
		Page.openBrowser("chrome");
		Page.lunchUrl(Page3.prop.getProperty("openurl"));


		LoginPage login=PageFactory.initElements(Page3.driver, LoginPage.class);
		login.enterUserId("mngr325429");
		login.enterPassword("hamuved");
		login.clickLoginBtn();
	}


	//NewCustomerPage newcustomerPage = PageFactory.initElements(Page.driver, newcustomerPage.class);

	@Test(priority=1)
	public void NewCustomerPageTest() {
		Page4.clickNewCustomerPage();
		Page4.EnterNewCustomerName();
		Page4.GenderSelect();
		Page4.clickDateOfBirth();
		Page4.clickAddress();
		Page4.EnterCityName();
		Page4.EnterState();
		Page4.EnterPinNo();
		Page4.EnterMobileNo();
		Page4.EnterEmailAdd();
		Page4.EnterPassword();
		Page4.clickSubmit();

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}



