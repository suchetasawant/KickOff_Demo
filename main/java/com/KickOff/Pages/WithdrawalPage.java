package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.mainBaseClass.mainBaseClass;

public class WithdrawalPage extends mainBaseClass {
	

	 public WithdrawalPage() {
			PageFactory.initElements(driver, this);
		}
		
	
	 By Withdrawal=By.xpath("//a[contains(text(),'Withdrawal')]");
	 By AccountNo = By.xpath("//input[@name='accountno']");//name="accountno"
		
	 By Amount = By.xpath("//input[@name='ammount']");//name="ammount"
	 
	 By Description = By.xpath("//input[@name='desc']");	//name="desc"
	 
	 By Submit = By.xpath("//input[@name='AccSubmit']");//name="AccSubmit"
	 
	 

		public void clickNewWithdrawalPage() {
			driver.findElement(Withdrawal).click();
		}


		public void EnterAccountNo() {
			driver.findElement(AccountNo).sendKeys("92191");
		}
		
		public void EnterAmount() {
			driver.findElement(Amount).sendKeys("1000");
		}
		
		public void EnterDescription() {
			driver.findElement(Description).sendKeys("Shop");
		}
		
		public void clicksubmitBt() {
			driver.findElement(Submit).click();
		}
		

}
