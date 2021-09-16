package SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLinkText {
	   public static void main(final String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	         WebElement  e1= driver.findElement(By.linkText("Forgotten password?"));
	       e1.click();
	    }
}
