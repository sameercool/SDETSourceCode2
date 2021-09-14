package SeleniumDemo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle1
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        final String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}