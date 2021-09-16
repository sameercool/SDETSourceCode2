package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait1 {

	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        		.withTimeout(20, TimeUnit.SECONDS)
        		.pollingEvery(500, TimeUnit.MILLISECONDS);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Forgotten password?")));
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.quit();
        		
		}
	

}
