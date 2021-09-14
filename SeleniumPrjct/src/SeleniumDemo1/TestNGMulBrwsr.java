package SeleniumDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMulBrwsr {
	WebDriver driver=null;
	@Parameters("browsername")
	@BeforeTest
	
public void setup(String browsername) {
		if(browsername.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		          driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium components\\geckodriver.exe");
                 driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("explorer"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\selenium components\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
}
	@Test
public void test2() throws InterruptedException {
	driver.get("https://www.google.com");
	Thread.sleep(4000);
}
	@AfterTest
	public void teardown() 
	{
		driver.close();
		System.out.println("test completed");
	}
}
