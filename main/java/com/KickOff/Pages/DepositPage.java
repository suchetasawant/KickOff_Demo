package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mainBaseClass.mainBaseClass;

public class DepositPage extends mainBaseClass{
	
	 
	 public DepositPage() {
			PageFactory.initElements(driver, this);
		}
		
	
	By Deposit = By.xpath("//a[contains(text(),'Deposit')]");
	
	 By AccountNo = By.xpath("//input[@name='accountno']");
	
	 By Amount = By.xpath("//input[@name='ammount']");
	 
	 By Description = By.xpath("//input[@name='desc']");	
	 
	 By Submit = By.xpath("//input[@name='AccSubmit']");
	 
	public void clickNewDepositPage() {
		driver.findElement(Deposit).click();
	}
	
	public void EnterAccountNo() {
		driver.findElement(AccountNo).sendKeys("92191");
	}
	
	public void EnterAmount() {
		driver.findElement(Amount).sendKeys("1500");
	}
	
	public void EnterDescription() {
		driver.findElement(Description).sendKeys("Shop");
	}
	
	public void clicksubmitBt() {
		driver.findElement(Submit).click();
	}
	
	
	

}
