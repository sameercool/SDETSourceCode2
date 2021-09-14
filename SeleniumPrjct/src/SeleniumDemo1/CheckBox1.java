package SeleniumDemo1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
    }
}