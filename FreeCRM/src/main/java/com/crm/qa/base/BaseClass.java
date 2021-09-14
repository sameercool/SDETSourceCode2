package com.crm.qa.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	//launching browser and url
	public static WebDriver driver;
	public static Properties prop;
	  
	public BaseClass()  {
		
		
		try {
			prop=new Properties();
			
			
			FileInputStream ip = new FileInputStream("C:\\Users\\SAMEER\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
	}
	
	public static void init() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");

         driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get(prop.getProperty("url"));
	}

}
