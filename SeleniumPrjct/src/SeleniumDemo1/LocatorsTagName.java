package SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTagName {
	 public static void main(final String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://omayo.blogspot.com");
	         WebElement e2 = driver.findElement(By.tagName("button"));
	       
	        System.out.println(e2.getText());
	        driver.close();
	 }
}
