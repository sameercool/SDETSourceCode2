package SeleniumDemo1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchGecko {
	public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver", "D:\\selenium components\\geckodriver.exe");
     FirefoxDriver driver1=new FirefoxDriver();
     driver1.get("http://www.amazon.com");
    
     driver1.quit(); 
}
}