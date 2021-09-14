package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class LandingPage extends  BaseClass{
	
	public LandingPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html/body/div[1]/header/div/nav/div/div/div[1]/div/a")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='rd-navbar-wrap']/a")
	WebElement login;
	
	@FindBy(xpath="//span[@class='mdi-chart-bar icon icon-md']")
	WebElement signup;
	
	public String verifyTitle() {
		String title=driver.getTitle();
		return title;
	}
	public boolean verifyLogo() {
		boolean isDisplayed=logo.isDisplayed();
		return isDisplayed;
	}
	public boolean verifyLogin() {
		boolean isLogin=login.isEnabled();
		return isLogin;
	}
	public LoginPage login() {
		login.click();
		return new LoginPage();
	}
	public boolean verifySingup() {
		boolean isSingup=login.isEnabled();
		return isSingup;
	}
	public SignupPage signup() {
		signup.click();
		return new SignupPage();
	}
}


	
      

