package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BaseClass {
      LoginPage loginpage;
      HomePage homepage;
      LandingPage landpage;
      
      public LoginPageTest() {
    	  super();
      }
      @BeforeMethod
      public void setup() {
      	init();
      	loginpage=new LoginPage();
      	homepage=new HomePage();
      	landpage=new LandingPage();
      	landpage.login();
      }
      
      @Test
      public void loginTitleTest(){
    	    String title=loginpage.verifyLoginTitle();
    	    Assert.assertEquals(title,"Cogmento CRM");
      }
      @Test
      public void loginTest() {
    	  String un=prop.getProperty("username");
    	  String pwd=prop.getProperty("password");
    	  homepage=loginpage.login(un, pwd);
    	  String title=homepage.verifyHomePageTitle();
    	  Assert.assertEquals(title, "Cogmento CRM");
    	  
    	  
      }
      
     
}