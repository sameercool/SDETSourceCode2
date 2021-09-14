package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.LandingPage;

public class LandingPageTest extends BaseClass {
	LandingPage landpage;
	
   public LandingPageTest() {
	   super();
   }
    @BeforeMethod
    public void setup() {
    	init();
    	landpage=new LandingPage();
    }

	@Test
	public void testTitle(){
		String actual=landpage.verifyTitle();
		String expected="#1 Free CRM customer relationship management software cloud";
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void testLandingPageLogo() {
		boolean isLogo=landpage.verifyLogo();
		Assert.assertTrue(isLogo);
		
	}
	@Test
	public void testLoginButton()  {
		boolean isLogin=landpage.verifyLogin();
		Assert.assertTrue(isLogin);
		landpage.login();
		
	}
	@Test
	public void testSignup() {
		boolean isSignup=landpage.verifySingup();
		Assert.assertTrue(isSignup);
		landpage.signup();
		
	}
}
  
