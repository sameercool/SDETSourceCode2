package SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSEndsWith {

	
	    public static void main( String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        //css ends with ($)
	         WebElement e1 = driver.findElement(By.cssSelector("input[id$='il']"));
	        e1.sendKeys("sameersameer638@gmail.com");
	    }
	}

