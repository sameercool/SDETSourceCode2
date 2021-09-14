package SeleniumDemo1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown1
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        final Select dropdown = new Select(driver.findElementById("testing dropdown"));
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        dropdown.selectByVisibleText("database");
        driver.close();
    }
}