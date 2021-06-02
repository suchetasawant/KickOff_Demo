package com.KickOffPage.test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.KickOff.Pages.HomePage;
import com.KickOff.Pages.LoginPage;
import com.KickOff.Pages.NewAccountPage;
import com.KickOff.Pages.NewCustomerPage;
import com.mainBaseClass.mainBaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class NewAccountTest extends mainBaseClass{
	
	
	LoginPage Page;
	HomePage Page1;
	mainBaseClass Page3 = new mainBaseClass();
	NewCustomerPage Page4 = new NewCustomerPage(); 
	NewAccountPage Page5 = new NewAccountPage();
	
	public NewAccountTest() {
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
	    public void NewAccountPageTest() {
	    	Page1.clickNewAccount();
	    	Page5.EnterCustomerId();
	    	Page5.clickAccountTypeOfSaving();
	    	//Page5.clickAccountTypeOfSaving();
	    	Page5.EnterInitialdeposite();
	    	Page5.clickBtn();
	 }
	 
	    	@Test(priority=2)
         public void NewScreenshot() {
        	 

			AShot ashot=new AShot();
			Screenshot sc=ashot.takeScreenshot(driver);
			
			try {
				ImageIO.write(sc.getImage(),"PNG", new File("D:\\Selenium java prog\\KickOff_demo\\src\\main\\resources\\Screenshot"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	    }
	
	 

