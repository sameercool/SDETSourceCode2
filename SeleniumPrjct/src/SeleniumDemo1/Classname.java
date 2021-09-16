package SeleniumDemo1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
         WebElement e2 = driver.findElement(By.className("inputtext"));
        e2.sendKeys( "user@gmail.com" );
    }
}