package com.KickOff.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mainBaseClass.mainBaseClass;

public class NewAccountPage extends mainBaseClass {
	
	public NewAccountPage() {
		PageFactory.initElements(driver, this);
	}

	By NewAccount =By.xpath("//li//a[contains(text(),'New Account')]");
	By CustomerId = By.name("cusid");
	By AccountType = By.xpath("//select[@name='selaccount']");
	//By AccountTypeSaving = By.xpath("//option[@value='Saving']");
	By AccountTypeSaving = By.xpath("//option[@value='Current']");
	By Initialdeposite = By.name("inideposit");
	By submit = By.xpath("//input[@type='submit']");




	public void ClickNewAccount() {
		driver.findElement(NewAccount).click();
	}

	public void EnterCustomerId() {
		driver.findElement(CustomerId).sendKeys("5029");
	}

	public void clickAccountTypeOfSaving() {
		driver.findElement(AccountType).click();
		Select select= new Select(driver.findElement(AccountType));
		//select.selectByValue("Savings");
		select.selectByValue("Current");
	}

	public void EnterInitialdeposite() {
		driver.findElement(Initialdeposite).sendKeys("10000");
	}
	public void clickBtn() {
		driver.findElement(submit).click(); 





	}
}

