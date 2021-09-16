package SeleniumDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName2 {

	public static void main(String[] args) {
		//here we use the iterator to get all the elements present in the tag button
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://omayo.blogspot.com");
	         List<WebElement> e2 = driver.findElements(By.tagName("button"));
	       for(WebElement i:e2) {
	    	   
	    	   System.out.println(i.getText());
	       }
	       
	        driver.close();
	}

}
