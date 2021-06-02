package com.KickOff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.mainBaseClass.mainBaseClass;

public class MiniStatementPage extends mainBaseClass{
	

	public MiniStatementPage() {
		PageFactory.initElements(driver, this);
	}

	By MiniStatment = By.xpath("//a[contains(text(),'Mini Statement')]");
	By AccountNo = By.xpath("//input[@name='accountno']");
	By Submit = By.xpath("//input[@name='AccSubmit']");


	public void clickMiniStatementPage() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scroll(0,600)");

		driver.findElement(MiniStatment).click();
	}


	public void EnterAccountNo() {
		driver.findElement(AccountNo).sendKeys("92191");
	}

	public void clicksubmitBt() {
		driver.findElement(Submit).click();
	}

}
