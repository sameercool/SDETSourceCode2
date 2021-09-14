package com.obc.magento.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.obc.magentoobject.magentopfm.Login;
import com.obc.magentoobject.magentopfm.Main;
import com.obc.magentoobject.magentopfm.Welcome;

public class MagentoTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.magento.com");
	Welcome w=new Welcome(driver);
	w.clickOnMyAcct();
	Login l=new Login(driver);
	l.typeEmail("sameersameer638@gmail.com");
	l.typePass("tS5sbrpe4!#dyCH");
	l.clickOnLogin();
	Main m=new Main(driver);
	m.clickOnLogout();
	driver.quit();
	
}
}
