package SeleniumDemo1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagClass
{
    public static void main( String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //tag & class
         WebElement e2 = driver.findElement(By.cssSelector("input.inputtext"));
        e2.sendKeys("sameersameer638@gmail.com");
    }   
}