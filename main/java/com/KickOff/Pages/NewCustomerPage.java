package com.KickOff.Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mainBaseClass.mainBaseClass;

public class NewCustomerPage extends mainBaseClass {
	
	  
		public NewCustomerPage() {
			PageFactory.initElements(driver, this);
		}
		
	

    By NewCustomrer=By.xpath("//a[contains(text(),'New Customer')]");
	By CustomerName = By.xpath("//input[@name='name']");
	By GenderSelect = By.xpath("//input[@value='f']");
	By DateOfBirth = By.xpath("//input[@onkeyup='validatedob();']");
	By Address = By.name("addr");
	By City = By.name("city");
	By State = By.xpath("//input[@name='state']");
	By Pin = By.xpath("//input[@name='pinno']");
	By MobileNo = By.xpath("//input[@name='telephoneno']");
	By EmailAdd = By.xpath("//input[@name='emailid']");
	By Password = By.xpath("//input[@name='password']");
	By Submit = By.xpath("//input[@value='Submit']");
	
	

	public void clickNewCustomerPage() {
	     driver.findElement(NewCustomrer).click();
		}
	

	public void EnterNewCustomerName() {
		driver.findElement(CustomerName).sendKeys("Arohi Swami");
}
	
	public void GenderSelect() {
		driver.findElement(GenderSelect).click();
//	    Select select = new Select(driver.findElement(GenderSelect));
//		select.selectByVisibleText("Female");
	   }
	
	public void clickDateOfBirth() {
		//driver.findElement(DateOfBirth).click();
		driver.findElement(DateOfBirth).sendKeys("18-4-1990");
		//driver.findElement(DateOfBirth).sendKeys("02-06-2000");
	}

     public void clickAddress() {
    	 driver.findElement(Address).click();
		driver.findElement(Address).sendKeys("Mukai Chowk Jagtap Dairy");
	}
     
     public void EnterCityName() {
    	 driver.findElement(City).sendKeys("Pune");
     }
     
     public void EnterState() {
    	 driver.findElement(State).sendKeys("Maharashtra");     }
     
     public void EnterPinNo() {
    	 driver.findElement(Pin).sendKeys("411033");
     }
     
     public void EnterMobileNo() {
    	 driver.findElement(MobileNo).sendKeys("9876549912");
     }
     
     public void EnterEmailAdd() {
    	 driver.findElement(EmailAdd).sendKeys("arohiswami18@gmail.com");   
    	 }
     
     public void EnterPassword() {
    	 driver.findElement(Password).sendKeys("sonisawant");
     }
     
     public void clickSubmit() {
    	 driver.findElement(Submit).click();
     }
     
  
	}

