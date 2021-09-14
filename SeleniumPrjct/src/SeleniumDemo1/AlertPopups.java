package SeleniumDemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups
{
    public static void main(final String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000L);
        final Alert alert = driver.switchTo().alert();
        Thread.sleep(5000L);
        alert.accept();
    }
}