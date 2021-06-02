package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.mainBaseClass.mainBaseClass;

public class BalancyEnquiryPage extends mainBaseClass{
	

	public BalancyEnquiryPage() {
		PageFactory.initElements(driver, this);
	}


	By BalancyEnquiry =By.xpath("//a[contains(text(),'Balance Enquiry')]");
	By AccountNo = By.xpath("//input[@name='accountno']");
	By Submit = By.xpath("//input[@name='AccSubmit']");

	public void clickBalancyEnquiryPage() {

		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scroll(0,600)");

		driver.findElement(BalancyEnquiry).click();
	}


	public void EnterAccountNoPage() {
		driver.findElement(AccountNo).sendKeys("92191");
	}

	public void clicksubmitBt() {
		driver.findElement(Submit).click();
	}




}
