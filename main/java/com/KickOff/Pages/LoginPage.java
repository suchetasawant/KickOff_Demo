package com.KickOff.Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mainBaseClass.mainBaseClass;

public class LoginPage extends mainBaseClass{
	
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement UserId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
    WebElement loginButton;	
	
	
	
	 public LoginPage() {
			PageFactory.initElements(driver, this); 
	}
	
	public void enterUserId(String userid) {
		UserId.sendKeys(userid);
	}
	
	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginButton.click();
	}
	
	
}
