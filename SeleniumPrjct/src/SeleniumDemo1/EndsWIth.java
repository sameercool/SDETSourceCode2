package SeleniumDemo1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndsWIth
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        final WebElement e1 = driver.findElement(By.cssSelector("input[id$='il']"));
        e1.sendKeys(new CharSequence[] { "sameersameer638@gmail.com" });
    }
}