package SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	        final ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.findElement(By.linkText("Forgotten password?")).click();
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().refresh();
	        }

}
