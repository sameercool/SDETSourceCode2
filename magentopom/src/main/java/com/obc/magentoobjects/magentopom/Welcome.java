package com.obc.magentoobjects.magentopom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
WebDriver driver;
By Signin =By.linkText("Sign in");
public Welcome(WebDriver driver) {
	this.driver=driver;
}
public void clickOnSignIn() {
	driver.findElement(Signin).click();
}
}
