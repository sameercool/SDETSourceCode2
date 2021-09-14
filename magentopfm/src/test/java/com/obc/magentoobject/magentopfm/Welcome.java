package com.obc.magentoobject.magentopfm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
WebDriver driver;
@FindBy(linkText="Sign in")
WebElement signin;
public Welcome(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void clickOnMyAcct() {
	signin.click();
}
}
