package SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsbyName {

    public static void main( String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
         WebElement e2 = driver.findElement(By.name("email"));
        e2.sendKeys( "user@gmail.com" );
}
}