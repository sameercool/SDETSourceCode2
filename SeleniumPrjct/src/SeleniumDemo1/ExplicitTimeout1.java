package SeleniumDemo1;
import java.util.function.Function;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitTimeout1
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        final WebDriverWait wait = new WebDriverWait((WebDriver)driver, 50L);
        final WebElement login = (WebElement)wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New Account")));
        login.click();
    }
}