package com.obc.magentotests.magentopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.obc.magentoobjects.magentopom.Login;
import com.obc.magentoobjects.magentopom.Main;
import com.obc.magentoobjects.magentopom.Welcome;

public class MagentoTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.magento.com");
	Welcome w=new Welcome(driver);
	w.clickOnSignIn();
	Login l=new Login(driver);
	l.typeEmail("sameersameer638@gmail.com");
	l.typePass("tS5sbrpe4!#dyCH");
	l.clickOnLogin();
	Main m=new Main(driver);
	m.clickOnLogOut();
	

	
}
}
