package SeleniumDemo1;

import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50L, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        final WebElement e1 = driver.findElementById("email");
        e1.sendKeys(new CharSequence[] { "sameer@gmail.com" });
    }
}