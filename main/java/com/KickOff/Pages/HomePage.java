package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mainBaseClass.mainBaseClass;

public class HomePage extends mainBaseClass{

	
	 
	 public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
	 
	 By NewCustomer= By.xpath("//a[contains(text(),'New Customer')]");
	 
	 By NewAccount =By.xpath("//li//a[contains(text(),'New Account')]");
	 
	 @FindBy(xpath="//img[@src='/logo.png']")
		WebElement Guru99Logo;
	
	 @FindBy(xpath="//div//h2[@class='barone']")
		WebElement title;
	 
//	 @FindBy(xpath="//li//a[contains(text(),'Deposit')]")
//	 WebElement Deposit;
	
	 By Deposit = By.xpath("//a[contains(text(),'Deposit')]");
	 By Withdrawal=By.xpath("//a[contains(text(),'Withdrawal')]");
	 By BalancyEnquiry =By.xpath("//a[contains(text(),'Balance Enquiry')]");
	 By MiniStatment = By.xpath("//a[contains(text(),'Mini Statement')]");
	 By CustomisedStatement =By.xpath("//a[contains(text(),'Customised Statement')]");
	 

     public boolean validateGuru99Logo() {
 		return Guru99Logo.isDisplayed();
     }
     
     public String validateTitle() {
  		return driver.getTitle();
  	}
     
		public void clickNewCustomer() {
		     driver.findElement(NewCustomer).click();
			}

	public void clickNewAccount() {
		driver.findElement(NewAccount).click();
	}
	
	public void clickNewDepositPage() {
		driver.findElement(Deposit).click();
	}
	
	public void clickNewWithdrawalPage() {
		driver.findElement(Withdrawal).click();
	}
	
	public void clickBalancyEnquiryPage() {
		driver.findElement(BalancyEnquiry).click();
	}
	
	public void clickMiniStatementPage() {
		driver.findElement(MiniStatment).click();
	}
	
	public void clickCustomisedStatementPage() {
		driver.findElement(CustomisedStatement).click();
	}

}
