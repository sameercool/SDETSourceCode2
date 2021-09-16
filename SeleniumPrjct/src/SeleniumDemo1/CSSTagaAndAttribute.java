package SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagaAndAttribute {
	 public static void main( String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com");
   //tag & attribute
    WebElement e2 = driver.findElement(By.cssSelector("input[id='email"));
   e2.sendKeys("sameersameer638@gmail.com");
}
}